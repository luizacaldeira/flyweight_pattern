package org.example;

import java.util.HashMap;
import java.util.Map;

public class PlanoFactory {
    private static Map<String, Plano> planos = new HashMap<>();

    public static Plano getPlano(String nome, String velocidade) {
        Plano plano = planos.get(nome);
        if (plano == null) {
            plano = new Plano(nome, velocidade);
            planos.put(nome, plano);
        }
        return plano;
    }

    public static int getTotalPlanos() {
        return planos.size();
    }

}