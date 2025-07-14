import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//Criação de clientes para compor o banco
		
		Cliente alunoDIO = new Cliente();
		alunoDIO.setNome("Aluno DIO");
		Cliente dioAluno = new Cliente();
		dioAluno.setNome("Dio Aluno");
		Cliente alunoSantander = new Cliente();
		alunoSantander.setNome("Aluno Santander");
		Cliente dioSantander = new Cliente();
		dioSantander.setNome("Dio Santander");
		
		
		// Criação de contas 
		// Contas corrente tem direiro a limite extra quando o saldo zerar
		
		Conta cc1 = new ContaCorrente(alunoDIO, 100.0);
		Conta poupanca1 = new ContaPoupanca(dioAluno);
		Conta cc2 = new ContaCorrente(alunoSantander, 200.0);
		Conta poupanca2 = new ContaPoupanca(dioSantander);
		
		// Adicionando contas a uma lista de contas, sejam conta corrente ou conta poupança
		Banco banco = new Banco();
		banco.adicionarConta(cc1);
		banco.adicionarConta(poupanca1);
		banco.adicionarConta(cc2);
		banco.adicionarConta(poupanca2);
		
		
		// Imprimindo contas disponiveis na lista
		System.out.println("\n \t Contas neste banco: \n "+ banco);

		
		// Usando estrutura try/catch para capturar possiveis execeçoes que podem ocorrer 
		try {
			cc1.depositar(100);
			System.out.println("\t Deposito de " + 100 + " feito em Agencia: "+ cc1.getAgencia() + " Numero: " + cc1.numero);
			cc1.imprimirExtrato();
			
			cc1.transferir(150, poupanca1);
			System.out.println("\t ==> Transferindo " + 150 + " para " + poupanca1.cliente.getNome());
			cc1.imprimirExtrato();
			poupanca1.imprimirExtrato();
			
			cc2.depositar(300);
			System.out.println("\t Deposito de " + 300 + " feito em Agencia: "+ cc2.getAgencia() + " Numero: " + cc2.numero);
			cc2.imprimirExtrato();
						
			cc2.transferir(500, poupanca2);
			System.out.println("\t ==> Transferindo " + 400 + " para " + poupanca2.cliente.getNome());
			cc2.imprimirExtrato();
			poupanca2.imprimirExtrato();
			
		}
		catch(BancoExceptions e) {
			System.out.println("\n" +"\t"+ e.getMessage()+"\n");
						
		}
		
		
		// Remover conta da lista, com base no numero da conta e se o saldo na conta esta zerado
		banco.removerConta(2, cc2.getSaldo());
		
		// Nova impressao de lista de contas
		System.out.println("\n \t Contas neste banco: \n "+ banco);
		
		
	}	

}
