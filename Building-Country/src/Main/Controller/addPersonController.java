package Main.Controller;

import Main.City;
import Main.Person;
import Main.View.addPersonView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class addPersonController {
    private addPersonView AddPersonView;
    private  City city;
    public addPersonController(City city){
        setAddPersonView(new addPersonView());
        this.city = city;
        AddPersonView.getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                  AddPerson();
                 AddPersonView.getScene().getWindow().hide();
            }
        });
    }

    public void AddPerson(){
        String Name = AddPersonView.getNameTF().getText();
        String LastName = AddPersonView.getLastNameTF().getText();
        int Year = AddPersonView.getYearSP().getValue();
        String Place = AddPersonView.getPlaceTF().getText();
        String Gender;
        if(AddPersonView.getFemale().isSelected()) {
            Gender = "FEMALE";
        }
        else {
            Gender = "MALE";
        }
        String CodeMelli = AddPersonView.getCodemelliTF().getText();
        String Job;
        double Salary;
        if(AddPersonView.getSailor().isSelected()){
            Job = "SAILOR";
            Salary = 4.0;
        }
        else if(AddPersonView.getLocomotives().isSelected()){
            Job = "LOCOMOTIVES";
            Salary = 3.0;
        }
        else if(AddPersonView.getDriver().isSelected()){
            Job = "DRIVER";
            Salary = 1.0;
        }
        else if(AddPersonView.getCrew().isSelected()){
            Job = "CREW";
            Salary = 2.0;
        }
        else {
            Job = "PILOT";
            Salary = 4.0;
        }

        getCity().setPerson(new Person(Name, LastName, Year, Place, Job, Gender, Salary, CodeMelli));
        getCity().setPeopleNum(getCity().getPeopleNum() + 1);
    }

    public addPersonView getAddPersonView() {
        return AddPersonView;
    }

    public void setAddPersonView(addPersonView addPersonView) {
        AddPersonView = addPersonView;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
