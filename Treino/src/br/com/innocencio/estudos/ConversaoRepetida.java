package br.com.innocencio.estudos;

import java.util.Scanner;

public class ConversaoRepetida {

	public static void main(String[] args) {
		
		Scanner e = new Scanner (System.in);
		
		 double dolar = 2.20;
		int quantidade;
		System.out.println ("Digite a quantidade que deseja compilar");
		quantidade = e.nextInt();
		
		
		for (int i = 0; i < quantidade; i++) {
			System.out.println("Digite o valor em reais");
			double real = e.nextDouble();
			
			double conversao = real/dolar;
			System.out.println("O valor convertido é de: "+ conversao);
		}
		

	}

}
