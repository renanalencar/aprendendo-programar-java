public class MatrizTransposta {
    public static int[][] transporMatriz(int[][] matriz) {
        int[][] transposta = new int[3][3];
        // Percorre a coluna da transposta
        for (int i = 0; i < transposta.length; i++) {
            // Percorre a linha da transposta
            for (int j = 0; j < transposta.length; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
    }

    public static void imprimeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j == matriz.length - 1) {
                    System.out.println(matriz[i][j]);
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        imprimeMatriz(mat);

        int[][] trans = transporMatriz(mat);
        imprimeMatriz(trans);
    }
}

/*
 * Entrada:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * Saída:
 * 1 4 7
 * 2 5 8
 * 3 6 9
 */
