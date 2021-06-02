package milestone2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Ml2_c {
//Feu una matriu que contingui algunes cadenes de text y numeros. Ordeneu-lo per:

	
	
	public static void main(String[] args) {
		
		List <String> matriu = Arrays.asList("Zolten","Pau","Ana","Marc","Berta","Arnau","Ari","Joan","1F","Març",
				"3.1515","3de8");
		
		//c) Alfabéticamente por el primer carácter
		
		List<String> primerChar = matriu.stream().sorted(Comparator.comparingInt(i -> i.charAt(0)))
				.collect(Collectors.toList());
		
		System.out.println("\n c) Matriu ordenada Alfabéticamente pel primer carácter\n" + primerChar);

	}

}
	