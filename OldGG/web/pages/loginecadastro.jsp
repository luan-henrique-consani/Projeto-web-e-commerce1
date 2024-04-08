<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="./../assets/logomaior.png">
        <script src="https://kit.fontawesome.com/560340c572.js" crossorigin="anonymous"></script>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link
            href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap"
            rel="stylesheet">
        <link rel="stylesheet" href="./../style/logincadastro.css">
        <title>Old Generation Games</title>
    </head>

    <body>
        <a href="./../redirect.jsp" id="voltar"><i class="fa-solid fa-arrow-left"></i></a>
        <div class="container">

            <div class="TelaCadastro">
                <h2>Bem faça sua conta!</h2>
                <div class="inputfield inputNome">
                    <i class="fa-solid fa-user"></i>
                    <input type="text" placeholder="Seu nome..." id="nome">
                </div>
                <div class="inputfield inputEmail">
                    <i class="fa-regular fa-envelope"></i>
                    <input type="email" placeholder="Seu email..." id="email"
                        pattern="[a-z0-9._%+\-]+@gmail.com[a-z0-9.\-]+\.[a-z]{2,}$">
                </div>
                <div class="inputfield inputTelefone">
                    <i class="fa-solid fa-phone"></i>
                    <input type="tel" placeholder="00 00000-0000" id="fone" pattern="(?=.*\d[0-9]){2}[0-9]{5}-[0-9]{4}">
                </div>
                <div class="inputfield inputCpf">
                    <i class="fa-solid fa-id-card"></i>
                    <input type="text" placeholder="000.000.000-00" id="cpf"
                        pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}">
                </div>
                <div class="inputfield inputSenha">
                    <i class="fa-solid fa-lock"></i>
                    <input type="password" placeholder="Seu senha..." id="senha" pattern="{8,}">
                </div>
                <button><i class="fa-solid fa-check"></i>Cadastrar</button>
            </div>
            <div class="TelaLogin">
                <h2>Bem-vindo de volta!</h2>
                <div class="inputfield email">
                    <i class="fa-regular fa-envelope"></i>
                    <input type="email" placeholder="Seu email..." id="email"
                        pattern="[a-z0-9._%+\-]+@gmail.com[a-z0-9.\-]+\.[a-z]{2,}$">
                </div>
                <div class="inputfield senha">
                    <i class="fa-solid fa-lock"></i>
                    <input type="password" id="senha" placeholder="Sua senha..." pattern="{8,}">
                </div>
                <button><i class="fa-solid fa-check"></i>Logar</button>
            </div>
            <div class="panels-container">
                <div class="panel panel-left">
                    <div class="content">
                        <h3>Você já tem uma conta?</h3>
                        <p>se caso tenha clique abaixo!</p>
                        <button class="btn" id="logar">Logar</button>
                    </div>
                    <img src="./../assets/1-removebg-preview.png" alt="ogg logo" class="image">
                </div>
                <div class="panel panel-right">
                    <div class="content">
                        <h3>Você não tem uma conta?</h3>
                        <p>Crie ela agora mesmo!</p>
                        <button class="btn" id="cadastrar">Cadastrar</button>
                    </div>
                    <img src="./../assets/1-removebg-preview.png" alt="ogg logo" class="image">
                </div>
            </div>
        </div>
        <script src="./../js/app.js"></script>
    </body>

    </html>