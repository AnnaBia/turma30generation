package com.minhaFarmacia.Farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhaFarmacia.Farmacia.model.Produto;
import com.minhaFarmacia.Farmacia.repository.ProdutoRepository;

@RestController // INDICA QUE A CLASSE É UM CONTROLADOR
@CrossOrigin(origins = "*", allowedHeaders = "*") // PERMITE QUE A API LEIA E LIBERE A REQUISIÇÃO INDEPENDENTE DA ORIGEM
@RequestMapping("/produto") // NOME ENDPOINT PARA CHAMAR O CONTROLLER
public class ProdutoController {
	@Autowired // INJETA O SERVIÇO
	private ProdutoRepository repository;

	// CRIAÇÃO DOS ENDPOINTS
	@GetMapping
	public ResponseEntity<List<Produto>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("{/id}")
	public ResponseEntity<Produto> getById(@PathVariable long id) {
		return repository.findById(id).map(res -> ResponseEntity.ok(res)).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Produto>> getByTitulo(@PathVariable String titulo) {
		return ResponseEntity.ok(repository.findAllByNomeIgnoreCase(titulo));
	}

	@PostMapping
	public ResponseEntity<Produto> post(@RequestBody Produto produto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}

	@PutMapping
	public ResponseEntity<Produto> put(@RequestBody Produto produto) {
		return ResponseEntity.ok(repository.save(produto));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
