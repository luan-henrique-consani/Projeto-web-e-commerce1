/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Usuario;

/**
 *
 * @author consa
 */
public class UsuarioDAO {
    
       public Usuario logar(Usuario usuario) {
        Usuario usu = new Usuario();

        try {

            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareCall("SELECT * FROM usuario WHERE email = ? AND senha = ?");
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            rs = stmt.executeQuery();
            
            if(rs.next()){
                Usuario.setIdUsuario(rs.getInt("idUsuario"));
                System.out.println("DAO: "+Usuario.getIdUsuario());
            }
            
            
            
            rs.close();
            stmt.close();
            conexao.close();
            

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usu;
    }


    public void create(Usuario usuario){
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conexao.prepareCall("INSERT INTO usuario(nome, senha, email, telefone, cpf) VALUES (?,?,?,?,?)");
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getTelefone());
            stmt.setString(5, usuario.getCpf());
            stmt.executeUpdate();
            
            stmt.close();
            conexao.close();
            System.out.println("deu certo");
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
