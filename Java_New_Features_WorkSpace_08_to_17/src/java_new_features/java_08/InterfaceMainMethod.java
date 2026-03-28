package java_new_features.java_08;

interface InterfaceMainMethod {

	void m1();
	public static void main(String[] args) {

		System.out.println("Main Method inside Interface");
		InterfaceMainMethodDemo obj = new InterfaceMainMethodDemo();
		obj.m1();
	}

}
class InterfaceMainMethodDemo implements InterfaceMainMethod{

	@Override
	public void m1() {

		System.out.println("InterfaceMainMethod interface m1 method");
	}
	
}
