-- puxa banco de dados p/criar tabela
use db_generation_game_online;

-- cria tabela 
create table tb_personagem(
	ID_PERSONAGEM bigint auto_increment,
    NOME varchar(20) not null,
    ATAQUE decimal(5) not null,
    DEFESA decimal(5) not null,
    ID_CLASSE bigint not null,
    PRIMARY KEY(ID_PERSONAGEM),
    FOREIGN KEY(ID_CLASSE) references tb_classe(ID_CLASSE)
    )
    engine=InnoDB;

-- cria dados tabela
    insert into tb_personagem (NOME,ATAQUE,DEFESA,ID_CLASSE) values("CAPITAO",300,500,1);
    insert into tb_personagem (NOME,ATAQUE,DEFESA,ID_CLASSE) values("INQUISIDOR",5000,3000,4);
    insert into tb_personagem (NOME,ATAQUE,DEFESA,ID_CLASSE) values("ERRANTE",2800,2000,3);
    insert into tb_personagem (NOME,ATAQUE,DEFESA,ID_CLASSE) values("ESPADACHIM",400,300,1);
    insert into tb_personagem (NOME,ATAQUE,DEFESA,ID_CLASSE) values("ALQUIMISTA",890,700,2);
    insert into tb_personagem (NOME,ATAQUE,DEFESA,ID_CLASSE) values("DEFENCSOR",2500,3000,3);
    insert into tb_personagem (NOME,ATAQUE,DEFESA,ID_CLASSE) values("CAVALEIRA",800,1000,2);
    insert into tb_personagem (NOME,ATAQUE,DEFESA,ID_CLASSE) values("EXECUTOR",3500,4000,4);

-- apresenta tabela
select * from tb_personagem
 
-- seleciona dados c/ataque > 2000
    select * from tb_personagem where ATAQUE > 2000;

-- seleciona dados c/defesa entre 1000 e 2000
    select * from tb_personagem where DEFESA >= 1000 and DEFESA <= 2000;
    
-- seleciona dados de personagens c/a letra 'c'
    select * from tb_personagem where nome like "%C%";

-- Inner Join entre tb_classe e tb_personagem   
    select * from tb_personagem
	inner join tb_classe on tb_classe.ID_CLASSE = tb_personagem. ID_CLASSE
    
-- Inner Join entre tb_ classe e tb_personagem selecionando apenas dados da 4º classe
    select tb_personagem.NOME, tb_personagem.ATAQUE, tb_personagem.DEFESA, tb_personagem.ID_CLASSE
	from tb_personagem 
	inner join tb_classe on tb_classe.ID_CLASSE = tb_personagem. ID_CLASSE
	where tb_personagem.ID_CLASSE = 4
	