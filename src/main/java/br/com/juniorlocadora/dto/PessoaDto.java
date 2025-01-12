package br.com.juniorlocadora.dto;

import br.com.juniorlocadora.entidades.Pessoa;
import br.com.juniorlocadora.enums.Sexo;

import java.time.LocalDate;

public class PessoaDto {

    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
    private Sexo sexo;

    public PessoaDto(Long id, String nome, LocalDate dataNascimento, String cpf, Sexo sexo) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public PessoaDto(Pessoa pessoa) {
        id = pessoa.getId();
        nome = pessoa.getNome();
        dataNascimento = pessoa.getDataNascimento();
        cpf = pessoa.getCpf();
        sexo = pessoa.getSexo();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public Sexo getSexo() {
        return sexo;
    }
}
