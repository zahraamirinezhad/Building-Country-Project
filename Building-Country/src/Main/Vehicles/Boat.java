package Main.Vehicles;

import java.io.Serializable;

public class Boat extends SeaVehicle implements Serializable {
    final private double Weight;
    final private String HullQuality;

    public Boat(int Capacity, int ID, String FactoryName, String Fuel, double LeastDepth, double LastSpeed, double Weight, String HullQuality) {
        super(20.0, Capacity, ID, FactoryName, Fuel, LeastDepth, LastSpeed);
        this.Weight = Weight;
        this.HullQuality = HullQuality;
    }

    public double getWeight() {
        return Weight;
    }

    public String getHullQuality() {
        return HullQuality;
    }
}
