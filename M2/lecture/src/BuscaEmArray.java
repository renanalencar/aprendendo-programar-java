public class BuscaEmArray {
    public static boolean contem(int numero, int[] numeros) {
        boolean contem = false;
        // Percorre todos itens do array numeros
        for (int n : numeros) {
            // Verifica se o item n é igual a numero
            if (numero == n) {
                contem = true;
            }
        }

        return contem;
    }

    public static void main(String[] args) {
        int[] num = { 8, 100, 23, 8, 5, 3, 13, 8, 21, 18 };
        int com = 100;
        if (contem(com, num)) {
            System.out.println(com + " está contido no array!");
        } else {
            System.out.println(com + "não está contido no array!");
        }
    }
}
