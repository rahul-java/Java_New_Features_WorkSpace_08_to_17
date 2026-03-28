package java_new_features.java_08;

interface StringFunctionInterface{
	String calculate(String s);
}
class StringOperation{
	static String reverseString(String str) {
		String revStr="";
		for(int i=str.length()-1;i>=0;i--)
			revStr+=str.charAt(i);
		return revStr;
	} 
}
public class MethodReferenceDemo {

	static String stringOp(StringFunctionInterface sf,String s) {
		return sf.calculate(s);
	}
	
	public static void main(String[] args) {
		String inStr="Lambda add great power to java.";
		String outStr;
		outStr=stringOp(StringOperation::reverseString, inStr);
		System.out.println("Original String is : "+inStr);
		System.out.println("Reversed String is : "+outStr);
	}
}
