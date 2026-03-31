package java_new_features.java_08.functional_interface.function;

import java.util.function.Function;

public class FunctionChaining1 {

	public static void main(String[] args) {

		Function<String, String> f1=s->s.toUpperCase();
		Function<String, String> f2=s->s.substring(0,6);
		System.out.println(f1.andThen(f2).apply("Prayagraj")); //PRAYAG
		System.out.println(f1.compose(f2).apply("Prayagraj")); //PRAYAG
	}

}
