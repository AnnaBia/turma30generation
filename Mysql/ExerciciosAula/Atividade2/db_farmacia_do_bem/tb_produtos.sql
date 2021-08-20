-- puxa banco de dados p/criar tabela
use db_farmacia_do_bem;

-- cria tabela 
create table tb_produtos(
	ID_PRODUTOS bigint auto_increment,
    CÓDIGO varchar(7) not null,
    NOME varchar(50) not null,
    PREÇO decimal(5,2) not null,
    ID_CATEGORIA bigint not null,
    PRIMARY KEY(ID_PRODUTOS),
    FOREIGN KEY(ID_CATEGORIA) references tb_categoria(ID_CATEGORIA)
    )
    engine=InnoDB;

-- cria dados tabela
    insert into tb_produtos (CÓDIGO,NOME,PREÇO,ID_CATEGORIA) values("G-00001","MEDIDOR DE PRESSÃO",99.00,4);
    insert into tb_produtos (CÓDIGO,NOME,PREÇO,ID_CATEGORIA) values("G-00002","SHAMPOO",8.70,3);
    insert into tb_produtos (CÓDIGO,NOME,PREÇO,ID_CATEGORIA) values("G-00003","BUSCOPAN",19.00,1);
    insert into tb_produtos (CÓDIGO,NOME,PREÇO,ID_CATEGORIA) values("G-00004","CREME HIDRATANTE",29.99,2);
    insert into tb_produtos (CÓDIGO,NOME,PREÇO,ID_CATEGORIA) values("G-00005","PROTETOR SOLAR",38.99,2);
    insert into tb_produtos (CÓDIGO,NOME,PREÇO,ID_CATEGORIA) values("G-00006","ESCOVA DE DENTE",15.00,3);
    insert into tb_produtos (CÓDIGO,NOME,PREÇO,ID_CATEGORIA) values("G-00007","DORFLEX",17.90,1);
    insert into tb_produtos (CÓDIGO,NOME,PREÇO,ID_CATEGORIA) values("G-00008","DIPIRONA",4.85,4);

-- apresenta tabela
select * from tb_produtos
 
-- seleciona dados c/preço > 50.00
    select * from tb_produtos where PREÇO > 50.00;

-- seleciona dados c/preço entre 3.00 e 60.00
    select * from tb_produtos where PREÇO >= 3.00 and PREÇO <= 60.00;
    
-- seleciona dados de produtos c/a letra 'B'
    select * from tb_produtos where NOME like "%B%";

-- Inner Join entre tb_categoria e tb_produtos   
    select * from tb_produtos
	inner join tb_categoria on tb_produtos.ID_CATEGORIA = tb_produtos. ID_CATEGORIA
    
-- Inner Join entre tb_ tb_categoria e tb_produtos selecionando apenas dados COSMÉTICO
    select tb_produtos.CÓDIGO, tb_produtos.NOME, tb_produtos.PREÇO, tb_produtos.ID_CATEGORIA
	from tb_produtos 
	inner join tb_categoria on tb_categoria.ID_CATEGORIA = tb_produtos. ID_CATEGORIA
	where tb_categoria.TIPO = "COSMÉTICO"