package br.com.innocencio.entity;

import java.util.Locale;
import java.util.Scanner;

public class CalculoRetangulo {
  public static void main (String [] args) {
	  
	  Locale.setDefault(Locale.US);
	  Scanner e = new Scanner(System.in);
	  Retangulo ret = new Retangulo();
	  
	  System.out.println("Digite a largura do retângulo");
	  ret.largura = e.nextDouble();
	  
	  System.out.println("Digite a altura do retângulo");
	  ret.altura = e.nextDouble();
	  
	  System.out.println(String.format("%.2f", ret.largura));
	  System.out.println(String.format("%.2f", ret.altura));
	  
	  System.out.println(ret.toString());
  }
  
}
