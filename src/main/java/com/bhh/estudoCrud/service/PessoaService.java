package com.bhh.estudoCrud.service;

import com.bhh.estudoCrud.dto.InsertPessoaDTO;
import com.bhh.estudoCrud.dto.PessoaRetornoDTO;
import com.bhh.estudoCrud.entity.Pessoa;
import com.bhh.estudoCrud.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaRetornoDTO> listarPessoas() {
        List<Pessoa> pessoas = pessoaRepository.findAll();

        //Transforma a lista de pessoas em DTO
        return pessoas.stream()
                .map(pessoa -> new PessoaRetornoDTO(pessoa.getNome(), pessoa.getSobrenome())).toList();
    }

    public PessoaRetornoDTO buscarPessoa(Long id) {
        var pessoa = pessoaRepository.findById(id).orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));

        //Transforma a pessoa em DTO
        return new PessoaRetornoDTO(pessoa.getNome(), pessoa.getEmail());
    }

    public InsertPessoaDTO inserirPessoa(InsertPessoaDTO insertPessoaDTO) {
        Pessoa novaPessoa = new Pessoa(insertPessoaDTO);
        pessoaRepository.save(novaPessoa);
        return insertPessoaDTO;
    }
}
