package br.com.innocencio.estudos;

public class Pro1 {

	private String nome;
	private double preco;
	private int quantidade;

	public Pro1(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

    public String getNome() {
         return nome;    	
    }
    
    public double getPrekco() {
    	return preco;
    }
    
    public int getQuantidade() {
    	return quantidade;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public void setPreco(double preco) {
    	this.preco = preco;
    }
    
    public void setQuantidade(int quantidade) {
    	this.quantidade = quantidade;
    }


}
