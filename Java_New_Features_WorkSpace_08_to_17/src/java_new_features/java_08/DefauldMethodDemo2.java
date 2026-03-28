package java_new_features.java_08;

interface I9{
	default void m1() {
		System.out.println("Default method in interface I9");
	}
}

interface I10{
	default void m1() {
		System.out.println("Default method in interface I10");
	}
}
public class DefauldMethodDemo2 implements I9,I10 {
	
	public void m1() {
		//System.out.println("Default method in interface I10");
		I9.super.m1(); //to call I9 default method
	}
	
	public static void main(String[] args) {

		DefauldMethodDemo2 obj = new DefauldMethodDemo2();
		obj.m1();
	}

}
