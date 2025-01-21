package br.com.juniorlocadora.dto;

import br.com.juniorlocadora.entidades.Carro;

public class CarroDto {

    private Long id;
    private String placa;
    private String cor;
    private String chassi;

    public CarroDto(Long id, String cor, String placa, String chassi) {
        this.id = id;
        this.cor = cor;
        this.placa = placa;
        this.chassi = chassi;
    }

    public CarroDto(Carro carro) {
        id = carro.getId();
        cor = carro.getCor();
        placa = carro.getPlaca();
        chassi = carro.getChassi();
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

    public String getChassi(){
        return chassi;
    }
}

