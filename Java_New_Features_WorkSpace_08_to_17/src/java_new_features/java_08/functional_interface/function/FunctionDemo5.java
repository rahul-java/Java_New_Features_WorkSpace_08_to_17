package java_new_features.java_08.functional_interface.function;

import java.util.ArrayList;
import java.util.function.Function;

class Employee{
	String ename; 
	double salary;
	
	public Employee(String ename,double salary) {
		this.ename=ename;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", salary=" + salary + "]";
	}
	
}
public class FunctionDemo5 {

	public static void main(String[] args) {
		ArrayList<Employee> empList=new ArrayList<>();
		insertEmployeeRecords(empList);
		System.out.println(empList);
		
		Function<ArrayList<Employee>, Double> f=el->{
			double total=0.0;
			for(Employee e:el) {
				total+=e.salary;
			}
			return total;
			
		};
		System.out.println("Total Salary of all employees : "+f.apply(empList));
		
	}

	public static void insertEmployeeRecords(ArrayList<Employee> empList) {

		empList.add(new Employee("Ram", 25000));
		empList.add(new Employee("Ravi", 40000));
		empList.add(new Employee("Suresh", 25000));
		empList.add(new Employee("Mahesh", 50000));
		empList.add(new Employee("Mahi", 20000));
		empList.add(new Employee("Soni", 35000));
		empList.add(new Employee("Karan", 15000));
		empList.add(new Employee("Tripti", 75000));
		empList.add(new Employee("Sonali", 65000));
		empList.add(new Employee("Sohan", 55000));
	}

}
