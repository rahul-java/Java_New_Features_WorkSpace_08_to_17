package java_new_features.java_08.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStream {

	public static void main(String[] args) {

		List<String> deptList=new ArrayList<>();
		deptList.add("Supply");
		deptList.add("HR");
		deptList.add("Sales");
		deptList.add("Marketing");
		
		System.out.println("-----Department List using Normal Stream------");
		Stream<String> deptStream = deptList.stream();
		deptStream.forEach(System.out::println);
		
		System.out.println("-----Department List using Parallel Stream------");
		Stream<String> deptParallelStream = deptList.parallelStream();
		deptParallelStream.forEach(System.out::println);
		
		System.out.println("-----Empty Stream------");
		Stream<Object> emptyStream = Stream.empty();
		emptyStream.forEach(System.out::println);
		
	}

}
