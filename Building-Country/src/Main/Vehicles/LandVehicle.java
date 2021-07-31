package Main.Vehicles;

import java.io.Serializable;

public abstract class LandVehicle extends Vehicle implements Serializable {
    final private double LastSpeed;
    final private String Fuel;

    LandVehicle(double Price, int Capacity, int ID, String FactoryName, double LastSpeed, String Fuel) {
        super(Price, Capacity, ID, FactoryName);
        this.LastSpeed = LastSpeed;
        this.Fuel = Fuel;
    }

    public double getLastSpeed() {
        return LastSpeed;
    }

    public String getFuel() {
        return Fuel;
    }
}
