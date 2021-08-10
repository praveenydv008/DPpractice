package com.example.dynamicprogramming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Garden {
    public static final int[] FLOWER_TYPES = {1,2,3,4};
    public int flowerType;
    static List<Garden> connectedGardens;
    
    public Garden() {
        flowerType = -1;
        connectedGardens = new ArrayList<Garden>();
    }
    
    public void setUniqFlowerType() {
        HashSet<Integer> takenByConnectedGarden = new HashSet<Integer>();
        for(Garden garden : connectedGardens){
            if(garden.flowerType != -1) takenByConnectedGarden.add(garden.flowerType);
        }
        
        for(int flowerType : FLOWER_TYPES){
            if(!takenByConnectedGarden.contains(flowerType)){
                this.flowerType = flowerType;
                break;
            }
        }
    }
}