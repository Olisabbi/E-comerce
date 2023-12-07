package com.projeto.projeto.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.projeto.projeto.entity.ProdutoImagens;
import com.projeto.projeto.service.ProdutoImagensService;

@RestController
@RequestMapping("/api/produtoImagens")
public class ProdutoImagensController {

    @Autowired
    private ProdutoImagensService ProdutoImagensService;

    @GetMapping("/")
    public List<ProdutoImagens> buscarTodos(){
        return ProdutoImagensService.buscarTodos();
    }

    @PostMapping("/")
    public ProdutoImagens inserir(@RequestParam("idProduto") Long idProduto, @RequestParam("file") MultipartFile file){
        return ProdutoImagensService.inserir(idProduto,file);
    }
    
    @PutMapping("/")
    public ProdutoImagens alterar(@RequestBody ProdutoImagens objeto){
        return ProdutoImagensService.alterar(objeto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        ProdutoImagensService.excluir(id);
        return ResponseEntity.ok().build();
    }





}
