package org.example;

import java.util.ArrayList;
import java.util.List;

public class Carteira {

    private List<Cliente> clientes = new ArrayList<>();

    public void cadastrar(String nomeCliente, String nomePlano, String velocidade) {
        Plano plano = PlanoFactory.getPlano(nomePlano, velocidade);
        Cliente cliente = new Cliente(nomeCliente, plano);
        clientes.add(cliente);
    }

    public List<String> obterClientes() {
        List<String> saida = new ArrayList<String>();
        for (Cliente cliente : this.clientes) {
            saida.add(cliente.obterCliente());
        }
        return saida;
    }

}
