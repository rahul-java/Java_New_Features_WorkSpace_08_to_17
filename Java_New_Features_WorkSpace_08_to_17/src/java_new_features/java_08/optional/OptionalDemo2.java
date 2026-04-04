package java_new_features.java_08.optional;

import java.util.Optional;

public class OptionalDemo2 {

	public static void main(String[] args) {
		
		//String after java 08
		String str[]=new String[10];
		str[6]="Delhi";
		System.out.println(str[6].toUpperCase());
		
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		
		Optional<String> optional = Optional.of(str[6]);
		System.out.println(optional.get()); //if str[5] then exception
		
		//Optional<String> optional1 = Optional.of(str[5]);
		//System.out.println(optional1.get()); //exception occurred
		
		Optional<String> optional2 = Optional.ofNullable(str[5]);
		optional2.ifPresent(System.out::println);
		System.out.println(optional2.orElse("No Value"));
		
		Optional<String> optional3 = Optional.of("Rahul Kumar Pandey");
		Optional<String> empty2 = Optional.empty();
		System.out.println("Non-Empty Optional String : "+optional3.map(String::toUpperCase));
		System.out.println("Empty Optional String : "+empty2.map(String::toUpperCase));
		
		Optional<String> optional4 = Optional.of("INDIA");
		Optional<String> empty4 = Optional.empty();
		System.out.println(optional4.filter(s->s.equals("india"))); //Optional.empty
		System.out.println(optional4.filter(s->s.equalsIgnoreCase("india"))); //Optional[INDIA]
		System.out.println(empty4.filter(s->s.equalsIgnoreCase("india"))); //Optional.empty
		
	}
}
