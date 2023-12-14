package com.projeto.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projeto.projeto.dto.PessoaClienteRequestDTO;
import com.projeto.projeto.entity.Pessoa;
import com.projeto.projeto.service.PessoaClienteService;

@RestController
@RequestMapping("/api/pessoa-gerenciamento")
public class PessoaGerenciamentoController {
    
    @Autowired
    private PessoaClienteService pessoaService;

    public Pessoa inserir(@RequestBody PessoaClienteRequestDTO pessoaClienteRequestDTO){
        return pessoaService.registrar(pessoaClienteRequestDTO);
    }

}
