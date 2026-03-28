package java_new_features.java_08;

interface I8{
	default void m1() {
		System.out.println("Default method in interface I8");
	}
}

public class DefauldMethodDemo implements I8 {
	public static void main(String[] args) {

		DefauldMethodDemo obj = new DefauldMethodDemo();
		obj.m1();
	}

}
