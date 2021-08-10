package com.example.dynamicprogramming;

public class CountingBits {
	public static int[] countBits(int num){
		int[] bitArr = new int[num+1];
		if(bitArr.length>=1)
		bitArr[0]=0;
		if(bitArr.length>=2)
		bitArr[1]=1;
		if(bitArr.length>=3)
		bitArr[2]=1;
		if(bitArr.length>=4){
		for(int i=3;i<=num;i++){
			int count = 0;
			int j=i;
			while(j!=0){
				int d = j%2;
				j/=2;
				if(d==1)
					count+=1;
			}
			bitArr[i]=count;
		}
	}
		
		return bitArr;
	}
	
	public static int[] optimizedCountBits(int n){
		int[] count = new int[n+1];
		for(int i=1;i<n+1;i++){
			count[i]=count[i & (i-1)]+1;
		}
		return count;
	}

}
