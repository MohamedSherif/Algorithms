package impl;

import java.util.Scanner;

public class CavityMap_Solution {
	/**
	 * Test Edit
	 * @param map
	 */
	private static void solve(int [][] map){
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				
				if(i != 0 && i != map.length-1 && j != 0 && j != map[i].length-1){
					
					if(map[i][j] > map[i-1][j] && map[i][j] > map[i+1][j] 
							&& map[i][j] > map[i][j-1] && map[i][j] > map[i][j+1]){
								System.out.print("X");
					}else{
						System.out.print(map[i][j]);
					}
				}else{
					System.out.print(map[i][j]);
				}
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] map = new int[n][n];
        
        if(n >= 1 && n <= 100){
	        for(int i = 0; i < n; i++){
//	        	int m = in.nextInt();
	        	
	        	String s = in.next();
	        	for (int j = 0; j < s.length(); j++) {
	        		int k = (int)Integer.parseInt(""+ s.charAt(j));
	        		map[i][j] = k;
	        	}
	        }
        }
        solve(map);
	}
}
