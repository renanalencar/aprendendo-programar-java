public class CalculadoraSimples {
    public static void main(String[] args) {
        double a = 5.6;
        double b = 3.4;
        double resultado;
        char p = '/';

        switch (p) {
            case '+':
                resultado = a + b;
                System.out.println(a + " + " + b + " = " + resultado);
                break;
            case '-':
                resultado = a - b;
                System.out.println(a + " - " + b + " = " + resultado);
                break;
            case '*':
                resultado = a * b;
                System.out.println(a + " * " + b + " = " + resultado);
                break;
            case '/':
                resultado = a / b;
                System.out.println(a + " / " + b + " = " + resultado);
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }
    }
}
