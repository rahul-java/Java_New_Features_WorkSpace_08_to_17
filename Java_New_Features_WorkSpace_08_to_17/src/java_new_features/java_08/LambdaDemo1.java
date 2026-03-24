package java_new_features.java_08;

interface I1{
	int factValue(int n);
}
public class LambdaDemo1 {

	public static void main(String[] args) {
		
		I1 obj=(n)->{
			int f=1;
			for(int i=1;i<=n;i++)
				f=f*i;
			return f;
		};
		System.out.println("The Factorial of 5 is : "+obj.factValue(5));
		System.out.println("The Factorial of 10 is : "+obj.factValue(10));

	}

}
