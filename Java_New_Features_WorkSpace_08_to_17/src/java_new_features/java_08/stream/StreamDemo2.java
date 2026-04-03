package java_new_features.java_08.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(5);
		al.add(15);
		al.add(30);
		al.add(25);
		al.add(35);
		
		List<Integer> al1 = al.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(al1);
		
		Stream<Integer> s = Stream.of(10,100,1000,10000);
		s.forEach(System.out::println);
		Stream.of(10,100,1000,10000).forEach(System.out::println);
		
		Double arr[]= {11.0,12.2,13.3,14.4,15.5,16.6};
		Stream<Double> s1 = Stream.of(arr);
		s1.forEach(System.out::println);
		
		Stream<String> emptyStream = Stream.empty();
		emptyStream.forEach(System.out::println);
		
		Stream<Integer> s2 = al.stream();
		s2.forEach(System.out::println);
		System.out.println("Parallel Stream");
		Stream<Integer> s4 = al.parallelStream();
		s4.forEach(System.out::println);
	}

}
