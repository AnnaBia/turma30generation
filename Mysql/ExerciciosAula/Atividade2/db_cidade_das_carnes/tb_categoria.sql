-- cria banco de dados
create database db_cidade_das_carnes;

-- puxa banco de dados p/criar tabela
use db_cidade_das_carnes;

-- cria tabela 
create table tb_categoria(
	ID_CATEGORIA bigint auto_increment,
    CATEGORIA varchar(50),
	FRESCA boolean,
    PRIMARY KEY(ID_CATEGORIA)
)
engine=InnoDB;

-- cria dados tabela
insert into tb_categoria(CATEGORIA,FRESCA) values ("CARNE VERMELHA",true);
insert into tb_categoria(CATEGORIA,FRESCA) values ("CARNE BRANCA",true);
insert into tb_categoria(CATEGORIA,FRESCA) values ("FRIOS",true);
insert into tb_categoria(CATEGORIA,FRESCA) values ("OUTROS",true);

-- apresenta tabela
select * from tb_categoria;