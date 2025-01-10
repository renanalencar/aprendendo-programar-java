public class Calculadora {
    int somar(int a, int b) {
        return a + b;
    }

    double somar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.somar(3, 4)); // Saída: 7 (Inteiro)
        System.out.println(calc.somar(2.5, 3.5)); // Saída: 6.0 (Double)
    }
}
