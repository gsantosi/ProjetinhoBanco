package br.com.exercicios.udemy;

import java.util.Scanner;

public class Triangulo {
  public static void main (String [] args) {
	  Scanner e = new Scanner(System.in);
	  

     TrianguloClass x,y;
     x = new TrianguloClass();
     y = new TrianguloClass();
     
	  double px = 0;
	  double py = 0;
	  
	double areax = x.area();
	double 	areay = y.area();
	
     System.out.println("Digite o primeiro lado do tri�nguloX;");  
	  x.a = e.nextDouble();
	 System.out.println("Digite o segundo lado do tri�ngulo X:");
	  x.b = e.nextDouble();
	 System.out.println("Digite o ultimo lado do tri�ngulo X:");
	  x.c = e.nextDouble();
	 System.out.println("____________________________________\n");
     System.out.println("Digite o primeiro lado do tri�ngulo Y: ");
     y.a = e.nextDouble();
     System.out.println("Digite o segundo lado do tri�ngulo Y: ");
     y.b= e.nextDouble();
     System.out.println("Digite o ultimo lado do tri�ngulo Y: ");
     y.c = e.nextDouble();
       
       px = x.a + x.b + x.c;
       py = y.a + y.b + y.c;
       double trix = Math.sqrt(px * (px - x.a) * (px - x.b) * (px - x.c));
       double triy = Math.sqrt(py * (py - y.a) * (py - y.b) * (py - y.c));
     
     System.out.println("O valor total do tri�ngulo X :"+ trix);
     System.out.println("O valor total do tri�ngulo Y :"+  triy);
	  
     if (trix > triy) {
    	  System.out.println("O maior triangulo � o Tri�nguloX:");
       }else if (triy > trix) {
          System.out.println("O maior triangulo � o Tri�nguloY:");
       }
     
  }   
}
