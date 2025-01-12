package br.com.juniorlocadora.dto;

import br.com.juniorlocadora.entidades.Fabricante;

public class FabricanteDto {

    private Long id;
    private String nome;

    public FabricanteDto(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public FabricanteDto(Fabricante fabricante) {
        id = fabricante.getId();
        nome = fabricante.getNome();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
