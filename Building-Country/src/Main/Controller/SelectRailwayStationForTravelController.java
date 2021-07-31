package Main.Controller;

import Main.Buildings.RailwayStation;
import Main.View.SelectRailwayStationForTravelView;

import javax.swing.*;

public class SelectRailwayStationForTravelController {
    private SelectRailwayStationForTravelView selectRailwayStationForTravelView;
    public SelectRailwayStationForTravelController(TravelController travelController,String Command){
        setSelectRailwayStationForTravelView(new SelectRailwayStationForTravelView());
        selectRailwayStationForTravelView.getSelected().setOnAction(event -> {
            RailwayStation railwayStation = selectRailwayStationForTravelView.getTableView().getSelectionModel().getSelectedItem();
            if(Command.compareToIgnoreCase("DESTINATION") == 0) {
                travelController.setDestinationTerminal(railwayStation);
            }else{
                if(railwayStation.getTrains().size() == 0){
                    JOptionPane.showMessageDialog(null,"NO TRAIN","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                else if(railwayStation.getPeople().size() == 0){
                    JOptionPane.showMessageDialog(null,"NO LOCOMOTIVE","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                else {
                    travelController.setOriginTerminal(railwayStation);
                }
            }
            selectRailwayStationForTravelView.getScene().getWindow().hide();
        });

    }

    public SelectRailwayStationForTravelView getSelectRailwayStationForTravelView() {
        return selectRailwayStationForTravelView;
    }

    public void setSelectRailwayStationForTravelView(SelectRailwayStationForTravelView selectRailwayStationForTravelView) {
        this.selectRailwayStationForTravelView = selectRailwayStationForTravelView;
    }
}
