import java.util.Date;

public class HoraContrato {

	public Date data;
	public double horav;
	public int hora;
	
	
	public HoraContrato() {}
	
	public HoraContrato(Date data, double horav, int hora) {
		
		this.data = data;
		this.horav = horav;
		this.hora = hora;		
		
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getHorav() {
		return horav;
	}

	public void setHorav(double horav) {
		this.horav = horav;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public double totalHora() {
		return horav * hora;
	}

}
