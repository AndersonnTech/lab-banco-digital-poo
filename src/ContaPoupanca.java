
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("\t === Extrato Conta Poupanca === \n");
		super.imprimirInfosComuns();
	}
}
