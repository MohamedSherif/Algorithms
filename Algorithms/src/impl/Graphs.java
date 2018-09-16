package impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Graphs {
	
	private static int getChildCount(Map<Integer, List<Integer>> map, int parent){
		int count = 0;
		
		if(map.get(parent) != null){
			count += map.get(parent).size();
			
			for (int i = 0; i < map.get(parent).size(); i++) {
				count += getChildCount(map, map.get(parent).get(i));
			}
		}
		return count;
	}
	
	
	/* you only have to complete the function given below.  
	Node is defined as  

	class Node {
	    int data;
	    Node left;
	    Node right;
	}

	

	void Preorder(Node root) {
		
		System.out.print(root.data + " ");
		
		if(root.left != null)
			Preorder(root.left);
		
		if(root.right != null)
			Preorder(root.right);
		
	}
 */
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        List<Integer> parents = new ArrayList<Integer>();
        
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        
        for (int i = 0; i < m; i++) {
        	int ui = in.nextInt();
        	int vi = in.nextInt();
        	
        	if(map.get(vi) == null){
        		map.put(vi, new ArrayList<Integer>());
        		map.get(vi).add(ui);
        		
        		parents.add(vi);
        	}else{
        		map.get(vi).add(ui);
        	}
        }
        
        int result = 0;
        
        for (int i = 1; i < parents.size(); i++) {
        	int childs = getChildCount(map, parents.get(i));
        	if(childs % 2 != 0)
        		result ++;
//			System.out.println(parents.get(i) + " -> " + childs);
		}
        System.out.println(result);
	}
}
