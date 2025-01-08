public class Tabuada {
    public static void main(String[] args) {
        int numero = 7;
        System.out.println("TABUADA DE " + numero);
        for (int i = 1; i <= 10; i++) {
            int resultado = i * numero;
            System.out.println(i + " * " + numero + " = " + resultado);
        }
    }
}
