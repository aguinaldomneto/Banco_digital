public class Main {

    public static void main(String[] args) {
        Cliente Aguinaldo = new Cliente();
        Aguinaldo.setNome("Aguinaldo");

        Conta cc = new ContaCorrente(Aguinaldo);
        Conta poupanca = new ContaPoupanca(Aguinaldo);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}