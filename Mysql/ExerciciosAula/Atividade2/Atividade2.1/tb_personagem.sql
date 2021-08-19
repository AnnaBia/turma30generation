use db_generation_game_online;

create table tb_personagem(
	ID_PERSONAGEM bigint auto_increment,
    NOME varchar(20) not null,
    ATAQUE decimal(5) not null,
    DEFESA decimal(5) not null,
    ID_CLASSE varchar(2) not null,
    PRIMARY KEY(ID_PERSONAGEM),
    FOREIGN KEY(ID_CLASSE) references tb_classe(ID_CLASSE)
    );

    insert into tb_personagem (NOME,ATAQUE,DEFESA,ID_CLASSE) values("CAPITAO",300,500,"1ª");
    insert into tb_personagem (NOME,ATAQUE,DEFESA,ID_CLASSE) values("INQUISIDOR",5000,3000,"4ª");
    insert into tb_personagem (NOME,ATAQUE,DEFESA,ID_CLASSE) values("ERRANTE",2800,2000,"3ª");
    insert into tb_personagem (NOME,ATAQUE,DEFESA,ID_CLASSE) values("ESPADACHIM",400,300,"1ª");
    insert into tb_personagem (NOME,ATAQUE,DEFESA,ID_CLASSE) values("ALQUIMISTA",890,700,"2ª");
    insert into tb_personagem (NOME,ATAQUE,DEFESA,ID_CLASSE) values("DEFENCSOR",2500,3000,"3ª");
    insert into tb_personagem (NOME,ATAQUE,DEFESA,ID_CLASSE) values("CAVALEIRA",800,1000,"2ª");
    insert into tb_personagem (NOME,ATAQUE,DEFESA,ID_CLASSE) values("EXECUTOR",3500,4000,"4ª");
    
    select * from tb_personagem where ATAQUE > 2000;
    select * from tb_personagem where DEFESA >= 1000 and DEFESA <= 2000;
    select * from tb_personagem where nome like "%C%";
    
    select * from tb_personagem
	inner join tb_classe on tb_classe.ID = tb_personagem. CLASSE_ID
    
    select tb_personagem.NOME, tb_personagem.ATAQUE, tb_personagem.DEFESA, tb_personagem.ID_CLASSE
	from tb_personagem 
	inner join tb_classe on tb_classe.ID_CLASSE = tb_personagem. ID_CLASSE
	where tb_personagem.ID_CLASSE = "4ª"
	
    

