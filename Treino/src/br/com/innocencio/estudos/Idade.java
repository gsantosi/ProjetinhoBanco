package br.com.innocencio.estudos;

import java.util.Scanner;

public class Idade {
   public static void main (String [] args) {
	   
	   String nome = "Patricia";
	   Scanner e = new Scanner(System.in);
	   
	   System.out.println("Digite o ano que voc� est�:");
	   int ano = e.nextInt();
	   System.out.println("Digite o ano que voc� nasceu");
	   int ano2 = e.nextInt();
	   int subtracao = (ano - ano2);
	   System.out.println("A sua idade �: " + subtracao);
	   
	   if (subtracao >= 18 ) {	   
	   System.out.println("Parab�ns Voc� ja � maior de idade");
	   }else {
		   System.out.println("Voc� ainda n�o � maior de idade");
	   }
	   
	   
   } 
}
