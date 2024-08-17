package com.bhh.estudoCrud.controller;

import com.bhh.estudoCrud.dto.ProdutoRetornoDTO;
import com.bhh.estudoCrud.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<ProdutoRetornoDTO>> listarProdutos() {
        var produtos = produtoService.listarProdutos();

        return ResponseEntity.ok(produtos);
    }
}
