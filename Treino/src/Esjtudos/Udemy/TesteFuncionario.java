package Esjtudos.Udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TesteFuncionario {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner e = new Scanner(System.in);
		List<Funcionario> array = new ArrayList<>();

		Funcionario f = null;

		System.out.println("Entre com o numero de cadastros:");
		int c = e.nextInt();

		for (int i = 1; i <= c; i++) {
			System.out.println("Digite o seu ID " + i + "º:");
			int id = e.nextInt();

			System.out.println("Digite o seu nome " + i + "º:");
			e.nextLine();
			String nome = e.nextLine();

			System.out.println("Digite o seu salário " + i  + "º:");
			double salario = e.nextDouble();

			f = new Funcionario(nome, id, salario);
			array.add(f);
		}
		System.out.println("Digite o ID para aumento: ");
		int men = e.nextInt();

		for (Funcionario arr : array) {

			if (men == arr.getId()) {
				System.out.println("Qual o valor que você deseja aumentar?: ");
				double v = e.nextDouble();
				arr.setSalario(arr.aumento(v));

			} else {
				System.out.println(f.getId());
			}
		}

		for (Funcionario x : array) {
			System.out.println(x);
		}

	}
}
