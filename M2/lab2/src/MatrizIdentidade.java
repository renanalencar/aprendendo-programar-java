public class MatrizIdentidade {
    public static void main(String[] args) {
        int[][] matriz = criaMatrizIdentidade(4);
        imprimeMatriz(matriz);
    }

    private static void imprimeMatriz(int[][] matriz) {
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

    private static int[][] criaMatrizIdentidade(int n) {
        int[][] identidade = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    identidade[i][j] = 1;
                } else {
                    identidade[i][j] = 0;
                }
            }
        }

        return identidade;
    }
}
// Entrada: 4
// Saída:
// 1 0 0 0
// 0 1 0 0
// 0 0 1 0
// 0 0 0 1