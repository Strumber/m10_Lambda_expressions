package milestone2;

public class Ml2_g {

	/*
	 * Crea una Functional Interface que continga un m�tode abstracte operacio (),
	 * que retorne un valor float; injecta a la interf�cie creada mitjan�ant una
	 * lambda el cos del m�tode, de manera que pugis transformar la operaci� a una
	 * suma, resta, multiplicaci� i divisio.
	 */

	public static void main(String[] args) {
		
	
		System.out.println("\nSuma de 1.1 i 1.2 :" + maths("suma", 1.1f, 1.2f));
		System.out.println("\nResta de 1.1 i 1.2 :" + maths("resta", 1.1f, 1.2f));
		System.out.println("\nMultiplicaci� de 1.1 i 1.2 :" + maths("multiplicacio", 1.1f, 1.2f));
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


