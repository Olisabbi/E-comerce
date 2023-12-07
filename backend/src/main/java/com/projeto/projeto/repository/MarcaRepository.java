package com.projeto.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.projeto.entity.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long>{
    
}
