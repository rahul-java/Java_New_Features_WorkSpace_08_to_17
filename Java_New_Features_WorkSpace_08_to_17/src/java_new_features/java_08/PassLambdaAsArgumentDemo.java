package java_new_features.java_08;

interface StringFunInterface{
	String func(String s);
}
public class PassLambdaAsArgumentDemo {

	static String calculate(StringFunInterface sf,String s) {
		return sf.func(s);
	}
	
	public static void main(String[] args) {
		
		String inStr="Lambda add great power to java";
		String outStr;
		System.out.println("Input string is : "+inStr);
		// a simple lambda exp which convert string into upper case
		outStr=calculate((str)->str.toUpperCase(), inStr);
		System.out.println("The string in upper case : "+outStr);
		
		//here we are passing a block lambda exp which remove spaces
		outStr=calculate((str)->{
			String resultStr="";
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)!=' ')
					resultStr+=str.charAt(i);
			}
			return resultStr;
		}, outStr);
		System.out.println("The string with spaces removed is : "+outStr);
	}

}
