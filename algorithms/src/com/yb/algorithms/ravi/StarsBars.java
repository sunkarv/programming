package com.yb.algorithms.ravi;

import java.util.ArrayList;
import java.util.List;

public class StarsBars {

	public StarsBars() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * s = '|**|*|*'

		startIndex = [1, 1]
		
		endIndex = [5, 6]
		
		 
		
		For the first pair of indices, (1, 5), the substring is '|**|*'. There are 2 stars between a pair of bars.
		
		For the second pair of indices, (1, 6), the substring is '|**|*|' and there are 2 + 1 = 3 stars between bars.
		
		Both of the answers are returned in an array,  [2, 3].*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "***|*|**|";
		int firstInd = 3;
		int lastInd = 6;
		
		System.out.println(findStars3(str,  firstInd,  lastInd));
	}
	
	public static int findStars(String str, int firstInd, int lastInd)
	{
		int count = 0;
		
		if(firstInd >= lastInd)
			return count;
		
		int firstindbar = firstInd;
		int lastindbar = firstInd;
		boolean isFirst = true;
		int barC =0;
		for(int i = firstInd; i<=lastInd; i++)
		{
			if(str.charAt(i-1)==124)
			{
				if(isFirst)
				{
					firstindbar = i;
					isFirst = false;
				}
				else
					lastindbar = i;
				barC++;
			}
		}
		
		if(barC<=1)
			return count;
		
		if(firstInd >= lastindbar)
			return count;
		
		return lastindbar - firstindbar - barC + 1 ;
	}

	 public static int findStars2(String str, int firstInd, int lastInd)
	    {
	        int count = 0;
	        
	        if(firstInd >= lastInd)
	            return count;
	        
	        String newSTr = str.substring(firstInd-1, lastInd);
	        
	        
	        int firstindbar = newSTr.indexOf('|');
	        int lastindbar = newSTr.lastIndexOf('|');
	        
	        if(firstindbar <0 || lastindbar <0 )
	            return 0;
	     
	        String nextString = newSTr.substring(firstindbar, lastindbar+1);
	        
	        int lens = nextString.length();
	        
	        nextString = nextString.replaceAll("\\*","");
	        int neelen = nextString.length();
	        
	        return lens-neelen;
	        
	         
	    } 
	 
	 public static int findStars3(String str, int firstInd, int lastInd)
	    {
	        int count = 0;
	        
	        if(firstInd >= lastInd)
	            return count;
	        
	        String newSTr = str.substring(firstInd-1, lastInd);
	        
	        
	        int firstindbar = newSTr.indexOf('|');
	        int lastindbar = newSTr.lastIndexOf('|');
	        
	        if(firstindbar <0 || lastindbar <0 )
	            return 0;
	     
	        for(int i = firstindbar + 1; i<=lastindbar; i++)
			{
				if(newSTr.charAt(i-1)==42)
				{
					count++;
				}
			}
	    return count;    
    } 
	 
	 public static List<Integer> starsAndBars(String s, List<Integer> startIndex, List<Integer> endIndex) {
		    // Write your code here
		        int len = startIndex.size();
		        
		        if( endIndex.size() < len)
		        {
		            len = endIndex.size();
		        }
		       
		        List<Integer> finalList = new ArrayList<Integer>();
		        
		        for(int i =0; i< len; i++)
		        {
		            finalList.add(findStars(s, startIndex.get(i), endIndex.get(i)));
		        }
		        
		        return finalList;
		    }
}
