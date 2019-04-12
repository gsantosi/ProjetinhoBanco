package br.com.exercicios.udemy;

public class TrianguloClass {
 
	public double a;
	public double b;
	public double c;
	public TrianguloClass() {}
	
public double area() {
	double 	p = (a + b + c) / 2.0; 
	double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
	return area;
	
}
	
}
