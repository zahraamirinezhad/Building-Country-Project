package Main.Bank;

import java.io.Serializable;

public class Tarakonesh implements Serializable {
    private double Price;
    private String Time;
    private TarakoneshType Type;
    public Tarakonesh(double Price, int Year, int Month, int Day, TarakoneshType tarakoneshType){
        this.setPrice(Price);
        this.setTime(Year+" / "+Month+" / "+Day);
        Type = tarakoneshType;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public TarakoneshType getType() {
        return Type;
    }

    public void setType(TarakoneshType type) {
        Type = type;
    }
}
