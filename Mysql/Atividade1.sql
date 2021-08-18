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

select * from tb_funcionaries

insert into tb_funcionaries(nome,cargo,salario,ativo) values("Beatriz","Vendedora",1600.00,true);
insert into tb_funcionaries(nome,cargo,salario,ativo) values("Leticia","Vendedora",1600.00,true);
insert into tb_funcionaries(nome,cargo,salario,ativo) values("Ronie","Estoquista",1800.00,true);
insert into tb_funcionaries(nome,cargo,salario,ativo) values("Arlete","Auxiliar de Limpeza",1400.00,true);
insert into tb_funcionaries(nome,cargo,salario,ativo) values("Érica","Gerente",3000.00,true);

select * from tb_funcionaries
    
select * from tb_funcionaries where salario > 2000;
select * from tb_funcionaries where salario < 2000;
    


