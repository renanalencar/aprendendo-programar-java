public class RetornaMaiorMenor {
    public static int[] retornaMaiorMenor(int[] numeros) {
        int menor = Integer.MAX_VALUE; // 2.147.483.647
        int maior = Integer.MIN_VALUE; // -2.147.483.648
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        return new int[] { maior, menor };
    }

    public static void main(String[] args) {
        int[] n = { 8, 100, 23, 8, 5, 3, 13, 8, 21, 18 };
        int[] resultado = retornaMaiorMenor(n);
        System.out.println("Maior número: " + resultado[0]);
        System.out.println("Menor número: " + resultado[1]);
    }
}

/* TESTA MESA
 * 8 > maior (-2.147.483.648) --> maior = 8
 * 8 < menor (2.147.483.647) --> menor = 8
 * 100 > maior (8) --> maior = 100
 * 100 < menor (8)
 * 23 > maior (100)
 * 23 < menor (8)
 * 8 > maior (100)
 * 8 < menor (8)
 * 5 > maior (100)
 * 5 < menor (8) --> menor = 5
 * 3 > maior (100)
 * 3 < menor (5) --> menor = 3
 * 13 > maior (100)
 * 13 < menor (3)
 * 8 > maior (100)
 * 8 < menor (3)
 * 21 > maior (100)
 * 21 < menor (3)
 * 18 > maior (100)
 * 18 < menor (3)
 * [maior, menor] == [100, 3]
 */
