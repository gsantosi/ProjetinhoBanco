package br.com.innocencio.estudos;

import java.util.Scanner;

public class EstruturasCindicionais {
    public static void main (String [] args ) {
    	Scanner e = new Scanner(System.in);
    	
    System.out.println("Quer andar?");
    String andar = e.next();
    
    
    
    if (andar.equalsIgnoreCase("Sim")) {
    	System.out.println("Vou começar a andar OK?");
    }else {
    	System.out.println("Resposta incorreta");
    }
    	
    }
}
