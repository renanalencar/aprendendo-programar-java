public class SomaNumeros {
    public static void main(String[] args) {
        int n = 10;
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            // temp = temp + i;
            temp += i;
        }
        System.out.println("A soma dos " + n + " números naturais é: " + temp);
    }
}
