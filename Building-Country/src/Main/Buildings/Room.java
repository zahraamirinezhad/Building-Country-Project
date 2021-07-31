package Main.Buildings;

import java.io.Serializable;

public class Room implements Serializable {
    private static double StayPrice = 10;
    final private int RoomNumber;
    final private double Metrazh;
    private int BedNum;

    public Room(int RoomNumber, int BedNum, double Metrazh) {
        this.RoomNumber = RoomNumber;
        this.setBedNum(BedNum);
        this.Metrazh = Metrazh;
    }

    public int getRoomNumber() {
        return RoomNumber;
    }

    public double getMetrazh() {
        return Metrazh;
    }

    public int getBedNum() {
        return BedNum;
    }

    public void setBedNum(int bedNum) {
        BedNum = bedNum;
    }

    public static double getStayPrice() {
        return StayPrice;
    }

    public static void setStayPrice(double stayPrice) {
        StayPrice = stayPrice;
    }
}
