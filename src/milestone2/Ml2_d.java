package milestone2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Ml2_d {
//Feu una matriu que contingui algunes cadenes de text y numeros. Ordeneu-lo per:

	
	
	public static void main(String[] args) {
		
		List <String> matriu = Arrays.asList("Zolten","Pau","Ana","Marc","Berta","Arnau","Ari","Joan","1F","Març",
				"3.1515","Eva","3de8","E8");
		
		/*d)Les cadenes que contenen "e" primer, tota la resta en segon lloc. 
		 * De moment, poseu el codi directament a la lambda.*/
		
		
				
		List<String> primerE = matriu.stream().sorted(Comparator.comparing(e -> e.length()))
		.sorted(Comparator.comparing(e -> !e.contains("E")))
		.collect(Collectors.toList());
		
		System.out.println("\n d) Matriu que contenen \"e\" primer, tota la resta en segon lloc\n" + primerE);

	}

}
	