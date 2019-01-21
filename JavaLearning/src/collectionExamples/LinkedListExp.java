package collectionExamples;

import java.util.LinkedList;

public class LinkedListExp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.add(10);
		l.add("Abhi");
		l.add(null);
		l.add(10);
		l.set(3,"Software");
		l.removeFirst();
		System.out.println(l.add(10));		
		System.out.println(l);

	}

}
