package Main;

import java.io.Serializable;

public class Person implements Serializable {
    final private String Name;
    final private String LastName;
    final private int Year;
    final private String Place;
    final private String Gender;
    final private String CodeMelli;
    private boolean WorkerOrNot = false;
    private String Job;
    private double Salary;

    public Person(String Name, String LastName, int Year, String Place, String Job, String Gender, double Salary, String CodeMelli) {
        this.Name = Name;
        this.LastName = LastName;
        this.Year = Year;
        this.Place = Place;
        this.setJob(Job);
        this.Gender = Gender;
        this.setSalary(Salary);
        this.CodeMelli = CodeMelli;

    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return LastName;
    }

    public int getYear() {
        return Year;
    }

    public String getPlace() {
        return Place;
    }

    public String getGender() {
        return Gender;
    }

    public String getCodeMelli() {
        return CodeMelli;
    }

    public boolean getWorkerOrNot() {
        return WorkerOrNot;
    }

    public void setWorkerOrNot(boolean workerOrNot) {
        WorkerOrNot = workerOrNot;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
