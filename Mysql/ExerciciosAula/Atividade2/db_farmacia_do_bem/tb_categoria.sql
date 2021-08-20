-- cria banco de dados
create database db_farmacia_do_bem;

-- puxa banco de dados p/criar tabela
use db_farmacia_do_bem;

-- cria tabela 
create table tb_categoria(
	ID_CATEGORIA bigint auto_increment,
    TIPO varchar(50) not null,
    CORREDOR varchar(20) not null,
    PRIMARY KEY(ID_CATEGORIA)
    )
	engine=InnoDB;

-- cria dados tabela
insert into tb_categoria(TIPO,CORREDOR) values("MEDICAMENTO","1, 2, 3");
insert into tb_categoria(TIPO,CORREDOR) values("COSMÉTICO","4");
insert into tb_categoria(TIPO,CORREDOR) values("HIGIENE","5");
insert into tb_categoria(TIPO,CORREDOR) values("APARELHO","balcão");

-- apresenta tabela
select * from tb_categoria;
