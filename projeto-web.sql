CREATE DATABASE projeto_web;

USE projeto_web;

CREATE TABLE usuario (
idUsuario INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(255) NOT NULL,
senha VARCHAR(255) NOT NULL,
email VARCHAR(255) NOT NULL,
telefone VARCHAR(20) NOT NULL,
cpf VARCHAR(14) NOT NULL
);

CREATE TABLE produtos (
idProdutos INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(255) NOT NULL,
imagem longblob,
categoria VARCHAR(100) NOT NULL,
descricao TEXT,
preco DECIMAL(10, 2) NOT NULL,
quantidade INT NOT NULL
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
categoria_carrinho VARCHAR(100) NOT NULL,
descricao_carrinho TEXT,
preco_carrinho DECIMAL(10, 2) NOT NULL,
quantidade_carrinho INT NOT NULL,
idProdutos INT,
foreign key (idProdutos) references Produtos (idProdutos)
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

