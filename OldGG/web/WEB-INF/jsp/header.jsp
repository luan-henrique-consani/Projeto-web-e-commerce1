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
    </head>

    <body>
        <header>
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="#"></a>
                <img src="assets/logomaior.png" alt="">
                <h2 id="text">Old Games Generation</h2>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#conteudoNavbarSuportado" aria-controls="conteudoNavbarSuportado" aria-expanded="false" aria-label="Alterna navegação">
                  <span class="navbar-toggler-icon"></span>
                </button>
              
                <div class="collapse navbar-collapse" id="conteudoNavbarSuportado">
                  <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                      <a class="nav-link" href="./home"><i class="fa-solid fa-house"></i>Home<span class="sr-only">(página atual)</span></a>
                    </li>
                    <li class="nav-item active">
                      <a class="nav-link" href="./produto-categoria?id=1"> <i class="fa-solid fa-gamepad"></i>Consoles</a>
                    </li>
                    <li class="nav-item active">
                      <a class="nav-link" href="./produto-categoria?id=2"><i class="fa-solid fa-person-walking"></i>Action figure</a>
                    </li>
                    <li class="nav-item active">
                      <a class="nav-link" href="./produto-categoria?id=3"> <i class="fa-solid fa-headset"></i>Acessórios</a>
                    </li>
                  </ul>
                  <a href="./CarrinhoController" id="cars"><button class="btn btn-outline-success my-2 my-sm-0 carrinho" ><i class="fa-solid fa-cart-shopping"></i></button></a>
                  <form class="form-inline my-2 my-lg-0" action="achar" enctype="multipart/form-data" method="post">
                      <input class="form-control mr-sm-2 barra" type="search" placeholder="Pesquisar" aria-label="Pesquisar" name="nome">
                    <button class="btn btn-outline-success my-2 my-sm-0 lupa" type="submit"><i class="fa-solid fa-magnifying-glass"></i></button>
                  </form>
                </div>
                <a href="./cadastro-usu" id="user"><button class="btn btn-outline-success my-2 my-sm-0 conta" ><i class="fa-solid fa-user"></i></button></a>
              </nav>
        </header>

    </html>