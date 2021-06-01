package milestone1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Fase1_2 {

	/*Escribe un método que retorne una cadena separada per comes 
	 * basada en una lista de Integers. Cada elemento tendrá que ir 
	 * precedido por la letra "e" si el nombre es par, y precedido de la 
	 * letra "o" si el nombre es impar. Por ejemplo, 
	 * si la lista de entrada es (3,44), la salida tendrá que ser "o3, e44".
	 * Imprime el resultado.
	 */
	public static void main(String[] args) {
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(0);numbers.add(1);
		numbers.add(2);numbers.add(3);
		numbers.add(4);numbers.add(5);
		numbers.add(6);numbers.add(7);
		numbers.add(8);numbers.add(9);
		
		System.out.println(evenOdd(numbers));
	}

	private static String evenOdd(ArrayList<Integer> numbers) {
		
		String even = numbers.stream().filter(i -> i%2 == 0).map(i -> "e"+i).collect(Collectors.joining(","));
		
		String odd = numbers.stream().filter(i -> i%2!=0).map(i -> "o"+ i).collect(Collectors.joining(","));
		
		
		return even + "," + odd;
	}
	
	
	

}
