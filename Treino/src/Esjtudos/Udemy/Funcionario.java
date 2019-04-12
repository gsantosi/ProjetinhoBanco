package Esjtudos.Udemy;

public class Funcionario {

	
	 public String nome;
	 public int id;
	 public double salario;
	 
	public Funcionario(String nome, int id, double salario ) {
		
		this.nome = nome;
		this.id = id; 
		this.salario = salario;		
		
	} 
	
	public String getNome() {
		return nome;
	}
	
	public int getId() {
		return id;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
		
	}
	
	public double aumento(double valor) {
		double au = valor/100;
		
		return this.salario += salario * au;
	}
	
	public String toString() {
		return "SEUS DADOS SÃO:"+" \nID: "+ id +", \nNOME: "+ nome +", \nSALÁRIO: "+ salario;
	}
}
