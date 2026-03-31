package java_new_features.java_08.functional_interface.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee1{
	String ename; 
	double salary;
	
	public Employee1(String ename,double salary) {
		this.ename=ename;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", salary=" + salary + "]";
	}
	
}
public class FunctionDemo6 {

	public static <E> void main(String[] args) {
		ArrayList<Employee1> empList=new ArrayList<>();
		insertEmployeeRecords(empList);
		System.out.println("Employees salaries before increment ::: ");
		System.out.println(empList);
		
		Predicate<Employee1> p=e->e.salary<50000;
		Function<Employee1, Employee1> f=e->{
			e.salary=e.salary+5000;
			return e;
			
		};
		System.out.println("Employees salaries after increment ::: ");
		ArrayList<Employee1> empList2 = new ArrayList<>();
		for(Employee1 e:empList)
		{
			if(p.test(e))
				empList2.add(f.apply(e));
		}
		System.out.println(empList2);
		
	}

	public static void insertEmployeeRecords(ArrayList<Employee1> empList) {

		empList.add(new Employee1("Ram", 25000));
		empList.add(new Employee1("Ravi", 40000));
		empList.add(new Employee1("Suresh", 25000));
		empList.add(new Employee1("Mahesh", 50000));
		empList.add(new Employee1("Mahi", 20000));
		empList.add(new Employee1("Soni", 35000));
		empList.add(new Employee1("Karan", 15000));
		empList.add(new Employee1("Tripti", 75000));
		empList.add(new Employee1("Sonali", 65000));
		empList.add(new Employee1("Sohan", 55000));
	}

}
