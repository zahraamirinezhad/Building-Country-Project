package Main.Buildings;

import java.io.Serializable;
import java.util.ArrayList;


public class Hotel implements Serializable {
    private static double BuildPrice = 90;
    final private String HotelName;
    final private String Address;
    private ArrayList<HotelServices> Services = new ArrayList<HotelServices>();
    private int StarNum;
    private ArrayList<Room> rooms = new ArrayList<Room>();

    public Hotel(String HotelName, String Address, int StarNum) {
        this.HotelName = HotelName;
        this.Address = Address;
        this.setStarNum(StarNum);
    }

    public String getHotelName() {
        return HotelName;
    }

    public String getAddress() {
        return Address;
    }

    public ArrayList<HotelServices> getServices() {
        return Services;
    }

    public void setServices(HotelServices services) {
        Services.add(services);
    }

    public int getStarNum() {
        return StarNum;
    }

    public void setStarNum(int starNum) {
        StarNum = starNum;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Room rooms) {
        this.rooms.add(rooms);
    }

    public static double getBuildPrice() {
        return BuildPrice;
    }

    public static void setBuildPrice(double buildPrice) {
        BuildPrice = buildPrice;
    }
}
