package Treino1;

import java.util.Locale;
import java.util.Scanner;

import br.com.innocencio.estudos.Aluguel;

public class VetorAluguel {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner e = new Scanner(System.in);

		String nome = null;
		String email = null;
		int quarto = 0;
		
		
		
		Aluguel[] vetor = new Aluguel[10];
		
		System.out.println("Quantos alunos desejam alugar o quarto?");
		int n = e.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Nome:" + (i+1));   
			e.nextLine();
		    nome = e.nextLine();
			
			System.out.println("E-mail:" + (i+1));
            email = e.next();
			
            System.out.println("Numero do quarto:" + (i+1));
		    quarto = e.nextInt();
            vetor[quarto] = new Aluguel(nome,email);
		
           
		} 
		for (int i=0; i<10; i++) {
		if (vetor[i] != null) {
			 System.out.println("Quarto: " + i + " \nNome: " + nome + " \nE-mail: " + email);
			
		}else {
			System.out.println("Quarto indisponível");
		}
		}
	
	}
}
