package br.com.innocencio.estudos;

import java.util.Scanner;

public class ConversaoGraus {
      public static void main (String [] args) {
    	   
    	  Scanner e = new Scanner (System.in);

    	  System.out.println("Digite os graus Fº:");
    	  int grausF = e.nextInt();
    	  
    	  double grausC = (grausF - 32)/1.8;
    	 
    	  System.out.println("O grau Cº é: " + grausC);
    	 
    	      	  
      }
      
}
