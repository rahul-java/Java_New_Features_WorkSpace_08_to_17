package java_new_features.java_08.functional_interface;

interface I17{
	void product(int x,int y);
}

public class Test3 {

	public static void main(String[] args) {
		I17 obj=(x,y)->System.out.println("Product of 2 numbers : "+(x*y));
		obj.product(10,20);

	}

}
