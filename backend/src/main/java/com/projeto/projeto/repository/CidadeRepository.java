package com.projeto.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.projeto.entity.Cidade;

public interface CidadeRepository  extends JpaRepository<Cidade, Long>{

    
}
