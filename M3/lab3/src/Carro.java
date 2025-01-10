public class Carro {
    private String modelo;
    private int ano;
    private String cor;

    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", ano=" + ano + ", cor=" + cor + "]";
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Qwid", 2019, "Laranja");
        System.out.println(carro);
    }
}
