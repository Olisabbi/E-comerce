package com.projeto.projeto.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projeto.projeto.dto.PessoaClienteRequestDTO;
import com.projeto.projeto.entity.Pessoa;
import com.projeto.projeto.repository.PessoaClienteRepository;

@Service
public class PessoaClienteService {


    @Autowired
    private EmailService emailService;

    @Autowired
    private PessoaClienteRepository pessoaRepository;

    @Autowired
    private PermissaoPessoaService permissaoPessoaService;

    public Pessoa registrar(PessoaClienteRequestDTO pessoaClienteRequestDTO){
        Pessoa pessoa = new PessoaClienteRequestDTO().converter(pessoaClienteRequestDTO);
        pessoa.setDataCriacao(new Date());
        Pessoa objetoNovo = pessoaRepository.saveAndFlush(pessoa);
        permissaoPessoaService.vincularPessoaPermissaoCliente(objetoNovo);
        //emailService.enviarEmailTexto(objetoNovo.getEmail(),"Cadastro na Loja","O registro na Loja foi realizado com sucesso. Em breve você receberá a senha de acesso por e-mail!!");
        Map<String, Object> proprMap = new HashMap<>();
        proprMap.put("nome", objetoNovo.getNome());
        proprMap.put("mensagem", "O registro na Loja foi realizado com sucesso. Em breve você receberá a senha de acesso por e-mail!!");
        emailService.enviarEmailTemplate(objetoNovo.getEmail(), "Cdastro no E-comerce", proprMap);
        return objetoNovo;
    }

    


}
