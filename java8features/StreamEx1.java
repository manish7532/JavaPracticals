package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Annie","raj","Bhagyashree","Vyankatesh","Shweta","Nikita","Priyanka");
		
		Stream<String>  allNames = names.stream();
		
		Stream<String> longNames = allNames.filter(str -> str.length()>7);
		
		longNames.forEach(str -> System.out.println(str));
	}

}
