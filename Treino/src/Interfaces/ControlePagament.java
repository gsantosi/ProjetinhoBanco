package Interfaces;

public class ControlePagament {

	public double pagamentobase;
	public double taxa;

	ServicoPagamento service;

	public ControlePagament(double pagamentobase, double taxa) {

		this.pagamentobase = pagamentobase;
		this.taxa = taxa;
	}

	public ServicoPagamento getService() {
		return service;
	}

	public double getPagamentoBase() {
		return pagamentobase;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setPagamentoBase(double pagamentobase) {
		this.pagamentobase = pagamentobase;
	}

	public void serTaxa(double taxa) {
		this.taxa = taxa;
	}

	public double TatalPagamento() {
		return getPagamentoBase() + getTaxa();
	}

}
