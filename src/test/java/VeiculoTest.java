import org.example.Veiculo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void deveRetornarNivelCombustivelVeiculo() {
        Veiculo veiculo = new Veiculo();
        veiculo.setNivel("Cheio");

        assertEquals("Cheio", veiculo.getNivel());
    }

    @Test
    void deveRetornarLitrosVeiculo() {
        Veiculo veiculo = new Veiculo();
        veiculo.setNivel("Cheio");

        assertEquals(40, veiculo.getLitros());
    }

}
