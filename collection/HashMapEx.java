package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("Br", "Brazil");
		map.put("In", "India");
		map.put("De", "Germany");
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
			
			System.out.println("Country code : "+entry.getKey()+" Country : "+entry.getValue());
		}
		System.out.println("\n"+map.get("In"));
		
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("b10", "Sandwich");
		treeMap.put("D5", "Pav-Bhaji");
		treeMap.put("L15", "Chole-puri");
		treeMap.put("B20", "Coffee");
		
		System.out.println("\nImplementing TreeMap : ");
         for (Map.Entry<String, String> entry : treeMap.entrySet()) {
			
			System.out.println("Menu code : "+entry.getKey()+" Menu name : "+entry.getValue());
		}
         Hashtable<String, String> hashTable = new Hashtable<String, String>();
         hashTable.put("b10", "Sandwich");
         hashTable.put("D5", "Pav-Bhaji");
         hashTable.put("L15", "Chole-puri");
         hashTable.put("B20", "Coffee");
         System.out.println("\nImplementing Hashtable : ");
         for (Map.Entry<String, String> entry : hashTable.entrySet()) {
			
			System.out.println("Menu code : "+entry.getKey()+" Menu name : "+entry.getValue());
		}
	}

}
