package com.example.dynamicprogramming;

public class MAXsumNoThreeContinousNum {
	public static int maxSumNoThreeContinousNum(int[] A, int l){
		int n = A.length;
		int[] m= new int[n+1];
		m[0]=A[0];
		m[1]=(A[0]>A[1]?A[0]:A[1]);
		m[2]=(A[2]<m[1]?A[2]:m[1]);
		int finalmax=0;
		for(int i=3;i<A.length;i++){
		m[i]=Math.max((A[i]+A[i-1]+m[i-3]), (A[i]+m[i-2]));
		int secondmax=Math.max(m[i], m[i-1]);
		if(secondmax>finalmax)
			finalmax=secondmax;
		}
		
		return finalmax;
	}
}
