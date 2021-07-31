package Main.Controller;

import Main.Buildings.ShippingPort;
import Main.Vehicles.Boat;
import Main.View.addBoatView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class addBoatController {
    private addBoatView AddBoatView;
    public addBoatController(ShippingPort shippingPort){
        setAddBoatView(new addBoatView());
        AddBoatView.getOKBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                shippingPort.setSeaV(new Boat(AddBoatView.getCapacitySP().getValue(),AddBoatView.getIDSP().getValue(),AddBoatView.getFactoryNameTF().getText(),AddBoatView.getFuelTF().getText(),AddBoatView.getLeastDepthSP().getValue(),AddBoatView.getLastSpeedSP().getValue(),AddBoatView.getWeightSP().getValue(),AddBoatView.getHullQualityTF().getText()));
                shippingPort.setBoatNum(shippingPort.getBoatNum() + 1);
                AddBoatView.getScene().getWindow().hide();
            }
        });
    }

    public addBoatView getAddBoatView() {
        return AddBoatView;
    }

    public void setAddBoatView(addBoatView addBoatView) {
        AddBoatView = addBoatView;
    }
}
