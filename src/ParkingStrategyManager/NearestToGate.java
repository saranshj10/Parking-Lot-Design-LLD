package ParkingStrategyManager;

import ParkingSpotFactory.ParkingSpot;

public class NearestToGate implements ParkingStrategy{
    @Override
    public ParkingSpot strategy() {
        System.out.println("We are in NearestToGate Strategy");
        return null;
    }
}
