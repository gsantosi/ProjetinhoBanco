package br.com.innocencio.estudos;

import java.util.Scanner;

public class CalculoDePorcentagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner e = new Scanner(System.in); 
    	
    	System.out.println("Digite o valor do produto que voc� comprou: ");
    	int produto = e.nextInt();
    	
    	int taxa = (produto*13)/100;
    	
    	System.out.println("A taxa do produto foi de 60%: " + taxa);
	}

}
