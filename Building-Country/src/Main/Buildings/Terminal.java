package Main.Buildings;

import Main.Person;
import Main.Trip.Safarable;
import Main.Trip.Trip;
import Main.Vehicles.*;
import java.io.Serializable;
import java.util.*;

public abstract class Terminal implements Safarable, Serializable {
    private static double BuildPrice;
    final private String CityName;
    final private String TerminalName;
    final private String Address;
    final private double Metrazh;
    private ArrayList<Person> People = new ArrayList<>();
    private ArrayList<Trip> trips = new ArrayList<>();

    Terminal(double BuildPrice, String CityName, String TerminalName, String Address, double Metrazh) {
        this.setBuildPrice(BuildPrice);
        this.CityName = CityName;
        this.TerminalName = TerminalName;
        this.Address = Address;
        this.Metrazh = Metrazh;
    }

    @Override
    public double TripsCost(ArrayList<Person> Passengers, Vehicle vehicle) {
        double Cost = 0;
        for (int i = 0; i < Passengers.size(); i++) {
            Cost += 5;
        }
        if (vehicle instanceof Bus) {
            Cost += 10;
        } else if (vehicle instanceof PassengerPlane) {
            Cost += 20;
        } else if (vehicle instanceof Ship) {
            Cost += 30;
        } else if (vehicle instanceof Train) {
            Cost += 25;
        }
        return Cost;
    }

    @Override
    public void SwapTrips(){
        for(int i = 0; i< this.getTrips().size(); i++){
            for(int j = i; j< this.getTrips().size(); j++){
                Trip temp;
                if(this.getTrips().get(i).compareTo(this.getTrips().get(j)) == -1){
                    temp = this.getTrips().get(i);
                    this.getTrips().set(i, this.getTrips().get(j));
                    this.getTrips().set(j,temp);
                }
            }
        }
    }

    public String getCityName() {
        return CityName;
    }

    public String getTerminalName() {
        return TerminalName;
    }

    public String getAddress() {
        return Address;
    }

    public double getMetrazh() {
        return Metrazh;
    }

    public ArrayList<Person> getPeople() {
        return People;
    }

    public void setPeople(Person people) {
        this.People.add(people);
    }

    public ArrayList<Trip> getTrips() {
        return trips;
    }

    public void setTrips(Trip trips) {
        this.trips.add(trips);
    }

    public static double getBuildPrice() {
        return BuildPrice;
    }

    public static void setBuildPrice(double buildPrice) {
        BuildPrice = buildPrice;
    }
}

