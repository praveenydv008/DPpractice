package com.example.dynamicprogramming;

public class FlowerPlantingWithNoAdjacent {
	public int[] gardenNoAdj(int N, int[][] paths) {
        /**
        Instancitate N garden
        connect the path
        setUniqFlowerType for each node
        return int[] array of each garden's flower type
        */
        
        Garden[] graph = new Garden[N];// array of gardens
        for(int i=0; i<N; i++){
            graph[i] = new Garden();
        }
        
        //connect path
        for(int[] path : paths){
            int p1 = path[0]-1;
            int p2 = path[1]-1;
            Garden garden1 = graph[p1];
            Garden garden2 = graph[p2];
			// when garden1's neighbor is garden2, then garden2's neighbor should also be garden1
            Garden.connectedGardens.add(garden2);
            Garden.connectedGardens.add(garden1);
        }
        
        int idx = 0;
        int[] res = new int[N];
        for(Garden garden : graph){
            garden.setUniqFlowerType();
            res[idx++] = garden.flowerType;
        }
        
        return res;
    }
}
