public class Fatorial {
    static String autor = "Carla Guimarães"; // Variável Global

    public static int fatorial(int num) {
        if (num == 1) {
            return num;
        }
        return num * fatorial(num - 1);
    }

    public static void exibirAutoria() {
        System.out.println("Variavel Global: " + autor);
    }

    public static void main(String[] args) throws Exception {
        int n = 6; // Variável Local
        String autor = "Renan Alencar"; //Variável Local
        System.out.println(n + "! = " + fatorial(n));
        System.out.println("Variável Local: " + autor);
        exibirAutoria();
    }

    /*
     * --> fatorial(6) == 720
     * --> 6 * fatorial(5) 
     * --> 5 * fatorial(4)
     * --> 4 * fatorial(3)
     * --> 3 * fatorial(2)
     * --> 2 * fatorial(1)
     * --> 1
     */
}
