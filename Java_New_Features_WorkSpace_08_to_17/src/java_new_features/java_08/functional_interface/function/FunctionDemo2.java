package java_new_features.java_08.functional_interface.function;

import java.util.function.Function;

public class FunctionDemo2 {

	public static void main(String[] args) {
//replace space with *** symbols
		String str="My name is Rahul Kumar Pandey.";
		Function<String, String> f=s->s.replaceAll(" ", "***");
		System.out.println(f.apply(str));
	}

}
