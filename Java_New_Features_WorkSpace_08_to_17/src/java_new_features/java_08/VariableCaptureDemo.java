package java_new_features.java_08;

interface I7{
	int func(int n);
}

public class VariableCaptureDemo {

	public static void main(String[] args) {
		//local variable that can be captured
		int num=10;
		I7 obj=(n)->{
			int x=num+n; //ek bar num andar use ho gya to ye final ho jata h that cnnot be changed.
			//num++; //illegal can not be changed
			return x;
		};
		//num++; //can not be changed
		System.out.println("num="+num);
		System.out.println("value is ="+obj.func(5));

	}

}
