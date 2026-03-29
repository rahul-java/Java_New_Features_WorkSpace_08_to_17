package java_new_features.java_08.functional_interface.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo5 {

	public static void main(String[] args) {

		String[] str= {"Ram",null,"Kavi","","Manno",null,"","Banti","Kapil",null};
		Predicate<String> p = s->(s!=null && s.length()!=0);
		ArrayList<String> al=new ArrayList<String>();
		for(String s:str)
			if(p.test(s))
				al.add(s);
		System.out.println("List elements are :" +al);
	}
}
