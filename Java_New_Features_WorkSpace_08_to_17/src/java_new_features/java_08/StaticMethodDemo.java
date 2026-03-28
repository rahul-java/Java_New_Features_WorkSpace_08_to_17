package java_new_features.java_08;

interface I11{
	public static void sum(int a,int b) {
		System.out.println("Addition of 2 numbers is : "+(a+b));
	}
}

public class StaticMethodDemo implements I11{

	public static void main(String[] args) {

		StaticMethodDemo obj = new StaticMethodDemo();
		//obj.sum(10,20);
		//StaticMethodDemo.sum(10,20);
		I11.sum(10, 20);
	}

	/*
	public void sum(int i, int j) {
		// TODO Auto-generated method stub
	}
	
	//overridden default method
	
	public static void sum(int i, int j) {
		// TODO Auto-generated method stub
		
	}*/

}
