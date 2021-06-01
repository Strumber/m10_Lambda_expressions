package milestone1;

import java.util.Arrays;

public class Fase1_5 {
	// Crea una llista amb els noms dels mesos de l’any.
	// Imprimeix tots els elements de la llista amb una lambda.

	public static void main(String[] args) {

		String[] mesos = { "Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre",
				"Novembre", "Desembre" };

		Arrays.stream(mesos).forEach(m -> System.out.println("Mes de : " + m));

	}

}
