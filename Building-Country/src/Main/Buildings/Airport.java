package Main.Buildings;

import Main.Vehicles.AirVehicle;
import Main.Vehicles.CargoPlane;
import Main.Vehicles.PassengerPlane;
import java.io.Serializable;
import java.util.ArrayList;

public class Airport extends Terminal implements Serializable {
    private ArrayList<AirVehicle> AirV = new ArrayList<AirVehicle>();
    private final String AirportType;
    private int RunawayNum;
    private int CrewsNum = 0;
    private int PilotsNum = 0;
    private int PassengerPlanesNum = 0;
    private int CargoPlanesNum = 0;

    public Airport(String CityName, String TerminalName, String Address, double Metrazh, String AirportType, int RunawayNum) {
        super(90.0, CityName, TerminalName, Address, Metrazh);
        this.AirportType = AirportType;
        this.setRunawayNum(RunawayNum);
    }

    public ArrayList<AirVehicle> getAirV() {
        return AirV;
    }

    public void setAirV(AirVehicle airV) {
        this.AirV.add(airV);
    }

    public String getAirportType() {
        return AirportType;
    }

    public int getRunawayNum() {
        return RunawayNum;
    }

    public void setRunawayNum(int runawayNum) {
        RunawayNum = runawayNum;
    }

    public int getCrewsNum() {
        return CrewsNum;
    }

    public void setCrewsNum(int crewsNum) {
        CrewsNum = crewsNum;
    }

    public int getPilotsNum() {
        return PilotsNum;
    }

    public void setPilotsNum(int pilotsNum) {
        PilotsNum = pilotsNum;
    }

    public int getPassengerPlanesNum() {
        return PassengerPlanesNum;
    }

    public void setPassengerPlanesNum(int passengerPlanesNum) {
        PassengerPlanesNum = passengerPlanesNum;
    }

    public int getCargoPlanesNum() {
        return CargoPlanesNum;
    }

    public void setCargoPlanesNum(int cargoPlanesNum) {
        CargoPlanesNum = cargoPlanesNum;
    }
}
