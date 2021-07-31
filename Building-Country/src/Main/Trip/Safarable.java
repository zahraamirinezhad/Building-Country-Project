package Main.Trip;

import Main.Person;
import Main.Vehicles.Vehicle;
import java.util.ArrayList;

public interface Safarable {
    void SwapTrips();
    double TripsCost(ArrayList<Person> Passengers, Vehicle vehicle);
}
