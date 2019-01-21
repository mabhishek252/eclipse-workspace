package collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class CursorsListIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.add("Abhi");
		l.add("Naga");
		l.add("Balakrishnan");
		l.add("Durga");
		 System.out.println(l);
	
		 ListIterator itr = l.listIterator();
		 while(itr.hasNext()){
			 String str = (String)itr.next();
			 if(str.equals("Naga")){
				 itr.remove();
			 }else if(str.equals("Balakrishnan")){
				 itr.add("Chaitu");
			 }else if(str.equals("Abhi")){
				 itr.set("Abhishek");
			 }
		 }System.out.println(l);
	}

}
