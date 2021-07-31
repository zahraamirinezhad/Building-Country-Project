package Main;

import java.io.*;
import java.util.ArrayList;

public class Country implements Serializable {
    private static String[] CountryOptions = {"Build NEW CITY", "ENTER CITY", "SHOW CITIES INFORMATION", "FINANCIAL MANAGEMENT", "EXIT"};
    private static int Population = 0;
    private static int cityNum = 0;
    private static double CountryHoleMoney = 0;
    private static ArrayList<City> cities = new ArrayList<>();
    private static int YEAR;
    private static int MONTH;
    private static int DAY;

    static {
        try {

            if (new File("cities.txt").length() == 0) {

                City Capital = new City("TEHRAN");

                Capital.addPerson(new Person("zahra", "amiri", 1360, "boushehr", "PILOT", "female", 4.0, "1234236785"));
                Capital.addPerson(new Person("hamed", "amiri", 1364, "boushehr", "DRIVER", "male", 2.0, "1245678345"));
                Capital.addPerson(new Person("mehrab", "amiri", 1360, "boushehr", "LOCOMOTIVES", "male", 3.0, "1212345799"));
                Capital.addPerson(new Person("elahe", "mahdavi", 1370, "shiraz", "SAILOR", "female", 4.0, "1232222785"));
                Capital.addPerson(new Person("reza", "musavi", 1360, "shiraz", "DRIVER", "male", 1.0, "1232123456"));
                Capital.addPerson(new Person("sara", "musavi", 1375, "tejran", "SAILOR", "female", 4.0, "1234111185"));
                Capital.addPerson(new Person("maryam", "mahdavi", 1366, "esphehan", "PILOT", "female", 4.0, "1234222285"));
                Capital.addPerson(new Person("elham", "salehi", 1360, "mashhad", "LOCOMOTIVES", "female", 3.0, "1234223785"));
                Capital.addPerson(new Person("mina", "ahmadi", 1365, "shiraz", "DRIVER", "female", 1.0, "1234236745"));
                Capital.addPerson(new Person("erfan", "ahmadi", 1367, "boushehr", "CREW", "male", 2.0, "1134567860"));
                Capital.addPerson(new Person("hesam", "ahmadian", 1367, "ahvaz", "PILOT", "male", 4.0, "1138867880"));
                Capital.addPerson(new Person("milad", "nejati", 1368, "mashhad", "LOCOMOTIVES", "male", 3.0, "1138867899"));
                Capital.addPerson(new Person("bita", "soltani", 1364, "birjand", "DRIVER", "female", 1.0, "1138867898"));
                Capital.addPerson(new Person("mahtab", "akbari", 1359, "tehran", "SAILOR", "female", 4.0, "1138867897"));
                Capital.addPerson(new Person("elahe", "pouladi", 1362, "tehran", "CREW", "female", 2.0, "1138867896"));
                Capital.addPerson(new Person("mahsa", "minayii", 1363, "mazandaran", "PILOT", "female", 4.0, "1138867895"));
                Capital.addPerson(new Person("ramtin", "abbasi", 1367, "karaj", "DRIVER", "male", 1.0, "1138867894"));
                Capital.addPerson(new Person("armin", "talebi", 1368, "ghilan", "LOCOMOTIVES", "male", 3.0, "1138867893"));
                Capital.addPerson(new Person("mehran", "farhadi", 1360, "sari", "SAILOR", "male", 4.0, "1138867892"));
                Capital.addPerson(new Person("motahare", "ashkani", 1361, "ahvaz", "CREW", "female", 2.0, "1138867891"));

                addCity(Capital);

                City city = new City("BOUSHEHR");

                city.addPerson(new Person("elahe", "amiri", 1360, "boushehr", "PILOT", "female", 4.0, "2234236785"));
                city.addPerson(new Person("ahmad", "amiri", 1364, "boushehr", "DRIVER", "male", 2.0, "2245678345"));
                city.addPerson(new Person("erfan", "amiri", 1360, "boushehr", "LOCOMOTIVES", "male", 3.0, "2212345799"));
                city.addPerson(new Person("zahra", "mahdavi", 1370, "shiraz", "SAILOR", "female", 4.0, "2232222785"));
                city.addPerson(new Person("hadi", "musavi", 1360, "shiraz", "DRIVER", "male", 1.0, "2232123456"));
                city.addPerson(new Person("sheyda", "musavi", 1375, "tejran", "SAILOR", "female", 4.0, "2234111185"));
                city.addPerson(new Person("mahsa", "mahdavi", 1366, "esphehan", "PILOT", "female", 4.0, "2234222285"));
                city.addPerson(new Person("mina", "salehi", 1360, "mashhad", "LOCOMOTIVES", "female", 3.0, "2234223785"));
                city.addPerson(new Person("ayda", "ahmadi", 1365, "shiraz", "DRIVER", "female", 1.0, "2234236745"));
                city.addPerson(new Person("ebrahim", "ahmadi", 1367, "boushehr", "CREW", "male", 2.0, "2134567860"));
                city.addPerson(new Person("hadi", "ahmadian", 1367, "ahvaz", "PILOT", "male", 4.0, "2138867880"));
                city.addPerson(new Person("mohammad", "nejati", 1368, "mashhad", "LOCOMOTIVES", "male", 3.0, "2138867899"));
                city.addPerson(new Person("negin", "soltani", 1364, "birjand", "DRIVER", "female", 1.0, "2138867898"));
                city.addPerson(new Person("yekta", "akbari", 1359, "tehran", "SAILOR", "female", 4.0, "2138867897"));
                city.addPerson(new Person("yasna", "pouladi", 1362, "tehran", "CREW", "female", 2.0, "2138867896"));
                city.addPerson(new Person("fatemeh", "minayii", 1363, "mazandaran", "PILOT", "female", 4.0, "2138867895"));
                city.addPerson(new Person("ehsan", "abbasi", 1367, "karaj", "DRIVER", "male", 1.0, "2138867894"));
                city.addPerson(new Person("amir", "talebi", 1368, "ghilan", "LOCOMOTIVES", "male", 3.0, "2138867893"));
                city.addPerson(new Person("damon", "farhadi", 1360, "sari", "SAILOR", "male", 4.0, "2138867892"));
                city.addPerson(new Person("negar", "ashkani", 1361, "ahvaz", "CREW", "female", 2.0, "2138867891"));

                addCity(city);

                City city1 = new City("SHIRAZ");

                city1.addPerson(new Person("shiva", "amiri", 1360, "boushehr", "PILOT", "female", 4.0, "4234236785"));
                city1.addPerson(new Person("arash", "amiri", 1364, "boushehr", "DRIVER", "male", 2.0, "4245678345"));
                city1.addPerson(new Person("mehrab", "saberi", 1360, "boushehr", "LOCOMOTIVES", "male", 3.0, "4212345799"));
                city1.addPerson(new Person("vania", "mahdavi", 1370, "shiraz", "SAILOR", "female", 4.0, "4232222785"));
                city1.addPerson(new Person("amirhosein", "musavi", 1360, "shiraz", "DRIVER", "male", 1.0, "4232123456"));
                city1.addPerson(new Person("sara", "saberi", 1375, "tejran", "SAILOR", "female", 4.0, "4234111185"));
                city1.addPerson(new Person("maryam", "saberi", 1366, "esphehan", "PILOT", "female", 4.0, "4234222285"));
                city1.addPerson(new Person("fariba", "salehi", 1360, "mashhad", "LOCOMOTIVES", "female", 3.0, "4234223785"));
                city1.addPerson(new Person("faride", "ahmadi", 1365, "shiraz", "DRIVER", "female", 1.0, "4234236745"));
                city1.addPerson(new Person("amirali", "ahmadi", 1367, "boushehr", "CREW", "male", 2.0, "4134567860"));
                city1.addPerson(new Person("amirabbas", "ahmadian", 1367, "ahvaz", "PILOT", "male", 4.0, "4138867880"));
                city1.addPerson(new Person("alireza", "nejati", 1368, "mashhad", "LOCOMOTIVES", "male", 3.0, "4138867899"));
                city1.addPerson(new Person("bita", "minayi", 1364, "birjand", "DRIVER", "female", 1.0, "4138867898"));
                city1.addPerson(new Person("mahtab", "minayi", 1359, "tehran", "SAILOR", "female", 4.0, "4138867897"));
                city1.addPerson(new Person("elahe", "erfany", 1362, "tehran", "CREW", "female", 2.0, "4138867896"));
                city1.addPerson(new Person("mahsa", "erfany", 1363, "mazandaran", "PILOT", "female", 4.0, "4138867895"));
                city1.addPerson(new Person("amirmohammad", "abbasi", 1367, "karaj", "DRIVER", "male", 1.0, "4138867894"));
                city1.addPerson(new Person("armin", "tabrizi", 1368, "ghilan", "LOCOMOTIVES", "male", 3.0, "4138867893"));
                city1.addPerson(new Person("mahdi", "farhadi", 1360, "sari", "SAILOR", "male", 4.0, "4138867892"));
                city1.addPerson(new Person("rahele", "ashkani", 1361, "ahvaz", "CREW", "female", 2.0, "4138867891"));

                addCity(city1);

                City city2 = new City("ESPHEHAN");

                city2.addPerson(new Person("zahra", "ehsani", 1360, "boushehr", "PILOT", "female", 4.0, "5234236785"));
                city2.addPerson(new Person("hamed", "ehsani", 1364, "boushehr", "DRIVER", "male", 2.0, "5245678345"));
                city2.addPerson(new Person("mehrab", "ehsani", 1360, "boushehr", "LOCOMOTIVES", "male", 3.0, "5212345799"));
                city2.addPerson(new Person("elahe", "erfani", 1370, "shiraz", "SAILOR", "female", 4.0, "5232222785"));
                city2.addPerson(new Person("reza", "erfani", 1360, "shiraz", "DRIVER", "male", 1.0, "5232123456"));
                city2.addPerson(new Person("sara", "erfani", 1375, "tejran", "SAILOR", "female", 4.0, "5234111185"));
                city2.addPerson(new Person("maryam", "mohammady", 1366, "esphehan", "PILOT", "female", 4.0, "5234222285"));
                city2.addPerson(new Person("elham", "mohammady", 1360, "mashhad", "LOCOMOTIVES", "female", 3.0, "5234223785"));
                city2.addPerson(new Person("mia", "mohammady", 1365, "shiraz", "DRIVER", "female", 1.0, "5234236745"));
                city2.addPerson(new Person("erfan", "eshaghy", 1367, "boushehr", "CREW", "male", 2.0, "5134567860"));
                city2.addPerson(new Person("hesam", "mohammady", 1367, "ahvaz", "PILOT", "male", 4.0, "5138867880"));
                city2.addPerson(new Person("milad", "eshaghy", 1368, "mashhad", "LOCOMOTIVES", "male", 3.0, "5138867899"));
                city2.addPerson(new Person("bita", "eshaghy", 1364, "birjand", "DRIVER", "female", 1.0, "5138867898"));
                city2.addPerson(new Person("mahtab", "ebrahimy", 1359, "tehran", "SAILOR", "female", 4.0, "5138867897"));
                city2.addPerson(new Person("elahe", "reshadi", 1362, "tehran", "CREW", "female", 2.0, "5138867896"));
                city2.addPerson(new Person("mahsa", "ebrahimy", 1363, "mazandaran", "PILOT", "female", 4.0, "5138867895"));
                city2.addPerson(new Person("ramtin", "ebrahimy", 1367, "karaj", "DRIVER", "male", 1.0, "5138867894"));
                city2.addPerson(new Person("armin", "soleymani", 1368, "ghilan", "LOCOMOTIVES", "male", 3.0, "5138867893"));
                city2.addPerson(new Person("mehran", "soleymani", 1360, "sari", "SAILOR", "male", 4.0, "5138867892"));
                city2.addPerson(new Person("motahare", "soleymani", 1361, "ahvaz", "CREW", "female", 2.0, "5138867891"));

                addCity(city2);


                setYEAR(1400);
                setMONTH(1);
                setDAY(1);

            } else {
                FileInputStream cityFin = new FileInputStream("cities.txt");
                ObjectInputStream cityOin = new ObjectInputStream(cityFin);
                while (cityFin.available() > 0) {
                    City c = (City) cityOin.readObject();
                    Country.getCities().add(c);
                    setCityNum(getCityNum() + 1);
                    setPopulation(getPopulation() + c.getPeopleNum());
                    setCountryHoleMoney(getCountryHoleMoney() + c.getHoleMoney());
                }
                cityOin.close();
                cityFin.close();

                FileInputStream dateFin = new FileInputStream("dates.txt");
                DataInputStream dateDin = new DataInputStream(dateFin);
                setYEAR(dateDin.readInt());
                setMONTH(dateDin.readInt());
                setDAY(dateDin.readInt());
                dateDin.close();
                dateFin.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException n) {
            System.out.println(n);
        }
    }

    public static void addCity(City city) throws IOException {
        getCities().add(city);
        setCountryHoleMoney(getCountryHoleMoney() + city.getHoleMoney());
        setCityNum(getCityNum() + 1);
        setPopulation(getPopulation() + city.getPeopleNum());
    }

    public static String[] getCountryOptions() {
        return CountryOptions;
    }

    public static void setCountryOptions(String[] countryOptions) {
        CountryOptions = countryOptions;
    }

    public static int getPopulation() {
        return Population;
    }

    public static void setPopulation(int population) {
        Population = population;
    }

    public static int getCityNum() {
        return cityNum;
    }

    public static void setCityNum(int cityNum) {
        Country.cityNum = cityNum;
    }

    public static double getCountryHoleMoney() {
        return CountryHoleMoney;
    }

    public static void setCountryHoleMoney(double countryHoleMoney) {
        CountryHoleMoney = countryHoleMoney;
    }

    public static ArrayList<City> getCities() {
        return cities;
    }

    public static void setCities(City cities) {
        Country.cities.add(cities);
    }

    public static int getYEAR() {
        return YEAR;
    }

    public static void setYEAR(int YEAR) {
        Country.YEAR = YEAR;
    }

    public static int getMONTH() {
        return MONTH;
    }

    public static void setMONTH(int MONTH) {
        Country.MONTH = MONTH;
    }

    public static int getDAY() {
        return DAY;
    }

    public static void setDAY(int DAY) {
        Country.DAY = DAY;
    }
}

