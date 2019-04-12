package br.com.exercicios.udemy;

import java.util.Scanner;

public class Horas {
   public static void main (String [] args) {
	   
	   Scanner e = new Scanner (System.in);
	   
	   System.out.println("Digite a hora:");
	   int hr = e.nextInt();
	   
	   if (hr < 12) {
		    System.out.println("BOM DIAA!");
	    }else if (hr < 18 ){
	    	System.out.println("BOA TARDE!!");
	    }else if (hr < 23 ) {
	    	System.out.println("BOA NOITEEEEEEEEE!!");
	    }
	   
	   System.out.println("SUCESSOOOOOOOOOOOOOOOOOO!!!!!!!!!!!!!!");
	   
	   
	   
	   
	   
	   
   }
}
