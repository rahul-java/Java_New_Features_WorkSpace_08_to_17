package java_new_features.java_08.functional_interface;

interface I18{
	int square(int x);
}

public class Test4 {

	public static void main(String[] args) {
		I18 obj=(x)->x*x;
		System.out.println("Square of number is :"+obj.square(10));

	}

}
