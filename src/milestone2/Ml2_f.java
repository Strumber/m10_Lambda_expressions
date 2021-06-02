package milestone2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Ml2_f {
//Feu una matriu que contingui algunes cadenes de text y numeros. Ordeneu-lo per:

	
	
	public static void main(String[] args) {
		
		List <String> matriu = Arrays.asList("Zolten","Pau","Ana","Marc","Berta","Arnau","Ari","Joan","1F","Març",
				"3.1515","Eva","3de8","E8","12345");
		
		//f)Modifica tots els elements de la matriu per canviar els caracters “a” a “4”
		
		
				
		List<String> nums = matriu.stream().filter( n -> n.matches("[0-9]+"))
		.collect(Collectors.toList());
		
		System.out.println("Matriu original: \n"+ matriu + "\n");
		System.out.println("\nf) Mostrar nomes els valos 100% numerics : \n" + nums);

	}

}
	