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
import model.bean.Carrinho;

/**
 *
 * @author Senai
 */
public class CarrinhoDAO {

    public List<Carrinho> leia() {
        List<Carrinho> carrinho = new ArrayList<>();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareCall("SELECT * FROM carrinho");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Carrinho cro = new Carrinho();
                cro.setIdCarrinho(rs.getInt("idCarrinho"));
                cro.setNomeCarrinho(rs.getString("nome_carrinho"));
                cro.setImagemCarrinho(rs.getBytes("imagem_carrinho"));
                cro.setCategoriaCarrinho(rs.getString("categoria_carrinho"));
                cro.setDescricaoCarrinho(rs.getString("descricao_carrinho"));
                cro.setPrecoCarrinho(rs.getFloat("preco_carrinho"));
                cro.setQuantidadeCarrinho(rs.getInt("quantidade_carrinho"));
                cro.setIdProdutos(rs.getInt("idProdutos"));
                cro.setIdUsuario(rs.getInt("idUsuario"));
                cro.setTotal(rs.getFloat("total"));
                carrinho.add(cro);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return carrinho;
    }
        public List<Carrinho> leia1() {
        List<Carrinho> carrinho = new ArrayList<>();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareCall("SELECT * FROM carrinho");
            rs = stmt.executeQuery();
            if (rs.next()) {
                Carrinho cro = new Carrinho();
                cro.setTotal(rs.getFloat("total"));
                carrinho.add(cro);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return carrinho;
    }
    public void create(Carrinho carrinho) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;


            stmt = conexao.prepareStatement("INSERT INTO carrinho(nome_carrinho, imagem_carrinho, descricao_carrinho, preco_carrinho, quantidade_carrinho, idProdutos) SELECT p.nome, p.imagem, p.descricao, p.preco, p.quantidade, ? FROM produtos p WHERE p.idProdutos = ?");
            stmt.setInt(1, carrinho.getIdProdutos());
            stmt.setInt(2, carrinho.getIdProdutos());

   
            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {

                float totalCarrinho = calcularTotalCarrinho();

              
                stmt = conexao.prepareStatement("UPDATE carrinho SET total = ?");
                stmt.setFloat(1, totalCarrinho);
                stmt.executeUpdate();

                System.out.println("Total do Carrinho atualizado com sucesso.");
            } else {
                System.out.println("Nenhum produto foi inserido no carrinho.");
            }

            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public float calcularTotalCarrinho() {
        float total = 0.0f;

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

         
            String sql = "SELECT SUM(p.preco * c.quantidade_carrinho) AS total FROM produtos p INNER JOIN carrinho c ON p.idProdutos = c.idProdutos";

            stmt = conexao.prepareStatement(sql);

       
            rs = stmt.executeQuery();

    
            if (rs.next()) {
                total = rs.getFloat("total");
            }

           
            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return total;
    }
}
