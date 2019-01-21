package collectionExamples;

import java.util.HashMap;

public class CountofDuplicateNo2 {

	public static void main(String[] args) {
		int[] a = {1,2,3,1,0,4,2,6,4,7,8,3,6,8,9,2,1};

		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<a.length; i++) {
			
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);

			}else {
				map.put(a[i], 1);
			}
			
		}
		System.out.println(map);
	}

}
