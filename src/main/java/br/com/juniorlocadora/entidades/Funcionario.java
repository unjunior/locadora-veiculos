package br.com.juniorlocadora.entidades;

import java.time.LocalDate;

import br.com.juniorlocadora.enums.Sexo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario extends Pessoa{

	@Column(unique = true)
	private String matricula;
	
	public Funcionario() {
	}

	public Funcionario(Long id, String nome, LocalDate dataNascimento, String cpf, Sexo sexo, String matricula) {
		super(id, nome, dataNascimento, cpf, sexo);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
