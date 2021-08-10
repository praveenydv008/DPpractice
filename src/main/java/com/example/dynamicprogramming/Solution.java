package com.example.dynamicprogramming;

class Solution {
    public static int maxProfit(int[] prices) {
    	int finalProfit=0;
        int[] profit = new int[prices.length];
        if(prices.length==0 || prices.length==1)
            return 0;
        for(int i=0 ;i<prices.length;++i){
        	for(int j=i;j<prices.length;j++){
            if(prices[i]>=prices[j])
                continue;
            else
                profit[i] = Math.max(profit[i],(prices[j]-prices[i]));
        }
        	if(profit[i] > finalProfit){
        		finalProfit = profit[i];
        	}
        }
        
        return finalProfit;
            
        }
    
    protected static int maxValue(int[] arr) {
    	int maxValue=0;

		if(arr!=null) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>maxValue)
					maxValue=arr[i];
    		}
		}
    	
    	return maxValue;
    }
        
    }