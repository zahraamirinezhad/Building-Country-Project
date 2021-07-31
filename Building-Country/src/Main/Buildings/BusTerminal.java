package Main.Buildings;

import Main.Vehicles.Bus;
import java.io.Serializable;
import java.util.ArrayList;

public class BusTerminal extends Terminal implements Serializable {
    private ArrayList<Bus> bus = new ArrayList<>();

    public BusTerminal(String CityName, String TerminalName, String Address, double Metrazh) {
        super(90.0, CityName, TerminalName, Address, Metrazh);
    }

    public ArrayList<Bus> getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus.add(bus);
    }
}
