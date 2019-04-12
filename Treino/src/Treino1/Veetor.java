package Treino1;

import java.util.Locale;
import java.util.Scanner;

import br.com.innocencio.estudos.Produto;

public class Veetor {
 public static void main (String [] args) {

	 Locale.setDefault(Locale.US);
     Scanner e = new Scanner(System.in);
     
     System.out.println("Digite o número de produtos desejados");
     int num = e.nextInt();
     
     Produto[] vetor = new Produto[num]; 
     
     for (int i=0; i<num; i++) {
    	   e.nextLine();
    	   System.out.println("Digite o nome do produto");
    	   String nome = e.next();
    	   System.out.println("Digite o produto");
    	   double preco = e.nextDouble();
    	   vetor[i] = new Produto (nome, preco);
     }
    double soma = 0.0;
    
    for (int i=0; i<num; i++) {
    	soma += num;
    }
    
    double media = soma/num;
    System.out.println("A média é: " + media);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 }
}