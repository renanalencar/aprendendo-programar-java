import java.text.MessageFormat;

public class Pessoa {
    // Atributos/Propriedades
    String nome;
    int idade;

    // Método para exibir informações
    void apresentar() {
        String mensagem = MessageFormat.format("Meu nome é {0} e tenho {1} anos.", nome, idade);
        System.out.println(mensagem);
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(); // Instância de Pessoa
        pessoa.nome = "João"; // Atribuição de valores
        pessoa.idade = 30;
        pessoa.apresentar(); // Chamando o método apresentar
    }
}

// Saída: Meu nome é João e tenho 30 anos.