package br.com.juniorlocadora.entidades;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_carro")
public class Carro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String placa;
	
	@Column(unique = true)
	private String chassi;
	
	private String cor;
	private BigDecimal valorTotal;
	
	@ManyToMany
	@JoinTable(name = "tb_carro_acessorio",
			joinColumns = @JoinColumn(name="carro_id"),
			inverseJoinColumns = @JoinColumn(name="acessorio_id"))
	private Set<Acessorio> acessorios = new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name = "modelo_carro_id")
	private ModeloCarro modeloCarro;
	
	@OneToMany(mappedBy = "carro")
	private List<Aluguel> alugueis = new ArrayList<>();
	
	public Carro() {
	}
	
	public Carro(Long id, String placa, String chassi, String cor, BigDecimal valorTotal) {
		this.id = id;
		this.placa = placa;
		this.chassi = chassi;
		this.cor = cor;
		this.valorTotal = valorTotal;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public ModeloCarro getModeloCarro() {
		return modeloCarro;
	}

	public void setModeloCarro(ModeloCarro modeloCarro) {
		this.modeloCarro = modeloCarro;
	}

	public Set<Acessorio> getAcessorios() {
		return acessorios;
	}

	public List<Aluguel> getAlugueis() {
		return alugueis;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(id, other.id);
	}
}
