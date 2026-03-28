package java_new_features.java_08.functional_interface;

interface I15{
	void m1();
}

class Test implements I15{

	@Override
	public void m1() {
		System.out.println("I15 interface m1 method.");
		
	}
	
}
public class TestMain {

	public static void main(String[] args) {

		Test obj = new Test();
		obj.m1();
	}

}
