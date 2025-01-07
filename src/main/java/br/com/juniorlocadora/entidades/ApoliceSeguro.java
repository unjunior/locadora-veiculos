package br.com.juniorlocadora.entidades;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_apolice_seguro")
public class ApoliceSeguro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private BigDecimal valorFranquia;
	private Boolean protecaoTerceiro;
	private Boolean protecaoCausasNaturais;
	private Boolean protecaoRoubo;
	
	@OneToOne
	@MapsId
	private Aluguel aluguel;
	
	public ApoliceSeguro() {
	}
	
	public ApoliceSeguro(Long id, BigDecimal valorFranquia, Boolean protecaoTerceiro, Boolean protecaoCausasNaturais,
			Boolean protecaoRoubo, Aluguel aluguel) {
		this.id = id;
		this.valorFranquia = valorFranquia;
		this.protecaoTerceiro = protecaoTerceiro;
		this.protecaoCausasNaturais = protecaoCausasNaturais;
		this.protecaoRoubo = protecaoRoubo;
		this.aluguel = aluguel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getValorFranquia() {
		return valorFranquia;
	}

	public void setValorFranquia(BigDecimal valorFranquia) {
		this.valorFranquia = valorFranquia;
	}

	public Boolean isProtecaoTerceiro() {
		return protecaoTerceiro;
	}

	public void setProtecaoTerceiro(Boolean protecaoTerceiro) {
		this.protecaoTerceiro = protecaoTerceiro;
	}

	public Boolean isProtecaoCausasNaturais() {
		return protecaoCausasNaturais;
	}

	public void setProtecaoCausasNaturais(Boolean protecaoCausasNaturais) {
		this.protecaoCausasNaturais = protecaoCausasNaturais;
	}

	public Boolean isProtecaoRoubo() {
		return protecaoRoubo;
	}

	public void setProtecaoRoubo(Boolean protecaoRoubo) {
		this.protecaoRoubo = protecaoRoubo;
	}

	public Aluguel getAluguel() {
		return aluguel;
	}

	public void setAluguel(Aluguel aluguel) {
		this.aluguel = aluguel;
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
		ApoliceSeguro other = (ApoliceSeguro) obj;
		return Objects.equals(id, other.id);
	}
}
