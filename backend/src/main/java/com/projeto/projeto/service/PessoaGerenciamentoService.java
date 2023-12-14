package com.projeto.projeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.projeto.repository.PessoaRepository;

@Service
public class PessoaGerenciamentoService {
    
    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private EmailService emailService;

    public String solicitarCodigo(String email){


        return "";
    }
}
