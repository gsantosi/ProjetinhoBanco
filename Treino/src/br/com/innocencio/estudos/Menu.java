package br.com.innocencio.estudos;

import java.util.Scanner;

public class Menu {
	public static void main (String [] args) {
	   Scanner e = new Scanner (System.in);
	   
	  int opcao;
	   
	   System.out.println("-------------------------");
	   System.out.println("|         MENU          |");
	   System.out.println("-------------------------");
	   System.out.println("|       OPÇÃO [1]       |");
	   System.out.println("|       OPÇÃO [2]       |");
	   System.out.println("|       OPÇÃO [3]       |");
	   System.out.println("-------------------------");
	   
	   do{
	   System.out.println("Escolha uma opção");
	   opcao = e.nextInt();
 
	   switch (opcao) {	
	   case 1:
		   for (int i = 0; i <= 10; i++) {
			   System.out.println(i);
		   } break;		   
		   
	   case 2:
		   for (int i = 10; i >= 0; i--) {
			   System.out.println(i);
		   }break;
		  
	   case 3:
		   System.out.println("Saindo...");
	     break;
     }
	   
	   }
	   while(opcao != 3);
	   }
	}
	
