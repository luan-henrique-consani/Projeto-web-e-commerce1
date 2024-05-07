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
import model.bean.Categoria;

/**
 *
 * @author Senai
 */
public class CategoriaDAO {
        public List<Categoria> leia() {
        List<Categoria> categoria = new ArrayList<>();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM categoria");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Categoria cro = new Categoria();
                cro.setIdCategoria(rs.getInt("idCategoria"));
                cro.setNome(rs.getString("nome"));
                categoria.add(cro);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categoria;
        }

}
