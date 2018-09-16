package impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Search {

	private static void isSymmetyExists(int[] a, int totalSum){
		int leftSum = 0;
		int rightSum = totalSum;
					
		for (int i = 1; i < a.length-1; i++) {
			leftSum += a[i-1];
			rightSum -= a[i-1];
			
//			for (int j = i+1; j < a.length; j++) {
//				rightSum += a[j];
//			}
			
			if(leftSum == (rightSum - a[i])){
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
	
	
	
	private static void iceCreamParlor(int[] flavs, int amount){
		
		for (int i = 0; i < flavs.length; i++) {
			for (int j = i+1; j < flavs.length; j++) {
				if((flavs[i] + flavs[j]) == amount){
					System.out.println((i+1) + " " + (j+1));
					return;
				}
			}
		}
		
		
	}
	
	private static HashMap<Integer, int[]> getSubArrays(int[] array, int m){
		HashMap<Integer, int[]> subArrays = new HashMap<Integer, int[]>();
		int maxSum = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				int[] sub = new int[(j-i+1)];
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += array[k];
					sub[k-i] = array[k];
				}
				
				if(sum%m > maxSum){
					maxSum = sum%m;
				}

				subArrays.put(sum, sub);
			}
		}
		
		System.out.println(maxSum);
		for (int i = 0; i < subArrays.size(); i++) {
			int[] sub = subArrays.get(i);
			System.out.print("[");
			for (int j = 0; j < sub.length; j++) {
				if(j==sub.length-1)
					System.out.print(sub[j]);
				else
					System.out.print(sub[j] + ",");
				
			}
			System.out.println("]");
		}
		
		return subArrays;
	}
	
	
	
	private static void getMax(int[] array, int m){
		int currSum = 0;
		int[] prefix = new int[array.length];
		prefix[0] = array[0]% m;
		
		for(int i = 1; i < array.length; i ++) {
			prefix[i] = (prefix[i-1] + array[i]) % m;
		}
		
		
		int ret = 0;
		for(int i = 0; i < array.length; i ++) {
		  for(int j = i-1; j >= 0; j --) {
		    ret = Math.max(ret, (prefix[i] - prefix[j] + m) % m);
		  }
		  ret = Math.max(ret, prefix[i]); // Don't forget sum from beginning. 
		}
		System.out.println(ret);
		
	}
	
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
    	int t = s.nextInt();
    	
//    	if(t >=1 && t <=100){
//    		for (int i = 0; i < t; i++) {
//    			int n = s.nextInt();
//    			if(n >=1 && n <=100000){
//    				int[] arr = new int[n];
//    				int totalSum = 0;
//    				for (int j = 0; j < n; j++) {
//						arr[j] = s.nextInt();
//						totalSum += arr[j];
//					}
//    				if(n==1){
//    					System.out.println("YES");
//    				}else{
//    					isSymmetyExists(arr, totalSum);
//    				}
//    				
//    			}
//    		}
//    	}
    	
//    	if(t >=1 && t <=100){
//	    	for (int i = 0; i < t; i++) {
//	    		int m = s.nextInt();
//	    		int n = s.nextInt();
//	    		if(n >=2 && n <=100000){
//	    			int[] flavs = new int[n];
//	    			for (int j = 0; j < n; j++) {
//						flavs[j] = s.nextInt();
//	    			}
//	    			iceCreamParlor(flavs, m);
//	    		}
//	    		
//			}
//    	}
    	
    	if(t >=1 && t <=100){
    		for (int i = 0; i < t; i++) {
	    		int n = s.nextInt();
	    		int m = s.nextInt();
	    		int[] arr = new int[n];
	    		for (int j = 0; j < n; j++) {
	    			arr[j] = s.nextInt();
	    		}
	    		
//	    		getMax(arr, m);
	    		
//	    		HashMap<Integer, int[]> subArrays = 
	    		
	    		getSubArrays(arr, m);
	    		
//	    		int max = Collections.max(subArrays.keySet());
	    		
//	    		Object[] k = subArrays.keySet().toArray();
	    		
//	    		for (int j = 0; j < k.length; j++) {
//					int kj = (int) k[j];
//					System.out.println(kj%m);
//				}
	    		
	    		
	    		
//	    		System.out.println(getSubArrays(arr).toArray().toString());
			}
    	}
	}
}
