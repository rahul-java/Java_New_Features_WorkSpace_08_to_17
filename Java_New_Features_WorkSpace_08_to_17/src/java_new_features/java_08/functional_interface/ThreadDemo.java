package java_new_features.java_08.functional_interface;
class Thread1 implements Runnable{

	@Override
	public void run() {

		for(int i=1;i<=10;i++)
			System.out.println("Child Thread");
	}
	
}
public class ThreadDemo {

	public static void main(String[] args) {

		//Runnable r = new Thread1();
		//r.run();
		System.out.println("--------------------------------");
		Thread1 obj = new Thread1();
		Thread t = new Thread(obj);
		t.start();
		for(int i=1;i<=10;i++)
			System.out.println("Main Thread");
		
	}

}
