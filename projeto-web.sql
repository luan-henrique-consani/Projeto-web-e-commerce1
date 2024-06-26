CREATE DATABASE projeto_web;

USE projeto_web;

CREATE TABLE usuario (
idUsuario INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(255) NOT NULL,
senha VARCHAR(255) NOT NULL,
email VARCHAR(255) NOT NULL,
telefone VARCHAR(20) NOT NULL,
cpf VARCHAR(14) NOT NULL,
tipo_usuario INT
);
CREATE TABLE categoria(
idCategoria INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(45)
);
CREATE TABLE produtos (
idProdutos INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(255) NOT NULL,
imagem longblob,
sub_img_1 longblob,
sub_img_2 longblob,
sub_img_3 longblob,
categoria INT,
sub_categoria VARCHAR(100),
descricao TEXT,
preco DECIMAL(10, 2) NOT NULL,
quantidade INT NOT NULL,
FOREIGN KEY (categoria) REFERENCES categoria (idCategoria)
);


CREATE TABLE estoque (
idEstoque INT AUTO_INCREMENT PRIMARY KEY,
nome_estoque VARCHAR(255) NOT NULL,
imagem_estoque longblob,
categoria_estoque VARCHAR(100) NOT NULL,
preco_estoque DECIMAL(10, 2) NOT NULL,
quantidade_estoque INT NOT NULL
);

CREATE TABLE carrinho (
idCarrinho INT AUTO_INCREMENT PRIMARY KEY,
nome_carrinho VARCHAR(255) NOT NULL,
imagem_carrinho longblob,
categoria_carrinho VARCHAR(100),
descricao_carrinho TEXT,
preco_carrinho DECIMAL(10, 2) NOT NULL,
quantidade_carrinho INT NOT NULL,
idProdutos INT,
idUsuario int,
total DECIMAL(10, 2),
foreign key (idUsuario) references Usuario (idUsuario),
foreign key (idProdutos) references Produtos (idProdutos)
);

CREATE TABLE historico_produtos (
id INT PRIMARY KEY,
idProdutos INT,
acao VARCHAR(20),
data_hora TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
usuario VARCHAR(50)
);

DELIMITER $$
CREATE TRIGGER tirar_quantidade_estoque
AFTER INSERT ON carrinho
FOR EACH ROW
BEGIN
UPDATE estoque
SET quantidade_estoque = quantidade_estoque - NEW.quantidade_carrinho
WHERE nome_estoque = NEW.nome_carrinho;
END$$
DELIMITER ;

insert into usuario(nome, senha, email, telefone, cpf) values('Admin','Admin1234','adm@gmail.com','43 91234-567','123.456.789-10');
insert into categoria (nome) values ('Consoles'),('Action Figure'),('Acessorios');
SELECT SUM(p.preco * c.quantidade_carrinho) AS total FROM produtos p INNER JOIN carrinho c ON p.idProdutos = c.idProdutos;