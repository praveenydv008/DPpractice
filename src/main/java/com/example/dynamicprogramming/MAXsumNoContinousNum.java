package com.example.dynamicprogramming;

public class MAXsumNoContinousNum {
	public static int maxSumNoContinousNum(int[] A, int l){
		int n = A.length;
		int[] m= new int[n+1];
		m[0]=A[0];
		m[1]=(A[0]>A[1]?A[0]:A[1]);
		for(int i=l;i<A.length;++i){
			//logic is not for ith element condition.
			//m[i]=(m[i+1]>m[i+2]+A[i]?m[i+1]:m[i+2]+A[i]);
			m[i]=(m[i-1]>m[i-2]+A[i]?m[i-1]:m[i-2]+A[i]);
		}
		return m[n-1];
		
		
	}
}
