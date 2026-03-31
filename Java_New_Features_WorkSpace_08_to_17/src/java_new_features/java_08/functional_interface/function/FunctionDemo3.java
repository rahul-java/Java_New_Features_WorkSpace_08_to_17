package java_new_features.java_08.functional_interface.function;

import java.util.function.Function;

public class FunctionDemo3 {

	public static void main(String[] args) {
//to find no of spaces present in the string
		String str="My name is Rahul Kumar Pandey.";
		Function<String, Integer> f=s->s.length()-s.replaceAll(" ", "").length();
		System.out.println("No. of spaces present in given string is : "+f.apply(str));
	}

}
