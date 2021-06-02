package milestone2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Ml2_e {
//Feu una matriu que contingui algunes cadenes de text y numeros. Ordeneu-lo per:

	
	
	public static void main(String[] args) {
		
		List <String> matriu = Arrays.asList("Zolten","Pau","Ana","Marc","Berta","Arnau","Ari","Joan","1F","Març",
				"3.1515","Eva","3de8","E8");
		
		//e)Modifica tots els elements de la matriu per canviar els caracters “a” a “4”
		
		
				
		List<String> aPer4 = matriu.stream().map(a-> a.replace("a", "4")).map(a-> a.replace("A", "4"))
		.collect(Collectors.toList());
		
		System.out.println("Matriu original: "+ matriu + "\n");
		System.out.println("\n e) Matriu modificant 'a' per '4' " + aPer4);

	}

}
	