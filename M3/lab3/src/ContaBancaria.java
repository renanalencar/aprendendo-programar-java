public class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void depositar(double quantia) {
        if (quantia > 0) {
            saldo += quantia; // saldo = saldo + quantia
        } else {
            System.out.println("Não é possível fazer deposito!");
        }
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor; // saldo = saldo - valor
        } else {
            System.out.println("Conta não possui saldo suficiente!");
        }
    }

    public void mostrarDados() {
        String mensagem = """
                Titular: %s \tSaldo: R$%.2f
                """.formatted(titular, saldo);
        System.out.println(mensagem);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(100, "Renan Costa Alencar");
        conta.mostrarDados();
        conta.depositar(50);
        conta.mostrarDados();
        conta.depositar(-50);
        conta.sacar(50);
        conta.mostrarDados();
        conta.sacar(200);
    }
}
