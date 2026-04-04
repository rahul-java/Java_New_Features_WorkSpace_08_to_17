package java_new_features.java_08.optional;

public class OptionalDemo1 {

	public static void main(String[] args) {
		
		//String before java 08
		String s[]= new String[10];
		String lowerCase = s[6].toLowerCase();
		System.out.println(lowerCase); //java.lang.NullPointerException: Cannot invoke "String.toLowerCase()" because "s[6]" is null
	}
}
