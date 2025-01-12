package br.com.juniorlocadora.dto;

import br.com.juniorlocadora.entidades.Acessorio;

public class AcessorioDto {

    private Long id;
    private String descricao;

    public AcessorioDto(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public AcessorioDto(Acessorio acessorio) {
        id = acessorio.getId();
        descricao = acessorio.getDescricao();
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}
