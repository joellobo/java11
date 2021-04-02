package java11;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		String fullName = "Joel Lobo de Brito Neto";
		Stream<String> lines = fullName.lines();
		
		lines
		.map(e -> e + ",")
		.forEach(System.out::print);

	}

}
