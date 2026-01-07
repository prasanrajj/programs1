package programs.programs.DSA.algorithms;

import java.util.HashMap;

public class CountingByStateTracking {
	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 3, 3, 4};

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int num : arr) {
		    if (map.containsKey(num)) {
		        map.put(num, map.get(num) + 1);
		    } else {
		        map.put(num, 1);
		    }
		}
		System.out.println(map);
		
		
		int maxCount = 0;
		int mostRepeated = arr[0];
		
		for(int key : map.keySet()) {
			if(maxCount < map.get(key)) {
				maxCount = map.get(key);
				mostRepeated = key;
				
			}
		}
		System.out.println("the number " + mostRepeated + " is most repeated " + maxCount +" times");
	}
}
