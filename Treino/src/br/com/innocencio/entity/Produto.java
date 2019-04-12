package br.com.innocencio.entity;

public class Produto {
   
	public String nome;
	public double preco;
	public int quantidade;
	
	public double quantidadeTotal() {
		return preco * quantidade;
	}
	
	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProduto(int quantidade){
		this.quantidade -= quantidade;
	}
	
    public String toString() {
	return nome + ", $" + preco + ", " + quantidade + " Total de unidades: $" + quantidadeTotal() ;
    } 
}
