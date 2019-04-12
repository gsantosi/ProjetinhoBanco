package br.com.exercicios.udemy;
import java.util.Scanner;
public class Debugging {
	
		public static void main(String[] args) {
			Scanner e = new Scanner(System.in);

			System.out.println("Digite 3 numero!");
			int numero1 =  e.nextInt();
			int numero2 = e.nextInt();
			int numero3 = e.nextInt();

			int maior = max(numero1, numero2, numero3);

			showResult(maior);

		}

		public static int max(int x, int y, int w) {
			int aux;
			if (x > y && x > w) {
				aux = x;
			} else if (y > x && y > w) {
				aux = y;
			} else {
				aux = w;
			}
			return aux;

		}
		public static void showResult(int value) {
			System.out.println("inteiro" + value);
		}

	}


