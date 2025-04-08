package com.br.projeto_crud.servico;

import org.springframework.beans.factory.annotation.Autowired;

import com.br.projeto_crud.modelo.ProdutoModelo;
import com.br.projeto_crud.repositorio.ProdutoRepositorio;

public class ProdutoServico {
  @Autowired
    private ProdutoRepositorio pr;
    
    public Iterable<ProdutoModelo> listar(){
        return pr.findAll();
    }
}
