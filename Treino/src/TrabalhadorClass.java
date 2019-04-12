import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TrabalhadorClass {
	public static void main(String[] args) throws ParseException {
		
		

		Locale.setDefault(Locale.US);
		Scanner e = new Scanner(System.in);
		SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Digite o seu Departamento:");
		String depart = e.next();

		System.out.println("Entre com seus dados:");
		System.out.print("Nome:");
		String nome = e.next();

		System.out.print("Digite o seu nivel:");
		String ex = e.next();

		System.out.print("Digite o seu salário:");
		double salario = e.nextDouble();

		Trabalhador tra = new Trabalhador(nome, Experiencia.valueOf(ex), salario, new Departamento(depart));
        
		System.out.println("Digite a quantidade de contratos");
		int n = e.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Entre com o " + (i + 1) + "º:");
			System.out.println("Entre com a data: (dd/MM/yyyy):");
			Date data = spf.parse(e.next());
			System.out.println("Valor por hr:");
			double va = e.nextDouble();
			System.out.println("Digite o meses trabalhados:");
			int meses = e.nextInt();
			HoraContrato contract = new HoraContrato(data, va, meses);
			tra.addContrato(contract);

		}
		System.out.println("Digite o mes e ano digitados a cima para calcular o salário:(MM/yyyy)");
		String mea = e.next();
		int mes = 1+Integer.parseInt(mea.substring(0, 1));
		int ano = Integer.parseInt(mea.substring(3));
		System.out.println("Nome do trabalhador: " + tra.getNome());
		System.out.println("Nome do departamento: " + tra.getDep().getNome());
		System.out.println("Total de datas + aumento:" + tra.incode(mes, ano));

	}
}
