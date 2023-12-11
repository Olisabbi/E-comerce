package com.projeto.projeto.dto;

import org.springframework.beans.BeanUtils;
import com.projeto.projeto.entity.Cidade;
import com.projeto.projeto.entity.Pessoa;
import lombok.Data;

@Data
public class PessoaClienteRequestDTO {

    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private String cep;
    private Cidade cidade;

    public Pessoa converter(PessoaClienteRequestDTO pessoaClienteRequestDTO){
        Pessoa pessoa = new Pessoa();
        BeanUtils.copyProperties(pessoaClienteRequestDTO, pessoa);
        return pessoa;
    }

    
}
