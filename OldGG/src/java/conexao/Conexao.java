/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Senai
 */
public class Conexao {
     
    private static final String url = "jdbc:mysql://localhost:3306/Projeto_Web?useSSL=false";
    private static final String usuario = "root";
    private static final String senha = "root";
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    
    public static Connection conectar()throws SQLException{
        Connection con = null;
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url, usuario, senha);
            return con;
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
    
}
