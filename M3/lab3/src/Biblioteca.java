import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> acervo;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
    }

    public void adicionar(Livro livro) {
        acervo.add(livro);
    }

    public void listar() {
        for (Livro livro : acervo) {
            livro.mostraInformacoes();
        }
    }

    public static void main(String[] args) {
        Livro livroA = new Livro("O Pequeno Principe", "Antoine de Saint-Exupéry", 1959);
        Livro livroB = new Livro("A Revolução dos Bichos", "George Orwell", 1945);
        Livro livroC = new Livro("1984", "George Orwell", 1949);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionar(livroA);
        biblioteca.adicionar(livroB);
        biblioteca.adicionar(livroC);

        biblioteca.listar();

    }
}
