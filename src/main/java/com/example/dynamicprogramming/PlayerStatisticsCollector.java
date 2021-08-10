package com.example.dynamicprogramming;

public interface PlayerStatisticsCollector {

    public void putNewInnings(String player, int runs);

    public double getAverageRuns(String player);

    public int getInningsCount(String player);

}
