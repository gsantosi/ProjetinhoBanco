package br.com.exercicios.udemy.praticas;

import java.util.Scanner;

public class Ex1 {
  public static void main (String [] args) {
	  Scanner e = new Scanner(System.in);
	  
	  int senha = 2002;
	  
	  System.out.println("Digite a senha");
	   senha = e.nextInt();
	  
	  while (senha != 2002) {
		  System.out.println("Senha incorreta!!");
		  System.out.println("Digite a senha novamente");
		  senha = e.nextInt();
	  }
	  System.out.println("Acesso permitido");
	  
  }
}
