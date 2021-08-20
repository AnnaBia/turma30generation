-- CRIAÇÃO DO BANCO DE DADOS
DROP DATABASE IF EXISTS db_projeto_integrador;
CREATE DATABASE db_projeto_integrador;

-- TABELAS DO PROJETO
USE db_projeto_integrador;

CREATE TABLE IF NOT EXISTS `tb_tema` (
    `id_tema` BIGINT NOT NULL AUTO_INCREMENT, -- identificação do tema
    `titulo` VARCHAR(55) NOT NULL, -- titulo do projeto
    `img` VARCHAR(255), -- imagem anexadas no tema
    `texto` VARCHAR(255) NOT NULL, -- texto do tema
    PRIMARY KEY (`id_tema`) -- chave primária da identificação
)  ENGINE=INNODB; -- segurança da tabela

CREATE TABLE IF NOT EXISTS `tb_usuario` (
    `id_usuario` BIGINT NOT NULL AUTO_INCREMENT, -- identificação do usuário
    `id_adm` BOOLEAN NOT NULL, -- identificação do administrador
    `nome_completo` VARCHAR(50) NOT NULL, -- nome completo do usuário/administrador
    `email` VARCHAR(50) NOT NULL, -- email do usuário/administrador
    `senha` VARCHAR(12) NOT NULL, -- senha do usuário/administrador
    PRIMARY KEY (`id_usuario`) -- chave primária do usuário
)  ENGINE=INNODB; -- segurança da tabela

CREATE TABLE IF NOT EXISTS `tb_postagem` (
    `id_postagem` BIGINT NOT NULL AUTO_INCREMENT, -- identificação da postagem
    `data` TIME NOT NULL, -- data da postagem
    `texto` VARCHAR(255) NOT NULL, -- texto da postagem
    `img` VARCHAR(255), -- imagem anexada na postagem
    `id_tema` BIGINT NOT NULL, -- identificação do tema
    `id_usuario` BIGINT NOT NULL, -- identificação do usuário
    PRIMARY KEY (`id_postagem`), -- chave primária da postagem
    FOREIGN KEY (`id_usuario`) -- chave estrangeira do usuário
        REFERENCES tb_usuario (`id_usuario`), -- referência da chave
    FOREIGN KEY (`id_tema`) -- chave estrangeira do usuário
        REFERENCES tb_tema (`id_tema`) -- refência da chave
)  ENGINE=INNODB; -- segurança da tabela