package br.com.innocencio.estudos;

import java.util.Scanner;

public class Leia {

	public static void main(String[] args) {

		String nome;

		Scanner e = new Scanner(System.in);
		System.out.println("Digite seu nome");
		nome = e.next();
		System.out.println("O nome cadastrado �: " + nome);
		
		
		if (nome.equalsIgnoreCase("Leonardo")) {
			
		System.out.println("tudo certo!");
	      }
	        else {
	    System.out.println("Nome n�o cadastrado");
	}
	
	}

}