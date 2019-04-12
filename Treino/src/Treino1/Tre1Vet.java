package Treino1;

import java.util.Locale;
import java.util.Scanner;

import br.com.innocencio.estudos.Pro1;

public class Tre1Vet {
   public static void main (String [] args) {
	
	   Locale.setDefault(Locale.US);
	   Scanner e = new Scanner(System.in);
	   int quantidade = 0;
	   double preco = 0;
	   
	   System.out.println("Digite a quantidade de produtos que deseja cadastrar ");
       int quant = e.nextInt();
	   
	   Pro1[] vect = new Pro1[quant];
	   
	   for (int i=0; i<quant; i++) {
		      e.nextLine();
		      System.out.println("Digite o produto #:" + (i+1));
		      String nome = e.next();
		      System.out.println("Digite o preço do #:" + (i+1));
		      preco = e.nextDouble();
		      System.out.println("Digite a quantidade qua você deseja#:" + (i+1));
		      quantidade = e.nextInt();
		      vect[i] = new Pro1(nome, preco, quantidade);
	   }
	   
	    int soma = 0;
	    
	    for (int i=0; i<quant; i++) {
	    	   soma += quantidade;
	    }
	    
	    double somaP = 0.0;
	   
	    for (int i=0; i<quant; i++) {
	    	  somaP = preco + preco;
	    }
	   
	   
	   System.out.println("A soma dos sseus produtos são:\n" + "Quantidade: " + soma + "\nPreço: "+ somaP);
   }
}
