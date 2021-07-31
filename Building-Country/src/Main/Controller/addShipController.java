package Main.Controller;

import Main.Buildings.ShippingPort;
import Main.Vehicles.Ship;
import Main.Vehicles.WelfareServices;
import Main.View.addShipView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class addShipController {
   private addShipView AddShipView;
   public addShipController(ShippingPort shippingPort){
       setAddShipView(new addShipView());
       AddShipView.getOKBTN().setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               AddShip(shippingPort);
               AddShipView.getScene().getWindow().hide();
           }
       });

       AddShipView.getBattle().setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               AddShipView.getService1().setDisable(true);
               AddShipView.getService2().setDisable(true);
               AddShipView.getService3().setDisable(true);
               AddShipView.getService4().setDisable(true);
               AddShipView.getService5().setDisable(true);
           }
       });

       AddShipView.getCargo().setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               AddShipView.getService1().setDisable(true);
               AddShipView.getService2().setDisable(true);
               AddShipView.getService3().setDisable(true);
               AddShipView.getService4().setDisable(true);
               AddShipView.getService5().setDisable(true);
           }
       });

       AddShipView.getPassenger().setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               AddShipView.getService1().setDisable(false);
               AddShipView.getService2().setDisable(false);
               AddShipView.getService3().setDisable(false);
               AddShipView.getService4().setDisable(false);
               AddShipView.getService5().setDisable(false);
           }
       });
   }

   public void AddShip(ShippingPort shippingPort){
       Ship ship;
       if(AddShipView.getBattle().isSelected()) {
           ship = new Ship(AddShipView.getCapacitySP().getValue(), AddShipView.getIDSP().getValue(), AddShipView.getFactoryNameTF().getText(), AddShipView.getFuelTF().getText(), AddShipView.getLeastDepthSP().getValue(), AddShipView.getLastSpeedSP().getValue(),"BATTLE" ,AddShipView.getWeightSP().getValue());
            shippingPort.setSeaV(ship);
       }
       else if(AddShipView.getCargo().isSelected()){
           ship = new Ship(AddShipView.getCapacitySP().getValue(), AddShipView.getIDSP().getValue(), AddShipView.getFactoryNameTF().getText(), AddShipView.getFuelTF().getText(), AddShipView.getLeastDepthSP().getValue(), AddShipView.getLastSpeedSP().getValue(),"CARGO" ,AddShipView.getWeightSP().getValue());
           shippingPort.setSeaV(ship);
       }
       else if(AddShipView.getPassenger().isSelected()){
           ship = new Ship(AddShipView.getCapacitySP().getValue(), AddShipView.getIDSP().getValue(), AddShipView.getFactoryNameTF().getText(), AddShipView.getFuelTF().getText(), AddShipView.getLeastDepthSP().getValue(), AddShipView.getLastSpeedSP().getValue(),"PASSENGER" ,AddShipView.getWeightSP().getValue());
           if(AddShipView.getService1().isSelected()){
               ship.setServices(WelfareServices.service[0]);
           }
           if(AddShipView.getService2().isSelected()){
               ship.setServices(WelfareServices.service[1]);
           }
           if(AddShipView.getService3().isSelected()){
               ship.setServices(WelfareServices.service[2]);
           }
           if(AddShipView.getService4().isSelected()){
               ship.setServices(WelfareServices.service[3]);
           }
           if(AddShipView.getService5().isSelected()){
               ship.setServices(WelfareServices.service[4]);
           }
           shippingPort.setSeaV(ship);
           shippingPort.setShipNum(shippingPort.getShipNum() + 1);
       }
   }

    public addShipView getAddShipView() {
        return AddShipView;
    }

    public void setAddShipView(addShipView addShipView) {
        AddShipView = addShipView;
    }
}
