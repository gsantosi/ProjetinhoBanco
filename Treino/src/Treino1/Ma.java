package Treino1;

import java.util.Scanner;

public class Ma {

		  public void main (String [] args) {
			  
			  Scanner e = new Scanner(System.in);
			  
			  System.out.println("Digite as matrizes");
			  int n = e.nextInt();
			  
			  int [][] mat = new int [n][n];
			  
			  for (int i=0; i<n; i++) {
				  for (int j=0; j<n; j++) {
				    mat [i][j] = e.nextInt();	  
					  
			  }
     	  }
			  
	  }
	}

