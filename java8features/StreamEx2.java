package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {
public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Annie","raj","Bhagyashree","Vyankatesh","Shweta","Nikita","Priyanka");
		
		List<String> longNames = names.stream().filter(str -> str.length()>6 && str.length()<11).collect(Collectors.toList());
		
		longNames.forEach(System.out::println);
	}
}
