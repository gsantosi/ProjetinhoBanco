package br.com.exercicios.udemy;

import java.util.Scanner;

public class ImpressaoPart2 {
	public static void main(String[] args) {

		String nome, nome1;
		int numero, numero1;
		double produto, altura;

		Scanner e = new Scanner(System.in);

		System.out.print("Entre com seu nome:");
		nome = e.nextLine();

		System.out.println("Entre com o numero da casa:");
		numero = e.nextInt();

		System.out.println("Digite o preço do produto:");
		produto = e.nextDouble();

		System.out.println("Digite o segundo nome:");
		nome1 = e.next();

		System.out.println("Digte a sua idade:");
		numero1 = e.nextInt();

		System.out.println("Digte a sua altura:");
		altura = e.nextDouble();

		System.out.println("____________________________________________________");
		System.out.println("Seus dados são:");
		System.out.println(nome);
		System.out.println(numero);
		System.out.println(produto);
		System.out.println(nome1);
		System.out.println(numero1);
		System.out.println(altura);

	}
}
