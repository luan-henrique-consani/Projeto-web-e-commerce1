<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Old Generation Games</title>
        <link rel="icon" href="assets/logomaior.png">
        <script src="https://kit.fontawesome.com/560340c572.js" crossorigin="anonymous"></script>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link
            href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap"
            rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
            integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
            integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
            crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
            integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
            crossorigin="anonymous"></script>
            <link rel="stylesheet" href="style/header.css"> 
            <link rel="stylesheet" href="style/main3.css">
            <link rel="stylesheet" href="style/footer.css">
    </head>

    <body>
           <jsp:include page="header.jsp"></jsp:include>
    <main>
        <h1>Suas Compras</h1>
</div>
        <div class="container">
          <c:forEach items="${carrinhos}" var="carrinho" >
              <div id="${carrinho.idProdutos}" class="produto">
                  <h2>${carrinho.nomeCarrinho}</h2>
                  <img src="data:image/png;base64,${carrinho.imagemBase64}"  alt="${carrinho.nomeCarrinho}">
                  <p>R$ ${carrinho.precoCarrinho}</p>
              </div>
          </c:forEach>
      </div>
    </main>
    <footer>
      <div class="redes">
        <a  href="https://www.instagram.com/luanconsani28/" class="btn btn-outline-succes my-2 my-sm-1 redes2" type="submit"><i class="fa-brands fa-instagram"></i></a>
        <a  href="https://wa.me/5543991504447?text=Fala+com+pai" class="btn btn-outline-succes my-2 my-sm-1 redes2" type="submit"><i class="fa-brands fa-whatsapp"></i></a>
        <a  href="https://www.linkedin.com/in/luan-henrique-consani-coelho-b9b66a219/" class="btn btn-outline-succes my-2 my-sm-1 redes2" type="submit"><i class="fa-brands fa-linkedin"></i></a> 
        
      </div>
      <p>Todos direitos reservados a Luan Consani&copy;</p>
    </footer>
    </body>

    </html>