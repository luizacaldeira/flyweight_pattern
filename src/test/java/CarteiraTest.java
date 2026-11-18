import org.example.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarteiraTest {

    @Test
    void deveRetornarClientes() {
        Carteira carteira = new Carteira();
        carteira.cadastrar("Ana", "Fibra Residencial", "300MB");
        carteira.cadastrar("Pedro", "Fibra Residencial", "300MB");
        carteira.cadastrar("Maria", "Fibra Residencial", "300MB");
        carteira.cadastrar("Empresa XPTO", "Fibra Empresarial", "1GB");

        List<String> saida = Arrays.asList(
                "Cliente{nome='Ana', plano='Fibra Residencial', velocidade='300MB'}",
                "Cliente{nome='Pedro', plano='Fibra Residencial', velocidade='300MB'}",
                "Cliente{nome='Maria', plano='Fibra Residencial', velocidade='300MB'}",
                "Cliente{nome='Empresa XPTO', plano='Fibra Empresarial', velocidade='1GB'}");

        assertEquals(saida, carteira.obterClientes());
    }

    @Test
    void deveRetornarTotalPlanos() {
        Carteira carteira = new Carteira();
        carteira.cadastrar("Ana", "Fibra Residencial", "300MB");
        carteira.cadastrar("Pedro", "Fibra Residencial", "300MB");
        carteira.cadastrar("Maria", "Fibra Residencial", "300MB");
        carteira.cadastrar("Empresa XPTO", "Fibra Empresarial", "1GB");

        assertEquals(2, PlanoFactory.getTotalPlanos());
    }

}
