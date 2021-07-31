package Main.Vehicles;

import java.io.Serializable;
import java.util.ArrayList;

public class Ship extends SeaVehicle implements Serializable {
    final private String Type;
    final private double Weight;
    private ArrayList<WelfareServices> Services = new ArrayList<WelfareServices>();

    public Ship(int Capacity, int ID, String FactoryName, String Fuel, double LeastDepth, double LastSpeed, String Type, double Weight) {
        super(40.0, Capacity, ID, FactoryName, Fuel, LeastDepth, LastSpeed);
        this.Type = Type;
        this.Weight = Weight;
    }

    public String getType() {
        return Type;
    }

    public double getWeight() {
        return Weight;
    }

    public ArrayList<WelfareServices> getServices() {
        return Services;
    }

    public void setServices(WelfareServices services) {
        Services.add(services);
    }
}
