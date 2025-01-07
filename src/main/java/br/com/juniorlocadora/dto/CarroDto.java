package br.com.juniorlocadora.dto;

import br.com.juniorlocadora.entidades.Carro;

public class CarroDto {

    private Long id;
    private String placa;
    private String cor;

    public CarroDto(Long id, String cor, String placa) {
        this.id = id;
        this.cor = cor;
        this.placa = placa;
    }

    public CarroDto(Carro carro) {
        id = carro.getId();
        cor = carro.getCor();
        placa = carro.getPlaca();
    }

    public Long getId() {
        return id;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }
}

