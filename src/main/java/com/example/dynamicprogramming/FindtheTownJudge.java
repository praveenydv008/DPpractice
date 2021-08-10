package com.example.dynamicprogramming;

/**
 * @author PRAVEEN
 *
 */
public class FindtheTownJudge {
	/*
	 * 1. Create an array of Size N + 1 to represent each person.
   arr[i] represents trust score of i th person
   and arr[i] = number of persons trusts him - number of 
   persons he trusts.
2. Now, traverse through given array. 
    a, b = a trusts b.
    if a person trusts others,
	then decrease his score by 1. i.e, arr[a]--
    if a person is trusted by others, 
    then increase his score by 1. i.e, arr[b]++
3. At last traverse through each person,
    if anyone found with N - 1 trusts,
	then return his index.
	 */
	 public static int findJudge(int N, int[][] trust) {
		 int[] isTrusted = new int[N+1];
	        for(int[] person : trust){
	            isTrusted[person[0]]--;
	            isTrusted[person[1]]++;
	        }
	        for(int i = 1;i < isTrusted.length;i++){
	            if(isTrusted[i] == N-1) return i;
	        }
	        return -1;
	 }
}
