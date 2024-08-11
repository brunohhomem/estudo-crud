package com.bhh.estudoCrud.service;

import com.bhh.estudoCrud.entity.Pessoa;
import com.bhh.estudoCrud.repository.PessoaRepository;
import com.bhh.estudoCrud.dto.PessoaRetornoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaRetornoDTO> listarPessoas() {
        List<Pessoa> pessoas = pessoaRepository.findAll();

        return pessoas.stream().map(pessoa -> new PessoaRetornoDTO(pessoa.getNome(), pessoa.getSobrenome())).toList();
    }
}
