package br.com.innocencio.estudos;

import java.util.Scanner;

public class Aprovacao {
	public static void main(String[] args) {
    
		
   Scanner e = new Scanner (System.in);
   
   String nome = "Leonardo Oliveira";
   int na = e.nextInt();
   int nb = e.nextInt();
   int nc = e.nextInt();
   
   int total = (na+nb+nc);
   
   if (total>=60) {
	   System.out.print("Parab�ns " + nome + ", Voc� passou!!!");
   }else {
	   System.out.print("Desculpe " + nome + ", Voc� n�o atingiu a meta...");
	   System.out.println(" \n ainda falta " + (60-total) + " pontos!");
   }
		
		
		
		
		
	}
}