public class Fatorial {
    public static void main(String[] args) throws Exception {
        int n = 6;
        int temp = 1;
        // 6 * 5 * 4 * 3 * 2 * 1 = 720
        // 6 * (6 - 1) * (6 - 2)... * (6 - 5) = 720
        // n * (n - 1) ^ (n - 1) = n!
        for (int i = 1; i < 6; i++) {
            // temp = temp * (n - i);
            temp *= (n - i);
        }
        temp = temp * n;
        System.out.println(n + "! = " + temp);
    }
}
