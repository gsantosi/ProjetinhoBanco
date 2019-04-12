package br.com.innocencio.estudos;

import java.util.Scanner;

public class Somas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);
        
		System.out.println("Digite um numero");
		int a = e.nextInt();
		System.out.println("Digite outro nomero");
		int b = e.nextInt();
		int soma = (a +	 b) / 2;
		System.out.println("a soma: " + soma);
		
	}

}
