import java.lang.Math;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a = 3;
        int b = 7;
        int c;
        double d;
        // Adição
        c = a + b; // c == 10
        System.out.println("a + b = " + c);
        // Subtração
        c = a - b; // c == -4
        System.out.println("a - b = " + c);
        // Multiplicação
        c = a * b; // c == 21
        System.out.println("a * b = " + c);
        // Divisão
        c = a / b; // c == 0
        System.out.println("a / b = " + c);
        d = (a * 1.0) / b; // d == 0.4285714285714286
        System.out.println("a / b = " + d);
        // Raticiação - Raiz Quadrada
        d = Math.sqrt(64); // d == 8
        System.out.println("sqrt(64) = " + d);
        // Potenciação
        d = Math.pow(2, 3); // d == 8
        System.out.println("2 ^ 3 = " + d);
        // Utilizando if...else
        int numero = 10;
        if (numero > 0) {
            System.out.println("Número positivo!");
        } else {
            System.out.println("Número negativo ou zero!");
        }
        // Utilizando switch...case
        char letra = 'W';
        switch (letra) {
            case 'A':
                System.out.println("Vogal A");
                break;
            case 'E':
                System.out.println("Vogal E");
                break;
            default:
                System.out.println("Não é uma vogal conhecida");
        }
        // Utilizando for
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }
        // Utilizando while
        int j = 0;
        while (j < 5) { // enquanto j < 5 for verdadeiro, repita:
            System.out.println("Valor de j: " + j);
            j++;
        }
        // Utilizando o do...while
        int contador = 0;
        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador < 3); // faça... enquanto contador < 3 for verdadeiro
        // Utilizando for aninhado
        for (int l = 0; l < 3; l++) {
            for (int k = 0; k < 2; k++) {
                System.out.println("l (linha): " + l + ", k (coluna): " + k);
            }
        }
        // O trecho de código acima trabalha com uma matriz 3 x 2
        // | a b |
        // | c d |
        // | e f |
        
        // Utilizando break
        for (int p = 0; p < 5; p++) {
            if (p == 3) {
                break; // Sai do laço quando i for 3
            }
            System.out.println("p: " + p);
        }
    }
}
