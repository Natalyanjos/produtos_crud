package com.br.projeto_crud.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.br.projeto_crud.modelo.ProdutoModelo;

public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo, Long> {
  
}
