package milestone1;

public class Fase3 {
	/*Crea una Functional Interface que continga un mètode abstracte reverse (), 
	 * que retorne un valor String; en una altra classe, injecta a la interfície creada mitjançant una 
	 * lambda el cos del mètode, de manera que torne la mateixa cadena que rep com a 
	 * paràmetre però a l'inrevés. 
	 * Invoca la instància de la interfície passant-li una cadena i comprovant el resultat.
	 */
	public static void main(String[] args) {
		String txt = "Aquest es el text de prova";
		
		ReverseFunctionalInterface reverseString = (str) -> { String result = "";
		
		for (int i = str.length() -1; i >=0; i --)
			
			result += str.charAt(i);
		
			return result;
		};
		
		System.out.println("Text Original : " + txt);
	
		System.out.println("Text invertit : " +reverseString.reverse(txt));
	}
	
}


