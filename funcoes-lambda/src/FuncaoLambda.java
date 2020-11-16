import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FuncaoLambda {

	private void doubleNumber(Integer number) {
		System.out.println(number * 2);
	}

	/**
	 * primeiro Integer = tipo de entrada da função
	 * segundo Integer = resultado obtido
	 * 
	 */
	private Function<Integer, Integer> function = (x) -> x;

	public static void main(String[] args) {
		FuncaoLambda basico = new FuncaoLambda();

		// (1) Iteração basica com função lambda

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		list.forEach(e -> System.out.println(e));

		System.out.println("\n");

		// (2) Iteração basica com função lambda

		list.forEach(e -> basico.doubleNumber(e));

		System.out.println("\n");

		// (3) Interfaces Funcionais - criando funções com função lambda

		Integer resultado = basico.function.apply(1);
		System.out.print(resultado + "\n");
	}

}
