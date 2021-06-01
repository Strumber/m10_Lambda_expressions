package milestone1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fase1_1 {
	
	/*Tenint una llista de cadenes de noms propis, escriu un mètode que retorne una llista de totes 
	 * les cadenes que comencen amb la lletra 'a' (mayuscula) i tenen exactament 3 lletres. 
	 * Imprimeix el resultat.*/
	 
	

	public static void main(String[] args) {
		
		List <String> noms = Arrays.asList("Jordi","Ana","Maria","Berta","Arnau","Ari",
				"Joan","Adria","Ali","Ona","Oriol","Ava");
		
		System.out.println("LLista Orignal de noms : " + noms);
		
		List<String> select = noms.stream().filter(nom -> nom.startsWith("A") &&
				nom.length() == 3).collect(Collectors.toList());
		
		System.out.println("\nNoms que comencen amb \"A\" y 3 lletres" + select);

	}

}
