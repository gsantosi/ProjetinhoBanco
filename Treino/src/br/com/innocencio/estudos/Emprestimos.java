package br.com.innocencio.estudos;

import java.util.Scanner;

public class Emprestimos {
   public static void main (String [] args){
	   Scanner e = new Scanner(System.in);
	   
	   System.out.println("Qual é o valor do empréstimo");
	   
	   int emprestimo = e.nextInt();
	   int Vemprestimo = emprestimo +((emprestimo*20)/100);
	   
	   System.out.println("O valor do empréstimo com taxa é: " + Vemprestimo);
	   System.out.println("Digite a quantidade de parcelas que você deseja");
	   
	   int parcelas = e.nextInt();
	   int Tparcelas = (Vemprestimo/parcelas);
	   
	   System.out.println("As suas parcelas vão ser " + parcelas + " vezes de " + Tparcelas + "reais!");
	   
	   
	   
     }
   }
