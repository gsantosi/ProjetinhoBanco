package br.com.innocencio.entity;

public class Funcionario {

	public String nome;
	public double salario;
	public double numero;
	

    public void taxa(double valor) {
    	
    	this.salario -= valor;
    }
	
	public void aumento(double valor) {
		 
	double bonus = (valor * 100) / 100;
		this.salario += bonus;
	}



	public String toString() {
		return nome + ", "+ String.format("%.2f", salario) ;

	}
	

}
