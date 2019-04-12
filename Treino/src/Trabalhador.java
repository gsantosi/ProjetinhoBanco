
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {

	public String nome;
	public Experiencia ex;
	public double salario;
	
	public Departamento dep;
	List<HoraContrato> array = new ArrayList<>();
	HoraContrato c = new HoraContrato();
	

	public Trabalhador(String nome, Experiencia ex, double salario, Departamento dep) {

		this.nome = nome;
		this.ex = ex;
		this.salario = salario;
		this.dep = dep;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Experiencia getEx() {
		return ex;
	}

	public void setEx(Experiencia ex) {
		this.ex = ex;
	}

	public double getSalario() {
		return salario;
	}
	
	public Departamento getDep() {
		return dep;
	}

	public void setDep(Departamento dep) {
		this.dep = dep;
	}
	
	public List<HoraContrato> getArray() {
		      return array;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void addContrato (HoraContrato contract) {
       		array.add(contract);
	}

	public void removeContrato(HoraContrato contract) {
		    array.remove(contract);
	}
	

	
	
	
	public double incode(int mes, int ano) {
		Calendar cale = Calendar.getInstance();
		
		double soma = 0;
		
		
		for (HoraContrato x : array) {
			
			cale.setTime(x.getData());
			
			int ano1 = cale.get(Calendar.YEAR);
	     	int mes1 = cale.get(Calendar.MONTH);
	     
	     	if(ano == ano1 && mes == mes1) {
	    	    
	    	 soma += (x.totalHora()+ salario);
	     }
			
		}
		
		return soma;
	}
}