package br.com.exercicios.udemy.praticas;

import java.util.Scanner;

public class Ex2 {
   public static void main (String [] args) {
	   Scanner e = new Scanner(System.in);
	   
	   System.out.println("Digite um numero");
	   int x = e.nextInt();
	   int y = e.nextInt();
	   
	   while (x != 0 && y != 0) {
		   if (x == y) {
			    System.out.println("Primeiro");
		   }
		   else if (x > 0 && y < 0) {
			   System.out.println("quarto");
		   }
		   else if (x < 0 && y < 0) {
			   System.out.println("terceiro");
		   }
		   else if (x < 0 && y > 0) {
			   System.out.println("Segundo");
		   }
		    x = e.nextInt();
		    y = e.nextInt();
	   } 
	   System.out.println("DEU CERTO");
	   
	   
	   
	   
   }
}
