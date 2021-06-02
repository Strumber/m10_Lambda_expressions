package milestone2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Ml2_a {
//Feu una matriu que contingui algunes cadenes de text y numeros. Ordeneu-lo per:

	
	
	public static void main(String[] args) {
		
		List <String> matriu = Arrays.asList("Zolten","Pau","Ana","Marc","Berta","Arnau","Ari","Joan","1F","Març",
				"3.1515","3de8");
		
		//a) longitud (de més curta a més llarga)
		
		List<String> longitud = matriu.stream().sorted(Comparator.comparing(l -> l.length()))
				.collect(Collectors.toList());
		
		System.out.println("\n a) Matriu ordenada per longitud  (de més curta a més llarga)\n" + longitud);

	}

}
	