package com.projeto.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projeto.projeto.dto.PessoaClienteRequestDTO;
import com.projeto.projeto.entity.Pessoa;
import com.projeto.projeto.service.PessoaClienteService;


@RestController
@RequestMapping("/api/cliente")
public class PessoaClienteController {
    
    @Autowired
    private PessoaClienteService pessoaService;


    @PostMapping("/")
    public Pessoa inserir(@RequestBody PessoaClienteRequestDTO pessoaClienteRequestDTO){
        
        return pessoaService.registrar(pessoaClienteRequestDTO);
    }

}
