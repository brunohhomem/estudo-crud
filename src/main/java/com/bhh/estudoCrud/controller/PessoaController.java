package com.bhh.estudoCrud.controller;

import com.bhh.estudoCrud.entity.Pessoa;
import com.bhh.estudoCrud.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pessoas")
public class PessoaController {

    @Autowired private PessoaService pessoaService;

    @GetMapping
    public ResponseEntity<List<Pessoa>> listarPessoas(){
        var pessoas = pessoaService.listarPessoas();
        return ResponseEntity.ok(pessoas);
    }
}
