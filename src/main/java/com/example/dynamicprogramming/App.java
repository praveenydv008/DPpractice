package com.example.dynamicprogramming;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //int[] A={1,-3,4,-2,-1,6};
        //int[] A={1,2,3,4,5,6};
        //int[] A={8,0,4,2,1,8};
        //int sum = ContagSumDP.contSum(A);
        //int sum=MAXsumNoContinousNum.maxSumNoContinousNum(A,3);
        //int sum=MAXsumNoThreeContinousNum.maxSumNoThreeContinousNum(A, 2);
        //int catalanNumber = CatalanNumberDP.catalanNumP(3);
        //System.out.println(sum);
        //System.out.println(catalanNumber);
        /*int val[] = new int[] { 60, 100, 120 }; 
		int wt[] = new int[] { 10, 20, 30 }; 
		int W = 50; 
		int n = val.length; 
		System.out.println(KnapSackDP.knapSack(W, wt, val, n));*/
        //int[] prices = {2,4,1};
        int[] prices = {1,11,15,3,22,4};
        //int[] house = {1,3,1};
        //int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        //int[]  coins= {1,2,5};
        //int [][] matrix={{0,1,1,1},{1,1,1,1},{0,1,1,1}};
        //int amount=11;
        //String s="acb";String t="ahbgdc";
        //String s = "abc"; String t = "ahbgdc";
        //int num=3;
        //int[] Arr={1,1,0,0,1,1,0,1,1};
        //int[] Arr={1,0,1,0,1,1};
        int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        //int[][] trust = {{1,2},{2,3}};
        //System.out.println(Solution.maxProfit(prices));
        //System.out.println(BuyAndSellStock.maxProfit(prices));
        //System.out.println(MostClimbingStairsCost.minCostClimbingStairs(cost));
        //System.out.println(IsSubsequence.isSubsequence(s,t));
        //System.out.println(HouseRobber.rob(house));
        //System.out.println(MinCoinChange.coinChange(coins,amount));
        //System.out.println(CountSquareSubmatrices.countSquares(matrix));
        //System.out.println(Arrays.toString(CountingBits.optimizedCountBits(num)));
        //System.out.println(ContArrEqualZeroOne.findMaxLenght(Arr));
        //System.out.println(FindtheTownJudge.findJudge(4, trust));
        System.out.println(Solution.maxValue(prices));
    }
}
