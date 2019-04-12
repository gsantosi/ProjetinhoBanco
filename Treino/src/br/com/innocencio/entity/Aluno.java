package br.com.innocencio.entity;

import java.util.Scanner;

public class Aluno {
   public static void main (String [] args) {
	
	   Scanner e = new Scanner(System.in);
	 String nome;
	 double nota = 0;
	 double notaFinal = 0;

	System.out.println("Digite o nome do aluno");
	nome = e.next();
	
	 
	for (int i=1; i<=3; i++) {
		System.out.println("Nota#" + i);
		System.out.println("Digite a nota do aluno");
		nota = e.nextInt();
	}
	 notaFinal = nota + nota + nota;
	  if (notaFinal < 60) {
		  System.out.println("Desculpe, mas vpcê não atingiu a média, faltam " + (60-notaFinal) + " pontos");
	  }else {
		  System.out.println("Parabéns, você passou");
	  }
        
	

}
}