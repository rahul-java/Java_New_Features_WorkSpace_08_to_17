package java_new_features.java_08.functional_interface;

interface I16{
	void m1();
}

public class Test2 {

	public static void main(String[] args) {
		I16 obj=()->System.out.println("I16 interface m1 method.");
		obj.m1();

	}

}
