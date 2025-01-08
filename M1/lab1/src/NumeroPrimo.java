public class NumeroPrimo {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // Verifica se i < 2
            boolean divisivel = false;
            if (i < 2) {
                System.out.print(i + " ");
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    // Verifica se i é divisível por j
                    if (i % j == 0) {
                        divisivel = true;
                    }
                }
                if (divisivel) {
                    continue;
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
