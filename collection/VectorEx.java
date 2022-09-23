package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
	
			Vector<String> vector = new Vector<String>();
			vector.addElement("Suyog");
			vector.add("Manish");
			vector.add("Tejas");
			vector.add("Sachin");
			vector.add(null);
			Enumeration<String> em = vector.elements();
			while (em.hasMoreElements()) {
				System.out.println(em.nextElement());
			}
			
	}

}
