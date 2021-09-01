package com.minhaFarmacia.Farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaFarmacia.Farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	// MÉTODO PARA FAZER UMA BUSCA PERSONALIZADA
	public List<Produto> findAllByNomeIgnoreCase(String nome);
}
