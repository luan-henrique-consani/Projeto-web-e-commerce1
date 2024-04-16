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
    
        public List<Carrinho> leia(){
        List<Carrinho> carrinho = new ArrayList<>();
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareCall("SELECT * FROM produtos;");
            while(rs.next()){
                Carrinho cro = new Carrinho();
                cro.setIdCarrinho(rs.getInt("idCarrinho"));
                cro.setNomeCarrinho(rs.getString("nome_carrinho"));
                cro.setImagemCarrinho(rs.getBytes("imagem"));
                cro.setCategoriaCarrinho(rs.getString("categoria_carrinho"));
                cro.setDescricaoCarrinho(rs.getString("descricao_carrinho"));
                cro.setPrecoCarrinho(rs.getFloat("preco_carrinho"));
                cro.setQuantidadeCarrinho(rs.getInt("quantidade_carrinho"));
                cro.setIdProdutos(rs.getInt("idProdutos"));
                carrinho.add(cro);
            }
            
            rs.close();
            stmt.close();
            conexao.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return carrinho;
}
}
