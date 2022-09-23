package java8features;

import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {
	
	public static void main(String[] args) {
		
		List<Student> list = Student.getStudentList();
		
		Predicate<Student> p1 = s -> s.getName().startsWith("B");
		Predicate<Student> p2 = s -> s.getAge()>30 && s.getName().startsWith("A");
		Predicate<Student> p3 = s -> s.getAge()>30;
		
		boolean b1 = list.stream().anyMatch(p1);
		System.out.println("P1 with anyMatch : "+b1);
		
		boolean b2 = list.stream().anyMatch(p2);
		System.out.println("P2 with anyMatch : "+b2);
		
		boolean b3 = list.stream().noneMatch(p2);
		System.out.println("P2 with noneMatch : "+b3);
		
		boolean b4 = list.stream().noneMatch(p3);
		System.out.println("P3 with noneMatch : "+b4);
		
		boolean b5 = list.stream().allMatch(p3);
		System.out.println("P3 with allMatch : "+b5);
	}

}