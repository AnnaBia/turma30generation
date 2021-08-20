-- cria banco de dados
create database db_rh

-- puxa banco de dados p/criar tabela
use db_rh;

-- cria tabela 
	create table tb_funcionaries(
	id bigint auto_increment,
	nome varchar(50) not null,
	cargo varchar(50) not null,
	salario decimal(10,2) not null,
	ativo boolean,
	primary key(id)
    );

-- cria dados tabela
insert into tb_funcionaries(nome,cargo,salario,ativo) values("Beatriz","Vendedora",1600.00,true);
insert into tb_funcionaries(nome,cargo,salario,ativo) values("Leticia","Vendedora",1600.00,true);
insert into tb_funcionaries(nome,cargo,salario,ativo) values("Ronie","Estoquista",1800.00,true);
insert into tb_funcionaries(nome,cargo,salario,ativo) values("Arlete","Auxiliar de Limpeza",1400.00,true);
insert into tb_funcionaries(nome,cargo,salario,ativo) values("Érica","Gerente",3000.00,true);

-- apresenta tabela
select * from tb_funcionaries

-- seleciona dados c/salario > 2000.00;
select * from tb_funcionaries where salario > 2000;

-- seleciona dados c/salario < 2000.00;
select * from tb_funcionaries where salario < 2000;
    
-- atualizando salario func.Beatriz
update tb_funcionaries set nome = "Beatriz", cargo = "Vendedora", salario = 1800.00, ativo = true where id = 1;

-- apresenta tabela
select * from tb_funcionaries
