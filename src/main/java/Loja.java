public class Loja {

    public static String formulaCalculo = "valor1 * 2 + valor2";

    public static double calcularFluxoCaixaTotal(double valor1, double valor2) {
        String expressao;
        expressao = formulaCalculo.replace("valor1", Double.toString(valor1));
        expressao = expressao.replace("valor2", Double.toString(valor2));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
