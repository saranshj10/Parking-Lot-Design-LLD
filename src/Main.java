import EntryGateManager.EntryGateManager;
import ParkingSpotFactory.ParkingSpot;
import ParkingSpotFactory.ParkingSpotManager;
import VehicleManager.Vehicle;
import VehicleManager.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /** Creating the list of all the parking spots */
        List<ParkingSpot> parkingSpotList = new ArrayList<ParkingSpot>();
        parkingSpotList.add(new ParkingSpot(1,true,VehicleType.TWOWHEELER, 300));
        parkingSpotList.add(new ParkingSpot(2,true,VehicleType.TWOWHEELER, 300));
        parkingSpotList.add(new ParkingSpot(3,true,VehicleType.TWOWHEELER, 300));
        parkingSpotList.add(new ParkingSpot(4,true,VehicleType.TWOWHEELER, 300));
        parkingSpotList.add(new ParkingSpot(5,true,VehicleType.TWOWHEELER, 300));
        parkingSpotList.add(new ParkingSpot(6,true,VehicleType.FOURWHEELER, 500));
        parkingSpotList.add(new ParkingSpot(7,true,VehicleType.FOURWHEELER, 500));
        parkingSpotList.add(new ParkingSpot(8,true,VehicleType.FOURWHEELER, 500));
        parkingSpotList.add(new ParkingSpot(9,true,VehicleType.FOURWHEELER, 500));
        parkingSpotList.add(new ParkingSpot(10,true,VehicleType.FOURWHEELER, 500));

        /** Creating the list of all the vehicles */
        List<Vehicle> vehicleList = new ArrayList<Vehicle>();
        vehicleList.add(new Vehicle(2020, VehicleType.FOURWHEELER));
        vehicleList.add(new Vehicle(2021, VehicleType.FOURWHEELER));
        vehicleList.add(new Vehicle(2022, VehicleType.FOURWHEELER));
        vehicleList.add(new Vehicle(2023, VehicleType.TWOWHEELER));
        vehicleList.add(new Vehicle(2024, VehicleType.TWOWHEELER));

        EntryGateManager entryGateManager = new EntryGateManager();
        ParkingSpotManager parkingSpotManager = new ParkingSpotManager(parkingSpotList);
        ParkingSpot parkingSpot = new ParkingSpot();
        vehicleList.forEach(vehicle -> {
            ParkingSpot newparkingSpot = parkingSpotManager.findParkingSpace("2", vehicle.getvType());
            newparkingSpot.parkVehicle(vehicle);
        });
        parkingSpotManager.showParkingSpaces();
        Vehicle vehicleToRemove = vehicleList.get(2);
        parkingSpot.removeVehicle(vehicleToRemove);
        vehicleList.forEach(vehicle -> {
            ParkingSpot newparkingSpot = parkingSpotManager.findParkingSpace("2", vehicle.getvType());
            if(newparkingSpot != null)
                newparkingSpot.parkVehicle(vehicle);
            else
                System.out.println("Can't Park Vehicle at this location: ");
        });
        parkingSpotManager.showParkingSpaces();
    }
}