-- puxa banco de dados p/criar tabela
use db_construindo_a_nossa_vida;

-- cria tabela 
Create table tb_produto(
	ID_PRODUTO bigint auto_increment,
    CÓDIGO varchar(20) not null,
    PRODUTO varchar(50) not null,
    PREÇO_PEÇA decimal(5,2) not null,
	ID_CATEGORIA bigint not null,
	primary key(ID_PRODUTO),
    foreign key(ID_CATEGORIA) references tb_categoria(ID_CATEGORIA)
)
engine=InnoDB; 

-- cria dados tabela
insert into tb_produto(CÓDIGO,PRODUTO,PREÇO_PEÇA,ID_CATEGORIA) values("001","INTERRUPTOR",23.52,2);
insert into tb_produto(CÓDIGO,PRODUTO,PREÇO_PEÇA,ID_CATEGORIA) values("002","PIA DE COZINHA",359.90,1);
insert into tb_produto(CÓDIGO,PRODUTO,PREÇO_PEÇA,ID_CATEGORIA) values("003","AZULEJO",19.90,4);
insert into tb_produto(CÓDIGO,PRODUTO,PREÇO_PEÇA,ID_CATEGORIA) values("004","PREGO DE AÇO",8.91,3);
insert into tb_produto(CÓDIGO,PRODUTO,PREÇO_PEÇA,ID_CATEGORIA) values("005","CHUVEIRO",62.90,1);
insert into tb_produto(CÓDIGO,PRODUTO,PREÇO_PEÇA,ID_CATEGORIA) values("006","LIXA",0.89,5);
insert into tb_produto(CÓDIGO,PRODUTO,PREÇO_PEÇA,ID_CATEGORIA) values("007","LÂMPADA LED",9.90,2);
insert into tb_produto(CÓDIGO,PRODUTO,PREÇO_PEÇA,ID_CATEGORIA) values("008","PARAFUSO FRANCES",10.71,3);

-- apresenta tabela
select * from tb_produto

-- seleciona dados c/preço > 50.00;
select * from tb_produto where PREÇO_PEÇA > 50.00

-- seleciona dados c/preço entre 3.00 e 60.00;
select * from tb_produto where PREÇO_PEÇA >= 3.00 and PREÇO_PEÇA <= 60.00

-- seleciona dados de produtos c/a letra 'c'
select * from tb_produto where PRODUTO like "%C%"; 

-- Inner Join entre tb_categoria e tb_produto 
select * from tb_produto
inner join tb_categoria on tb_categoria.ID_CATEGORIA = tb_produto. ID_CATEGORIA
  
-- Inner Join entre tb_categoria e tb_produto selecionando apenas dados 'fixadores'
select tb_produto.CÓDIGO, tb_produto.PRODUTO, tb_produto.PREÇO_PEÇA, tb_produto.ID_CATEGORIA
from tb_produto
inner join tb_categoria on tb_categoria.ID_CATEGORIA = tb_produto. ID_CATEGORIA
where tb_categoria.CATEGORIA  = "FIXADORES"