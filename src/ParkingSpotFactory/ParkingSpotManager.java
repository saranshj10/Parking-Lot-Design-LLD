package ParkingSpotFactory;

import ParkingStrategyManager.ParkingManager;
import ParkingStrategyManager.ParkingStrategy;
import VehicleManager.Vehicle;
import VehicleManager.VehicleType;

import java.util.List;

public class ParkingSpotManager {

    List<ParkingSpot> parkingSpotlist;

    public ParkingSpotManager(List<ParkingSpot> parkingSpotlist) {
        this.parkingSpotlist = parkingSpotlist;
    }

    public ParkingSpot findParkingSpace(String args, VehicleType vehicleType){
        ParkingManager parkingStrategy = new ParkingManager();
        parkingStrategy.getParkingStrategy(args);
        for (int i=0;i<parkingSpotlist.size();i++) {
            if (parkingSpotlist.get(i).isEmpty && parkingSpotlist.get(i).vehicleType == vehicleType) {
                return parkingSpotlist.get(i);
            }
        }
        System.out.println("Need time to find the Parking Space");
        return null;
    }
    public void addParkingSpace(ParkingSpot parkingSpot){
        parkingSpotlist.add(parkingSpot);
    }
    public void showParkingSpaces(){
        parkingSpotlist.forEach(parkingSpot -> {
                System.out.println("id is: " + parkingSpot.id + " for the vehicleType: " + parkingSpot.vehicleType + " and the price is: " + parkingSpot.price + " isEmpty: " + parkingSpot.isEmpty);
        });
    }
    public void removeParkingSpace(ParkingSpot parkingSpot){
        parkingSpotlist.remove(parkingSpot);
    }
    public void parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot){
        parkingSpot.parkVehicle(vehicle);
    }
    public void removeVehicle(Vehicle vehicle, ParkingSpot parkingSpot){
        parkingSpot.removeVehicle(vehicle);
    }

}
