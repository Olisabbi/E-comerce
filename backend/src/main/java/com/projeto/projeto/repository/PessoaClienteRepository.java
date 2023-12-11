package com.projeto.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.projeto.entity.Pessoa;


public interface PessoaClienteRepository extends JpaRepository<Pessoa, Long>{

}
    

