-- cria banco de dados
create database db_pizzaria_legal;

-- puxa banco de dados p/criar tabela
use db_pizzaria_legal;

-- cria tabela 
create table tb_categoria(
	ID_CATEGORIA bigint auto_increment,
    TIPO varchar(20),
    PIZZA boolean,
    PRIMARY KEY(ID_CATEGORIA)
)
engine=InnoDB;

-- cria dados tabela
insert into tb_categoria(TIPO,PIZZA) values ("SALGADA",true);
insert into tb_categoria(TIPO,PIZZA) values ("DOCE",true);
insert into tb_categoria(TIPO,PIZZA) values ("VEGANA",true);

-- apresenta tabela
select * from tb_categoria;