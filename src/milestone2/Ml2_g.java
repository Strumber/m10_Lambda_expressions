package milestone2;

public class Ml2_g {

	/*
	 * Crea una Functional Interface que continga un mètode abstracte operacio (),
	 * que retorne un valor float; injecta a la interfície creada mitjançant una
	 * lambda el cos del mètode, de manera que pugis transformar la operació a una
	 * suma, resta, multiplicació i divisio.
	 */

	public static void main(String[] args) {
		
	
		System.out.println("\nSuma de 1.1 i 1.2 :" + maths("suma", 1.1f, 1.2f));
		System.out.println("\nResta de 1.1 i 1.2 :" + maths("resta", 1.1f, 1.2f));
		System.out.println("\nMultiplicació de 1.1 i 1.2 :" + maths("multiplicacio", 1.1f, 1.2f));
		System.out.println("\ndivisio de 1.1 i 1.2 :" + maths("divisio", 1.1f, 1.2f));
	}

	public static float maths (String s, float a, float b) {
		
		Operations operate;

		if (s.equals("suma")) {
			operate = () -> a + b;
		} else if (s.equals("resta")) {
			operate = () -> a - b;
		} else if (s.equals("multiplicacio")) {
			operate = () -> a * b;
		} else {
			operate = () -> a / b;
		}
		return  operate.operation();

	}
}


