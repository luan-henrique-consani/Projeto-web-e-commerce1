<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Enviar Imagem</h2>
        <form name="frmProduct" action="insert" enctype="multipart/form-data" method="post">
            <h2>IMAGEM</h2>
            <input type="file" name="imagem" id="imagem">
            <h2>nome<h2/>
            <input type="text" name="nome">
            <h2>categoria<h2/>
            <input type="text"name="categoria">
            <h2>valor<h2/>
            <input type="text"name="preco">
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
