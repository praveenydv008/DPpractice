package com.example.dynamicprogramming;

public class ClimbingStairsWays {
	    public static int climbStairs(int n) {
	    	int[] ways = new int[n+1];
	    	if(n==0 || n==1)
	    		return 1;
	        for (int i = 2; i < n; i++) {
	          ways[i] = ways[i-2] + ways[i-1];
	        }
	        return ways[n];
	    }
	        
	    }
