package programs.programs.DSA.algorithms;

import java.util.HashMap;

public class Dummy {
	public static void main(String[] args) {
		 int[] arr = {1, 1, 2,2, 1, 2, 2};
	        int k = 3;
	        int windowSum = 0;
	        int maxSum = 0;
	        
	     HashMap<Integer, Integer> map = new HashMap<>();
	     
	     //first window
	     for(int i = 0; i < k; i++) {
	    	 windowSum += arr[i];
	    	 map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
	     }
	     if(map.size() == k) {
	    	 maxSum = windowSum;
	     }
	     
	     //loop
	     for(int i = k; i < arr.length; i++) {
	    	 windowSum += arr[i];
	    	 map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
	    	 
	    	 int left = i-k;
	    	 windowSum -= arr[left];
	    	 
	    	 map.put(arr[left], map.get(arr[left]) - 1);

	    	 if(map.get(arr[left]) == 0) {
	    		 map.remove(arr[left]);
	    	 }
	    	 if(map.size() == k) {
	    		 maxSum = Math.max(maxSum, windowSum);
	    		 
	    	 }
	     }
	     System.out.println(maxSum);
	     
	     
	}
}
