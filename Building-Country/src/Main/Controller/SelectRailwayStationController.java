package Main.Controller;

import Main.Buildings.RailwayStation;
import Main.City;
import Main.Country;
import Main.View.SelectRailwayStationView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SelectRailwayStationController {
    private SelectRailwayStationView selectRailwayStationView;
    public SelectRailwayStationController(String type){
        setSelectRailwayStationView(new SelectRailwayStationView());
        selectRailwayStationView.getSelected().setOnAction(event -> {
            RailwayStation railwayStation = selectRailwayStationView.getTableView().getSelectionModel().getSelectedItem();
            if(type.compareToIgnoreCase("TRAIN") == 0) {
                addTrainController AddTrainController = new addTrainController(railwayStation);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(AddTrainController.getAddTrainView()));
                addCityStage.setWidth(650);
                addCityStage.setHeight(650);
                addCityStage.show();
            }else{
                City city = null;
                for(int i = 0; i< Country.getCities().size(); i++){
                    if(Country.getCities().get(i).getCityName().compareToIgnoreCase(railwayStation.getCityName()) == 0){
                        city = Country.getCities().get(i);
                    }
                }
                AddCrewController addCrewController = new AddCrewController(railwayStation);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(addCrewController.getAddCrewView()));
                addCityStage.setWidth(850);
                addCityStage.setHeight(460);
                for(int i=0;i<city.getPerson().size();i++){
                    if(city.getPerson().get(i).getJob().compareToIgnoreCase("LOCOMOTIVES") == 0 && !city.getPerson().get(i).getWorkerOrNot()){
                        addCrewController.getAddCrewView().getTableView().getItems().add(city.getPerson().get(i));
                    }
                }
            }
            selectRailwayStationView.getScene().getWindow().hide();
        });
    }

    public SelectRailwayStationView getSelectRailwayStationView() {
        return selectRailwayStationView;
    }

    public void setSelectRailwayStationView(SelectRailwayStationView selectRailwayStationView) {
        this.selectRailwayStationView = selectRailwayStationView;
    }
}
