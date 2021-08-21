-- cria banco de dados
create database db_construindo_a_nossa_vida;

-- puxa banco de dados p/criar tabela
use db_construindo_a_nossa_vida;

-- cria tabela 
create table tb_categoria(
	ID_CATEGORIA bigint auto_increment,
    CATEGORIA varchar(50),
	NOTA_FISCAL boolean,
    PRIMARY KEY(ID_CATEGORIA)
)
engine=InnoDB;

-- cria dados tabela
insert into tb_categoria(CATEGORIA,NOTA_FISCAL) values ("MATERIAIS HIDRAÚLICOS",true);
insert into tb_categoria(CATEGORIA,NOTA_FISCAL) values ("MATERIAIS ELÉTRICOS",true);
insert into tb_categoria(CATEGORIA,NOTA_FISCAL) values ("FIXADORES",true);
insert into tb_categoria(CATEGORIA,NOTA_FISCAL) values ("REVESTIMENTOS",true);
insert into tb_categoria(CATEGORIA,NOTA_FISCAL) values ("OUTROS",true);

-- apresenta tabela
select * from tb_categoria;