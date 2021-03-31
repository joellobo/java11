package java11;

import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		String fullName = "Joel Lobo de Brito Neto";
		Stream<String> lines = fullName.lines();
		
		System.out.println(lines);
		
//		
//		List<String> ordensIDs =    
//				lines
//	               //.filter(o -> o.getType() == Ordem.ATIVACAO)
//	               //.sorted(comparing(Ordem::getValue).reversed())
//	               .map()
//	               .collect(System.out::println);

	}

}
