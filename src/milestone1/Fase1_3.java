package milestone1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Fase1_3 {
	
	/*Tenint una llista de Strings, escriu un mètode que retorne una llista de totes les cadenes
	 *  que continguen la lletra ‘o’ i imprimeix el resultat.*/
	 

	public static void main(String[] args) {
		ArrayList<String> nom = new ArrayList<String>();
		nom.add("Joan");
		nom.add("Ana");
		nom.add("Caterina");
		nom.add("Andira");
		nom.add("Oscar");
		nom.add("Sophia");
		nom.add("Oliver");
		
		System.out.println(buscarO(nom));

	}

	private static List<String> buscarO(ArrayList<String> strings) {
		
		
		return strings.stream().filter(s -> s.contains("o") || s.contains("O")).collect(Collectors.toList());
		
		
	}

}
