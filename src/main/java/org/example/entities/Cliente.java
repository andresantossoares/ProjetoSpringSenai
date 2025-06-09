package org.example.entities;

import jakarta.persistence.*;
/*
 Declara a Classe Cliente como uma entidade
 */

@Entity
public class Cliente {
    /*
      Indica que essa classe é uma entidade JPA, ou seja, será mapeada para uma tabela no banco de dados.
       */

    @Id
    // marca o campo id como a chave primária da tabela.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //a chave será gerada automaticamente pelo banco, geralmente com auto-incremento.
    @Column(name = "ID")
    //nome da coluna no banco.

    private Long id;
    @Column(name = "NOME",nullable = false,length = 45)
    private String nome;
    @Column(name = "EMAIL",nullable = false,unique = true,length = 100)
    private String email;
    @Column(name = "CPF",nullable = false,unique = true,length = 14)
    private String cpf;
    /*
    nullable = false: não pode ser nulo.

    unique = true: valor deve ser único na tabela.

    length: tamanho máximo do campo.
     */

    public Cliente() {
    }

    public Cliente(Long id, String nome, String email, String cpf) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
