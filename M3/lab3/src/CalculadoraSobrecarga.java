public class CalculadoraSobrecarga {
    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Não existe divisão por zero!");
            return 0;
        }
        return a / b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Não existe divisão por zero!");
            return 0.0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        CalculadoraSobrecarga calculadora = new CalculadoraSobrecarga();

        System.out.println(calculadora.somar(3, 4));
        System.out.println(calculadora.somar(2.5, 3.5));

        System.out.println(calculadora.subtrair(3, 4));
        System.out.println(calculadora.subtrair(2.5, 3.5));

        System.out.println(calculadora.multiplicar(3, 4));
        System.out.println(calculadora.multiplicar(2.5, 3.5));

        System.out.println(calculadora.dividir(3, 4));
        System.out.println(calculadora.dividir(2.5, 3.5));
    }
}
