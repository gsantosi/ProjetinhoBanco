package br.com.exercicios.udemy;

import java.util.Scanner;

public class While {
   public static void main (String [] args) {
	 Scanner e = new Scanner(System.in);
	 double n = 0;
	 System.out.println("Digite um numero");
	  n = e.nextInt();
	  
	  while(n < 100) {
	  double raiz = Math.sqrt(n);
	 
	  System.out.printf("A raiz desse numero é: %.3f%n",raiz);
	  System.out.println("Digite um numero");
	 
	  n = e.nextInt();
	 }
	 System.out.println("Esse numero é negativo");
 
   }   
}
