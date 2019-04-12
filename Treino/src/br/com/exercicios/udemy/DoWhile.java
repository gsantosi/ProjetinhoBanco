package br.com.exercicios.udemy;

import java.util.Scanner;

public class DoWhile {
  public static void main (String [] args) {
	  Scanner e = new Scanner (System.in);
	 
	  char fim;
	  String sim= null;
	  int numero = 0;
	  
	  
	  do {
		  double raiz = Math.sqrt(numero);
		 System.out.println("Digite outro numero");
		 numero = e.nextInt();
		 System.out.println("Sua raiz é: "+ raiz);
		 System.out.println("------------------");
		 System.out.println("Deseja continuar?"); 
		 fim = e.next().charAt(0);
		 
	  }while( fim != 'n');
	  
	  
	  
	  
  }
}
