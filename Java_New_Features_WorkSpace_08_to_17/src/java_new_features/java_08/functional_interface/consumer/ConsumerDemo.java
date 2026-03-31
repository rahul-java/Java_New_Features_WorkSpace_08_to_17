package java_new_features.java_08.functional_interface.consumer;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		Consumer<String> c=s->System.out.println(s);
		c.accept("Hello");
		c.accept("Rahul");
	}

}
