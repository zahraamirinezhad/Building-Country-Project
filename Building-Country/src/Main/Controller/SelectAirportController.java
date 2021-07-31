package Main.Controller;

import Main.Buildings.Airport;
import Main.City;
import Main.Country;
import Main.View.SelectAirportView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SelectAirportController {
    private SelectAirportView selectAirportView;
    public SelectAirportController(String type){
        setSelectAirportView(new SelectAirportView());
        selectAirportView.getSelected().setOnAction(event -> {
            Airport airport = selectAirportView.getTableView().getSelectionModel().getSelectedItem();
            if(type.equals("PASSENGER PLANE")) {
                addPassengerPlaneController AddPassengerPlaneController = new addPassengerPlaneController(airport);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(AddPassengerPlaneController.getAddPassengerPlaneView()));
                addCityStage.setWidth(650);
                addCityStage.setHeight(650);
                addCityStage.show();
            }
            else if(type.equals("CARGO PLANE")){
                addCargoPlaneController AddCargoPlaneController = new addCargoPlaneController(airport);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(AddCargoPlaneController.getAddCargoPlaneView()));
                addCityStage.setWidth(650);
                addCityStage.setHeight(650);
                addCityStage.show();
            }
            else if(type.equals("PILOT")){
                AddCrewController addCrewController = new AddCrewController(airport);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(addCrewController.getAddCrewView()));
                addCityStage.setWidth(850);
                addCityStage.setHeight(460);
                City city = null;
                for(int i=0;i< Country.getCities().size();i++){
                    if(Country.getCities().get(i).getCityName().compareToIgnoreCase(airport.getCityName()) == 0){
                        city = Country.getCities().get(i);
                    }
                }
                for (int i = 0; i < city.getPerson().size(); i++) {
                    if (city.getPerson().get(i).getJob().compareToIgnoreCase("PILOT") == 0 && !city.getPerson().get(i).getWorkerOrNot()) {
                        addCrewController.getAddCrewView().getTableView().getItems().add(city.getPerson().get(i));
                    }
                }
                addCityStage.show();
            }
            else{
                AddCrewController addCrewController = new AddCrewController(airport);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(addCrewController.getAddCrewView()));
                addCityStage.setWidth(850);
                addCityStage.setHeight(460);
                City city = null;
                for(int i=0;i< Country.getCities().size();i++){
                    if(Country.getCities().get(i).getCityName().compareToIgnoreCase(airport.getCityName()) == 0){
                        city = Country.getCities().get(i);
                    }
                }
                for(int i=0;i<city.getPerson().size();i++){
                    if(city.getPerson().get(i).getJob().compareToIgnoreCase("CREW") == 0 && !city.getPerson().get(i).getWorkerOrNot()){
                        addCrewController.getAddCrewView().getTableView().getItems().add(city.getPerson().get(i));
                    }
                }
                addCityStage.show();
            }
            selectAirportView.getScene().getWindow().hide();
        });
    }

    public SelectAirportView getSelectAirportView() {
        return selectAirportView;
    }

    public void setSelectAirportView(SelectAirportView selectAirportView) {
        this.selectAirportView = selectAirportView;
    }
}
