package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(11,"Tejas",23));
		list.add(new Employee(12,"Manish",21));
		list.add(new Employee(13,"Suyog",22));
		list.add(new Employee(14,"Sachin",25));
		
		System.out.println("Asscending Order : ");
		Collections.sort(list);
		for (Employee employee : list) {
			System.out.println(employee);
		}
		System.out.println("\nDescending Order : ");
		Collections.reverse(list);
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}
}