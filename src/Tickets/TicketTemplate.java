package Tickets;

import ParkingSpotFactory.ParkingSpot;
import VehicleManager.Vehicle;

public class TicketTemplate {
    Vehicle vehicle;
    Long entryTime;
    ParkingSpot spot;
    int pricePerHour;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public TicketTemplate(Vehicle vehicle, ParkingSpot spot) {
        this.vehicle = vehicle;
        this.entryTime = System.currentTimeMillis();
        this.spot = spot;
        this.pricePerHour=spot.getPrice();
    }
    public Long getEntryTime() {
        return entryTime;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }
}
