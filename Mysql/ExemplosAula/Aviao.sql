create database voo321;

use voo321;

create table aviao(
	id_aviao int(11) not null,
    modelo varchar(50) not null,
    primary key(id_aviao)
)
engine=InnoDB; -- para trazer segurança ao banco de dados

desc aviao; -- descrição do aviao

show tables; -- apresenta a tabela

create table tripulantes(
	id_tripulacao int(11) not null,
    nome varchar(50) not null,
    genero char(1) not null check (genero in ('F', 'M', 'N')),-- de procurar
    id_aviao int(11) not null,
    foreign key (id_aviao) references aviao(id_aviao), -- referenciar a tabela aviao ao tripulantes
    primary key(id_tripulacao)
    )
engine=InnoDB;
    
desc tripulantes;
select * from aviao;
    
insert into aviao values(1,'Zoom');
insert into aviao values(2,'Roing');
insert into aviao values(3,'Excelcior');
insert into tripulantes values(16,'James Kirk','M',1);
insert into tripulantes values(86, 'Catherine Janeway', 'F', 2);
insert into tripulantes values(87, 'Uhura', 'F', 1);
insert into tripulantes values(48, 'Ikaru Sulu', 'M', 3);
insert into tripulantes values(52, 'Tuvok', 'M', 2);
insert into tripulantes values(1,'Jhony','M',1);
insert into tripulantes values(20, 'Sasha', 'N', 2);
insert into tripulantes values(30, 'Uhura', 'F', 1);
insert into tripulantes values(66, 'Price', 'N', 3);
insert into tripulantes values(55, 'Taira', 'N', 2);

select * from tripulantes;

set sql_safe_updates=0; 

UPDATE tripulantes SET genero='N';