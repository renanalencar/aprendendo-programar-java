public class Matriz {
    public static void main(String[] args) {
        // int[][] matriz = new int[2][2];
        int[][] matriz = { { 1, 2 }, { 3, 4 } };
        // Percorre cada linha
        for (int i = 0; i < matriz.length; i++) {
            // Percorre cada coluna
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == matriz[i].length - 1) {
                    System.out.println(matriz[i][j]);
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }
}
