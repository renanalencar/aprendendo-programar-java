public class ContagemVogais {
    public static int contaVogais(String frase) {
        char[] vogais = { 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' };
        int quantidade = 0;
        // Para cada vogal dentro do array vogais
        for (char vogal : vogais) {
            // Percorre a frase para verificar se tem a vogal
            for (int i = 0; i < frase.length(); i++) {
                // Se o caracter na posição i for igual a vogal
                if (vogal == frase.charAt(i)) {
                    quantidade++;
                }
            }
        }
        return quantidade;
    }

    public static void main(String[] args) {
        String f = "O rato reu a roupa do rei de Roma.";
        System.out.println("A frase contém " + contaVogais(f) + " vogais.");
        // Saída: A frase contém 15 vogais.
    }
}
