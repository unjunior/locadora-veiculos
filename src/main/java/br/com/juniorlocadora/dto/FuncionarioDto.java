package br.com.juniorlocadora.dto;

import br.com.juniorlocadora.entidades.Funcionario;
import br.com.juniorlocadora.entidades.Pessoa;
import br.com.juniorlocadora.enums.Sexo;

import java.time.LocalDate;

public class FuncionarioDto extends PessoaDto{

    private String matricula;

   public FuncionarioDto(Long id, String nome, LocalDate dataNascimento, String cpf, Sexo sexo, String matricula) {
        super(id, nome, dataNascimento, cpf, sexo);
        this.matricula = matricula;
    }

    public FuncionarioDto(Pessoa pessoa, Funcionario funcionario) {
        super(pessoa);
        matricula = funcionario.getMatricula();
    }

    public String getMatricula() {
        return matricula;
    }
}
