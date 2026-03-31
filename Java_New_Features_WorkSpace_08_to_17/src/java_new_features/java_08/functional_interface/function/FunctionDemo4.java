package java_new_features.java_08.functional_interface.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	String sname;
	int marks;
	
	public Student(String sname,int marks) {
		this.sname=sname;
		this.marks=marks;
	}
	
}
public class FunctionDemo4 {

	public static void main(String[] args) {
		ArrayList<Student> stdList=new ArrayList<Student>();
		insertStudentRecord(stdList);
		Function<Student, String> f=s->{
			int marks=s.marks;
			if(marks>=75)
				return "Distinction";
			else if(marks>=60)
				return "First Div";
			else if(marks>=50)
				return "Second Div";
			else if(marks>=35)
				return "Third Div";
			else
				return "Failed";
		};
		
		Predicate<Student> p=s->s.marks>=60;
		/*
		for(Student s:stdList)
		{
			if(p.test(s)) {
				System.out.println("Student Name : "+s.sname);
				System.out.println("Student Marks : "+s.marks);
				System.out.println("Student Grade : "+f.apply(s));
			}
		}*/
		for(Student s:stdList)
		{
				System.out.println("Student Name : "+s.sname);
				System.out.println("Student Marks : "+s.marks);
				System.out.println("Student Grade : "+f.apply(s));
		}
		
	}

	public static void insertStudentRecord(ArrayList<Student> stdList) {

		stdList.add(new Student("Sachin", 100));
		stdList.add(new Student("Saurabh", 70));
		stdList.add(new Student("Rahul", 75));
		stdList.add(new Student("Ajay", 55));
		stdList.add(new Student("Kumble", 80));
		stdList.add(new Student("Rohan", 35));
	}

}
