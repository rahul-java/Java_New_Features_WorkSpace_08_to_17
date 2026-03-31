package java_new_features.java_08.functional_interface.function;

import java.util.function.Function;

public class FunctionChaining2 {

	public static void main(String[] args) {

		Function<String, String> f1=Function.identity();
		String s = f1.apply("Prayagraj");
		System.out.println(s);
	}

}
