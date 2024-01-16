package EntryGateManager;

import ParkingSpotFactory.ParkingSpot;
import ParkingSpotFactory.ParkingSpotManager;
import ParkingStrategyManager.ParkingManager;
import Tickets.TicketTemplate;
import VehicleManager.Vehicle;
import VehicleManager.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class EntryGateManager {
    long entryTime;
    public TicketTemplate generateTicket(Vehicle vehicle, List<ParkingSpot> parkingSpots, String args){
        ParkingSpot parkingSpot = getParkingSpot(getParkingSpotManager(parkingSpots), args, vehicle.getvType());
        TicketTemplate ticket = new TicketTemplate(vehicle, parkingSpot);
        return ticket;
    }
    public ParkingSpot getParkingSpot(ParkingSpotManager parkingSpotManager, String args, VehicleType vehicleType){
        ParkingSpot parkingSpot = parkingSpotManager.findParkingSpace(args, vehicleType);
        return parkingSpot;
    }

    public Vehicle getVehicle(Vehicle vehicle){
        return vehicle;
    }
    public ParkingSpotManager getParkingSpotManager(List<ParkingSpot> parkingSpots){
        ParkingSpotManager parkingSpotManager = new ParkingSpotManager(parkingSpots);
        return parkingSpotManager;
    }
}
