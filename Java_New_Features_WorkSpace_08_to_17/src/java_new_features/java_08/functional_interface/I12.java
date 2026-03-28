package java_new_features.java_08.functional_interface;

@FunctionalInterface
public interface I12 {
 void m1();
 default void m2() {}
 public static void m3() {}
 default void m4() {}
}

//@FunctionalInterface
interface I13 extends I12{
	void m5();
}

//@FunctionalInterface
interface I14{
	
}
