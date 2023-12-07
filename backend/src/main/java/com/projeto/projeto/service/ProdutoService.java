package com.projeto.projeto.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projeto.projeto.entity.Produto;
import com.projeto.projeto.repository.ProdutoRepository;

@Service
public class ProdutoService {


    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> buscarTodos(){
        return produtoRepository.findAll();
    }

    public Produto inserir(Produto objeto){
        objeto.setDataCriacao(new Date());
        Produto novoProduto = produtoRepository.saveAndFlush(objeto);
        return novoProduto;
    }

    public Produto alterar(Produto objeto){
        objeto.setDataatualizacao(new Date());
        return produtoRepository.saveAndFlush(objeto);
    }

    public void excluir(Long id){
        Produto objeto = produtoRepository.findById(id).get();
        produtoRepository.delete(objeto);
    }


}
