
public interface IConta {
	
	void sacar(double valor) throws BancoExceptions;
	
	void depositar(double valor)throws BancoExceptions;
	
	void transferir(double valor, IConta contaDestino) throws BancoExceptions;
	
	void imprimirExtrato();
}
