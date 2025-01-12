package br.com.juniorlocadora.dto;

import br.com.juniorlocadora.entidades.ModeloCarro;
import br.com.juniorlocadora.enums.Categoria;

public class ModeloCarroDto {

    private Long id;
    private String descricao;
    private Categoria categoria;

    public ModeloCarroDto(Long id, String descricao, Categoria categoria) {
        this.id = id;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public ModeloCarroDto(ModeloCarro entidade) {
        id = entidade.getId();
        descricao = entidade.getDescricao();
        categoria = entidade.getCategoria();
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
