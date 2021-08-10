package com.example.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class PlayerStatisticsCollectorImpl implements PlayerStatisticsCollector {
	Map<String, Map> playerMap = new HashMap<String, Map>();
//Virat_Kohli 22,Steve_Smith 33,Virat_Kohli 45,Steve_Smith 55,Virat_Kohli 66
	public void putNewInnings(String player, int runs) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> playerInfo = new HashMap<Integer, Integer>();
		if(this.playerMap.containsKey(player)){
			playerInfo.put(Integer.parseInt(playerMap.get(player).keySet().toArray()[0].toString())+runs, 
					Integer.parseInt(playerMap.get(player).values().toArray()[0].toString())+1);
			playerMap.put(player, playerInfo);
		}
		else {
			playerInfo.put(runs, 1);
			playerMap.put(player, playerInfo);
		}
	}

	public double getAverageRuns(String player) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> playerinfo = playerMap.get(player);
		int avgRun = Integer.parseInt(playerinfo.keySet().toArray()[0].toString())/Integer.parseInt(playerinfo.values().toArray()[0].toString());
		return avgRun;
	}

	public int getInningsCount(String player) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> playerinfo = playerMap.get(player);
		return Integer.parseInt(playerinfo.values().toArray()[0].toString());
	}
	
	public static void main(String args[]){
		PlayerStatisticsCollectorImpl obj = new PlayerStatisticsCollectorImpl();
		//Virat_Kohli 22,Steve_Smith 33,Virat_Kohli 45,Steve_Smith 55,Virat_Kohli 66
		obj.putNewInnings("Virat_Kohli", 22);
		obj.putNewInnings("Steve_Smith", 33);
		obj.putNewInnings("Virat_Kohli", 45);
		obj.putNewInnings("Steve_Smith", 15);
		obj.putNewInnings("Virat_Kohli", 66);
		System.out.println("Virat_Kohli average runs:- "+ obj.getAverageRuns("Virat_Kohli"));
		System.out.println("Steve_Smith average runs:- "+ obj.getAverageRuns("Steve_Smith"));
		System.out.println("Virat_Kohli inings count:- "+ obj.getInningsCount("Virat_Kohli"));
		System.out.println("Steve_Smith inings count:- "+ obj.getInningsCount("Steve_Smith"));
	}

}
