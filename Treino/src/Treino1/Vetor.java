package Treino1;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
        Scanner e = new Scanner(System.in);
        
        int n = e.nextInt();
        double[] vect = new double[n];
        
        for (int i=0; i<n; i++) {
        	vect[i] = e.nextDouble();
        }
        double soma = 0.0;
        for (int i=0; i<n; i++) {
	        
			soma += vect[i];
	 
    }
        double media = soma/n;
        System.out.println("A media é: " + media);
	}
}
