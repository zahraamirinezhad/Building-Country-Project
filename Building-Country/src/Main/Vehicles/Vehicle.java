package Main.Vehicles;

import java.io.Serializable;

public abstract class Vehicle implements Serializable {
    private static double Price;
    final private int ID;
    final private String FactoryName;
    private int Capacity;

    Vehicle(double Price, int Capacity, int ID, String FactoryName) {
        this.setPrice(Price);
        this.setCapacity(Capacity);
        this.ID = ID;
        this.FactoryName = FactoryName;
    }

    public static double getPrice() {
        return Price;
    }

    public static void setPrice(double price) {
        Price = price;
    }

    public int getID() {
        return ID;
    }

    public String getFactoryName() {
        return FactoryName;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }
}
