/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.DAO.ProdutoDAO;
import model.bean.Produto;

/**
 *
 * @author consa
 */
@WebServlet(urlPatterns = "/criarprt")
@MultipartConfig
public class CadastroProdutosController extends HttpServlet {

    Produto objProduto = new Produto();
    ProdutoDAO objProdutoDao = new ProdutoDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nextPage = "/pages/cadastroprodutos.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getServletPath();
        if (action.equals("/criarprt")) {
            product(request, response);
        }

    }

    protected void product(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Part filePart = request.getPart("imagem");
        InputStream inputStream = filePart.getInputStream();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[4096];
        int bytesRead = -1;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }
        byte[] imageBytes = outputStream.toByteArray();

        objProduto.setImagem(imageBytes);
        objProduto.setNome(request.getParameter("nome"));
        objProduto.setCategoria(request.getParameter("categoria"));
        objProduto.setPreco(Float.parseFloat(request.getParameter("preco")));
        objProduto.setQuantidade(Integer.parseInt(request.getParameter("quantidade")));
        objProduto.setDescricao(request.getParameter("descricao"));
        objProdutoDao.create(objProduto);
        response.sendRedirect("./cadastroProdutos");
        

    }

}
