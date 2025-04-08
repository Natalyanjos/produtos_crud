package com.br.projeto_crud.controle;

import org.springframework.web.bind.annotation.GetMapping;

import com.br.projeto_crud.modelo.ProdutoModelo;
import com.br.projeto_crud.servico.ProdutoServico;

public class ProdutoControle {

  private ProdutoServico ps;
   @GetMapping("/listar")
    public Iterable<ProdutoModelo> listar(){
        return ps.listar();
    }

    @GetMapping("/")
    public String rota(){
        return "A API está funcionando!";
    }
}
