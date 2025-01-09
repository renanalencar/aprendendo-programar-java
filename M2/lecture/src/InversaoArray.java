public class InversaoArray {
    public static int[] inverteArray(int[] original) {
        int tam = original.length - 1;
        int[] invertido = new int[original.length];
        // original = { 1, 2, 3, 4, 5 }
        // invertido = { 5, 4, 3 , 2 , 1 }
        // Percorre o array original
        for (int i = tam; i >= 0; i--) {
            invertido[tam - i] = original[i];
        }
        return invertido;
    }

    public static void main(String[] args) {
        int[] numeros = { 8, 100, 23, 8, 5, 3, 13, 8, 21, 18 };
        System.out.print("Array Original: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        numeros = inverteArray(numeros);
        System.out.print("Array Invertido: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        // 18 21 8 13 3 5 8 23 100 8
    }
}

// TESTE DE MESA
// 1. tam = 4, i = 4 --> invertido[4 - 4 = 0] = original[4]
// 2. tam = 4, i = 3 --> invertido[4 - 3 = 1] = original[3]
// 3. tam = 4, i = 2 --> invertido[4 - 2 = 2] = original[2]
// 4. tam = 4, i = 1 --> invertido[4 - 1 = 3] = original[1]
// 5. tam = 4, i = 0 --> invertido[4 - 0 = 4] = orirignal[0]
