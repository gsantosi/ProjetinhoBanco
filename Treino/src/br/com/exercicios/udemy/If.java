package br.com.exercicios.udemy;

import java.util.Scanner;

public class If {

public static void main (String [] args) {
	  Scanner e = new Scanner (System.in);
	 
	  String day = null;
	  int x;
	  
	  
	  
	 
	  
	for (int i = 0; i<=5; i++) {
	 
		System.out.println("Digite um dia!");
		  x = e.nextInt();
		
		switch (x) {
		  case 1:
		  day = "Domingo";
		break;
		  case 2:
			day = "Segunda";
		break;
		  case 3:
			day = "Ter�a";
		break;
		  case 4: 
			day = "Quarta";
		break;
		  case 5:
			 day = "Quinta";
		break; 
		  case 6:
			  day = "Sexta";
	    break;
	      case 7:
	    	  day = "S�bado";	
		
		}
		System.out.println("O dia �:  " + day );
	}
	
	
  }
}
