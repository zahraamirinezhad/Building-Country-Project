package Main.Bank;

import java.io.Serializable;
import java.util.ArrayList;

public class Bank implements Serializable {
    private static String[] BankWorks = {"OPENING A BANK ACCOUNT" , "LOGIN" , "SHOW BANK INFORMATION","EXIT"};
    private ArrayList<HesabBanki> HesabHaBanki = new ArrayList<>();
    private String BankName;
    private double HoleMoney = 0;
    private int AliveAccounts = 0;
    private String CityName;
    private double Profit;
    private static double BuildPrice = 10.0;
    public Bank(String CityName, String BankName, double Profit){
        this.setCityName(CityName);
        this.setBankName(BankName);
        this.setProfit(Profit);
    }

    public static double getBuildPrice() {
        return BuildPrice;
    }

    public static void setBuildPrice(double buildPrice) {
        BuildPrice = buildPrice;
    }

    public void SetAliveAccountsAndHoleMoney(){
        this.HoleMoney = 0;
        this.AliveAccounts = 0;
        for(int i = 0; i< this.getHesabHaBanki().size(); i++){
            this.setHoleMoney(this.getHoleMoney() + this.getHesabHaBanki().get(i).getMojudiHesab());
            if(this.getHesabHaBanki().get(i).getMojudiHesab() > 0){
                this.setAliveAccounts(this.getAliveAccounts() + 1);
            }
        }
    }

    public ArrayList<HesabBanki> getHesabHaBanki() {
        return HesabHaBanki;
    }

    public void setHesabHaBanki(HesabBanki hesabHaBanki) {
        HesabHaBanki.add(hesabHaBanki);
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public double getHoleMoney() {
        return HoleMoney;
    }

    public void setHoleMoney(double holeMoney) {
        HoleMoney = holeMoney;
    }

    public int getAliveAccounts() {
        return AliveAccounts;
    }

    public void setAliveAccounts(int aliveAccounts) {
        AliveAccounts = aliveAccounts;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public double getProfit() {
        return Profit;
    }

    public void setProfit(double profit) {
        Profit = profit;
    }

    public static String[] getBankWorks() {
        return BankWorks;
    }

    public static void setBankWorks(String[] bankWorks) {
        BankWorks = bankWorks;
    }
}