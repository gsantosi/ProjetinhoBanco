package Interfaces;

public class ServicoPagamento {

	public double pagamentohr;
	public double pagamentodia;
	public TaxaBrasil taxa;
	
	public ServicoPagamento(double pagamentohr, double pagamentodia, TaxaBrasil taxa) {
		
		this.pagamentohr = pagamentohr;
		this.pagamentodia = pagamentodia;
		this.taxa = taxa;
	
	}
	public double getPagamentodia() {
		return pagamentodia;
	}
	
	public double getPagamentohr() {
		return pagamentohr;
	}
	
	public TaxaBrasil getTaxa() {
		return taxa;
	}
	
	public void setPagamentohr(double pagamentohr) {
	     this.pagamentohr = pagamentohr;
	}
	
	public void setPagamentodia(double pagamentodia) {
		this.pagamentodia = pagamentodia;
	}
	
	public void setTaxa(TaxaBrasil taxa) {
		this.taxa = taxa;
	}
	
	public void ServicoControlePagamento(AluguelCarro aluguel) {
		long a1 = aluguel.getDatainicio().getTime();
		long a2 = aluguel.getDatafim().getTime();
		double hrs = (double) (a1 - a2) / 1000/ 60 / 60;
		
		double servicetaxa;
		double pagamentobase;
		if (hrs <= 12.0) {
			pagamentobase = Math.ceil(hrs) * pagamentohr;
		}
		else {
			pagamentobase = Math.ceil(hrs / 24) * pagamentodia;
		}
		
		servicetaxa = taxa.tax(pagamentobase);
	
		aluguel.setPagamento(new ControlePagament(pagamentobase,servicetaxa));

	}
}
