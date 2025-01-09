public class SomatorioNumerosImpares {
    public static int somaNumerosImpares(int n) {
        int soma = 0;
        // Percorre os números de 1 até n
        for (int i = 1; i <= n; i++) {
            // Verifica se i é impar
            if (i % 2 != 0) {
                soma += i;
            }
        }

        return soma;
    }

    public static void main(String[] args) {
        int numero = 10;
        System.out.println("A soma dos números impares de 1 até "
                + numero + " = " + somaNumerosImpares(numero));
        // Saída: 25
    }
}