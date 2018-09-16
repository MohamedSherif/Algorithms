package impl;

import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Solution {

	
	/*
	 * Draw StairCase
	 */
	private static void drawStep(int spaceN, int stepN){
		
		for (int i = 1; i <= spaceN; i++) {
			System.out.print(" ");
		}
		for (int j = 0; j < stepN; j++) {
			System.out.print("#");
		}
		System.out.println("");
		
	}
	
	public static void drawStairCase(int n){
		if(n >= 1 && n <= 100){
			
			for (int i = 1; i <= n; i++) {
				drawStep(n-i, i);
			}
			
		}
	}
	
	
	/*
	 * Time Conversion
	 * 
	 * 05:12:12PM
	 */
	
	private static void converTime(String time){
		int col1Index = time.indexOf(":", 0);
		int col2Index = time.indexOf(":", col1Index+1);
		
		String hhStr = time.substring(0, col1Index);
		String mmStr = time.substring(col1Index + 1, col2Index);
		String ssStr = time.substring(col2Index + 1, col2Index + 3);
		String am = time.substring(time.length() - 2 , time.length());
		
		
		System.out.println(hhStr);
		System.out.println(mmStr);
		System.out.println(ssStr);
		System.out.println(am);
		
		if(hhStr.length() == 2 && mmStr.length() == 2 && ssStr.length() == 2
				&& am.length() == 2 ){
			
			int hh = 0;
			
			if(hhStr.matches("[0-9]+") && hhStr.length() == 2){
				hh = Integer.parseInt(hhStr);
			}
			
			if(am.matches("[a-zA-Z]+") && am.length() == 2){
				
				if(am.equalsIgnoreCase("pm")){
					
					if(hh != 12 && hh != 0)
						hh += 12;
				}else if (am.equalsIgnoreCase("am")){
					if(hh==12)
						hh=0;
				}
				
				hhStr = "" + hh;
				if(hhStr.length() == 1)
					hhStr = "0" + hhStr;
			}
			System.out.println(hhStr + ":" + mmStr + ":" + ssStr);
		}
	}
	
	
	private static int sherlockSquare(int a, int b){
		int count = 0;
		if(b >=a && b >=1 && b <= Math.pow(10, 9)){
			
			for (int i = a; i <= b; i++) {
				int sqrt = (int) Math.sqrt(i);
				
				if(sqrt*sqrt == i){ // Then i is a perfect Square.
					count++;
				}
				
			}
		}
		return count;
	}
	
	
	private static int charCount(String word, char c){
		int count = 0;

		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == c)
				count ++;
		}
		
		return count;
	}
	
	
    public static void main(String[] args) {
        /* Enter your code here. 
         * Read input from STDIN. Print output to STDOUT. 
         * Your class should be named Solution. */
    	
    	Scanner s = new Scanner(System.in);
    	
    	int n = s.nextInt();
    	
    	/**
    	if(n >=1 && n <=100){
    		for (int i = 0; i < n; i++) {
    			int a = s.nextInt();
        		int b = s.nextInt();
        		
        		int C = (int)(Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1);

        		System.out.println(C);
    		}
    	}
    	**/
    	
    	/**
    	if(n >=1 && n <=100){
    		for (int i = 0; i < n; i++) {
    			String str = s.next();
    			String rts = "";
    			
    			for (int j = str.length()-1; j >= 0 ; j--) {
					rts += str.charAt(j);
				}
    			boolean isFunny = true;
    			
    			for (int j = 1; j < str.length(); j++) {
					if(Math.abs(str.charAt(j) - str.charAt(j-1)) != Math.abs(rts.charAt(j) - rts.charAt(j-1))){
						isFunny = false;
					}
				}
    			
    			if (isFunny) {
					System.out.println("Funny");
				}else{
					System.out.println("Not Funny");
				}
    			
    		}
    	}
    	*/
    	
    	/**
    	if(n >=1 && n <=100){
    		for (int i = 0; i < n; i++) {
    			String str = s.next();
    			
    			StringBuilder sb = new StringBuilder(str);
    			
    			int count = 0;
    			
    			for (int j = 0; j < sb.length()-1; j++) {
    				int k = j+1;
					while((k < sb.length())&&(sb.charAt(j) == sb.charAt(k))){
						sb.deleteCharAt(k);
						count++;
					}
				}
    			System.out.println(count);
    		}
    	}
    	*/
    	
    	/**
    	int count = 0;
    	char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    	String [] rocks = new String [n];
    	
    	if(n >=1 && n <=100){
    		for (int i = 0; i < n; i++) {
    			String st = s.next();
				rocks[i] = st;
    		}
    		
    		for (int i = 0; i < chars.length; i++) {
				boolean isGem = true;
				for (int j = 0; j < rocks.length; j++) {
					if(!rocks[j].contains("" + chars[i])){
						isGem = false;
					}
				}
				if(isGem){
					count++;
				}
			}
    		System.out.println(count);
    	}
		*/
    	
    	
    	/**
    	int delCount = 0;
    	char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    	
    	String a = s.next();
    	StringBuilder sb = new StringBuilder(a);
    	
    	String b = s.next();
    	StringBuilder bb = new StringBuilder(b);
    	
    	for (int i = 0; i < chars.length; i++) {
    		int acCount = charCount(a, chars[i]);
    		int bcCount = charCount(b, chars[i]);
    		
    		if(acCount != bcCount){
        		if(bcCount != 0){
    				delCount += Math.abs((acCount - bcCount));
        		}else{
        			delCount += acCount;
        		}
    		}
		}
    	
    	System.out.println(delCount);
    	*/
    	
    	for (int k = 0; k < n; k++) {
        	int delCount = 0;
        	char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        	
        	String a = s.next();
        	StringBuilder sb = new StringBuilder(a);
        	
        	String b = s.next();
        	StringBuilder bb = new StringBuilder(b);
        	
        	for (int i = 0; i < chars.length; i++) {
        		int acCount = charCount(a, chars[i]);
        		int bcCount = charCount(b, chars[i]);
        		
        		if(acCount != bcCount){
            		if(bcCount != 0){
        				delCount += Math.abs((acCount - bcCount));
            		}else{
            			delCount += acCount;
            		}
        		}
    		}
        	System.out.println(delCount);
		}

    	
    	
//    	String str = s.next();
//    	drawStairCase(n);
//    	converTime(str);
    }
}