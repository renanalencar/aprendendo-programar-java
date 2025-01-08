public class InverterString {
    public static void main(String[] args) {
        String palavra = "amor";
        String invertido = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            // invertido = invertido + palavra.charAt(i);
            invertido += palavra.charAt(i);
        }
        System.out.println(palavra + " ao contrário é " + invertido);
    }
}
