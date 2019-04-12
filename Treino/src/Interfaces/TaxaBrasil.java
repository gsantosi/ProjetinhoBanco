package Interfaces;

public class TaxaBrasil {
 
	public double tax(double imposto) {
      if (imposto <= 100.00) {
    	  return  imposto * 0.2;
      }
      else {
    	  return imposto * 0.15;
      }

	}
}
