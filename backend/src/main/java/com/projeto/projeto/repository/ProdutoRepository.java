package com.projeto.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.projeto.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
