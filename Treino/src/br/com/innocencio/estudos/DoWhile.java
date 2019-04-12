package br.com.innocencio.estudos;

import java.util.Scanner;

public class DoWhile {
    public static void main (String [] args) {
   int numero; 
   int soma = 0;
   String sim;
    Scanner e = new Scanner(System.in);
    
	
	do {
	System.out.println("Digite um valor");
	numero= e.nextInt();
	System.out.println("Deseja continuar? [S/N]");
	sim = e.next();
	soma += numero;
   }while(sim.equalsIgnoreCase("sim"));
	
	 
	System.out.println("A soma dos valores é de: " + soma);
	   
   }
}

