package collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortingEx {
	
public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Suyog");
		list.add("Tejas");
		list.add(0,"Manish");
		list.add("Ajay");
		list.add("Raj");
		list.add("Siddhi");
		
		Collections.sort(list);
		
		System.out.println("Sorting String objects : ");
		for (String string : list) {
			System.out.println(string);
		}
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(35);
		list2.add(45);
		list2.add(12);
		list2.add(5);
		list2.add(7);
		list2.add(27);
		list2.add(18);
		
		Collections.sort(list2);
		System.out.println("\nSorting wrapper objects : ");
		for (Integer integer : list2) {
			System.out.println(integer);
		}
}
}