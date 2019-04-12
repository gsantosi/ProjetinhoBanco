package br.com.exercicios.udemy;

import java.util.Scanner;

public class Desafio {
  public static void main (String [] args) {
	  Scanner e = new Scanner(System.in);
	  
	  int soma = 0;
	  int vamo = 0;
	  int maior = 0;
	  
	  System.out.println("Digite um numero positivo");
	  int numero = e.nextInt();
	 
	  
	  
	   while (numero < 0) {
		  System.out.println("Por favor, digite um numero positivo!");	  
		  
		  System.out.println("Favor digite novamente");
		  numero = e.nextInt();
		  
	  }
	   for (int i = 0; i < numero; i++) {
		  System.out.println("Valor" + i + ":");
		    
		  System.out.println("Digite o valor:");
		  vamo = e.nextInt();
		   if (vamo > maior) {
			    maior = vamo;
		   }
		  
	   }
	  System.out.println("O maior numero é:" + maior);
	  
  }
}
