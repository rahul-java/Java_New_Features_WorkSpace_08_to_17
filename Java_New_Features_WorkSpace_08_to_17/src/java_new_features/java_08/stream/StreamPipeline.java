package java_new_features.java_08.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPipeline {

	public static void main(String[] args) {

		List<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(5);
		al.add(15);
		al.add(30);
		al.add(25);
		al.add(35);
		
		List<Integer> al1 = al.stream().filter(n->n%2!=0).map(n->n*n).sorted().collect(Collectors.toList());
		System.out.println("Stream Pipline");
		al1.forEach(System.out::println);
	}

}
