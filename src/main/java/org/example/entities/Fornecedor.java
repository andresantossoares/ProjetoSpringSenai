package org.example.entities;

import jakarta.persistence.*;

@Entity
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ID")
    private Long id;
    @Column(name = "NOME",nullable = false, length = 50)
    private String nome;
    @Column(name = "EMAIL",nullable = false,unique = true,length = 100)
    private String email;
    @Column(name = "CNPJ",nullable = false,length = 18)
    private String cnpj;

    public Fornecedor() {
    }

    public Fornecedor(Long id, String nome, String email, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cnpj = cnpj;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
