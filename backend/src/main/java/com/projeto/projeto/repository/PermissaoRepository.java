package com.projeto.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.projeto.entity.Permissao;



public interface PermissaoRepository extends JpaRepository<Permissao, Long>{
    
}
