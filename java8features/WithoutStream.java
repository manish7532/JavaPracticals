package java8features;

import java.util.ArrayList;

public class WithoutStream {
	
	public static void main(String[] args) {
		
		ArrayList<String> list =new ArrayList<String>();
		list.add("Raj");
		list.add("Bhagyashree");
		list.add("Riya");
		list.add("Rangunath");
		list.add("Sujit");
		list.add("Ravi");
		
		int count=0;
		for(String string : list)
		{
			if(string.length()<5)
				count++;
		}
		System.out.println("There are "+count+" string with length less than 5");
	}

}