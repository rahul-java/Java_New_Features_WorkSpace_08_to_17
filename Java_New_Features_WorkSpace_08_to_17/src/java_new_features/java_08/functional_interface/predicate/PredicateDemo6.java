package java_new_features.java_08.functional_interface.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class Customer{
	String cname;
	String pswd;
	
	public Customer(String cname,String pswd) {
		this.cname=cname;
		this.pswd=pswd;
	}
}
public class PredicateDemo6 {

	public static void main(String[] args) {
		Predicate<Customer> p=c->c.cname.equals("rahul") && c.pswd.equals("12345");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer name and password : ");
		String cname = sc.next();
		String pswd = sc.next();
		Customer customer = new Customer(cname, pswd);
		if(p.test(customer))
			System.out.println("Valid Customer");
		else
			System.out.println("Invalid Customer");

	}

}
