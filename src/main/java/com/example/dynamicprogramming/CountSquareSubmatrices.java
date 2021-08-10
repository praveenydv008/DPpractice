package com.example.dynamicprogramming;

public class CountSquareSubmatrices {
	public static int countSquares(int[][] matrix) {
        int total=0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        
        for(int i=0;i<m;i++){
        	dp[i][0]=matrix[i][0];
        	total+=dp[i][0];
        }
        
        for(int i=1;i<n;i++){
        	dp[0][i]=matrix[0][i];
        	total+=dp[0][i];
        }
        
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==1){
                    dp[i][j]=1+Math.min(Math.min(dp[i-1][j],dp[i][j-1]), dp[i-1][j-1]);
                        total+=dp[i][j];
                }
                }
            }
        
        return total;
    }

}
