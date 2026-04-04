package java_new_features.java_08.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {

		List<String> deptList=new ArrayList<>();
		deptList.add("Supply");
		deptList.add("HR");
		deptList.add("Sales");
		deptList.add("Marketing");
		
		//Map in Stream
		deptList.stream().map(s->s.toUpperCase()).forEach(System.out::println);
		
		//Filter in Stream
		deptList.stream().filter(s->s.startsWith("S")).forEach(System.out::println);
		
		//Traverse once in Stream
		Stream<String> deptStream = deptList.stream();
		try {
			deptStream.forEach(System.out::println); // this will execute
			deptStream.forEach(System.out::println); // but this will throw exception
		} catch (Exception e) {
            e.printStackTrace();
		}
		
		//Limit in Stream
		Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);
		
		//Skip in Stream
		Stream.iterate(1, n->n+1).skip(20).limit(30).forEach(System.out::println);
		
		//Reduce in Stream
		System.out.println(Stream.iterate(1, n->n+1).limit(20).reduce(0, (a,b)->a+b));
		
		//Collect Stream
		List<String> collectList = deptList.stream().filter(d->d.startsWith("S")).collect(Collectors.toList());
		collectList.forEach(System.out::println);
		
	}

}
