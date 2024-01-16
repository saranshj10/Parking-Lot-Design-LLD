package ParkingStrategyManager;

import ParkingSpotFactory.ParkingSpot;

public class DefaultStrategy implements ParkingStrategy{
    @Override
    public ParkingSpot strategy() {
        System.out.println("We are in Default Strategy");
        return null;
    }
}
