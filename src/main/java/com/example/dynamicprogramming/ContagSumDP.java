package com.example.dynamicprogramming;

public class ContagSumDP {
	public static int contSum(int[] A){
		int sum=0; int maxSum=0;
		for(int i=0;i<A.length;i++){
			sum=Math.max(sum+A[i], A[i]);
			maxSum=Math.max(sum, maxSum);
			System.out.println(maxSum);
				
			}
		
		
		return maxSum;
		
	}

}
