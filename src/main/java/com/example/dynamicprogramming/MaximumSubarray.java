package com.example.dynamicprogramming;

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		//[-2,1,-3,4,-1,2,1,-5,4]
		int maxSum =nums[0];
		int sum=0;
		if(nums.length==0)
			return 0;
		if(nums.length==1)
			return nums[0];
		for(int i=0;i<nums.length;i++){
			sum=Math.max(sum+nums[i], nums[i]);
				maxSum=Math.max(maxSum, sum);
		}
		return maxSum;
        
    }

}
