package br.com.exercicios.udemy;

import java.util.Scanner;

public class SwitchCase {

public static void main (String [] args) {
	   
	   Scanner e = new Scanner(System.in);
	   
	   int escolha;
	   
	   
	    
	       
	       
	       for (int i=0;i<3;i++) {
	    	   System.out.println("Digite um numero");
		       escolha = e.nextInt();
	          switch (escolha) {
	        case 1: 
	    	   System.out.println("CASE 1");
	        break; 
	        case 2:
	    	   System.out.println("CASE 2");
	    	break;
	        case 3:
	        	System.out.println("CASE 3");       
	       
	       }
	       }
	     
	  

	   
   }
}


