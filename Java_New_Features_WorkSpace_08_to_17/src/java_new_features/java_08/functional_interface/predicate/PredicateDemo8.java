package java_new_features.java_08.functional_interface.predicate;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

class Employee1{
	String ename;
	String designation;
	double salary;
	String city;
	
	public Employee1(String ename, String designation, double salary, String city) {
		super();
		this.ename = ename;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", designation=" + designation + ", salary=" + salary + ", city=" + city
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, designation, ename, salary);
	}

	@Override
	public boolean equals(Object obj) {
		Employee1 e = (Employee1) obj;
		if(ename.equals(e.ename) && designation.equals(e.designation) && salary==e.salary && city.equals(e.city))
			return true;
		else
			return false;
	}
	
	
}
public class PredicateDemo8 {

	public static void insertEmployeeRecord(ArrayList<Employee1> empList)
	{
		empList.add(new Employee1("Ram", "Manager", 25000, "Hyderabad"));
		empList.add(new Employee1("Ravi", "Developer", 40000, "Hyderabad"));
		empList.add(new Employee1("Suresh", "Manager", 25000, "Bangalore"));
		empList.add(new Employee1("Hari", "Developer", 50000, "Hyderabad"));
		empList.add(new Employee1("Soni", "Lead", 20000, "Pune"));
		empList.add(new Employee1("Mahesh", "Manager", 35000, "Hyderabad"));
		empList.add(new Employee1("Karan", "Tester", 15000, "Bangalore"));
		empList.add(new Employee1("Tripti", "Developer", 75000, "Bangalore"));
		empList.add(new Employee1("Sonali", "Lead", 65000, "Pune"));
		empList.add(new Employee1("Golu", "Manager", 55000, "Hyderabad"));
	}
	public static void main(String[] args) {

		ArrayList<Employee1> empList = new ArrayList<>();
		insertEmployeeRecord(empList);
		
		Predicate<Employee1> p1 = e -> e.designation.equals("Manager");
		System.out.println("Manager EMployees are ::: ");
		displayEmployees(p1,empList);
		
		Predicate<Employee1> p2 = e -> e.city.equals("Hyderabad");
		System.out.println("Hyderabad EMployees are ::: ");
		displayEmployees(p2,empList);
		
		Predicate<Employee1> p3 = e -> e.salary<30000;
		System.out.println("Employees whose salary less than 30k are ::: ");
		displayEmployees(p3,empList);
		
		Predicate<Employee1> p4 = e -> e.designation.equals("Lead");
		System.out.println("Lead EMployees are ::: ");
		displayEmployees(p4,empList);
		
		System.out.println("Managers whose location is Hyderabad");
		displayEmployees(p1.and(p2),empList);
		
		System.out.println("Employees information other than Managers");
		displayEmployees(p1.negate(),empList);
		
		System.out.println("Employees who re either Leads or whose slary is less than 30k");
		displayEmployees(p3.or(p4),empList);
		
	}
	public static void displayEmployees(Predicate<Employee1> p, ArrayList<Employee1> empList) {

		for(Employee1 e:empList)
			if(p.test(e))
				System.out.println(e);
		System.out.println();
	}

}
