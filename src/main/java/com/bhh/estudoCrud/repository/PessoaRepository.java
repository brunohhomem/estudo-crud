package com.bhh.estudoCrud.repository;

import com.bhh.estudoCrud.entity.Pessoa;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
