import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoFinancasTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        DepartamentoFinancas departamentoFinancas = new DepartamentoFinancas();
        departamentoFinancas.setFluxoCaixa1(62000.0);
        departamentoFinancas.setFluxoCaixa2(30000.0);

        assertEquals(154000.0, departamentoFinancas.calcularFluxoCaixa());
    }
}