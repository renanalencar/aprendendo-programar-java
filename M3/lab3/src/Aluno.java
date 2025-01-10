public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void mostraDados() {
        String mensagem = """
                Nome: %s | Matrícula: %s | Curso: %s
                """.formatted(nome, matricula, curso);
        System.out.println(mensagem);
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Renan Costa Alencar", "20250901", "Análise e Desenvolvimento de Sistemas");
        aluno.mostraDados();
    }
}