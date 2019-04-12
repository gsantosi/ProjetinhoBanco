package br.com.innocencio.estudos;

import java.util.Scanner;

public class NumeroNegativo {
    public static void main (String [] args) {
    	Scanner e = new Scanner(System.in);
    	 
    	int contador = 5;
    	int numeroN = 0;
    	   	
     for (int i = 0; i<= contador; i++) {
    		System.out.println("Digite um numero");
    		numeroN = e.nextInt();
       if (numeroN < 0) {
    	   System.out.println("Esse numero é negtivo");
       }else {
    	   System.out.println("Esse umero é positivo");
       }	
       
     
     } 
    	
    	
    }
}
