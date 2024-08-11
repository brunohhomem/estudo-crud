package com.bhh.estudoCrud.entity;

import com.bhh.estudoCrud.dto.InsertPessoaDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String sobrenome;
    private String email;

    //Construtor de inserir pessoa
    public Pessoa(InsertPessoaDTO insertPessoaDTO) {
        this.nome = insertPessoaDTO.nome();
        this.sobrenome = insertPessoaDTO.sobrenome();
        this.email = insertPessoaDTO.email();
    }
}
