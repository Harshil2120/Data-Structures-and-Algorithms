package maps;

import java.util.*;

public class HashmapClass {
	public static void main(String[] args) {
		String[] arr = { "d", "b", "c", "b", "c", "a" };

		HashMap<String, Integer> hm = new HashMap<>();
		

		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i]))
				hm.put(arr[i], hm.get(arr[i]) + 1);
			else
				hm.put(arr[i], 1);
		}
		
		System.out.println(hm.containsValue(2));
	
		System.out.println(hm.entrySet());
		
	    System.out.println(hm.keySet());
	    
		
		

	}
}
