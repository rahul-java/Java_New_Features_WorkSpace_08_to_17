package java_new_features.java_08;

interface I2{
	String reverseString(String str);
}
public class LambdaDemo2 {

	public static void main(String[] args) {
		
		I2 obj=(str)->{
			String revStr="";
			for(int i=str.length()-1;i>=0;i--)
				revStr+=str.charAt(i);
			return revStr;
		};
		System.out.println("Revese String is : "+obj.reverseString("Lambda"));
		System.out.println("Revese String is : "+obj.reverseString("Expression"));
	}
}
