-- cria banco de dados
create database db_generation_game_online

-- puxa banco de dados p/criar tabela
use db_generation_game_online;

-- cria tabela 
create table tb_classe(
	ID_CLASSE varchar(2) not null,
    ARMADURA boolean,
    JOGANDO boolean,
    PRIMARY KEY(ID_CLASSE)
    );

-- cria dados tabela
insert into tb_classe (ID_CLASSE,ARMADURA,JOGANDO) values("1ª",true,true);
insert into tb_classe (ID_CLASSE,ARMADURA,JOGANDO) values("2ª",true,true);
insert into tb_classe (ID_CLASSE,ARMADURA,JOGANDO) values("3ª",true,true);
insert into tb_classe (ID_CLASSE,ARMADURA,JOGANDO) values("4ª",true,true);

-- apresenta tabela
select * from tb_classe;
    