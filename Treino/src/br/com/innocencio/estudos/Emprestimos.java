package br.com.innocencio.estudos;

import java.util.Scanner;

public class Emprestimos {
   public static void main (String [] args){
	   Scanner e = new Scanner(System.in);
	   
	   System.out.println("Qual � o valor do empr�stimo");
	   
	   int emprestimo = e.nextInt();
	   int Vemprestimo = emprestimo +((emprestimo*20)/100);
	   
	   System.out.println("O valor do empr�stimo com taxa �: " + Vemprestimo);
	   System.out.println("Digite a quantidade de parcelas que voc� deseja");
	   
	   int parcelas = e.nextInt();
	   int Tparcelas = (Vemprestimo/parcelas);
	   
	   System.out.println("As suas parcelas v�o ser " + parcelas + " vezes de " + Tparcelas + "reais!");
	   
	   
	   
     }
   }
