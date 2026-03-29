package java_new_features.java_08.functional_interface.predicate;

import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {

		Predicate<Integer> p = i->(i>20);
		System.out.println(p.test(15));
		System.out.println(p.test(25));
		System.out.println(p.test(20));
		System.out.println(p.test(45));
		
	}

}
