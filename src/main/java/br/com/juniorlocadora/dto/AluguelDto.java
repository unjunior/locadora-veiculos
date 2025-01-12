package br.com.juniorlocadora.dto;

import br.com.juniorlocadora.entidades.Aluguel;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AluguelDto {

    private Long id;
    private LocalDate dataPedido;
    private LocalDate dataEntrega;
    private LocalDate dataDevolucao;
    private BigDecimal valorTotal;

    public AluguelDto(Long id, LocalDate dataPedido, LocalDate dataEntrega, LocalDate dataDevolucao, BigDecimal valorTotal) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.dataEntrega = dataEntrega;
        this.dataDevolucao = dataDevolucao;
        this.valorTotal = valorTotal;
    }

    public AluguelDto(Aluguel aluguel) {
        id = aluguel.getId();
        dataPedido = aluguel.getDataPedido();
        dataEntrega = aluguel.getDataEntrega();
        dataDevolucao = aluguel.getDataDevolucao();
        valorTotal = aluguel.getValorTotal();
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }
}
