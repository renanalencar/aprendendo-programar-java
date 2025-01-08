public class PositivoNegativo {
    public static boolean isPositivo(int num) {
        if (num > 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int numero = -105;
        if (isPositivo(numero)) {
            System.out.println(numero + " é positivo.");
        } else {
            System.out.println(numero + " é negativo.");
        }
    }
}
