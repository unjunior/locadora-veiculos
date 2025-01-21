package br.com.juniorlocadora.dto;

import br.com.juniorlocadora.entidades.Fabricante;
import br.com.juniorlocadora.entidades.ModeloCarro;
import br.com.juniorlocadora.enums.Categoria;

public class ModeloCarroFabricanteDto {

    private Long id;
    private String descricao;
    private Categoria categoria;
    private FabricanteDto fabricante;

    public ModeloCarroFabricanteDto(Long id, String descricao, Categoria categoria, FabricanteDto fabricante) {
        this.id = id;
        this.descricao = descricao;
        this.categoria = categoria;
        this.fabricante = fabricante;
    }

    public ModeloCarroFabricanteDto(ModeloCarro entidade) {
        id = entidade.getId();
        descricao = entidade.getDescricao();
        categoria = entidade.getCategoria();
        fabricante = new FabricanteDto(entidade.getFabricante());
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

    public FabricanteDto getFabricante() {
        return fabricante;
    }
}
