package Main.Controller;

import Main.Buildings.ShippingPort;
import Main.View.SelectShipPortForTravelView;

import javax.swing.*;

public class SelectShipPortForTravelController {
    private SelectShipPortForTravelView selectShipPortForTravelView;
    public SelectShipPortForTravelController(TravelController travelController,String Command){
        setSelectShipPortForTravelView(new SelectShipPortForTravelView());
        selectShipPortForTravelView.getSelected().setOnAction(event -> {
            ShippingPort shippingPort = selectShipPortForTravelView.getTableView().getSelectionModel().getSelectedItem();
            if(Command.compareToIgnoreCase("DESTINATION") == 0) {
                travelController.setDestinationTerminal(shippingPort);
            }else{
                if(shippingPort.getShipNum() == 0){
                    JOptionPane.showMessageDialog(null,"NO SHIP","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                else if(shippingPort.getPeople().size() == 0){
                    JOptionPane.showMessageDialog(null,"NO SAILOR","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                else {
                    travelController.setOriginTerminal(shippingPort);
                }
            }
            selectShipPortForTravelView.getScene().getWindow().hide();
        });

    }

    public SelectShipPortForTravelView getSelectShipPortForTravelView() {
        return selectShipPortForTravelView;
    }

    public void setSelectShipPortForTravelView(SelectShipPortForTravelView selectShipPortForTravelView) {
        this.selectShipPortForTravelView = selectShipPortForTravelView;
    }
}
