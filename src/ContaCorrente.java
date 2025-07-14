
public class ContaCorrente extends Conta{
	
	private double limite;
	
	
	
	public ContaCorrente(Cliente cliente , double limite) {
		super(cliente);
		
		if (limite < 0) {
			throw new RuntimeException("Valor do limite da conta não pode ser negativo");
		}
		this.limite = limite;
	}
	
	public double getLimite() {
		return limite;
	}
	
	@Override
	public void sacar(double valor) throws BancoExceptions {
		
		if (valor < 0) {
			throw new BancoExceptions("Valor de saque não pode ser negativo");
		}
		
		if (valor < this.saldo) {
			this.saldo -= valor;
		}
		else {
			
			double usoLimite = valor - this.saldo;
			
			if(usoLimite > limite ) {
				throw new BancoExceptions("Desculpe, mas seu Limite eh insuficiente para realizar essa transferencia!");
			}
			else {
				this.limite -= usoLimite;
				this.saldo = 0;	
			}
		}
			
	}
	
	@Override
	public void transferir(double valor, IConta contaDestino) throws BancoExceptions{
		if(valor < 0) {
			throw new BancoExceptions("Valor de transferencia não pode ser negativo!");
		}
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("\t === Extrato Conta Corrente === \n");
		super.imprimirInfosComuns();
		
		System.out.print("\t Limite Disponivel = " + String.format("%.2f \n", limite)+ "\n");
		
		System.out.println("==================================================");
	}
	
	
}
