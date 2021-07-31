package Main.Buildings;

import Main.Vehicles.SeaVehicle;
import java.io.Serializable;
import java.util.ArrayList;

public class ShippingPort extends Terminal implements Serializable {
    private ArrayList<SeaVehicle> SeaV = new ArrayList<SeaVehicle>();
    private int StageNum;
    private int ShipNum = 0;
    private int BoatNum = 0;

    public ShippingPort(String CityName, String TerminalName, String Address, double Metrazh, int StageNum) {
        super(100.0, CityName, TerminalName, Address, Metrazh);
        this.setStageNum(StageNum);

    }

    public ArrayList<SeaVehicle> getSeaV() {
        return SeaV;
    }

    public void setSeaV(SeaVehicle seaV) {
        SeaV.add(seaV);
    }

    public int getStageNum() {
        return StageNum;
    }

    public void setStageNum(int stageNum) {
        StageNum = stageNum;
    }

    public int getShipNum() {
        return ShipNum;
    }

    public void setShipNum(int shipNum) {
        ShipNum = shipNum;
    }

    public int getBoatNum() {
        return BoatNum;
    }

    public void setBoatNum(int boatNum) {
        BoatNum = boatNum;
    }
}
