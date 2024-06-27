package me.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

//Nome da tabela do banco de dados
@Entity(name = "tb_account")
public class Account {
    @Id
    //Vai ser gerado os id automáticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //O número da conta é unico
    @Column(unique = true)
    private String number;
    private String agency;

    //11 numeros inteiros e dois numeros depois da virgula (Ex: 00.000.000.000,00)
    @Column(precision = 13, scale = 2)
    private BigDecimal balance;

    //11 numeros inteiros e dois numeros depois da virgula (Ex: 00.000.000.000,00)
    @Column(name = "additional_limit",precision = 13, scale = 2)
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

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
