package br.com.exercicios.udemy;

import java.util.Scanner;

public class Forzin {
   public static void main (String [] args) {
	   Scanner e = new Scanner (System.in);
	   
	   int soma = 0;
	   int soma1 = 0;
	   
	   System.out.println("Digite o numero de vezes que deseja somar");
	   soma1 = e.nextInt();
	   
	   int soma2 = 0;
	   for (int i = 1; i <= soma1; i++ ) {
		   System.out.println("Valor#" + i + ":");
		   
		   System.out.println("Digite um numero para ser somado");
       	   soma = e.nextInt();
		  
       	   soma2 = soma + soma;
		 }
	   System.out.println("A soma é:" + soma2);
	   
	   
	   
	   
   }
}
