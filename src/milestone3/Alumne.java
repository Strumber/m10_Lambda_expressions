package milestone3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Alumne {

	private String nom;
	private int edat;
	private String curs;
	private double nota;

// Getters i Setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public String getCurs() {
		return curs;
	}

	public void setCurs(String curs) {
		this.curs = curs;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public Alumne(String nom, int edat, String curs, double nota) {
		super();
		this.nom = nom;
		this.edat = edat;
		this.curs = curs;
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Alumne (nom=" + nom + ", edat=" + edat + ", curs=" + curs + ", nota=" + nota + ")\n";
	}

	public static void main(String[] args) {
		List<Alumne> alumnes = new ArrayList<Alumne>();

		alumnes.add(new Alumne("Anastasia", 36, "HTML", 4.5));
		alumnes.add(new Alumne("Josep", 28, "Java", 6.8));
		alumnes.add(new Alumne("Jordi", 36, "PHP", 8.0));
		alumnes.add(new Alumne("Ana", 46, "JavaScript", 5.5));
		alumnes.add(new Alumne("andreu", 17, "JAVA", 3.5));
		System.out.println(" 1- Relació alumnes : \n" + alumnes);

		// Mostra per pantalla el nom i l’edat de cada alumne
		System.out.println("\na) Relació estudiants nom i edat :");

		alumnes.stream().flatMap(alumne -> Stream.of("Nom: " + alumne.getNom() + " Edat: " + alumne.getEdat()))
				.collect(Collectors.toList()).forEach(System.out::println);

		
		 /* Filtra la llista per tots els alumnes que el nom comensi per “a”, asigna-ho a
		 * un altre llista y mostra per pantalla la nova llista (tot amb lambdas)
		 */

		List<Alumne> iniciA = alumnes.stream().filter(a -> a.getNom().startsWith("A") || a.getNom().startsWith("a"))
				.collect(Collectors.toList());

		System.out.println("\nb.1) Relació estudiants que el seu nom comencen per 'A' : \n" + iniciA);

		System.out.println("\nb.2) Noms que comencen per 'A' \n");
		for (int a = 0; a < iniciA.size(); a++) {
			System.out.println(iniciA.get(a).getNom());
		}
		// Filtra y mostra per pantalla els alumnes que tinguin un 5 o mes de nota.

		List<Alumne> nota5 = alumnes.stream().filter(n -> n.getNota() >= 5).collect(Collectors.toList());

		System.out.println("\nc) Relació estudiants que la seva nota es mes de 5 \n" + nota5);

		// Filtra y mostra per pantalla els alumnes que tinguin un 5 o mes de nota y que
		// no siguin de PHP.

		List<Alumne> nota5noPHP = alumnes.stream().filter(n5 -> n5.getNota() >= 5 && !n5.getCurs().equals("PHP"))
				.collect(Collectors.toList());

		System.out.println(
				"\nd) Relació estudiants que tinguin un 5 o mes de nota y que no siguin de PHP \n" + nota5noPHP);

		// Mostra tots els alumnes que facin JAVA i siguin majors d’edat.

		List<Alumne> java18 = alumnes.stream()
				.filter(j18 -> j18.getCurs().equalsIgnoreCase("JAVA") && j18.getEdat() >= 18)
				.collect(Collectors.toList());

		System.out.println("\ne) Relació estudiants que facin JAVA i siguin majors d’edat \n" + java18);

	}

}
