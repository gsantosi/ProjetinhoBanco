package Interfaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class AluguelClass {
  public static void main(String[] args) throws ParseException {
	  
	  Locale.setDefault(Locale.US);
	  Scanner e = new Scanner(System.in);
	  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	  
	  System.out.println("ENTRE COM OS DADOS DO ALUGUEL");
	  
	  System.out.println("Modelo do carro:");
	  String modelo = e.next();
	  
	  System.out.println("Entre com a data inicio do aluguel:");
	  e.nextLine();
	  Date datainicio = sdf.parse(e.nextLine());
	  
	  System.out.println("Entre com a data de entrega:");
	  Date datafim = sdf.parse(e.nextLine());
	  
	  AluguelCarro ac = new AluguelCarro(datainicio,datafim, new ModeloCarro(modelo));
	  
	  System.out.println("Entre com o pre�o por hora:");
	  double pagamentohr = e.nextDouble();
	  
	  System.out.println("Entre com o pre�o por dia:");
	  double pagamentodia = e.nextDouble();
	  
	  ServicoPagamento sp = new ServicoPagamento(pagamentohr, pagamentodia, new TaxaBrasil());
	  
	  sp.ServicoControlePagamento(ac);
	  
	  System.out.println("____________");
	  System.out.println("NOTA FISCAL!");
	  System.out.println();
	  System.out.println("Pre�o base: " + String.format("%.2f", ac.pagamento.getPagamentoBase()));
	  System.out.println("Taxa: " + String.format("%.2f",ac.pagamento.getTaxa()));
	  System.out.println("Total Pagamento: " + String.format("%.2f" , ac.pagamento.TatalPagamento()));

	  e.close();
  }
	
}