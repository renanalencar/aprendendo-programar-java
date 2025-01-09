public class FrequenciaCaractere {
    public static void main(String[] args) {
        String frase = "Mamma mia!";
        mostraFrequenciaCaracteres(frase);
    }

    private static void mostraFrequenciaCaracteres(String frase) {
        String controle = "";
        // Percorre caractere por caractere da frase
        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);
            int frequencia = 0;

            // Percorre a frase para verificar quantas
            // vezes caractere está presente nela
            for (int j = 0; j < frase.length(); j++) {
                if (caractere == frase.charAt(j)) {
                    frequencia++;
                }
            }
            // Verifica se o caractere já foi analisado
            if (controle.contains(String.valueOf(caractere))) {
                continue;
            } else {
                // Adicione ao controle
                controle += String.valueOf(caractere);
                // Imprime o caractere e quantidade de vezes
                // que ele aparece na frase
                System.out.println(caractere + ": " + frequencia);
            }
        }
    }
}

// Entrada: Mamma mia!
// Saída:
// M: 1
// a: 3
// m: 3
//  : 1
// i: 1
// !: 1
