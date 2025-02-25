package br.com.juniorlocadora.dto;

import br.com.juniorlocadora.entidades.Motorista;
import br.com.juniorlocadora.entidades.Pessoa;
import br.com.juniorlocadora.enums.Sexo;

import java.time.LocalDate;

public class MotoristaDto extends PessoaDto{

    private String numeroCnh;

    public MotoristaDto(){
    }

    public MotoristaDto(Long id, String nome, LocalDate dataNascimento, String cpf, Sexo sexo, String numeroCnh) {
        super(id, nome, dataNascimento, cpf, sexo);
        this.numeroCnh = numeroCnh;
    }

    public MotoristaDto(Pessoa pessoa, String numeroCnh) {
        super(pessoa);
        this.numeroCnh = numeroCnh;
    }

    public MotoristaDto(Pessoa pessoa, Motorista motorista){
        super(pessoa);
        motorista.getNumeroCnh();
    }

    public String getNumeroCnh() {
        return numeroCnh;
    }
}
