package java_new_features.java_08;

interface DoubleArrayInterface{
	double calculate(double[] arr) throws EmptyArrayException;
}
class EmptyArrayException extends Exception{
	public EmptyArrayException() {
		super("Array is Empty...");
	}
}
public class LambdaExceptionDemo {

	public static void main(String[] args) throws EmptyArrayException {
		
		double[] dArr= {10.0,20.0,30.0,40.0,50.0};
		DoubleArrayInterface avg=(arr)->{
			double sum=0;
			if(arr.length==0)
				throw new EmptyArrayException();
			for(int i=0;i<arr.length;i++)
				sum+=arr[i];
			return sum/arr.length;
		};
		
		System.out.println("The Average of double Array elements is : "+avg.calculate(dArr));
		System.out.println("The Average of double Array elements is : "+avg.calculate(new double[0]));
	}

}
