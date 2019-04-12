package br.com.innocencio.estudos;

import java.util.Scanner;

public class PareImp {
      public static void main (String [] args) {
      
      Scanner e = new Scanner(System.in);
            
      for (int i = 0;i<5;i++) {
    	  
    	  System.out.println("Digite um numero:");
          int PAR = e.nextInt();  
    	  
    	  
      if (PAR % 2 == 0) {
    	  System.out.print("Esse numero é PAR \n");
      
      }else {
    	  System.out.print("Esse numero é IMPAR \n");
      }   
      } 
   
      
      }
}
