/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.DAO.CarrinhoDAO;
import model.DAO.ProdutoDAO;
import model.bean.Carrinho;
import model.bean.Produto;

/**
 *
 * @author Senai
 */
@WebServlet(urlPatterns = "/enviarc")
@MultipartConfig
public class ProdutoController extends HttpServlet {

    Carrinho objProduto = new Carrinho();
    CarrinhoDAO objProdutoDao = new CarrinhoDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProdutoDAO produto = new ProdutoDAO();
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        List<Produto> produtos = produto.leia1(id);
        request.setAttribute("produtos", produtos);
        String url = "/pages/produto.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
        if (action.equals("/enviarc")) {
            produto(request, response);
        } else {
            processRequest(request, response);
        }

    }

    protected void produto(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Part filePart = request.getPart("imagem");
        InputStream inputStream = filePart.getInputStream();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[4096];
        int bytesRead = -1;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }
        byte[] imageBytes = outputStream.toByteArray();


        objProduto.setNomeCarrinho(request.getParameter("nome"));
        objProduto.setPrecoCarrinho(Float.parseFloat(request.getParameter("preco")));
        objProduto.setDescricaoCarrinho(request.getParameter("descricao"));
        objProduto.setImagemCarrinho(imageBytes);
        objProdutoDao.create(objProduto);
        response.sendRedirect("./home");

    }

}
