CREATE DATABASE db_ifpr;

CREATE TABLE tb_usuario (
    id INT AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    cpf CHAR(14) NOT NULL,
    data_nascimento DATE,
    sexo ENUM ('FEMININO','MASCULINO','OUTRO'),
    CONSTRAINT pk_tb_usuario PRIMARY KEY(id)
);