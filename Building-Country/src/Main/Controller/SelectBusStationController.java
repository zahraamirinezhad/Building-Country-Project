package Main.Controller;

import Main.Buildings.BusTerminal;
import Main.City;
import Main.Country;
import Main.View.SelectBusStationView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SelectBusStationController {
   private SelectBusStationView selectBusStationView;
   public SelectBusStationController(String type){
       setSelectBusStationView(new SelectBusStationView());
       selectBusStationView.getSelected().setOnAction(event -> {
           BusTerminal busTerminal = selectBusStationView.getTableView().getSelectionModel().getSelectedItem();
           if(type.compareToIgnoreCase("BUS") == 0) {
               addBusController AddBusController = new addBusController(busTerminal);
               Stage addCityStage = new Stage();
               addCityStage.setScene(new Scene(AddBusController.getAddBusView()));
               addCityStage.setWidth(650);
               addCityStage.setHeight(650);
               addCityStage.show();
           }else{
               AddCrewController addCrewController = new AddCrewController(busTerminal);
               Stage addCityStage = new Stage();
               addCityStage.setScene(new Scene(addCrewController.getAddCrewView()));
               addCityStage.setWidth(850);
               addCityStage.setHeight(460);
               City city = null;
               for(int i = 0; i< Country.getCities().size(); i++){
                   if(Country.getCities().get(i).getCityName().compareToIgnoreCase(busTerminal.getCityName()) == 0){
                       city = Country.getCities().get(i);
                   }
               }
               for(int i=0;i<city.getPerson().size();i++){
                   if(city.getPerson().get(i).getJob().compareToIgnoreCase("DRIVER") == 0 && !city.getPerson().get(i).getWorkerOrNot()){
                       addCrewController.getAddCrewView().getTableView().getItems().add(city.getPerson().get(i));
                   }
               }
               addCityStage.show();
           }
           selectBusStationView.getScene().getWindow().hide();
       });
   }

    public SelectBusStationView getSelectBusStationView() {
        return selectBusStationView;
    }

    public void setSelectBusStationView(SelectBusStationView selectBusStationView) {
        this.selectBusStationView = selectBusStationView;
    }
}
