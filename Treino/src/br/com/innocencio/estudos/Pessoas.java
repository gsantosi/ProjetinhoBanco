package br.com.innocencio.estudos;

import java.util.Scanner;

public class Pessoas {
	public  static void main (String [] args) {
        Scanner e = new Scanner(System.in);
        String opcao;
        int usuario = 0;
        int contador = 0;
        int contador2 =0;
        int contador3 =0;
        int contador4 =0;
        int contadorF1 =0;
        int contadorF2 =0;
        int contadorF3 =0;
        int contadorF4 =0;
	    String sexo;
        
        
       
       
      
       do {
    	   System.out.println("Qual o sexo? [M/F] ");
           sexo = e.next();
    	   
           System.out.println("Digte a sua idade");
    	    int idade = e.nextInt();
    	   System.out.println("Digite a cor do Cabelo");
    	   System.out.println("______________________");
    	   System.out.println("|------[1]-Preto-----|");
    	   System.out.println("|------[2]-Castanho--|");
    	   System.out.println("|------[3]-Loiro-----|");
    	   System.out.println("|------[4]-Ruivo-----|");
    	   System.out.println("______________________");
    	   int Cor = e.nextInt();
    	      if (Cor == 1) {
      	    	     System.out.println("Preto");	  
    	      
    	      }else if (Cor == 2) {
    	    	  System.out.println("Castanho");
    	    	  
    	      }else if (Cor == 3) {
    	    	  System.out.println("Loiro");
    	      
    	      }else if (Cor == 4) {
    	    	  System.out.println("Ruivo");
    	      }else {
    	    	  System.out.println("Cor de cabelo n�o selecionada!");
    	      }
    	      
    	     System.out.println("Quer continuar?");
    	     opcao = e.next();
    	 
       if (sexo.equalsIgnoreCase("M") && idade>= 18 && Cor==1) {
    	   contador++;
       }
       if (sexo.equalsIgnoreCase("M") && idade<= 18 && Cor == 2) {
    	   contador2++;
       }
       if (sexo.equalsIgnoreCase("M") && idade<= 18 && Cor == 3) {
    	   contador3++;
       }
       if (sexo.equalsIgnoreCase("M") && idade<= 18 && Cor == 4) {
    	   contador4++;
       }
       if (sexo.equalsIgnoreCase("F") && (idade<= 18 && idade>=30) && Cor == 1) {
    	   contadorF1++;
       }
       if (sexo.equalsIgnoreCase("F") && (idade<= 18 && idade>=30) && Cor == 2) {
    	   contadorF2++;
       }
       if (sexo.equalsIgnoreCase("F") && (idade<= 18 && idade>=30) && Cor == 3) {
    	   contadorF3++;
       }
       if (sexo.equalsIgnoreCase("F") && (idade<= 18 && idade>=30) && Cor == 4) {
    	   contadorF4++;
       }
       
       }
       while (opcao.equalsIgnoreCase("S"));
       
       System.out.println("Total de homens maior de 18 e cabelos Pretos �:" + contador );
       System.out.println("Total de homens maior de 18 e cabelos Castanhos �:" + contador2 );
       System.out.println("Total de homens maior de 18 e cabelos Loiro �:" + contador3 );
       System.out.println("Total de homens maior de 18 e cabelos Ruivo �:" + contador4 ); 
       System.out.println("_______________________________________________________________|" );
       System.out.println("Total de mulheres entre 18 e 30 anos e cabelos Pretos �:" + contadorF1 );
       System.out.println("Total de mulheres entre 18 e 30 anos e cabelos Pretos �:" + contadorF2 );
       System.out.println("Total de mulheres entre 18 e 30 anos e cabelos Pretos �:" + contadorF3 );
       System.out.println("Total de mulheres entre 18 e 30 anos e cabelos Pretos �:" + contadorF4 );
       System.out.println("_______________________________________________________________|");
	} 

 }



