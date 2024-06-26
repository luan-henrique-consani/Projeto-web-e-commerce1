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
import model.bean.Produto;

/**
 *
 * @author consa
 */
public class ProdutoDAO {

    public void create(Produto produto) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("INSERT INTO produtos(nome, imagem, categoria, descricao, preco, quantidade)VALUES(?,?,?,?,?,?)");
            stmt.setString(1, produto.getNome());
            stmt.setBytes(2, produto.getImagem());
            stmt.setInt(3, produto.getCategoria());
            stmt.setString(4, produto.getDescricao());
            stmt.setFloat(5, produto.getPreco());
            stmt.setInt(6, produto.getQuantidade());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Produto> leia() {
        List<Produto> produto = new ArrayList<>();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produtos");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto prt = new Produto();
                prt.setIdProdutos(rs.getInt("idProdutos"));
                prt.setNome(rs.getString("nome"));
                prt.setImagem(rs.getBytes("imagem"));
                prt.setCategoria(rs.getInt("categoria"));
                prt.setDescricao(rs.getString("descricao"));
                prt.setPreco(rs.getFloat("preco"));
                prt.setQuantidade(rs.getInt("quantidade"));
                produto.add(prt);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produto;
    }

    public List<Produto> leia1(int id) {
        List<Produto> produto = new ArrayList<>();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produtos WHERE idProdutos = ?");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto prt = new Produto();
                prt.setIdProdutos(rs.getInt("idProdutos"));
                prt.setNome(rs.getString("nome"));
                prt.setImagem(rs.getBytes("imagem"));
                prt.setCategoria(rs.getInt("categoria"));
                prt.setDescricao(rs.getString("descricao"));
                prt.setPreco(rs.getFloat("preco"));
                prt.setQuantidade(rs.getInt("quantidade"));
                produto.add(prt);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produto;
    }

    public List<Produto> leia2(int categoria) {
        List<Produto> produto = new ArrayList<>();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produtos WHERE categoria = ?");
            stmt.setInt(1, categoria);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto prt = new Produto();
                prt.setIdProdutos(rs.getInt("idProdutos"));
                prt.setNome(rs.getString("nome"));
                prt.setImagem(rs.getBytes("imagem"));
                prt.setCategoria(rs.getInt("categoria"));
                prt.setDescricao(rs.getString("descricao"));
                prt.setPreco(rs.getFloat("preco"));
                prt.setQuantidade(rs.getInt("quantidade"));
                produto.add(prt);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produto;
    }
        public List<Produto> leia3(String pesquisar) {
        List<Produto> produto = new ArrayList<>();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produtos WHERE nome LIKE ?");
            stmt.setString(1, "%"+pesquisar+"%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto prt = new Produto();
                prt.setIdProdutos(rs.getInt("idProdutos"));
                prt.setNome(rs.getString("nome"));
                prt.setImagem(rs.getBytes("imagem"));
                prt.setCategoria(rs.getInt("categoria"));
                prt.setDescricao(rs.getString("descricao"));
                prt.setPreco(rs.getFloat("preco"));
                prt.setQuantidade(rs.getInt("quantidade"));
                produto.add(prt);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produto;
    }

}
