package java_new_features.java_08.functional_interface.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Movie{
	String mname;
	String result;
	
	public Movie(String mname,String result) {

		this.mname=mname;
		this.result=result;
	}
}
public class ConsumerDemo3 {

	public static void main(String[] args) {
		Consumer<Movie> c1=m->System.out.println(m.mname+" Movie is ready to release...");
		Consumer<Movie> c2=m->System.out.println(m.mname+" Movie is released and it is :"+m.result);
		Consumer<Movie> c3=m->System.out.println(m.mname+" Movie just now i have watched");
		
		Consumer<Movie> c4=c1.andThen(c2).andThen(c3);
		Movie m1=new Movie("Avatar2", "Hit");
		c4.accept(m1);
		Movie m2=new Movie("Devil", "Flop");
		c4.accept(m2);
		
		
		
	}
}
