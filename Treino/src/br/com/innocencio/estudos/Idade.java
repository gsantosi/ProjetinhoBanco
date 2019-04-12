package br.com.innocencio.estudos;

import java.util.Scanner;

public class Idade {
   public static void main (String [] args) {
	   
	   String nome = "Patricia";
	   Scanner e = new Scanner(System.in);
	   
	   System.out.println("Digite o ano que você está:");
	   int ano = e.nextInt();
	   System.out.println("Digite o ano que você nasceu");
	   int ano2 = e.nextInt();
	   int subtracao = (ano - ano2);
	   System.out.println("A sua idade é: " + subtracao);
	   
	   if (subtracao >= 18 ) {	   
	   System.out.println("Parabéns Você ja é maior de idade");
	   }else {
		   System.out.println("Você ainda não é maior de idade");
	   }
	   
	   
   } 
}
