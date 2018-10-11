package com.btk;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// System.out.println( "Hello World!" );

		List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// affichier les nombres pairs

		// for (Integer nb : nombres) {
		// if (nb % 2 == 0) {
		// System.out.println(nb + "est pair");
		// }
		// }
		//
		// Predicate<Integer> filtrePaire = x -> x % 2 == 0;
		
		
		//Predicate<Integer> filtrePaire = a -> a % 2 == 0;

		List<Integer> pairs = nombres.stream().filter(a -> a % 2 == 0)// oprateur -> s'appelle LAMDA
				.collect(Collectors.toList());

		// pairs.forEach(x->{System.out.println(x);});

		pairs.forEach(System.out::println);

	}
}
