package br.com.exercicios.udemy.praticas;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		int g = 0;
		int d = 0;
		int a = 0;
		
		
		System.out.println("Digite o tipo de combustivel de sua prefer�ncia");
		int pre = e.nextInt();

		do {
			if (pre == 1) {
				   a++;
			}else if (pre == 2){
				   d++;
			}else if (pre == 3) {
				   g++;
			}
			
		System.out.println("Digite o tipo de combustivel de sua prefer�ncia");
		pre = e.nextInt();

			}while(pre != 4);
			System.out.println("O total de Gasolina �:" + a);
			System.out.println("O total de Diesel �:" + d);
			System.out.println("O total de Alcool �:" + g);

		}
	}

