package br.com.innocencio.estudos;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  		
		Scanner e = new Scanner (System.in);
	
	    System.out.println("Digite o L1 do tri�ngulo");
	    int L1 = e.nextInt();
	    System.out.println("Digite o L2 do tri�ngulo");
	    int L2 = e.nextInt();
	    System.out.println("Digite o L3 do tri�ngulo");
	    int L3 = e.nextInt();
	     
	    if ((L1 < L2 +L3) && (L2 < L1 + L3) && (L3 < L1 + L2)) {
	    	   System.out.println("Esse � um TRI");
	    }else if ((L1 == L2) ) {
	    	System.out.println("Esse N�O � um EQ");
	    }else {
	    	System.out.println("Esse n�o � nenhum dos dois");
	    }
	
	
	
	
	}

}
