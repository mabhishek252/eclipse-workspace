package collectionExamples;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		Map<String, String> tmap = new TreeMap<>();
		
		tmap.put("Friuts", "Tomato");
		tmap.put("Friuts1", "Tomato1");
		tmap.put("Friuts2", "Tomato2");
		
		
		System.out.println(tmap.get("Friuts"));
		
		
	}

}
