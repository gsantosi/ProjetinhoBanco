package Treino1;

public class Banco {

	 public int conta;
	 public String nome;
	 public double deposito;
	 
	
	public Banco(int conta, String nome, double deposito) {
		super();
		this.conta = conta;
		this.nome = nome;
		this.deposito = deposito;
		
	}
	
	public int getConta() {
		return conta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getDeposito() {
		return deposito;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Seus Dados s�o: "+" \n O numero da conta �:" + conta + " \n O nome do titular da conta �: " + nome + " \n O saldo �: " + deposito ;
	}
	
	public void deposito(double valor) {
		this.deposito += valor;
	}
	public void saque (double saque) {
		this.deposito = (deposito- saque)-5;
	}



















}
