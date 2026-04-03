package java_new_features.java_08.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(5);
		al.add(15);
		al.add(30);
		al.add(25);
		al.add(35);
		//Configuration (filter,map)
		List<Integer> al1 = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(al1);
		List<Integer> al2 = al.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(al2);
		//Processing (collect,count,sorted)
		ArrayList<String> names=new ArrayList<String>();
		names.add("Rahul");
		names.add("Ravinder");
		names.add("Mritunjay");
		names.add("Deepak");
		names.add("Gayasul");
		long count = names.stream().filter(s->s.length()>=6).count();
		System.out.println("Count :"+count);

		List<Integer> al3 = al.stream().sorted().collect(Collectors.toList());
		System.out.println(al3);
		
		al.stream().forEach(n->System.out.println(n));
		System.out.println("-----------------");
		al.stream().forEach(System.out::println);
		
		Integer[] array = al.stream().toArray(Integer[]::new);
		
		Integer min = al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		Integer max = al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Min : "+min+" Max : "+max);
	}

}
