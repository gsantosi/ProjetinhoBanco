package br.com.innocencio.estudos;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  		
		Scanner e = new Scanner (System.in);
	
	    System.out.println("Digite o L1 do triângulo");
	    int L1 = e.nextInt();
	    System.out.println("Digite o L2 do triângulo");
	    int L2 = e.nextInt();
	    System.out.println("Digite o L3 do triângulo");
	    int L3 = e.nextInt();
	     
	    if ((L1 < L2 +L3) && (L2 < L1 + L3) && (L3 < L1 + L2)) {
	    	   System.out.println("Esse é um TRI");
	    }else if ((L1 == L2) ) {
	    	System.out.println("Esse NÃO é um EQ");
	    }else {
	    	System.out.println("Esse não é nenhum dos dois");
	    }
	
	
	
	
	}

}
