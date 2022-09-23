package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		
         ArrayList<Student> list = new ArrayList<>();
         list.add(new Student(101, "Manish", 21));
         list.add(new Student(102, "Tejas", 20));
         list.add(new Student(103, "Suyog", 22));
         list.add(new Student(104, "Sachin", 20));
         
         
         System.out.println("Sorting by age");
         Collections.sort(list, new AgeComparator());
         for(Student student : list)
         {
        	 System.out.println(student); 
         }
         
         System.out.println("\nSorting by name");
         Collections.sort(list, new NameComparator());
         for(Student student : list)
         {
        	 System.out.println(student); 
         }
	}

}
