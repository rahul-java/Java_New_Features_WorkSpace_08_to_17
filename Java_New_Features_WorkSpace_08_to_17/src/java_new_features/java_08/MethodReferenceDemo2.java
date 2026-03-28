package java_new_features.java_08;

interface StringFunctionInterface1{
	String calculate(String s);
}
class StringOperation1{
	String reverseString(String str) {
		String revStr="";
		for(int i=str.length()-1;i>=0;i--)
			revStr+=str.charAt(i);
		return revStr;
	} 
}
public class MethodReferenceDemo2 {

	static String stringOp(StringFunctionInterface sf,String s) {
		return sf.calculate(s);
	}
	
	public static void main(String[] args) {
		String inStr="Lambda add great power to java.";
		String outStr;
		StringOperation1 obj=new StringOperation1();
		outStr=stringOp(obj::reverseString, inStr);
		System.out.println("Original String is : "+inStr);
		System.out.println("Reversed String is : "+outStr);
	}
}
