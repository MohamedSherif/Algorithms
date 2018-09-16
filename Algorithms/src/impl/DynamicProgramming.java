package impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class DynamicProgramming {

	private static BigDecimal Fibonacci(int t1, int t2, int n){
		BigDecimal bt1 = new BigDecimal(t1);
		BigDecimal bt2 = new BigDecimal(t2);
		if(n == 1)
			return bt1;
		
		if(n == 2)
			return bt2;
		
		return (Fibonacci(t1, t2, n-1).multiply(Fibonacci(t1, t2, n-1)).add(Fibonacci(t1, t2, n-2))); 
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int n = in.nextInt();

        System.out.println(Fibonacci(t1, t2, n));
        
	}
	
	
	
	private static void Solve(int[] arr, int target){
		int result = 0;
		
		for (int i = 0; i < arr.length - 1; i++) {
			if(result + arr[i] <= target){
				if(target - (result + arr[i]) > target - (result + arr[i+1])){
					while(result < target){
						result += arr[i];
					}
				}else{
					result += arr[i+1];
				}
			}
		}
		
		System.out.println(result);
	}
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//       
//        for (int i = 0; i < t; i++) {
//			int n = in.nextInt();
//			int target = in.nextInt();
//			
//			int[] arr = new int[n];
//			
//			for (int j = 0; j < arr.length; j++) {
//				arr[j] = in.nextInt();
//			}
//			
//			Solve(arr, target);
//		}
//	}

}
