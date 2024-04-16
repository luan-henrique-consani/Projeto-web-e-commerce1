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
import java.util.ArrayList;
import java.util.List;
import model.bean.Estoque;

/**
 *
 * @author Senai
 */
public class EstoqueDAO {
            public List<Estoque> leia(){
        List<Estoque> estoque = new ArrayList<>();
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareCall("SELECT * FROM produtos;");
            
            while(rs.next()){
                Estoque est = new Estoque();
                est.setIdEstoque(rs.getInt("idEstoque"));
                est.setNomeEstoque(rs.getString("nome_estoque"));
                est.setImagemEstoque(rs.getBytes("imagem"));
                est.setCategoriaEstoque(rs.getString("categoria_estoque"));
                est.setPrecoEstoque(rs.getFloat("preco_estoque"));
                est.setQuantidadeEstoque(rs.getInt("quantidade_estoque"));
                estoque.add(est);
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return estoque;
}
}
