-- puxa banco de dados p/criar tabela
use db_pizzaria_legal;

-- cria tabela 
create table tb_pizza(
	ID_PIZZA bigint auto_increment,
    SABOR varchar(50) not null,
    BORDA boolean,
    PREÇO decimal (10.2) not null,
    ID_TIPO varchar(50) not null,
    PRIMARY KEY(ID_PIZZA),
    FOREIGN KEY(ID_TIPO) references tb_categoria(ID_TIPO)
);

-- cria dados tabela
insert into tb_pizza(SABOR,BORDA,PREÇO,ID_TIPO) values("TOSCANA",true,45.00,"SALGADA");
insert into tb_pizza(SABOR,BORDA,PREÇO,ID_TIPO) values("CALABRESA",true,39.00,"SALGADA");
insert into tb_pizza(SABOR,BORDA,PREÇO,ID_TIPO) values("ATUM",true,47.00,"SALGADA");
insert into tb_pizza(SABOR,BORDA,PREÇO,ID_TIPO) values("MUSSARELA",true,39.00,"SALGADA");
insert into tb_pizza(SABOR,BORDA,PREÇO,ID_TIPO) values("BRIGADEIRO",true,29.00,"DOCE");
insert into tb_pizza(SABOR,BORDA,PREÇO,ID_TIPO) values("OREON",true,29.00,"DOCE");
insert into tb_pizza(SABOR,BORDA,PREÇO,ID_TIPO) values("PALMITO",true,50.00,"VEGANA");
insert into tb_pizza(SABOR,BORDA,PREÇO,ID_TIPO) values("VEGUERITA",true,50.00,"VEGANA");

-- apresenta tabela
select * from tb_classe;

-- seleciona dados c/preço > 45.00
select * from tb_pizza where PREÇO > 45.00; 

-- seleciona dados c/preço entre 29.00 e 60.00
select * from tb_pizza where PREÇO >= 29.00 and PREÇO <= 60.00;

-- seleciona dados de pizzas c/a letra 'c'
select * from tb_pizza where SABOR like "%C%"; 

-- Inner Join entre tb_categoria e tb_pizza 
select * from tb_pizza
inner join tb_categoria on tb_categoria.ID_TIPO = tb_pizza. ID_TIPO
  
-- Inner Join entre tb_categoria e tb_pizza selecionando apenas dados 'salgada'
select tb_pizza.SABOR, tb_pizza.BORDA, tb_pizza.PREÇO, tb_pizza.ID_TIPO
from tb_pizza
inner join tb_categoria on tb_categoria.ID_TIPO = tb_pizza. ID_TIPO
where tb_pizza.ID_TIPO = "SALGADA"