import java.text.MessageFormat;

public class FormatacaoSaida {
    public static void main(String[] args) {
        String nome = "Ana";
        int idade = 25;
        double altura = 1.68;
        // Saída sem formatação
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Altura: " + altura + " metros");
        // Saída formatada com o printf
        System.out.printf("Nome: %s | Idade: %d | Altura: %.2f metros\n", nome, idade, altura);
        // Saída formatada com String.format()
        String mensagem = String.format("Nome: %s | Idade: %d | Altura: %.2f metros", nome, idade, altura);
        System.out.println(mensagem);
        // Saída formatada com o MessageFormat
        mensagem = MessageFormat.format("Nome: {0} | Idade: {1} | Altura: {2} metros", nome, idade, altura);
        System.out.println(mensagem);
        // Saída formatada com o StringBuilder
        StringBuilder msgBuilder = new StringBuilder();
        msgBuilder.append("Nome: ").append(nome).append(" | Idade: ").append(idade).append(" | Altura: ").append(altura)
                .append(" metros");
        System.out.println(msgBuilder.toString());
    }
}

// Placeholders
// %s: string
// %d: int
// %f: double