package Main.Vehicles;

import java.io.Serializable;

public class CargoPlane extends AirVehicle implements Serializable {
    final private double LastWeight;

    public CargoPlane(int Capacity, int ID, String FactoryName, double LastHeight, double RunwayLength, double LastWeight) {
        super(40.0, Capacity, ID, FactoryName, LastHeight, RunwayLength);
        this.LastWeight = LastWeight;
    }

    public double getLastWeight() {
        return LastWeight;
    }
}
