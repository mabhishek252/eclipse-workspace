package collectionExamples;

import java.util.HashSet;

public class HashSetExp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashSet h = new HashSet();//Duplicate values are not allowed and Insertion Order are not Preserved
		h.add(10);
		h.add("Abhi");
		h.add(null);
		h.add(10);
		System.out.println(h.add(10));		
		System.out.println(h);
	}

}









