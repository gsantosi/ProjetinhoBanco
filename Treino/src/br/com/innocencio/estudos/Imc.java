package br.com.innocencio.estudos;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner e = new Scanner(System.in);
       
       System.out.println("Digite a sua altura:");
       double altura = e.nextDouble();
       System.out.println("Digite o seu peso:");
       double peso = e.nextDouble();
       
       double imc = peso / (altura*altura);
	
	  System.out.println("O seu IMC é: " + imc);
	}
		
}
