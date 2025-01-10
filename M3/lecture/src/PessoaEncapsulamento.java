import java.text.MessageFormat;

public class PessoaEncapsulamento {
    // Atributos/Propriedades
    private String nome;
    private int idade;

    // Construtor Padrão
    PessoaEncapsulamento() {
    }

    // Construtor
    PessoaEncapsulamento(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para exibir informações
    public void apresentar() {
        String mensagem = MessageFormat.format("Meu nome é {0} e tenho {1} anos.", nome, idade);
        System.out.println(mensagem);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        PessoaEncapsulamento pessoa = new PessoaEncapsulamento(); // Instância de Pessoa
        pessoa.apresentar(); // Chamando o método apresentar
        // Saída: Meu nome é e tenho anos.
        PessoaEncapsulamento pessoaEncapsulada = new PessoaEncapsulamento("Carlos", 40);
        pessoaEncapsulada.apresentar();
        // Saída: Meu nome é Carlos e tenho 40 anos.
    }
}

// Saída: Meu nome é João e tenho 30 anos.