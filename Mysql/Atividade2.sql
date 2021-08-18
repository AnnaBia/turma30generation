Create database db_ecommerce

use db_ecommerce;
	create table tb_produtos(
		id bigint(5) auto_increment,
        Código varchar(20) not null,
        Produto varchar(50) not null,
        Preço float(10) not null,
        Estoque int(5) not null,
        primary key(id)
	);

insert into tb_produtos(Código,Produto,Preço,Estoque) values("G-001","Fone bluetoth",120.00,100);
insert into tb_produtos(Código,Produto,Preço,Estoque) values("G-002","Carregador USB",100.00,100);
insert into tb_produtos(Código,Produto,Preço,Estoque) values("G-003","Mouse s/fio",100.00,100);
insert into tb_produtos(Código,Produto,Preço,Estoque) values("G-004","Teclado led",200.00,100);
insert into tb_produtos(Código,Produto,Preço,Estoque) values("G-005","Cadeira Gamer",1500.00,100);
insert into tb_produtos(Código,Produto,Preço,Estoque) values("G-006","Adaptador HDMI",190.00,100);
insert into tb_produtos(Código,Produto,Preço,Estoque) values("G-007","Monitor c/suporte regulável",550.00,100);
insert into tb_produtos(Código,Produto,Preço,Estoque) values("G-008","Impressora",400.00,100);

select * from tb_produtos where Preço > 500.00;
select * from tb_produtos where Preço < 500.00;

update tb_produtos set Código = "G-003", Produto = "Mouse s/fio", Preço = 100.00, Estoque = 80 where id = 3;

select * from tb_produtos
