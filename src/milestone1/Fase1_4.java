package milestone1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Fase1_4 {
	
	/*Has de fer el mateix que en el punt anterior, però retornant una llista que incloga 
	 *els elements amb més de 5 lletres. Imprimeix el resultat*/
	 	 

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
		
		
		return strings.stream().filter(s -> s.contains("o") || s.contains("O")&& s.length()>=5).collect(Collectors.toList());
		
		
	}

}
