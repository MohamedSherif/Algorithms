package impl;

import java.util.Scanner;

public class InsertionSort {
	
	public static void insertIntoSorted(int[] ar) {
        // Fill up this function
		
		int v = ar[ar.length - 1];
		for (int i = ar.length - 2; i >= 0; i--) {
			 if(v < ar[i]){
				 ar[i+1] = ar[i];
				 printArray(ar);
			 }
		}
		for (int i = 0; i < ar.length; i++) {
			if(v < ar[i]){
				ar[i] = v;
				break;
			}
		}
		printArray(ar);
    }
	
	
	public static void insertionSortPart2(int[] ar)
    {       
           // Fill up the code for the required logic here
           // Manipulate the array as required
           // The code for Input/Output is already provided
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = i; j > 0; j--) {
				if(ar[j] < ar[j-1]){
					int temp = ar[j-1];
					ar[j-1] = ar[j];
					ar[j] = temp;
					
				}
			}
			if(i > 0)
				printArray(ar);
		}
    } 
	
	
	
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
//         insertIntoSorted(ar);
         insertionSortPart2(ar);
    }
	
	/*
	 * Search
	 */
//	public static void main(String[] args) {
//	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//		 
//		Scanner in = new Scanner(System.in);
//		
//		int v  = in.nextInt();
//		if(v >= -1000 && v <= 1000){
//			int n = in.nextInt();
//			if(n >= 1 && n <= 1000){
//				int[] ar = new int[n];
//				for (int i = 0; i < n; i++) {
//					ar[i] = in.nextInt();
//				}
//				
//				for (int i = 0; i < ar.length; i++) {
//					if(v == ar[i])
//						System.out.println(i);
//				}
//			}
//		}
//	}	
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
