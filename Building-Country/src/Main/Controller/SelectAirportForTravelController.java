package Main.Controller;

import Main.Buildings.Airport;
import Main.View.SelectAirportForTravelView;

import javax.swing.*;

public class SelectAirportForTravelController {
    private SelectAirportForTravelView selectAirportForTravelView;

    public SelectAirportForTravelController(TravelController travelController, String Command) {
        setSelectAirportForTravelView(new SelectAirportForTravelView());
        selectAirportForTravelView.getSelected().setOnAction(event -> {
            Airport airport = selectAirportForTravelView.getTableView().getSelectionModel().getSelectedItem();
            if (Command.compareToIgnoreCase("DESTINATION") == 0) {
                travelController.setDestinationTerminal(airport);
            } else {
                if (airport.getPassengerPlanesNum() == 0) {
                    JOptionPane.showMessageDialog(null, "NO PASSENGER PLANE", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else if (airport.getPilotsNum() == 0) {
                    JOptionPane.showMessageDialog(null, "NO PILOT", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    travelController.setOriginTerminal(airport);
                }
            }
            selectAirportForTravelView.getScene().getWindow().hide();
        });

    }

    public SelectAirportForTravelView getSelectAirportForTravelView() {
        return selectAirportForTravelView;
    }

    public void setSelectAirportForTravelView(SelectAirportForTravelView selectAirportForTravelView) {
        this.selectAirportForTravelView = selectAirportForTravelView;
    }
}
