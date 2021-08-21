-- cria banco de dados
create database db_cursoDaMinhaVida;

-- puxa banco de dados p/criar tabela
use db_cursoDaMinhaVida;

-- cria tabela 
create table tb_categoria(
	ID_CATEGORIA bigint auto_increment,
    CATEGORIA varchar(50),
	AULA_ONLINE boolean,
    PRIMARY KEY(ID_CATEGORIA)
)
engine=InnoDB;

-- cria dados tabela
insert into tb_categoria(CATEGORIA,AULA_ONLINE) values ("PROGRAMAÇÃO",true);
insert into tb_categoria(CATEGORIA,AULA_ONLINE) values ("FRONT-END",true);
insert into tb_categoria(CATEGORIA,AULA_ONLINE) values ("DATA SCIENCE",true);
insert into tb_categoria(CATEGORIA,AULA_ONLINE) values ("UX & DESIGN",true);
insert into tb_categoria(CATEGORIA,AULA_ONLINE) values ("MOBILE",true);

-- apresenta tabela
select * from tb_categoria;