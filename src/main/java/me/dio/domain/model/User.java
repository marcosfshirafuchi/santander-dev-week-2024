package me.dio.domain.model;

import jakarta.persistence.*;


import java.util.List;
//Nome da tabela do banco de dados
@Entity(name = "tb_user")
public class User {

    @Id
    //Vai ser gerado os id automáticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    //Relacionamento um  para um e tem uma relação forte ente user e account
    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    //Relacionamento um  para muitos(Um usuário tem muitas features)
    //FetchType.EAGER vai trazer do banco de dados a lista de features
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;

    //Relacionamento um  para muitos(Um usuário tem muitas news)
    //FetchType.EAGER vai trazer do banco de dados a lista de news
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }
}
