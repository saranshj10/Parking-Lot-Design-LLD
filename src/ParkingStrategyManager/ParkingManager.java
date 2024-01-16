package ParkingStrategyManager;

import ParkingSpotFactory.ParkingSpot;

public class ParkingManager {

    String args;
    public ParkingSpot getParkingStrategy(String args){
        if(args!=""){
            switch (args){
                case "1": return new NearestToGate().strategy();
                case "2": return new NearestToLift().strategy();
                default: return new DefaultStrategy().strategy();
            }
        }
        else{
            return new DefaultStrategy().strategy();
        }
    }
}
