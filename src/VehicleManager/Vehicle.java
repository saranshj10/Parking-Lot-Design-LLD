package VehicleManager;

public class Vehicle {
    int id;
    VehicleType vType;
    public Vehicle(int id, VehicleType vType) {
        this.id = id;
        this.vType = vType;
    }

    public VehicleType getvType() {
        return vType;
    }

    public int getId() {
        return id;
    }
}
