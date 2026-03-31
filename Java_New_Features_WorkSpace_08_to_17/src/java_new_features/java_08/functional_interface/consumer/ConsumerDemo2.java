package java_new_features.java_08.functional_interface.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
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
public class ConsumerDemo2 {

	public static void main(String[] args) {

		ArrayList<Student> stdList=new ArrayList<>();
		insertStudentRecords(stdList);
		Predicate<Student> p=s->s.marks>=50;
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
				return "Fail";
			};
			
			Consumer<Student> c=s->{
				System.out.println("Student name :"+s.sname);
				System.out.println("Student marks :"+s.marks);
				System.out.println("Student Grade :"+f.apply(s));
			};
			
			for(Student std:stdList)
			{
				if(p.test(std))
					c.accept(std);
			}
		}



	public static void insertStudentRecords(ArrayList<Student> stdList) {

		stdList.add(new Student("Anitha", 65));
		stdList.add(new Student("Annu", 55));
		stdList.add(new Student("Anju", 75));
		stdList.add(new Student("Anusha", 45));
		stdList.add(new Student("Anupama", 35));
		stdList.add(new Student("Arpita", 28));
		stdList.add(new Student("Alpana", 85));
		stdList.add(new Student("Ananya", 95));
		stdList.add(new Student("Anjali", 50));
		stdList.add(new Student("Akanksha", 70));
	}
}
