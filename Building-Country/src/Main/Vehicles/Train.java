package Main.Vehicles;

import java.io.Serializable;
import java.util.ArrayList;

public class Train extends LandVehicle implements Serializable {
    private ArrayList<WelfareServices> Services = new ArrayList<WelfareServices>();
    private int Waggon;
    private int Star;

    public Train(int Capacity, int ID, String FactoryName, double LastSpeed, String Fuel, int Waggon, int Star) {
        super(30.0, Capacity, ID, FactoryName, LastSpeed, Fuel);
        this.setWaggon(Waggon);
        this.setStar(Star);
    }

    public ArrayList<WelfareServices> getServices() {
        return Services;
    }

    public void setServices(WelfareServices services) {
        Services.add(services);
    }

    public int getWaggon() {
        return Waggon;
    }

    public void setWaggon(int waggon) {
        Waggon = waggon;
    }

    public int getStar() {
        return Star;
    }

    public void setStar(int star) {
        Star = star;
    }
}
