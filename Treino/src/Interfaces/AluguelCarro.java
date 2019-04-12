package Interfaces;

import java.util.Date;

public class AluguelCarro {

	public Date datainicio;
	public Date datafim;
	
	ModeloCarro modelo;
	ControlePagament pagamento;
	
	public AluguelCarro(Date datainicio, Date datafim, ModeloCarro modelo ){
		
		this.datainicio = datainicio;
		this.datafim = datafim;
		this.modelo = modelo;
	}
	
	public ControlePagament getPagamento() {
		return pagamento;
	}
	
	public ModeloCarro getModelo() {
		return modelo;
	}
	
	public Date getDatainicio() {
		return datainicio;
	}
	
	public Date getDatafim() {
		return datafim;
	}
	public void setModelo(ModeloCarro modelo) {
		this.modelo = modelo;
	}
	
	public void setPagamento(ControlePagament pagamento) {
		this.pagamento = pagamento;
	}

}
