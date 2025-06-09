package org.example.entities;

import jakarta.persistence.*;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID")
    private Long id;
     @Column(name = "EMAIL", nullable =false,unique = true, length = 100)
    private Long sku;
    @Column (name = "NOME", nullable = false, length = 45)
    private String nome;
    @Column (name = "Preco", nullable = false, length = 10)
    private Double preco;

    public Produto() {
    }

    public Produto(Long id, Long sku, String nome, Double preco) {
        this.id = id;
        this.sku = sku;
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSku() {
        return sku;
    }

    public void setSku(Long sku) {
        this.sku = sku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
