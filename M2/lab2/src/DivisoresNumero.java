public class DivisoresNumero {
    public static void main(String[] args) {
        int numero = 33;
        System.out.println("Os divisores de " + numero + " são: ");
        int[] divisores = retornaDivisoresDe(numero);
        for (int divisor : divisores) {
            if (divisor != 0) {
                System.out.print(divisor + " ");
            }
        }
    }

    public static int[] retornaDivisoresDe(int numero) {
        int[] candidatos = new int[numero];
        int cont = 0;
        // Percorre i = 1 até i <= numero
        for (int i = 1; i <= numero; i++) {
            // Verifica se i é divisor de numero
            if (numero % i == 0) {
                candidatos[cont] = i;
                cont++;
            }
        }
        return candidatos;
    }
}
// Entrada: 25
// Saída: [1, 5, 25]
// Entrada: 33
// Saída: [1, 3, 11, 33]
