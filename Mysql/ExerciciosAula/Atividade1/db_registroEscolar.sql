-- cria banco de dados
create database db_registroEscolar

-- puxa banco de dados p/criar tabela
use db_registroEscolar;

-- cria tabela 
Create table tb_estudantes(
	id bigint(10) auto_increment,
    Matrícula int(10) not null,
    Nome varchar(50) not null,
    Turma varchar(10) not null,
	Nota int(5) not null,
    Situação varchar(50) not null,
	primary key(id)
);

-- cria dados tabela
insert into tb_estudantes(Matrícula,Nome,Turma,Nota,Situação) values(111,"Angélica","1ªsérie",8,"Aprovado");
insert into tb_estudantes(Matrícula,Nome,Turma,Nota,Situação) values(112,"Gabriel","1ªsérie",8,"Aprovado");
insert into tb_estudantes(Matrícula,Nome,Turma,Nota,Situação) values(113,"Angela","1ªsérie",8,"Aprovado");
insert into tb_estudantes(Matrícula,Nome,Turma,Nota,Situação) values(114,"Gerson","1ªsérie",8,"Aprovado");
insert into tb_estudantes(Matrícula,Nome,Turma,Nota,Situação) values(115,"Ana Beatriz","1ªsérie",5,"Reprovado");
insert into tb_estudantes(Matrícula,Nome,Turma,Nota,Situação) values(116,"Alejandro","1ªsérie",9,"Aprovado");
insert into tb_estudantes(Matrícula,Nome,Turma,Nota,Situação) values(117,"Henry","1ªsérie",9,"Aprovado");
insert into tb_estudantes(Matrícula,Nome,Turma,Nota,Situação) values(118,"Leticia","1ªsérie",9,"Aprovado");

-- apresenta tabela
select * from tb_estudantes

-- seleciona dados c/nota > 7;
select * from tb_estudantes where nota > 7

-- seleciona dados c/nota < 7;
select * from tb_estudantes where nota < 7

-- atualizando situação Ana
update tb_estudantes set Matrícula = "115", Nome = "Ana Beatriz", Turma = "1ªsérie", Nota = 10, Situação = "Aprovado" where id = 5;

-- apresenta tabela
select * from tb_estudantes

