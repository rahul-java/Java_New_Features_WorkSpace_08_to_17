package java_new_features.java_08.functional_interface.predicate;

import java.util.function.Predicate;

public class PredicateDemo4 {

	public static void main(String[] args) {

		int x[]= {1,2,3,4,5,6,7,8,9,10,11,12,24,25};
		Predicate<Integer> p1 = i->(i>5);
		Predicate<Integer> p2 = i->i%2==0;
		System.out.println("Elements greater than 5 : ");
		m1(p1,x);
		System.out.println("Even nos in array x are :");
		m1(p2,x);
		System.out.println("Elements which are not greater than 5 : ");
		m1(p1.negate(),x);
		System.out.println("Elements greater than 5 and even numbers : ");
		m1(p1.and(p2),x);
		System.out.println("Elements greater than 5 or even numbers : ");
		m1(p1.or(p2),x);
		
		
	}

	 static void m1(Predicate<Integer> p, int[] x) {

		 for(int n:x) {
			 if(p.test(n))
				 System.out.print(" "+n);
		 }
		 System.out.println();
	}

}
