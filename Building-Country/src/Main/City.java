package Main;

import Main.Bank.Bank;
import Main.Buildings.*;
import java.io.Serializable;
import java.util.ArrayList;

public class City implements Serializable {
    private static String[] List = {"HOTEL", "TERMINAL", "ROOM", "PASSENGER PLANE","CARGO PLANE", "BUS", "TRAIN", "BOAT"," SHIP", "PILOT", "DRIVER", "LOCOMOTIVES", "SAILOR", "CREW", "SHOW AIRPORTS", "SHOW SHIP PORTS", "SHOW BUS STATIONS", "SHOW RAILWAY STATIONS", "SHOW CITY", "SHOW HOTELS", "ADD PERSON", "SHOW PEOPLE","BUILD BANK","ENTER BANK","EXIT"};
    private static String[] EnterList = {"HOTEL", "TERMINAL", "ROOM", "PASSENGER PLANE","CARGO PLANE", "BUS", "TRAIN", "BOAT"," SHIP", "PILOT", "DRIVER", "LOCOMOTIVES", "SAILOR", "CREW", "SHOW AIRPORTS", "SHOW SHIP PORTS", "SHOW BUS STATIONS", "SHOW RAILWAY STATIONS", "SHOW CITY", "SHOW HOTELS", "ADD PERSON", "SHOW PEOPLE","TRAVEL","BUILD BANK","ENTER BANK","EXIT"};
    private  static String[] ShowList = {"SHOW HOTELS", "SHOW AIRPORTS", "SHOW SHIP PORTS", "SHOW BUS STATIONS", "SHOW RAILWAY STATIONS","SHOW PEOPLE","SHOW TRAVELS","EXIT"};
    private  ArrayList<Hotel> hotel = new ArrayList<>();
    private  ArrayList<Person> person = new ArrayList<>();
    private  ArrayList<Airport> airport = new ArrayList<>();
    private  ArrayList<BusTerminal> busTerminal = new ArrayList<>();
    private  ArrayList<RailwayStation> railwayStation = new ArrayList<>();
    private  ArrayList<ShippingPort> shippingPort = new ArrayList<>();
    private  ArrayList<Bank> AllBanks = new ArrayList<>();
    private  double HoleMoney = 10000;
    private  int peopleNum = 0;
    private  String CityName;
    private  int numAirport = -1;
    private  int numBusTerminal = -1;
    private  int numRailwayStation = -1;
    private int numShipPort = -1;
    private int numHotel = -1;

    public City(String CityName) {
        this.setCityName(CityName);
    }

    public void addPerson(Person person) {
        this.getPerson().add(person);
        this.setPeopleNum(this.getPeopleNum() + 1);
    }

    public ArrayList<Hotel> getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel.add(hotel);
    }

    public ArrayList<Person> getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.getPerson().add(person);
    }

    public ArrayList<Airport> getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport.add(airport);
    }

    public ArrayList<BusTerminal> getBusTerminal() {
        return busTerminal;
    }

    public void setBusTerminal(BusTerminal busTerminal) {
        this.busTerminal.add(busTerminal);
    }

    public ArrayList<RailwayStation> getRailwayStation() {
        return railwayStation;
    }

    public void setRailwayStation(RailwayStation railwayStation) {
        this.railwayStation.add(railwayStation);
    }

    public ArrayList<ShippingPort> getShippingPort() {
        return shippingPort;
    }

    public void setShippingPort(ShippingPort shippingPort) {
        this.shippingPort.add(shippingPort);
    }

    public ArrayList<Bank> getAllBanks() {
        return AllBanks;
    }

    public void setAllBanks(Bank allBanks) {
        AllBanks.add(allBanks);
    }

    public double getHoleMoney() {
        return HoleMoney;
    }

    public void setHoleMoney(double holeMoney) {
        HoleMoney = holeMoney;
    }

    public int getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(int peopleNum) {
        this.peopleNum = peopleNum;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public int getNumAirport() {
        return numAirport;
    }

    public void setNumAirport(int numAirport) {
        this.numAirport = numAirport;
    }

    public int getNumBusTerminal() {
        return numBusTerminal;
    }

    public void setNumBusTerminal(int numBusTerminal) {
        this.numBusTerminal = numBusTerminal;
    }

    public int getNumRailwayStation() {
        return numRailwayStation;
    }

    public void setNumRailwayStation(int numRailwayStation) {
        this.numRailwayStation = numRailwayStation;
    }

    public int getNumShipPort() {
        return numShipPort;
    }

    public void setNumShipPort(int numShipPort) {
        this.numShipPort = numShipPort;
    }

    public int getNumHotel() {
        return numHotel;
    }

    public void setNumHotel(int numHotel) {
        this.numHotel = numHotel;
    }

    public static String[] getList() {
        return List;
    }

    public static void setList(String[] list) {
        List = list;
    }

    public static String[] getEnterList() {
        return EnterList;
    }

    public static void setEnterList(String[] enterList) {
        EnterList = enterList;
    }

    public static String[] getShowList() {
        return ShowList;
    }

    public static void setShowList(String[] showList) {
        ShowList = showList;
    }
}