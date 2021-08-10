package com.example.dynamicprogramming;

public class MinCoinChange {
	public static int coinChange(int[] coins, int amount){
		int[] ways = new int[amount + 1];  
		  
        // Set the first way to 1 because its 0 and 
        // there is 1 way to make 0 with 0 coins 
        ways[0] = 1;  
  
         // Go through all of the coins 
        for (int i = 0; i < coins.length; i++) { 
  
            // Make a comparison to each index value  
            // of ways with the coin value. 
            for (int j = 0; j < ways.length; j++) {  
                if (coins[i] <= j) { 
       
                    // Update the ways array 
                    ways[j] += ways[j - coins[i]];  
                } 
            } 
        } 
  
        // return the value at the Nth position 
        // of the ways array.     
        return ways[amount];  
	}
}
