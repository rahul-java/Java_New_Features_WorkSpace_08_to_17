package java_new_features.java_08;

//MyInterface is a functional interface whose method returns MyClass reference.
interface MyInterface {
	MyClass func(int n);
}

class MyClass {
	private int x;

	public MyClass(int a) {
		x = a;
	}

	public MyClass() {
		x = 0;
	}

	int getX() {
		return x;
	}
}

public class ConstructorRefereneDemo {
	public static void main(String[] args) {
		
		/* create a reference to MyClass constructor bcoz func() in MyInterface takes an arg, new reers to the 
		 * parameterized constructor in MyClass, not the default constructor*/
		MyInterface obj=MyClass::new;
		
		//create an instance of of MyClass via that constructor reference
		MyClass mc=obj.func(100);
		
		//using MyClass object we are calling the getter method of MyClass
		System.out.println("x value in mc object : "+mc.getX());

	}
}
