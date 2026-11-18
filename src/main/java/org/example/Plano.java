package org.example;

public class Plano {

    private String nome;
    private String velocidade;

    public Plano(String nome, String velocidade) {
        this.nome = nome;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public String getVelocidade() {
        return velocidade;
    }
}