package java_new_features.java_08.functional_interface;

public class ThreadDemo2 {

	public static void main(String[] args) {

		Runnable r=()->{
			for(int i=1;i<=10;i++)
				System.out.println("Child Thread");
		};
		Thread t = new Thread(r);
		t.start();
		for(int i=1;i<=10;i++)
			System.out.println("Main Thread");
		
	}

}
