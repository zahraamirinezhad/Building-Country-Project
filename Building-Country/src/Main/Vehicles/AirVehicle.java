package Main.Vehicles;

import java.io.Serializable;

public abstract class AirVehicle extends Vehicle implements Serializable {
    final private double LastHeight;
    final private double RunwayLength;

    AirVehicle(double Price, int Capacity, int ID, String FactoryName, double LastHeight, double RunwayLength) {
        super(Price, Capacity, ID, FactoryName);
        this.LastHeight = LastHeight;
        this.RunwayLength = RunwayLength;
    }

    public double getLastHeight() {
        return LastHeight;
    }

    public double getRunwayLength() {
        return RunwayLength;
    }
}
