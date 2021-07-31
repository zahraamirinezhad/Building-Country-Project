package Main.Buildings;

import Main.Vehicles.Train;
import java.io.Serializable;
import java.util.ArrayList;

public class RailwayStation extends Terminal implements Serializable {
    private ArrayList<Train> Trains = new ArrayList<Train>();
    private int InputRails;
    private int OutputRails;

    public RailwayStation(String CityName, String TerminalName, String Address, double Metrazh, int InputRails, int OutputRails) {
        super(90.0, CityName, TerminalName, Address, Metrazh);
        this.setInputRails(InputRails);
        this.setOutputRails(OutputRails);
    }

    public ArrayList<Train> getTrains() {
        return Trains;
    }

    public void setTrains(Train trains) {
        Trains.add(trains);
    }

    public int getInputRails() {
        return InputRails;
    }

    public void setInputRails(int inputRails) {
        InputRails = inputRails;
    }

    public int getOutputRails() {
        return OutputRails;
    }

    public void setOutputRails(int outputRails) {
        OutputRails = outputRails;
    }
}
