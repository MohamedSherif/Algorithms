package impl;

import java.util.ArrayList;

public class InterviewBit {

	public static ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < A.size(); i++) {
			B.add(new ArrayList<Integer>());

			for (int j = 0; j < A.get(i).size(); j++) {
				B.get(i).add(0);
			}

			for (int j = 0; j < A.get(i).size(); j++) {
				B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
			}
		}
		return B;
	}
	
	public static ArrayList<Integer> performOps2(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<Integer>();
        for (int i = 0; i < 2 * A.size(); i++) B.add(0);
        for (int i = 0; i < A.size(); i++) {
                B.set(i, A.get(i));
                B.set(i + A.size(), A.get((A.size() - i) % A.size()));
        }
        return B;
}


	
	public static int[] addOneToNum(int[] digits){
		for (int i = digits.length-1; i >= 0; i--) {
			digits[i]++;
			
			if(digits[i] < 10){
				return digits;
			}
			
			digits[i] = 0;
		}
		
		int[] res = new int[digits.length+1];
		
		System.arraycopy(digits, 0, res, 1, digits.length);
		
		res[0] = 1;
		
		return res;
	}
	
	public static ArrayList<Integer> addOne(ArrayList<Integer> digits){
		
		ArrayList<Integer> tempRes = new ArrayList<Integer>();
		
		for (int i = digits.size()-1; i >= 0; i--) {
			digits.set(i, digits.get(i)+1);
			
			if(digits.get(i) < 10){
				
				for (int j = 0; j < digits.size(); j++) {
					if(digits.get(j) > 0 || !tempRes.isEmpty()){
						tempRes.add(digits.get(j));
					}
				}
				
				return tempRes;
			}
			
			digits.set(i, 0);
		}
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		res.add(1);
		for (int i = 0; i < digits.size(); i++) {
			res.add(digits.get(i));
		}
		
		
//		System.arraycopy(digits, 0, res, 1, digits.size());
		
		return res;
	}
	
	public static void main(String[] args) {
//		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
//		
//		A.add(new ArrayList<Integer>());
//		A.add(new ArrayList<Integer>());
//		A.add(new ArrayList<Integer>());
//		
//		A.get(0).add(1);
//		A.get(0).add(2);
//		A.get(0).add(3);
//		A.get(0).add(4);
//		
//		A.get(1).add(5);
//		A.get(1).add(6);
//		A.get(1).add(7);
//		A.get(1).add(8);
//		
//		A.get(2).add(9);
//		A.get(2).add(10);
//		A.get(2).add(11);
//		A.get(2).add(12);
//		
//		ArrayList<ArrayList<Integer>> B = performOps(A);
//		for (int i = 0; i < B.size(); i++) {
//		    for (int j = 0; j < B.get(i).size(); j++) {
//		            System.out.print(B.get(i).get(j) + " ");
//		    }
//		}
//		
//		
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		
//		A : [5, 10, 2, 1]
				
//		A.add(5);
//		A.add(10);
//		A.add(2);
//		A.add(1);

//		ArrayList<Integer> B = performOps2(A);
//		for (int i = 0; i < B.size(); i++) {
//		        System.out.print(B.get(i) + " ");
//		}
		
		int[] a = {9,9,9};
		int[] b = addOneToNum(a);
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		A.add(8);
		A.add(8);
		A.add(9);
		
		ArrayList<Integer> res = addOne(A);
		
		for (int i = 0; i < res.size(); i++) {
			System.out.print(res.get(i) + " ");
		}
	}
	
}
