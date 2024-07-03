public class Main {
    public static void main(String[] args) throws Exception {
        Cliente bruno = new Cliente();
		bruno.setNome("Bruno");
		
		Conta cc = new ContaCorrente(bruno);
		Conta poupanca = new ContaPoupanca(bruno);

		cc.depositar(150);
		cc.transferir(90, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
