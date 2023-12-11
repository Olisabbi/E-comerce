package com.projeto.projeto.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.projeto.entity.Permissao;



public interface PermissaoRepository extends JpaRepository<Permissao, Long>{
    
    List<Permissao> findByNome(String nome);
}
