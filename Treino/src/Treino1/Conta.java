package Treino1;

import java.util.Locale;
import java.util.Scanner;

public class Conta {
   public static void main (String [] args){
	   Locale.setDefault(Locale.US);
	   Scanner e = new Scanner(System.in);
       Banco b = new Banco(0, "nome", 0.0);
       String dep;
       
       System.out.print("Digite o numero da sua conta:");
       b.conta = e.nextInt();
       
       System.out.println("Digite o nome do Titular da conta: ");
       e.nextLine();
       b.nome = e.nextLine();
              
       System.out.print("Deseja Iniciar com um saldo ?");
       dep = e.next();
        
       
	if (dep.equalsIgnoreCase("sim") ) {
		 System.out.println("Favor colocar um saldo que deseja iniciar:");
	     b.deposito = e.nextDouble();
	     System.out.println(b.toString());
	
	}else{
		b.deposito = 0.0;
		System.out.println("____________________");
		System.out.println(b.toString());
	} 
	   System.out.println("Digite o valor a ser depositado");
	   int depp = e.nextInt();
	   b.deposito(depp);
	   System.out.println("____________________");
	   System.out.println(b.toString());
   
	   System.out.println("Digite um valor para ser sacado");
	   int saque = e.nextInt();
	   b.saque(saque);
	   System.out.println("____________________");
	   System.out.println(b.toString());
   }
       
}
