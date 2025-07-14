
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) throws BancoExceptions {
		if (valor < 0) {
			throw new BancoExceptions("Valor de saque não pode ser negativo");
		}
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) throws BancoExceptions {
		if(valor < 0) {
			throw new BancoExceptions("Valor de deposito não pode ser negativo!");
		}
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) throws BancoExceptions {
		if(valor < 0) {
			throw new BancoExceptions("Valor de transferencia não pode ser negativo!");
		}
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format(" \t Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("\t Agencia: %d", this.agencia));
		System.out.println(String.format("\t Numero: %d", this.numero));
		System.out.println(String.format("\t Saldo: %.2f", this.saldo)+ "\n");
		System.out.println("==========================================");
	}

	@Override
	public String toString() {
		return "agencia = " + agencia + ", numero = " + numero + ", saldo = " + String.format("%.2f", saldo) + ", cliente = " + cliente.getNome() + "\n";
	}

	
	
	
}
