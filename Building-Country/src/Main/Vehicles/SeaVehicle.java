package Main.Vehicles;

import java.io.Serializable;

public abstract class SeaVehicle extends Vehicle implements Serializable {
    final private String Fuel;
    final private double LeastDepth;
    final private double LastSpeed;

    SeaVehicle(double Price, int Capacity, int ID, String FactoryName, String Fuel, double LeastDepth, double LastSpeed) {
        super(Price, Capacity, ID, FactoryName);
        this.Fuel = Fuel;
        this.LeastDepth = LeastDepth;
        this.LastSpeed = LastSpeed;
    }

    public String getFuel() {
        return Fuel;
    }

    public double getLeastDepth() {
        return LeastDepth;
    }

    public double getLastSpeed() {
        return LastSpeed;
    }
}
