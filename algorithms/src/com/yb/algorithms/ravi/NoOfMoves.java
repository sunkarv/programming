package com.yb.algorithms.ravi;

import java.util.List;

public class NoOfMoves {

	public NoOfMoves() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {2468};
		int arr2[] = {8642};
		
		System.out.println(countMoves(arr1, arr2));
	}

	private static int countMoves(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int count = 0;
		
		int len = arr1.length;
		
		for(int i =0; i<len; i++)
		{
			int firstNum = arr1[i];
			int secNum = arr2[i];
			
			while(firstNum>0)
			{
				count = count + Math.abs((firstNum % 10 ) - (secNum % 10));
				firstNum = firstNum/10;
				secNum = secNum/10;
			}
		}
		
		return count;
	}
	
	public static int minimumMoves(List<Integer> arr1, List<Integer> arr2) {
	    // Write your code here
	        
	        int count = 0;
	        
	        int len = arr1.size();
	        
	        for(int i =0; i<len; i++)
	        {
	            int firstNum = arr1.get(i);
	            int secNum = arr2.get(i);
	            
	            while(firstNum>0)
	            {
	                count = count + Math.abs((firstNum % 10 ) - (secNum % 10));
	                firstNum = firstNum/10;
	                secNum = secNum/10;
	            }
	        }
	        
	        return count;
	    }


}
