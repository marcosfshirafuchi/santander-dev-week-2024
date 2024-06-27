package me.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

//Nome da tabela do banco de dados
@Entity(name = "tb_card")
public class Card {
    @Id
    //Vai ser gerado os id automáticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Numero do cartão é unico
    @Column(unique = true)
    private String number;

    //11 numeros inteiros e dois numeros depois da virgula (Ex: 00000000000,00)
    @Column(name = "available_limit", scale = 13, precision = 2)
    private BigDecimal limit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
