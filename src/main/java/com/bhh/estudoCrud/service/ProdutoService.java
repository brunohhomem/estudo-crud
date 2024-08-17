package com.bhh.estudoCrud.service;

import com.bhh.estudoCrud.dto.ProdutoRetornoDTO;
import com.bhh.estudoCrud.entity.Produto;
import com.bhh.estudoCrud.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoRetornoDTO> listarProdutos() {
        List<Produto> produtos = produtoRepository.findAll();

        return produtos.stream().map(produto -> new ProdutoRetornoDTO(produto.getNome())).toList();
    }

}
