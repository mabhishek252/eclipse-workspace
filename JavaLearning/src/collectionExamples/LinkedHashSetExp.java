package collectionExamples;
import java.util.LinkedHashSet;

public class LinkedHashSetExp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkedHashSet h = new LinkedHashSet();//Duplicate values are not allowed and Insertion Order Preserved
		h.add(10);
		h.add("Abhi");
		h.add(null);
		h.add(21);
		System.out.println(h.add(10));		
		System.out.println(h);
		
	}

}
