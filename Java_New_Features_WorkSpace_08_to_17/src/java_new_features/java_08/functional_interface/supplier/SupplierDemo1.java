package java_new_features.java_08.functional_interface.supplier;

import java.util.function.Supplier;

public class SupplierDemo1 {

	public static void main(String[] args) {

		Supplier<String> s=()->{
			String otp="";
			for(int i=1;i<=10;i++)
				otp=otp+(int)(Math.random()*10);
			return otp;
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
