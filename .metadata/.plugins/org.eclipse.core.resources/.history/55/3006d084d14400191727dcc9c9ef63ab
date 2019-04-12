package br.com.innocencio.estudos;

import java.util.Scanner;

public class Teeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner e = new Scanner(System.in);
String opcao=null;
int contador=0;
int contadorF=0;
do {
System.out.println("Qual o genero?M/F");
String genero = e.next();
System.out.println("Qual a idade?");
int idade = e.nextInt();

System.out.println("Qual cor vc quer?");
int cabelo = e.nextInt();

System.out.println("Quer continuar? S/N");
opcao = e.next();

if(genero.equalsIgnoreCase("M") && idade > 18 && cabelo==2) {
	contador++;
}
if(genero.equalsIgnoreCase("F") && (idade>=25 && idade<=30) && cabelo==3) {
	contadorF++;
}

}while(opcao.equalsIgnoreCase("S"));
	
System.out.println("Total de homens com idade maior que 18 e cabelo castanho :"+contador);
System.out.println("Total de mulheres entre 25 e 30 anos e cabelos loiros :"+contadorF);

	}
	
}
