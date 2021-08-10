package com.example.dynamicprogramming;

public class RangeSumQuery {
	int[] numArr = null;
	public RangeSumQuery(int[] nums) {
		this.numArr=nums; 
    }
    
    public int sumRange(int i, int j) {
    	int sum=0;
    	if(i==j)
    		return numArr[i];
    	for(int l=i;l<=j;l++){
        	sum+=numArr[l];
        }
    	return sum;
    }

}
