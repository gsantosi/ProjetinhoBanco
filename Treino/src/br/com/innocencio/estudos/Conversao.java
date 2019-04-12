package br.com.innocencio.estudos;

import java.util.Scanner;

public class Conversao {
    public static void main (String [] args) { 
	   
    	double dolar = 2.20;
    	
    	Scanner e = new Scanner(System.in);
    
     
     System.out.println("Digite o valor que você quer converter:");
     double real = e.nextInt();
     
     double conversao = (real/dolar); 
     
     System.out.println("O seu saldo em dolar é:" + conversao);
}
 }