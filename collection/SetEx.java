package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Set<String> hSet = new HashSet<String>();
			hSet.add("Xiaomi");        
			hSet.add("Apple");        
			hSet.add("Samsung");		
		    hSet.add("Nothing");
		    hSet.add("Apple");
			hSet.add(null);
			
			System.out.println("implementing HashSet");
			for(String string : hSet)
			{
				System.out.println(string);
			}
			
			LinkedHashSet<String> lhSet = new LinkedHashSet<String>();
			lhSet.add("Xiaomi");        
			lhSet.add("Apple");        
			lhSet.add("Samsung");		
		    lhSet.add("Nothing");
		    lhSet.add("Apple");
			lhSet.add(null);
			
			System.out.println("\nimplementing LinkedHashSet");
			for(String string : lhSet)
			{
				System.out.println(string);
			}
			
			TreeSet<String> tSet = new TreeSet<String>();
			tSet.add("Xiaomi");        
			tSet.add("Apple");        
			tSet.add("Samsung");		
		    tSet.add("Nothing");
		    tSet.add("Apple");
		    //lhSet.add(null);     can't store null value
		    
		    System.out.println("\nimplementing TreeSet");
			for(String string : tSet)
			{
				System.out.println(string);
			}
	}

}
