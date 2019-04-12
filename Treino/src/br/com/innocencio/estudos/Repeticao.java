package br.com.innocencio.estudos;

import java.util.Scanner;

public class Repeticao {
	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		System.out.println("Digite um valor");
		int valor = e.nextInt();
		int soma = 0;
		int maior = 0;

		
		int numero = 0;
		
		for (int i = 0; i < valor; i++) {
			
			System.out.println("Digite um numero");
			 numero = e.nextInt();
			soma = soma + numero;

		}

		System.out.println("A soma é:" + soma);

		while (numero < maior) {
			  numero = maior;
			

		}
		System.out.println("Esse numero é o maior " + numero);
	}

}

//     while(contador<valor) {
//    	 contador = contador + 2;
//    	 System.out.println(contador);
//     }
//    	System.out.println("Terminei de contar");
//    }
