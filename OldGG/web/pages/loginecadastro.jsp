<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="assets/logomaior.png">
        <script src="https://kit.fontawesome.com/560340c572.js" crossorigin="anonymous"></script>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link
            href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap"
            rel="stylesheet">
        <link rel="stylesheet" href="style/logincadastro.css">
        <title>Old Generation Games</title>
    </head>

    <body>
        <a href="./redirect.jsp" id="voltar"><i class="fa-solid fa-arrow-left"></i></a>
         <div class="container">
        <div class="signin-signup">
            <form class="sign-in-form"  >
                <h2 class="title">Logar</h2>
                <div class="input-field">
                    <i class="fas fa-user"></i>
                    <input type="text" placeholder="Nome">
                </div>
                <div class="input-field">
                    <i class="fas fa-lock"></i>
                    <input type="password" placeholder="Senha" pattern="{8,}">
                </div>
                <input type="submit" value="Login" class="btn">

      
                <p class="account-text">Don't have an account? <a href="#" id="sign-up-btn2">Sign up</a></p>
            </form>
            <form  action="./criar" class="sign-up-form" enctype="multipart/form-data" method="post">
                <h2 class="title">Cadastro</h2>
                <div class="input-field">
                    <i class="fas fa-user"></i>
                    <input type="text" placeholder="Nome" name="nome">
                </div>
                <div class="input-field">
                    <i class="fas fa-envelope"></i>
                    <input type="email" placeholder="Email" pattern="[a-z0-9._%+\-]+@[a-z0-9.\-]+\.[a-z]{2,}$" name="email">
                </div>
                <div class="input-field">
                    <i class="fas fa-lock"></i>
                    <input type="password" placeholder="Senha" pattern="{8,}" name="senha">
                </div>
                <div class="input-field">
                    <i class="fa-solid fa-id-card"></i>
                    <input type="text" placeholder="CPF"  pattern="[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}" id="cpf" name="cpf">

                </div>
                <div class="input-field">
                    <i class="fa-solid fa-phone"></i>
                    <input type="tel" placeholder="Telefone" pattern="[0-9]{2}[0-9]{5}-[0-9]{4}" id="telefone" name="telefone">
                </div>
                <input type="submit" value="Cadastrar" class="btn">

                <p class="account-text">Already have an account? <a href="#" id="sign-in-btn2">Sign in</a></p>
            </form>
        </div>
        <div class="panels-container">
            <div class="panel left-panel">
                <div class="content">
                    <h3>Já tem uma conta?</h3>
                    <p>Então faça o seu login e entre novamente!</p>
                    <button class="btn" id="sign-in-btn">Logar</button>
                </div>
                <img src="assets/logomaior.png" alt="" class="image">
            </div>
            <div class="panel right-panel">
                <div class="content">
                    <h3>Você é novo por aqui?</h3>
                    <p>Crie sua conta e venha fazer parte da velha guarda do jogos!</p>
                    <button class="btn" id="sign-up-btn">Cadastrar</button>
                </div>
                <img src="assets/logomaior.png" alt="" class="image">
            </div>
        </div>
    </div>
    <script src="js/app.js"></script>
    <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.16/jquery.mask.js"></script>
    <script src="js/mask.js"></script>
    </body>

    </html>