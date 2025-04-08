package com.br.projeto_crud.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.br.projeto_crud.modelo.ProdutoModelo;
import com.br.projeto_crud.modelo.RespostaModelo;
import com.br.projeto_crud.repositorio.ProdutoRepositorio;

public class ProdutoServico {
  @Autowired
  private ProdutoRepositorio pr;
  @Autowired
  private RespostaModelo rm;

  public ResponseEntity <?> cadastrarAlterar(ProdutoModelo pm, String acao){
        if(pm.getNome().equals("")){
            rm.setResposta("O nome do produto é obrigatório!");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
        }else if(pm.getMarca().equals("")){
            rm.setResposta("A marca do produto é obrigatório!");
            return new ResponseEntity<RespostaModelo>(rm,HttpStatus.BAD_REQUEST);
        }else{
            if(acao.equals("cadastrar")){
                return new ResponseEntity<ProdutoModelo>(pr.save(pm), HttpStatus.CREATED);
            }else{
                return new ResponseEntity<ProdutoModelo>(pr.save(pm), HttpStatus.OK);
                
            }
        }
    }

  public Iterable<ProdutoModelo> listar() {
    return pr.findAll();
  }
}
