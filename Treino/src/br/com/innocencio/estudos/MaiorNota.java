package br.com.innocencio.estudos;

import java.util.Scanner;

public class MaiorNota {
   public static void main (String [] args) {
	   
	   Scanner e = new Scanner(System.in);
	   double nota = 0;
       int alunos;
       double maior = 0;
       String nome = null;
       
       String nomeMaior = null ;
       
	   System.out.println("Quantos alunos tem na sala? ");
	   alunos = e.nextInt();
	   
	   
	   for (int i = 0; i< alunos ; i++) {
		   System.out.println("ALUNO " +(i+1));   
		   System.out.println("Nome do aluno:");
		   
		   nome = e.next();
		   System.out.println("Qual a nota de " + nome +":");
		   
		   nota = e.nextInt();
		   System.out.println("A nota do " + nome + " é " + nota);
		   
	   }
	   while (nota > maior) {
		   maior = nota;
	     nomeMaior = nome ;
	   }
	   
	   System.out.println("A maior nota foi de: \n" +nomeMaior  +" \n com a maior nota foi: \n"+ maior);
	   
   }
}
