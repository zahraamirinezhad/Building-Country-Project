package Main.Controller;

import Main.Buildings.Airport;
import Main.Buildings.BusTerminal;
import Main.Buildings.RailwayStation;
import Main.Buildings.ShippingPort;
import Main.Person;
import Main.View.AddCrewView;

public class AddCrewController {
    private AddCrewView addCrewView;

   public AddCrewController(Object obj){
       addCrewView = new AddCrewView();
       addCrewView.getEmployedBTN().setOnAction(event -> {
           if(obj instanceof Airport) {
                   Airport airport = (Airport) obj;
                   Person person = addCrewView.getTableView().getSelectionModel().getSelectedItem();
                   person.setWorkerOrNot(true);
                   airport.setPeople(person);
                   if(person.getJob().compareToIgnoreCase("PILOT") == 0){
                       airport.setPilotsNum(airport.getPilotsNum()+1);
                   }
                   else if(person.getJob().compareToIgnoreCase("CREW") == 0){
                       airport.setCrewsNum(airport.getCrewsNum()+1);
                   }
           }
           if(obj instanceof RailwayStation) {
                   RailwayStation railwayStation = (RailwayStation) obj;
                   Person person = addCrewView.getTableView().getSelectionModel().getSelectedItem();
                   person.setWorkerOrNot(true);
                   railwayStation.setPeople(person);
           }
           if(obj instanceof ShippingPort) {

                   ShippingPort shippingPort = (ShippingPort) obj;
                   Person person = addCrewView.getTableView().getSelectionModel().getSelectedItem();
                   person.setWorkerOrNot(true);
                   shippingPort.setPeople(person);
           }
           if(obj instanceof BusTerminal) {
                   BusTerminal busTerminal = (BusTerminal) obj;
                   Person person = addCrewView.getTableView().getSelectionModel().getSelectedItem();
                   person.setWorkerOrNot(true);
                   busTerminal.setPeople(person);
           }
           addCrewView.getScene().getWindow().hide();
       });
   }

    public AddCrewView getAddCrewView() {
        return addCrewView;
    }

    public void setAddCrewView(AddCrewView addCrewView) {
        this.addCrewView = addCrewView;
    }
}
