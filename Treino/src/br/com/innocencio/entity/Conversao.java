package br.com.innocencio.entity;

import java.util.Locale;
import java.util.Scanner;

public class Conversao {
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner e = new Scanner(System.in);
		
		System.out.println("Digite o valor do dolár");
        double dolar = e.nextDouble();
        
        System.out.println("Digite o valor que deseja converter");
        double real = e.nextDouble();
        
        double conversao = (real*dolar);
        
        System.out.println("O valor em reais vai ser em: " + conversao);
		
		
		
		
	} 
  
}
