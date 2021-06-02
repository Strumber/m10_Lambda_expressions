package milestone2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Ml2_b {
//Feu una matriu que contingui algunes cadenes de text y numeros. Ordeneu-lo per:

	
	
	public static void main(String[] args) {
		
		List <String> matriu = Arrays.asList("Zolten","Pau","Ana","Marc","Berta","Arnau","Ari","Joan","1F","Març",
				"3.1515","3de8");
		
		//b)longitud inversa (de més llarga a més curta)
		
		List<String> longitudinv = matriu.stream().sorted(Comparator.comparingInt(String::length).reversed())
				.collect(Collectors.toList());
		
		System.out.println("\n b) Matriu ordenada per longitud  (de més llarga a més curta)\n" + longitudinv);

	}

}
	