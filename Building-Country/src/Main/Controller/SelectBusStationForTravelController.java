package Main.Controller;

import Main.Buildings.BusTerminal;
import Main.View.SelectBusStationForTravelView;

import javax.swing.*;

public class SelectBusStationForTravelController {
    private SelectBusStationForTravelView selectBusStationForTravelView;
    public SelectBusStationForTravelController(TravelController travelController,String Command){
        setSelectBusStationForTravelView(new SelectBusStationForTravelView());
        selectBusStationForTravelView.getSelected().setOnAction(event -> {
            BusTerminal busTerminal = selectBusStationForTravelView.getTableView().getSelectionModel().getSelectedItem();
            if(Command.compareToIgnoreCase("DESTINATION") == 0) {
                travelController.setDestinationTerminal(busTerminal);
            }else{
                if(busTerminal.getBus().size() == 0){
                    JOptionPane.showMessageDialog(null,"NO BUS","ERROR",JOptionPane.WARNING_MESSAGE);
                }
                else if(busTerminal.getPeople().size() == 0){
                    JOptionPane.showMessageDialog(null,"NO DRIVER","ERROR",JOptionPane.WARNING_MESSAGE);
                }
                else {
                    travelController.setOriginTerminal(busTerminal);
                }
            }
            selectBusStationForTravelView.getScene().getWindow().hide();
        });

    }

    public SelectBusStationForTravelView getSelectBusStationForTravelView() {
        return selectBusStationForTravelView;
    }

    public void setSelectBusStationForTravelView(SelectBusStationForTravelView selectBusStationForTravelView) {
        this.selectBusStationForTravelView = selectBusStationForTravelView;
    }
}
