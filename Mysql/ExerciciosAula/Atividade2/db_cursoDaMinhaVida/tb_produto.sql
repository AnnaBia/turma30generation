-- puxa banco de dados p/criar tabela
use db_cursoDaMinhaVida;

-- cria tabela 
create table tb_produto(
	ID_PRODUTO bigint auto_increment,
    CURSO varchar(50) not null,
    NÍVEL varchar(50) not null,
	PREÇO_SEMESTRAL decimal(10,2) not null,
	ID_CATEGORIA bigint not null,
	primary key(ID_PRODUTO),
    foreign key(ID_CATEGORIA) references tb_categoria(ID_CATEGORIA)
)
engine=InnoDB; 

-- cria dados tabela
insert into tb_produto(CURSO,NÍVEL,PREÇO_SEMESTRAL,ID_CATEGORIA) values("PHP","BÁSICO,MÉDIO,AVANÇADO",150.00,1);
insert into tb_produto(CURSO,NÍVEL,PREÇO_SEMESTRAL,ID_CATEGORIA) values("ANDROID","BÁSICO,MÉDIO,AVANÇADO",300.00,5);
insert into tb_produto(CURSO,NÍVEL,PREÇO_SEMESTRAL,ID_CATEGORIA) values("PYTHON","BÁSICO,MÉDIO,AVANÇADO",150.00,1);
insert into tb_produto(CURSO,NÍVEL,PREÇO_SEMESTRAL,ID_CATEGORIA) values("HTML","BÁSICO,MÉDIO,AVANÇADO",100.00,2);
insert into tb_produto(CURSO,NÍVEL,PREÇO_SEMESTRAL,ID_CATEGORIA) values("ANGULAR","BÁSICO,MÉDIO,AVANÇADO",100.00,2);
insert into tb_produto(CURSO,NÍVEL,PREÇO_SEMESTRAL,ID_CATEGORIA) values("POWER BI","BÁSICO,MÉDIO,AVANÇADO",200.00,3);
insert into tb_produto(CURSO,NÍVEL,PREÇO_SEMESTRAL,ID_CATEGORIA) values("DATOMIC","BÁSICO,MÉDIO,AVANÇADO",200.00,3);
insert into tb_produto(CURSO,NÍVEL,PREÇO_SEMESTRAL,ID_CATEGORIA) values("BLENDER","BÁSICO,MÉDIO",250.00,4);

-- apresenta tabela
select * from tb_produto

-- seleciona dados c/preço > 50.00;
select * from tb_produto where PREÇO_SEMESTRAL > 50.00

-- seleciona dados c/preço entre 3.00 e 60.00;
select * from tb_produto where PREÇO_SEMESTRAL >= 3.00 and PREÇO_SEMESTRAL <= 60.00

-- seleciona dados de cursos c/a letra 'c'
select * from tb_produto where CURSO like "%C%"; 

-- Inner Join entre tb_categoria e tb_produto 
select * from tb_produto
inner join tb_categoria on tb_categoria.ID_CATEGORIA = tb_produto. ID_CATEGORIA
  
-- Inner Join entre tb_categoria e tb_produto selecionando apenas dados 'fixadores'
select tb_produto.CURSO, tb_produto.NÍVEL, tb_produto.PREÇO_SEMESTRAL, tb_produto.ID_CATEGORIA
from tb_produto
inner join tb_categoria on tb_categoria.ID_CATEGORIA = tb_produto. ID_CATEGORIA
where tb_categoria.CATEGORIA  = "PROGRAMAÇÃO"