package impl;

import java.util.Scanner;

public class ChocolateFeast {
	
	/*
	 * Chocolate Feast
	 */
	
	private static long calculateFreeChoc(int num, int M){
		long result = 0;
		
		if(num < M){
			return result;
		}
		
		if(num % M == 0){
			result += (num/M) + calculateFreeChoc((num/M), M);
		}else{
			result += (num/M) + calculateFreeChoc(((num%M) + (num/M)), M);
		}
		
		return result;
	}
	
	private static long Solve(int N, int C, int M){
		
		long result = 0;
		
		if(N >= 2 && N <= Math.pow(10, 5)){
			if(C >=1 && C <= N && M >=2 && M <= N){
				
				int chocNum = N/C;
				
				int freeChocNum = (int) calculateFreeChoc(chocNum, M);
				
				result = chocNum + freeChocNum;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if(t >= 1 && t <= 1000){
	        for(int i = 0; i < t; i++){
	            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
	        }
        }
    }
}
