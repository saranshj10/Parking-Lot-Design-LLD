package ParkingSpotFactory;

import VehicleManager.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotManagerFactory {
    public void getParkingManager(Vehicle vehicle){
        List<ParkingSpot> obj = new ArrayList<ParkingSpot>();
        ParkingSpotManager parkingSpotManager = new ParkingSpotManager(obj);
        System.out.println(parkingSpotManager.parkingSpotlist);
    }
}
