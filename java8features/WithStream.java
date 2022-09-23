package java8features;

import java.util.ArrayList;

public class WithStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list =new ArrayList<String>();
		list.add("Raj");
		list.add("Bhagyashree");
		list.add("Riya");
		list.add("Rangunath");
		list.add("Sujit");
		list.add("Ravi");
		
		long count = list.stream().filter(str -> str.length()<5).count();
		
		System.out.println("There are "+count+" string with length less than 5");

	}

}