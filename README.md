# Projeto de Programação Orientada a Objetos

## Sobre o projeto:
Esse projeto visa fazer uso dos pilares da orientação a objetos, a partir do codigo fornecido pelo professor **Venilton FalvoJr**,  
* Como foi soliciatado para atender ao desafio, fiz a criação do atributo limite, que funciona como o cheque especial dos bancos,  
  para que quando o saldo das contas corrente chegassem a zero ainda se pudesse realizar operações com base no limite disponivel.
  
* Fiz uso tambem de Exceções para capturar possiveis problemas, como por exemplo tentar fazer um deposito ou saque com valor negativo.

* Criação de uma lista com as contas de bancos, sejam elas corrente ou poupança



# Criando um Banco Digital com Java e Orientação a Objetos

Desafio: Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java. Para isso, vamos interpretar o seguinte cenário:
“Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

### Abstração
Habilidade de concentrar-se nos aspectos essenciais de um domínio, ignorando características menos importantes ou acidentais. Nesse contexto, objetos são abstrações de entidades existentes no domínio em questão.

### Encapsulamento
Encapsular significa esconder a implementação dos objetos, criando assim interfaces de uso mais concisas e fáceis de usar/entender. O encapsulamento favorece principalmente dois aspectos de um sistema: a manutenção e a evolução.

### Herança
Permite que você defina uma classe filha que reutiliza (herda), estende ou modifica o comportamento de uma classe pai. A classe cujos membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada.

### Polimorfismo
Capacidade de um objeto poder ser referenciado de várias formas, ou seja, é capacidade de tratar objetos criados a partir das classes específicas como objetos de uma classe genérica. Cuidado, polimorfismo não quer dizer que o objeto fica se transformando, muito pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar é a maneira como nos referimos a ele.
