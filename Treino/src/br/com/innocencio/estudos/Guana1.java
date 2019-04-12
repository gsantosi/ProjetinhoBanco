package br.com.innocencio.estudos;

import java.util.Scanner;

public class Guana1 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		int c =1;	
		int contador =0;
		
		System.out.println("Escreva um numero");
		int numero = e.nextInt();
		
		for(int i=0;i<numero;i++) {
			System.out.print(c+" ");
			if(numero%c==0) {
				contador = contador+1;      
			}
			c = c+1;
		}
		System.out.println("Ao todo existem "+contador+" valores divisiveis");
	}

}
