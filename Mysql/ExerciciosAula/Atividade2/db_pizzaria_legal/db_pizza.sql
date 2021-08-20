-- puxa banco de dados p/criar tabela
use db_pizzaria_legal;

-- cria tabela 
create table tb_pizza(
	ID_PIZZA bigint auto_increment,
    SABOR varchar(50) not null,
    BORDA boolean,
    PREÇO decimal (10.2) not null,
    ID_CATEGORIA bigint not null,
    PRIMARY KEY(ID_PIZZA),
    FOREIGN KEY(ID_CATEGORIA) references tb_categoria(ID_CATEGORIA)
)
engine=InnoDB;

-- cria dados tabela
insert into tb_pizza(SABOR,BORDA,PREÇO,ID_CATEGORIA) values("TOSCANA",true,45.00,1);
insert into tb_pizza(SABOR,BORDA,PREÇO,ID_CATEGORIA) values("CALABRESA",true,39.00,1);
insert into tb_pizza(SABOR,BORDA,PREÇO,ID_CATEGORIA) values("ATUM",true,47.00,1);
insert into tb_pizza(SABOR,BORDA,PREÇO,ID_CATEGORIA) values("MUSSARELA",true,39.00,1);
insert into tb_pizza(SABOR,BORDA,PREÇO,ID_CATEGORIA) values("BRIGADEIRO",true,29.00,2);
insert into tb_pizza(SABOR,BORDA,PREÇO,ID_CATEGORIA) values("OREON",true,29.00,2);
insert into tb_pizza(SABOR,BORDA,PREÇO,ID_CATEGORIA) values("PALMITO",true,50.00,3);
insert into tb_pizza(SABOR,BORDA,PREÇO,ID_CATEGORIA) values("VEGUERITA",true,50.00,3);

-- apresenta tabela
select * from tb_pizza;

-- seleciona dados c/preço > 45.00
select * from tb_pizza where PREÇO > 45.00; 

-- seleciona dados c/preço entre 29.00 e 60.00
select * from tb_pizza where PREÇO >= 29.00 and PREÇO <= 60.00;

-- seleciona dados de pizzas c/a letra 'c'
select * from tb_pizza where SABOR like "%C%"; 

-- Inner Join entre tb_categoria e tb_pizza 
select * from tb_pizza
inner join tb_categoria on tb_categoria.ID_CATEGORIA = tb_pizza. ID_CATEGORIA
  
-- Inner Join entre tb_categoria e tb_pizza selecionando apenas dados 'salgada'
select tb_pizza.SABOR, tb_pizza.BORDA, tb_pizza.PREÇO, tb_pizza.ID_CATEGORIA
from tb_pizza
inner join tb_categoria on tb_categoria.ID_CATEGORIA = tb_pizza. ID_CATEGORIA
where tb_categoria.TIPO  = "SALGADA"