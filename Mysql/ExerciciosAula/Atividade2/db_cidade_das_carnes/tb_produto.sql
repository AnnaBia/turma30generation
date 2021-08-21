-- puxa banco de dados p/criar tabela
use db_cidade_das_carnes;

-- cria tabela 
create table tb_produto(
	ID_PRODUTO bigint auto_increment,
    PRODUTO varchar(50) not null,
    PREÇO_KG decimal(5,2) not null,
    DISPONÍVEL boolean,
	ID_CATEGORIA bigint not null,
	primary key(ID_PRODUTO),
    FOREIGN KEY(ID_CATEGORIA) references tb_categoria(ID_CATEGORIA)
)
engine=InnoDB; 

-- cria dados tabela
insert into tb_produto(PRODUTO,PREÇO_KG,DISPONÍVEL,ID_CATEGORIA) values("MUSSARELA",42.89,true,3);
insert into tb_produto(PRODUTO,PREÇO_KG,DISPONÍVEL,ID_CATEGORIA) values("COSTELA",152.90,true,1);
insert into tb_produto(PRODUTO,PREÇO_KG,DISPONÍVEL,ID_CATEGORIA) values("BACALHAU",175.99,true,2);
insert into tb_produto(PRODUTO,PREÇO_KG,DISPONÍVEL,ID_CATEGORIA) values("BISTECA",22.00,true,1);
insert into tb_produto(PRODUTO,PREÇO_KG,DISPONÍVEL,ID_CATEGORIA) values("FAROFA",7.99,true,4);
insert into tb_produto(PRODUTO,PREÇO_KG,DISPONÍVEL,ID_CATEGORIA) values("NUGGETS",29.15,true,2);
insert into tb_produto(PRODUTO,PREÇO_KG,DISPONÍVEL,ID_CATEGORIA) values("MORTADELA",13.09,true,3);
insert into tb_produto(PRODUTO,PREÇO_KG,DISPONÍVEL,ID_CATEGORIA) values("ASA DE FRANGO",21.99,true,2);

-- apresenta tabela
select * from tb_produto

-- seleciona dados c/preço > 50.00;
select * from tb_produto where PREÇO_KG > 50.00

-- seleciona dados c/preço entre 3.00 e 60.00;
select * from tb_produto where PREÇO_KG >= 3.00 and PREÇO_KG <= 60.00

-- seleciona dados de produtos c/a letra 'c'
select * from tb_produto where PRODUTO like "%C%"; 

-- Inner Join entre tb_categoria e tb_produto 
select * from tb_produto
inner join tb_categoria on tb_categoria.ID_CATEGORIA = tb_produto. ID_CATEGORIA
  
-- Inner Join entre tb_categoria e tb_produto selecionando apenas dados 'frios'
select tb_produto.PRODUTO, tb_produto.PREÇO_KG, tb_produto.DISPONÍVEL, tb_produto.ID_CATEGORIA
from tb_produto
inner join tb_categoria on tb_categoria.ID_CATEGORIA = tb_produto. ID_CATEGORIA
where tb_categoria.CATEGORIA  = "FRIOS"