package Esjtudos.Udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListArray {
   public static void main (String [] args) {
  
	   
	   List<String> array = new ArrayList<>();
        
	   array.add("Maria");
	   array.add("Amanda");
	   array.add("Bruna");
	   array.add("Alex");
	   
	   array.add(2, "gui");
	   System.out.println(array.size());
	   
	   array.remove("Amanda");
	   
	   
	   for (String x: array) {
		      System.out.println(x);
	   }
	   System.out.println("----------------------");
	   array.removeIf(x -> x.charAt(0) == 'B');
	   
	   for (String x: array) {
		      System.out.println(x);
	   }
	   System.out.println("----------------------");
	   System.out.println("Em qual posição está o Alex?: " + array.indexOf("Alex"));
	   System.out.println("----------------------");
	   List<String> result =array.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
	   
	   for (String x: result) {
		      System.out.println(x);
	   }
   
   
   }
}
