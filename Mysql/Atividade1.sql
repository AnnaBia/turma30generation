Create database db_admin

use db_admin;
	create table tb_funcionaries(
		id bigint(5) auto_increment,
        nome varchar(50) not null,
        cargo varchar(50) not null,
        salario float(10) not null,
        ativo boolean,
        primary key(id)
    );


insert into tb_funcionaries(nome,cargo,salario,ativo) values("Beatriz","Vendedora",1600.00,true);
insert into tb_funcionaries(nome,cargo,salario,ativo) values("Leticia","Vendedora",1600.00,true);
insert into tb_funcionaries(nome,cargo,salario,ativo) values("Ronie","Estoquista",1800.00,true);
insert into tb_funcionaries(nome,cargo,salario,ativo) values("Arlete","Auxiliar de Limpeza",1400.00,true);
insert into tb_funcionaries(nome,cargo,salario,ativo) values("Érica","Gerente",3000.00,true);
    

select * from tb_funcionaries where salario > 2000;
select * from tb_funcionaries where salario < 2000;
    

update tb_funcionaries set nome = "Beatriz", cargo = "Vendedora", salario = 1800.00, ativo = true where id = 1;

select * from tb_funcionaries

