package controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.DAO.ProdutoDAO;
import model.bean.Produto;

@WebServlet(urlPatterns = "/insert")
@MultipartConfig
public class Controller extends HttpServlet {

    Produto objProduto = new Produto();
    ProdutoDAO objProdutoDao = new ProdutoDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
        if (action.equals("/insert")) {
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

            
        out.println("<script type=\"text/javascript\">");
        out.println("alert('Cadastro feito com Sucesso!.');");
        out.println("window.location.href = './cadastro-usu';"); 
        out.println("</script>");
        response.sendRedirect("redirect.jsp");
    }
}
