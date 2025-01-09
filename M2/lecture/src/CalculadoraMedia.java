public class CalculadoraMedia {
    public static double media(int[] numeros) {
        // media = soma / total_numeros
        int soma = 0;
        // Percorre o array numeros até o seu tamanho - 1
        // Soma todos os números do array
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        // Devide a soma pelo total de itens do array e retorna
        return (soma * 1.0) / numeros.length;
    }

    public static void main(String[] args) {
        int[] num = { 8, 100, 23, 8, 5, 3, 13, 8, 21, 18 };
        System.out.println("Média: " + media(num));
    }
}
