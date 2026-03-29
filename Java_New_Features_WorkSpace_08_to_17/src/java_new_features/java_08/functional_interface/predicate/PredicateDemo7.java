package java_new_features.java_08.functional_interface.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class Employee{
	String ename;
	int age;
	String location;
	boolean isHavingId;
	public Employee(String ename, int age, String location, boolean isHavingId) {
		super();
		this.ename = ename;
		this.age = age;
		this.location = location;
		this.isHavingId = isHavingId;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", age=" + age + ", location=" + location + ", isHavingId=" + isHavingId
				+ "]";
	}

	
}
public class PredicateDemo7 {

	public static void main(String[] args) {
		Employee[] eList= {new Employee("Ram", 23, "Delhi", true),
				new Employee("Sita", 21, "Delhi", false),
				new Employee("Ravi", 28, "Bengaluru", true),
				new Employee("Vinay", 33, "Chennai", false),
				new Employee("Abhinav", 24, "Kolkata", true),
				new Employee("Tarun", 22, "Pune", true),
				new Employee("Anita", 26, "Luckmow", false),};
		
		Predicate<Employee> predicate=e->e.isHavingId;
		for(Employee emp:eList)
			if(predicate.test(emp))
				System.out.println(emp);

	}

}
