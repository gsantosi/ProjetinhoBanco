package br.com.innocencio.estudos;

import java.util.Scanner;

public class Fatorial {
   public static void main (String [] args) {
	   Scanner e = new Scanner (System.in);
	   
	   int c = 0;
	  
	   int f = 1 ;
	   
	   f = f*c;
	   
	   System.out.println("Digite um valor");
	   c = e.nextInt();
	  
	   for (int i = 1; i < c; i--) {
		   
		   int mult = i*c;
		   System.out.println(mult);
		   
	   }
	   
	   
	   
   }
}
