package Main.Vehicles;

import java.io.Serializable;

public class Bus extends LandVehicle implements Serializable {
    final private String Type;

    public Bus(int Capacity, int ID, String FactoryName, double LastSpeed, String Fuel, String Type) {
        super(10.0, Capacity, ID, FactoryName, LastSpeed, Fuel);
        this.Type = Type;
    }

    public String getType() {
        return Type;
    }
}
