package milestone1;

public class Fase3 {
	/*Crea una Functional Interface que continga un m�tode abstracte reverse (), 
	 * que retorne un valor String; en una altra classe, injecta a la interf�cie creada mitjan�ant una 
	 * lambda el cos del m�tode, de manera que torne la mateixa cadena que rep com a 
	 * par�metre per� a l'inrev�s. 
	 * Invoca la inst�ncia de la interf�cie passant-li una cadena i comprovant el resultat.
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


