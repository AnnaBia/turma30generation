-- COMANDO INNER JOIN --

-- seleciona os dados em comum de acordo com o ID
select * from tb_produtos
	inner join tb_marcas on tb_marcas.id = tb_produtos. marca_id 
    
-- especifica as colunas e valores em comum das duas tabelas  
select tb_produtos.nome, tb_produtos.preco, tb_marcas.nome 
	from tb_produtos 
inner join tb_marcas on tb_marcas.id = tb_produtos. marca_id
where tb_marcas.nome = "Fatal Surf"
and tb_produtos.preco < 50.00
and tb_produtos.nome = "Meias"
    
-- especifica as colunas e valores em comum das duas tabelas 
select tb_produtos.nome, tb_produtos.preco, tb_marcas.nome 
	from tb_produtos 
inner join tb_marcas on tb_marcas.id = tb_produtos. marca_id
where tb_produtos.nome = "Meias"
or tb_produtos.nome = "Tênis"

-- COMANDO LEFT JOIN --
-- tras os dados em comum entre as tabelas, considerando a tabela da esquerda
select *
	from tb_produtos 
left join tb_marcas on tb_marcas.id = tb_produtos. marca_id

-- COMANDO RIGHT JOIN --
-- tras os dados em comum entre as tabelas, considerando a tabela da direita
select *
	from tb_produtos 
right join tb_marcas on tb_marcas.id = tb_produtos. marca_id