package java_new_features.java_08.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo3 {

	public static void main(String[] args) {
		
		Stream.iterate(1, n->n+1).skip(10).limit(20).forEach(System.out::println);
		System.out.println("--------------------");
		Stream.iterate(1, n->n+1).limit(20).forEach(System.out::println);
		
		
	}

}
