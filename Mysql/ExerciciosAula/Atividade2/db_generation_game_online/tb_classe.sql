  -- cria banco de dados
create database db_generation_game_online

-- puxa banco de dados p/criar tabela
use db_generation_game_online;

-- cria tabela 
create table tb_classe(
	ID_CLASSE bigint auto_increment,
    CLASSE varchar(2) not null,
    ARMADURA boolean,
    PRIMARY KEY(ID_CLASSE)
    )
	engine=InnoDB;

-- cria dados tabela
insert into tb_classe(CLASSE,ARMADURA) values("1ª",true);
insert into tb_classe(CLASSE,ARMADURA) values("2ª",true);
insert into tb_classe(CLASSE,ARMADURA) values("3ª",true);
insert into tb_classe(CLASSE,ARMADURA) values("4ª",true);

-- apresenta tabela
select * from tb_classe;