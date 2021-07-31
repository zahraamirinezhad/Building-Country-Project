package Main.Bank;

import Main.Person;
import java.io.Serializable;
import java.util.ArrayList;

public class HesabBanki implements Serializable {
    private static String[] HesabBankiWorks = {"VARIZ" , "BARDASHT" , "SHOW INFORMATION","EXIT"};
    private ArrayList<Tarakonesh> TarakoneshHa = new ArrayList<>();
    private double MojudiHesab;
    private Person Owner;
    private String UserName;
    private int Password;
    private int start;
    private String BankName;
    private String CityName;
    public HesabBanki(double MojudiHesab, Person Owner, String UserName, int Password, String CityName , String BankName){
        this.setMojudiHesab(MojudiHesab);
        this.setOwner(Owner);
        this.setUserName(UserName);
        this.setPassword(Password);
        this.CityName = CityName;
        this.BankName = BankName;
        this.setStart(0);
    }

    public ArrayList<Tarakonesh> getTarakoneshHa() {
        return TarakoneshHa;
    }

    public void setTarakoneshHa(Tarakonesh tarakoneshHa) {
        TarakoneshHa.add(tarakoneshHa);
    }

    public double getMojudiHesab() {
        return MojudiHesab;
    }

    public void setMojudiHesab(double mojudiHesab) {
        MojudiHesab = mojudiHesab;
    }

    public Person getOwner() {
        return Owner;
    }

    public void setOwner(Person owner) {
        Owner = owner;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getPassword() {
        return Password;
    }

    public void setPassword(int password) {
        Password = password;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public static String[] getHesabBankiWorks() {
        return HesabBankiWorks;
    }

    public static void setHesabBankiWorks(String[] hesabBankiWorks) {
        HesabBankiWorks = hesabBankiWorks;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }
}
