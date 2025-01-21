package br.com.juniorlocadora.dto;

import br.com.juniorlocadora.entidades.Fabricante;
import br.com.juniorlocadora.entidades.ModeloCarro;
import br.com.juniorlocadora.enums.Categoria;

public class ModeloCarroMinDto {

    private Long id;
    private String descricao;
    private Categoria categoria;
    private Long fabricanteId;

    public ModeloCarroMinDto(Long id, String descricao, Categoria categoria, Long fabricanteId) {
        this.id = id;
        this.descricao = descricao;
        this.categoria = categoria;
        this.fabricanteId = fabricanteId;
    }

    public ModeloCarroMinDto(ModeloCarro entidade) {
        id = entidade.getId();
        descricao = entidade.getDescricao();
        categoria = entidade.getCategoria();
        fabricanteId = entidade.getFabricante().getId();
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

    public Long getFabricante() { return  fabricanteId; }
}
