-- cria banco de dados
create database db_pizzaria_legal;

-- puxa banco de dados p/criar tabela
use db_pizzaria_legal;

-- cria tabela 
create table tb_categoria(
	ID_TIPO varchar(50) not null,
    BROTINHO boolean,
    PIZZA boolean,
    PRIMARY KEY(ID_TIPO)
);

-- cria dados tabela
insert into tb_categoria(ID_TIPO,BROTINHO,PIZZA) values ("SALGADA",true,true);
insert into tb_categoria(ID_TIPO,BROTINHO,PIZZA) values ("DOCE",true,true);
insert into tb_categoria(ID_TIPO,BROTINHO,PIZZA) values ("VEGANA",true,true);

-- apresenta tabela
select * from tb_categoria;

