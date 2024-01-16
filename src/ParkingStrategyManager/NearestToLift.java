package ParkingStrategyManager;

import ParkingSpotFactory.ParkingSpot;

public class NearestToLift implements ParkingStrategy{
    @Override
    public ParkingSpot strategy() {
        System.out.println("We are in NearestToLift Strategy");return null;
    }
}