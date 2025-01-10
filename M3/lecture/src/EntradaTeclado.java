import java.util.Scanner;

public class EntradaTeclado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.println("Olá, " + nome + ". Você tem " + idade 
            + " anos e " + altura + "m de altura.");
            
        scanner.close();
    }
}
