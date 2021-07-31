package Main.Controller;

import Main.Buildings.ShippingPort;
import Main.City;
import Main.Country;
import Main.View.SelectShipPortView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SelectShipPortController {
    private SelectShipPortView selectShipPortView;
    public SelectShipPortController(String type){
        setSelectShipPortView(new SelectShipPortView());
        selectShipPortView.getSelected().setOnAction(event -> {
            ShippingPort shippingPort = selectShipPortView.getTableView().getSelectionModel().getSelectedItem();
            if(type.equals("SHIP")) {
                addShipController AddShipController = new addShipController(shippingPort);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(AddShipController.getAddShipView()));
                addCityStage.setWidth(650);
                addCityStage.setHeight(650);
                addCityStage.show();
            }
            else if(type.equals("BOAT")){
                addBoatController AddBoatController = new addBoatController(shippingPort);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(AddBoatController.getAddBoatView()));
                addCityStage.setWidth(650);
                addCityStage.setHeight(650);
                addCityStage.show();
            }
            else{
                City city = null;
                for(int i = 0; i< Country.getCities().size(); i++){
                    if(Country.getCities().get(i).getCityName().compareToIgnoreCase(shippingPort.getCityName()) == 0){
                        city = Country.getCities().get(i);
                    }
                }
                AddCrewController addCrewController = new AddCrewController(shippingPort);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(addCrewController.getAddCrewView()));
                addCityStage.setWidth(850);
                addCityStage.setHeight(460);
                for (int i = 0; i < city.getPerson().size(); i++) {
                    if (city.getPerson().get(i).getJob().compareToIgnoreCase("SAILOR") == 0 && !city.getPerson().get(i).getWorkerOrNot()) {
                        addCrewController.getAddCrewView().getTableView().getItems().add(city.getPerson().get(i));
                    }
                }
            }

            selectShipPortView.getScene().getWindow().hide();
        });
    }

    public SelectShipPortView getSelectShipPortView() {
        return selectShipPortView;
    }

    public void setSelectShipPortView(SelectShipPortView selectShipPortView) {
        this.selectShipPortView = selectShipPortView;
    }
}
