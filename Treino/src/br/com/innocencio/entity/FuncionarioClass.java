package br.com.innocencio.entity;

import java.util.Locale;
import java.util.Scanner;

public class FuncionarioClass {
   public static void main (String [] args) {
	   
	   
	   Locale.setDefault(Locale.US);
	   Scanner e = new Scanner(System.in);
	   Funcionario fun = new Funcionario();
	   
	   System.out.println("Digite o seu nome");
	   fun.nome = e.next();
	   
	   System.out.println("Digite seu salario");
	   fun.salario = e.nextDouble();
	   
	   
	   System.out.println("Digite o valor da taxa para descondo no salario");
	   double taxa = e.nextDouble();
	   fun.taxa(taxa);
	   
	   System.out.println(fun.toString());
	   
	   System.out.println();
       System.out.println("Digite o valor para acrescentar ao salario");
       double aumento = e.nextDouble();
       fun.aumento(aumento);
       
       System.out.println(fun.toString());
   }
}
