package com.minhaLojadeGames.LojaGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minhaLojadeGames.LojaGames.model.Produto;

@Repository 
public interface ProdutoRepository extends JpaRepository <Produto, Long>{ 
		public List<Produto> findByTituloIgnoreCase (String titulo);
	}
