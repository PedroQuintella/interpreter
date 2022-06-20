public class DepartamentoFinancas {

    private double fluxoCaixa1;
    private double fluxoCaixa2;

    public double getFluxoCaixa1() {
        return fluxoCaixa1;
    }

    public void setFluxoCaixa1(double fluxoCaixa1) {
        this.fluxoCaixa1 = fluxoCaixa1;
    }

    public double getFluxoCaixa2() {
        return fluxoCaixa2;
    }

    public void setFluxoCaixa2(double fluxoCaixa2) {
        this.fluxoCaixa2 = fluxoCaixa2;
    }

    public double calcularFluxoCaixa() {
        return Loja.calcularFluxoCaixaTotal(this.fluxoCaixa1, this.fluxoCaixa2);
    }
}
