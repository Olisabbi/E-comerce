package com.projeto.projeto.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.projeto.projeto.dto.PessoaClienteRequestDTO;
import com.projeto.projeto.entity.Pessoa;
import com.projeto.projeto.repository.PessoaClienteRepository;


public class PessoaClienteService {



    @Autowired
    private PessoaClienteRepository pessoaRepository;

    @Autowired
    private PermissaoPessoaService permissaoPessoaService;

    public Pessoa registrar(PessoaClienteRequestDTO pessoaClienteRequestDTO){
        Pessoa pessoa = new PessoaClienteRequestDTO().converter(pessoaClienteRequestDTO);
        pessoa.setDataCriacao(new Date());
        Pessoa objetoNovo = pessoaRepository.saveAndFlush(pessoa);
        permissaoPessoaService.vincularPessoaPermissaoCliente(objetoNovo);
        return objetoNovo;
    }

    


}
