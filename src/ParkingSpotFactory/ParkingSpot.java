package ParkingSpotFactory;

import VehicleManager.Vehicle;
import VehicleManager.VehicleType;

public class ParkingSpot {
    int id;
    boolean isEmpty;
    Vehicle vehicle;
    VehicleType vehicleType;
    int price;

    public ParkingSpot(int id, boolean isEmpty, VehicleType vehicleType, int price) {
        this.id = id;
        this.isEmpty=isEmpty;
        this.vehicleType=vehicleType;
        this.price=price;
    }
    public ParkingSpot(){
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void parkVehicle(Vehicle v){
        if(this.isEmpty){
            this.id=v.getId();
            this.isEmpty=false;
            this.vehicle=v;
            System.out.println("Successfully Parked at: " + v.getId());
        }
        else{
            System.out.println("Other Vehicle is Already Parked");
        }
    };
    public void removeVehicle(Vehicle v){
        this.id=0;
        this.vehicle=null;
        this.isEmpty=true;
    };
}
