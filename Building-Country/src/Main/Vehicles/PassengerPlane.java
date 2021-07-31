package Main.Vehicles;

import java.io.Serializable;
import java.util.ArrayList;

public class PassengerPlane extends AirVehicle implements Serializable {
    final private String Chairs;
    private ArrayList<WelfareServices> Services = new ArrayList<WelfareServices>();

    public PassengerPlane(int Capacity, int ID, String FactoryName, double LastHeight, double RunwayLength, String Chairs) {
        super(50.0, Capacity, ID, FactoryName, LastHeight, RunwayLength);
        this.Chairs = Chairs;
    }

    public String getChairs() {
        return Chairs;
    }

    public ArrayList<WelfareServices> getServices() {
        return Services;
    }

    public void setServices(WelfareServices services) {
        Services.add(services);
    }
}
