package java_new_features.java_08.functional_interface.function;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		Function<String, Integer> f=s->s.length();
		System.out.println(f.apply("Rahul"));
		System.out.println(f.apply("Pandey"));
	}

}
