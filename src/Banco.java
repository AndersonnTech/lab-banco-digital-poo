import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Conta> contas;
	
	public Banco() {
		this.contas = new ArrayList<Conta>();
	}

	public void adicionarConta (Conta conta) {
		this.contas.add(conta);
	}
	

	public void removerConta (int numero , double saldo) {
		
		if (!contas.isEmpty()) {
			for(Conta c : contas) {
				if (c.getNumero() == numero && (saldo == 0)) {
					contas.remove(c);
					break;
				}
				else {
					System.out.println("***** Para remover conta, eh necessario fazer saque total do saldo disponivel");
					break;
				}
				
			}
		}
		else {
			System.out.println("A lista de contas esta vazia!");
		}
	}
	

	@Override
	public String toString() {
		return " "+ contas + " ";
	}
	
	
}

