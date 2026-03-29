package java_new_features.java_08.functional_interface.predicate;

import java.util.function.Predicate;

public class PredicateDemo3 {

	public static void main(String[] args) {

		int x[]= {1,2,3,4,5,6,7,8,9,10,11,12,24,25};
		Predicate<Integer> p = i->(i>5);
		System.out.println("Elements greater than 5 : ");
		m1(p,x);
		
	}

	 static void m1(Predicate<Integer> p, int[] x) {

		 for(int n:x) {
			 if(p.test(n))
				 System.out.println(n);
		 }
	}

}
