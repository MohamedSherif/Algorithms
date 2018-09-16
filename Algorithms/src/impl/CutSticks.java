package impl;

import java.util.Scanner;

public class CutSticks {

	
	private static boolean isZeroes(int[] sticks){
		for (int i = 0; i < sticks.length; i++) {
			if(sticks[i] > 0 )
				return false;
		}
		return true;
	}
	
	private static int getSmalletNonZero(int[] sticks){
		int s = sticks[0];
		
		for (int i = 0; i < sticks.length; i++) {
			if(sticks[i] < s && sticks[i] != 0){
				s = sticks[i];
			}else{
				if(s == 0)
					s = sticks[i];
			}
		}
		return s;
	}
	
	private static void solve(int[] sticks){
		
		while(!isZeroes(sticks)){
			int smallest = getSmalletNonZero(sticks);
			int cutNo = 0;
			
			for (int i = 0; i < sticks.length; i++) {
				if(sticks[i] > 0){
					sticks[i] = sticks[i] - smallest;
					cutNo++;
				}
			}
			System.out.println(cutNo);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	
    	int[] sticks = new int[n];
    	
    	if(n >=1 && n <=1000){
    		for (int i = 0; i < n; i++) {
    			int in = s.nextInt();
    			
    			if(in >= 1 && in <= 1000){
    				sticks[i] = in;
    			}else{
    				return;
    			}
    			
    		}
    		solve(sticks);
    	}
	}

}
