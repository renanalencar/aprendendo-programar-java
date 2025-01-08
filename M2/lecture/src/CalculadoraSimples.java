public class CalculadoraSimples {

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        double a = 5.6;
        double b = 3.4;
        char p = '/';

        switch (p) {
            case '+':
                System.out.println(a + " + " + b + " = " + soma(a, b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + subtracao(a, b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + multiplicacao(a, b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + divisao(a, b));
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }
    }
}
