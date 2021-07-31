package Main.Controller;

import Main.Buildings.BusTerminal;
import Main.Vehicles.Bus;
import Main.View.addBusView;

public class addBusController {
    private addBusView AddBusView;
    public addBusController(BusTerminal busTerminal){
        setAddBusView(new addBusView());
        AddBusView.getOKBTN().setOnAction(event -> {
            if(AddBusView.getVIP().isSelected()) {
                busTerminal.setBus(new Bus(AddBusView.getCapacitySP().getValue(), AddBusView.getIDSP().getValue(), AddBusView.getFactoryNameTF().getText(), AddBusView.getLastSpeedSP().getValue(), AddBusView.getFuelTF().getText(), "VIP"));
            }
            else {
                busTerminal.setBus(new Bus(AddBusView.getCapacitySP().getValue(), AddBusView.getIDSP().getValue(), AddBusView.getFactoryNameTF().getText(), AddBusView.getLastSpeedSP().getValue(), AddBusView.getFuelTF().getText(), "NON_VIP"));
            }
            AddBusView.getScene().getWindow().hide();
        });
    }

    public addBusView getAddBusView() {
        return AddBusView;
    }

    public void setAddBusView(addBusView addBusView) {
        AddBusView = addBusView;
    }
}
