package com.bhh.estudoCrud.repository;

import com.bhh.estudoCrud.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
