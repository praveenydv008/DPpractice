package com.example.dynamicprogramming;

import java.util.HashMap;

public class ContArrEqualZeroOne {
	 public static int findMaxLenght(int[] Arr){
		int longestArr = 0;
		HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
		int sumArr = 0;
		for(int i=0;i<Arr.length;i++){
			sumArr+=Arr[i]==0?-1:1;
			if(sumArr==0){
				if(longestArr<i+1)
					longestArr = i+1;
			}
			else if (sumMap.containsKey(sumArr)){
				if(longestArr<i-sumMap.get(sumArr))
				longestArr = i-sumMap.get(sumArr);
			}
			else{
				sumMap.put(sumArr, i);
			}
			
		}
		
		return longestArr;
	}

}
