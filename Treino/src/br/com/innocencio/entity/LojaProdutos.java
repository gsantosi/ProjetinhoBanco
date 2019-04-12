package br.com.innocencio.entity;

import java.util.Locale;
import java.util.Scanner;

public class LojaProdutos {
   public static void main (String [] args) {
	   
	   Locale.setDefault(Locale.US);
	   Scanner e = new Scanner(System.in);
	   Produto product = new Produto();
   
	   int quantidade;
	   
       System.out.println("Digite o nome do produto:");
       product.nome = e.nextLine();
       System.out.println("Digite o preço do produto:");
       product.preco = e.nextDouble();
       System.out.println("Digite a quantidade do produto:");
       product.quantidade = e.nextInt();
       
       System.out.println("Product data"+product);
       
       System.out.println();
       System.out.println("Digite um valor para ser add ao estoque:");
       quantidade = e.nextInt();
       product.addProduto(quantidade);
       
       System.out.println(product.toString());
       
       System.out.println();
       System.out.println("Digite um alor para ser removido do estoque");
       quantidade = e.nextInt();
       product.removeProduto(quantidade);
       
       System.out.println(product.toString());
       
       
   
   
   
   
   }
}
