package com.projeto.projeto.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projeto.projeto.entity.Pessoa;
import com.projeto.projeto.service.PessoaService;


@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {
    
    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/")
    public List<Pessoa> buscarTodos(){
        return pessoaService.buscarTodos();
    }

    @PostMapping("/")
    public Pessoa inserir(Pessoa objeto){
        return pessoaService.inserir(objeto);
    }

    @PutMapping("/")
    public Pessoa alterar(Pessoa objeto){
        return pessoaService.alterar(objeto);
    }

    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        pessoaService.excluir(id);
        return ResponseEntity.ok().build();
    }

}
