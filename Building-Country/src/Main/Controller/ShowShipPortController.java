package Main.Controller;

import Main.Buildings.Airport;
import Main.Buildings.RailwayStation;
import Main.Buildings.ShippingPort;
import Main.Vehicles.Boat;
import Main.Vehicles.Ship;
import Main.View.ShowShipPortView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class ShowShipPortController {
    private ShowShipPortView showShipPortView;
    public ShowShipPortController(){
        setShowShipPortView(new ShowShipPortView());

        showShipPortView.getShowShipBTN().setOnAction(event -> {
            ShippingPort shippingPort = showShipPortView.getTableView().getSelectionModel().getSelectedItem();
            if(shippingPort.getShipNum() == 0){
                JOptionPane.showMessageDialog(null,"NO SHIP","ERROR",JOptionPane.WARNING_MESSAGE);
                showShipPortView.getScene().getWindow().hide();
            }
            else {
                ShowShipController showShipController = new ShowShipController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showShipController.getShowShipView()));
                addCityStage.setWidth(920);
                addCityStage.setHeight(400);
                for (int i = 0; i < shippingPort.getSeaV().size(); i++) {
                    if(shippingPort.getSeaV().get(i) instanceof Ship) {
                        Ship ship = (Ship) shippingPort.getSeaV().get(i);
                        showShipController.getShowShipView().getTableView().getItems().add(ship);
                    }
                }
                addCityStage.show();
            }
        });

        showShipPortView.getShowBoatBTN().setOnAction(event -> {
            ShippingPort shippingPort = showShipPortView.getTableView().getSelectionModel().getSelectedItem();
            if(shippingPort.getBoatNum() == 0){
                JOptionPane.showMessageDialog(null,"NO BOAT","ERROR",JOptionPane.WARNING_MESSAGE);
                showShipPortView.getScene().getWindow().hide();
            }
            else {
                ShowBoatController showBoatController = new ShowBoatController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showBoatController.getShowBoatView()));
                addCityStage.setWidth(920);
                addCityStage.setHeight(400);
                for (int i = 0; i < shippingPort.getSeaV().size(); i++) {
                    if(shippingPort.getSeaV().get(i) instanceof Boat) {
                        Boat boat = (Boat) shippingPort.getSeaV().get(i);
                        showBoatController.getShowBoatView().getTableView().getItems().add(boat);
                    }
                }
                addCityStage.show();
            }
        });

        showShipPortView.getShowSailorBTN().setOnAction(event -> {
            ShippingPort shippingPort = showShipPortView.getTableView().getSelectionModel().getSelectedItem();
            if(shippingPort.getPeople().size() == 0){
                JOptionPane.showMessageDialog(null,"NO SAILOR","ERROR",JOptionPane.WARNING_MESSAGE);
                showShipPortView.getScene().getWindow().hide();
            }
            else {
                ShowPeopleController showPeopleController = new ShowPeopleController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showPeopleController.getShowPeopleView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                for (int i = 0; i < shippingPort.getPeople().size(); i++) {
                    showPeopleController.getShowPeopleView().getTableView().getItems().add(shippingPort.getPeople().get(i));
                }
                addCityStage.show();
            }

        });

        showShipPortView.getShowTripsBTN().setOnAction(event -> {
            ShippingPort shippingPort = showShipPortView.getTableView().getSelectionModel().getSelectedItem();
            ShowTripTypeController showTripTypeController = new ShowTripTypeController(shippingPort);
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(showTripTypeController.getShowTripTypeView()));
            addCityStage.setWidth(400);
            addCityStage.setHeight(200);
            addCityStage.show();
        });

        showShipPortView.getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showShipPortView.getScene().getWindow().hide();
            }
        });
    }

    public ShowShipPortView getShowShipPortView() {
        return showShipPortView;
    }

    public void setShowShipPortView(ShowShipPortView showShipPortView) {
        this.showShipPortView = showShipPortView;
    }
}
