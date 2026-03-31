package java_new_features.java_08.functional_interface.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

class Customer{
	String cname;
	int cid;
	String city;
	String bankName;

	public Customer(String cname, int cid, String city, String bankName) {
		this.cname = cname;
		this.cid = cid;
		this.city = city;
		this.bankName = bankName;
	}
	
	
}
public class ConsumerDemo1 {

	public static void main(String[] args) {

		ArrayList<Customer> custList=new ArrayList<Customer>();
		insertCustomerRecords(custList);
		
		Consumer<Customer> c=cust->{
			System.out.println("=====================Customer Details===========================");
			System.out.println("Customer Name :"+cust.cname);
			System.out.println("Customer id :"+cust.cid);
			System.out.println("Customer City Name :"+cust.city);
			System.out.println("Customer Bank Name :"+cust.bankName);
		};
		
		for(Customer cust:custList) {
			c.accept(cust);
		}
	}

	public static void insertCustomerRecords(ArrayList<Customer> custList) {

		custList.add(new Customer("Ram", 101, "Hyderabad", "HDFC"));
		custList.add(new Customer("Ravi", 102, "Bengalore", "ICICI"));
		custList.add(new Customer("Rohan", 103, "Pune", "IDBI"));
		custList.add(new Customer("Ramesh", 104, "Kolakata", "Axis"));
		custList.add(new Customer("Rakesh", 105, "Delhi", "SBI"));
	}

}
