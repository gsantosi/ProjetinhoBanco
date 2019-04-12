package br.com.innocencio.entity;

public class Retangulo {
   public double largura;
   public double altura;
   double perimetro;
   double diagonal;
   
   
   public double area() {
	   return largura*altura;
   }
   public double parametro() {
	   return perimetro = 2*largura + 2*altura;
   }
   
   public double diagonal() {
	    
			  double raiz = largura*largura + altura*altura;
			   return Math.sqrt(raiz);
			         
   }
   
   public String toString() {
	   return String.format("\n%.2f", area()) + String.format("\n%.2f", parametro())+ String.format("\n%.2f", diagonal()) ;
   }
}
