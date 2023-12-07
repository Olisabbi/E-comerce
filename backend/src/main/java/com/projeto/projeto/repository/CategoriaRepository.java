package com.projeto.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.projeto.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    
}
