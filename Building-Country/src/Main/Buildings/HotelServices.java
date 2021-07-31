package Main.Buildings;

import java.io.Serializable;

public enum HotelServices implements Serializable {
    LAUNDRY, GYM, POOL, RESTAURANT, CAFE, STORE, LIBRARY, BEAUTYSALON, CINEMA, CLINIC, PARK, GAMENET, FREEINTERNET;
    public static HotelServices[] service = HotelServices.values();

}
