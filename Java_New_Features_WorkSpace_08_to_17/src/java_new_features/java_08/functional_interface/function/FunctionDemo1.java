package java_new_features.java_08.functional_interface.function;

import java.util.function.Function;

public class FunctionDemo1 {

	public static void main(String[] args) {
//remove spaces from the string using Function
		String str="My name is Rahul Kumar Pandey.";
		Function<String, String> f=s->s.replaceAll(" ", "");
		System.out.println(f.apply(str));
	}

}
