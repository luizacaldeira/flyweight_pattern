package org.example;

public class Cliente {

    private String nome;
    private Plano plano;

    public Cliente(String nome, Plano plano) {
        this.nome = nome;
        this.plano = plano;
    }

    public String obterCliente() {
        return "Cliente{" +
                "nome='" + this.nome + '\'' +
                ", plano='" + plano.getNome() + '\'' +
                ", velocidade='" + plano.getVelocidade() + '\'' +
                '}';
    }
}