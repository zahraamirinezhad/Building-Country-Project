package Main.Trip;

import Main.Buildings.Terminal;
import Main.Person;
import Main.Vehicles.Vehicle;
import java.io.Serializable;
import java.util.ArrayList;


public class Trip implements Comparable, Serializable {
    private String OriginCityName;
    private String DestinationCityName;
    private Terminal Origin;
    private Terminal Destination;
    private ArrayList<Person> Passengers;
    private Person Driver;
    private Vehicle vehicle;
    private int ID;
    private int Year;
    private int Month;
    private int Day;
    private double TripCost;
    private String Type;
    //TRUE FOR ENTRANCE TRIPS
    //FALSE FOR OUTWARD TRIPS
    public Trip(String OriginCityName, String DestinationCityName, Terminal Origin, Terminal Destination, ArrayList<Person> Passengers, Person Driver, Vehicle vehicle, int ID, int Year, int Month, int Day, double TripCost, String Type) {
        this.setOriginCityName(OriginCityName);
        this.setDestinationCityName(DestinationCityName);
        this.setOrigin(Origin);
        this.setDestination(Destination);
        this.setPassengers(Passengers);
        this.setDriver(Driver);
        this.setVehicle(vehicle);
        this.setID(ID);
        this.setYear(Year);
        this.setMonth(Month);
        this.setDay(Day);
        this.setTripCost(TripCost);
        this.setType(Type);
    }

    @Override
    public int compareTo(Object obj) {
        Trip trip = (Trip) obj;
        if (this.getYear() > trip.getYear()) {
            return -1;
        } else if (this.getYear() < trip.getYear()) {
            return 1;
        } else {
            if (this.getMonth() > trip.getMonth()) {
                return -1;
            } else if (this.getMonth() < trip.getMonth()) {
                return 1;
            } else {
                if (this.getDay() > trip.getDay()) {
                    return -1;
                } else if (this.getDay() < trip.getDay()) {
                    return 1;
                } else {
                    if (this.getTripCost() > trip.getTripCost()) {
                        return 1;
                    } else if (this.getTripCost() < trip.getTripCost()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        }

    }


    public Terminal getOrigin() {
        return Origin;
    }

    public void setOrigin(Terminal origin) {
        Origin = origin;
    }

    public Terminal getDestination() {
        return Destination;
    }

    public void setDestination(Terminal destination) {
        Destination = destination;
    }

    public ArrayList<Person> getPassengers() {
        return Passengers;
    }

    public void setPassengers(ArrayList<Person> passengers) {
        Passengers = passengers;
    }

    public Person getDriver() {
        return Driver;
    }

    public void setDriver(Person driver) {
        Driver = driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    public double getTripCost() {
        return TripCost;
    }

    public void setTripCost(double tripCost) {
        TripCost = tripCost;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getOriginCityName() {
        return OriginCityName;
    }

    public void setOriginCityName(String originCityName) {
        OriginCityName = originCityName;
    }

    public String getDestinationCityName() {
        return DestinationCityName;
    }

    public void setDestinationCityName(String destinationCityName) {
        DestinationCityName = destinationCityName;
    }
}
