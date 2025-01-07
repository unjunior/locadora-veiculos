package br.com.juniorlocadora.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.juniorlocadora.enums.Sexo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_motorista")
public class Motorista extends Pessoa{

	@Column(unique = true)
	private String numeroCnh;
	
	@OneToMany(mappedBy = "motorista")
	private List<Aluguel> alugueis = new ArrayList<>();
	
	public Motorista() {
	}

	public Motorista(Long id, String nome, LocalDate dataNascimento, String cpf, Sexo sexo, String numeroCnh) {
		super(id, nome, dataNascimento, cpf, sexo);
		this.numeroCnh = numeroCnh;
	}

	public String getNumeroCnh() {
		return numeroCnh;
	}

	public void setNumeroCnh(String numeroCnh) {
		this.numeroCnh = numeroCnh;
	}
}
