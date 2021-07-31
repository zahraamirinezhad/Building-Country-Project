package Main.Controller;

import Main.City;
import Main.View.SelectCityForTravelView;

import javax.swing.*;

public class SelectCityForTravelController {
    private SelectCityForTravelView selectCityForTravelView;
    public SelectCityForTravelController(TravelController travelController){
        setSelectCityForTravelView(new SelectCityForTravelView());
        selectCityForTravelView.getSelected().setOnAction(event -> {
            City DestinationCity = selectCityForTravelView.getTableView().getSelectionModel().getSelectedItem();
            boolean flag = false;
            if(travelController.getOriginCity().getNumAirport() != -1 && DestinationCity.getNumAirport() != -1) {
                travelController.getTravelView().getAIRPORT().setDisable(false);
                flag = true;
            }
            if(travelController.getOriginCity().getNumShipPort() != -1 && DestinationCity.getNumShipPort() != -1) {
                travelController.getTravelView().getSHIP_PORT().setDisable(false);
                flag = true;
            }
            if(travelController.getOriginCity().getNumRailwayStation() != -1 && DestinationCity.getNumRailwayStation() != -1) {
                travelController.getTravelView().getRAILWAY_STATION().setDisable(false);
                flag = true;
            }
            if(travelController.getOriginCity().getNumBusTerminal() != -1 && DestinationCity.getNumBusTerminal() != -1) {
                travelController.getTravelView().getBUS_STATION().setDisable(false);
                flag = true;
            }
            if(flag) {
                travelController.setDestinationCity(DestinationCity);
            }else{
                JOptionPane.showMessageDialog(null,"NO SUITABLE TERMINAL","ERROR",JOptionPane.WARNING_MESSAGE);
            }
            travelController.getTravelView().getSelectDestinationCityBTN().setDisable(true);
            travelController.getTravelView().getSelectOriginTerminalBTN().setDisable(false);
            selectCityForTravelView.getScene().getWindow().hide();
        });

    }

    public SelectCityForTravelView getSelectCityForTravelView() {
        return selectCityForTravelView;
    }

    public void setSelectCityForTravelView(SelectCityForTravelView selectCityForTravelView) {
        this.selectCityForTravelView = selectCityForTravelView;
    }
}
