package br.com.juniorlocadora.dto;

import br.com.juniorlocadora.entidades.ApoliceSeguro;

import java.math.BigDecimal;

public class ApoliceSeguroDto {

    private Long id;
    private BigDecimal valorFranquia;
    private Boolean protecaoTerceiro;
    private Boolean protecaoCausasNaturais;
    private Boolean protecaoRoubo;

    public ApoliceSeguroDto(Long id, BigDecimal valorFranquia, Boolean protecaoTerceiro, Boolean protecaoCausasNaturais, Boolean protecaoRoubo) {
        this.id = id;
        this.valorFranquia = valorFranquia;
        this.protecaoTerceiro = protecaoTerceiro;
        this.protecaoCausasNaturais = protecaoCausasNaturais;
        this.protecaoRoubo = protecaoRoubo;
    }

    public ApoliceSeguroDto(ApoliceSeguro apolice) {
        id = apolice.getId();
        valorFranquia = apolice.getValorFranquia();
        protecaoTerceiro = apolice.isProtecaoTerceiro();
        protecaoCausasNaturais = apolice.isProtecaoCausasNaturais();
        protecaoRoubo = apolice.isProtecaoRoubo();
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getValorFranquia() {
        return valorFranquia;
    }

    public Boolean getProtecaoTerceiro() {
        return protecaoTerceiro;
    }

    public Boolean getProtecaoCausasNaturais() {
        return protecaoCausasNaturais;
    }

    public Boolean getProtecaoRoubo() {
        return protecaoRoubo;
    }
}
