package br.com.exercicios.udemy;

import java.util.Locale;

public class PrimeiroEx {
   public static void main (String [] args) {
	  String product1 = "Computer";
	  String product2 = "Office Desk";
	  
	  int age = 30;
	  int code = 5290;
	  char gender = 'F';
	  	
	  double price1 = 2100.0;
      double price2 = 650.50;
      double measure = 53.234567;
      
      System.out.println("Products");
      System.out.println("Computer, Whith price is $ "+ price1);
      System.out.println("Office Desk, Whith price is $ "+ price2);
      System.out.println("Record: 30 years old, code 5390 and gender:" + gender);
      System.out.println("Measue with eight decimal places:" +  measure);
      System.out.printf("Rouded (theree decimal places) = %.2f%n",  measure);
      System.out.println("Rouded (theree decimal places) = " + String.format("%.3f", measure));
      Locale.setDefault(Locale.US);
      System.out.println("Rouded (theree decimal places) = " + String.format("%.3f", measure));
}
 }