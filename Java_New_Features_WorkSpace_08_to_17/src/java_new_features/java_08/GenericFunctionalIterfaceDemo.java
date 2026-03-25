package java_new_features.java_08;

interface GenericInterface<T>{
	T calculate(T t);
}
public class GenericFunctionalIterfaceDemo {

	public static void main(String[] args) {

		GenericInterface<String> reverse=(str)->{
			String revStr="";
			for(int i=str.length()-1;i>=0;i--)
				revStr+=str.charAt(i);
			return revStr;
		};
		
		System.out.println("Lambda Expression Reverse is : "+reverse.calculate("Lambda Expression"));
		
		GenericInterface<Integer> factorial=(n)->{
			int f=1;
			for(int i=1;i<=n;i++)
				f*=i;
			return f;
		};
		
		System.out.println("The factorial of 5 is : "+factorial.calculate(5));
	}

}
