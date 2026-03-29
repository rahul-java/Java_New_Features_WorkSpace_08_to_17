package java_new_features.java_08.functional_interface.predicate;

import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {

		Predicate<String> p = s->(s.length()>5);
		System.out.println(p.test("rahulpandey"));
		System.out.println(p.test("rahul"));
		
	}

}
