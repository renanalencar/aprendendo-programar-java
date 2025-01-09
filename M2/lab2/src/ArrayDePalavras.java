public class ArrayDePalavras {
    public static void main(String[] args) {
        String frase = "O rato roeu a roupa do rei de Roma.";
        String[] palavras = retornaPalavrasDe(frase);
        System.out.print("Palavras: ");
        for (String palavra : palavras) {
            System.out.print(palavra + "; ");
        }
    }

    private static String[] retornaPalavrasDe(String frase) {
        // Quebra a string em substrings
        // tendo como delimitador um espaço em branco
        return frase.split("[ .]");
    }
}

// Entrada: O rato roeu a roupa do rei de Roma.
// Saída: O; rato; roeu; a; roupa; do; rei; de; Roma;
