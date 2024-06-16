package proxyPattern;

public class CalculatorProxy extends Calculator{
    @Override
    public int sum(int a, int b) {
        System.out.println("Calculando");
        int result = super.sum(a, b);
        System.out.println("Resultado: " + result);
        return result;
    }
}
