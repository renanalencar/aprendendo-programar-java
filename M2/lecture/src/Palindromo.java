public class Palindromo {
    public static void main(String[] args) {
        String palavra = "radar";
        String frase = "socorram me subi-no on-ibus em marrocos";
        if (isPalindromo(palavra)) {
            System.out.println(palavra + " é um palindromo!");
        } else {
            System.out.println(palavra + "não é um palindromo!");
        }

        if (isPalindromo(frase)) {
            System.out.println(frase + " é um palindromo!");
        } else {
            System.out.println(frase + " não é um palindromo!");
        }
    }

    public static String inverteString(String original) {
        String modificada = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            modificada += original.charAt(i);
        }
        return modificada;
    }

    public static boolean isPalindromo(String frase) {
        String invertido = inverteString(frase);
        if (frase.equalsIgnoreCase(invertido)) {
            return true;
        }
        return false;
    }
}
