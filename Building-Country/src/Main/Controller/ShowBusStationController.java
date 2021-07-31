package Main.Controller;

import Main.Buildings.Airport;
import Main.Buildings.BusTerminal;
import Main.Buildings.RailwayStation;
import Main.View.ShowBusStationView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class ShowBusStationController {
    private ShowBusStationView showBusStationView;
    public ShowBusStationController(){
        setShowBusStationView(new ShowBusStationView());

        showBusStationView.getShowDriverBTN().setOnAction(event -> {
            BusTerminal busTerminal = showBusStationView.getTableView().getSelectionModel().getSelectedItem();
            if(busTerminal.getPeople().size() == 0){
                JOptionPane.showMessageDialog(null,"NO DRIVER","ERROR",JOptionPane.WARNING_MESSAGE);
                showBusStationView.getScene().getWindow().hide();
            }
            else {
                ShowPeopleController showPeopleController = new ShowPeopleController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showPeopleController.getShowPeopleView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                for (int i = 0; i < busTerminal.getPeople().size(); i++) {
                    showPeopleController.getShowPeopleView().getTableView().getItems().add(busTerminal.getPeople().get(i));
                }
                addCityStage.show();
            }
        });

        showBusStationView.getShowBusBTN().setOnAction(event -> {
            BusTerminal busTerminal = showBusStationView.getTableView().getSelectionModel().getSelectedItem();
            if(busTerminal.getBus().size() == 0){
                JOptionPane.showMessageDialog(null,"NO BUS","ERROR",JOptionPane.WARNING_MESSAGE);
                showBusStationView.getScene().getWindow().hide();
            }
            else {
                ShowBusController showBusController = new ShowBusController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showBusController.getShowBusView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                for (int i = 0; i < busTerminal.getBus().size(); i++) {
                    showBusController.getShowBusView().getTableView().getItems().add(busTerminal.getBus().get(i));
                }
                addCityStage.show();
            }
        });

        showBusStationView.getShowTripsBTN().setOnAction(event -> {
            BusTerminal busTerminal = showBusStationView.getTableView().getSelectionModel().getSelectedItem();
            ShowTripTypeController showTripTypeController = new ShowTripTypeController(busTerminal);
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(showTripTypeController.getShowTripTypeView()));
            addCityStage.setWidth(400);
            addCityStage.setHeight(200);
            addCityStage.show();
        });

        showBusStationView.getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showBusStationView.getScene().getWindow().hide();
            }
        });
    }

    public ShowBusStationView getShowBusStationView() {
        return showBusStationView;
    }

    public void setShowBusStationView(ShowBusStationView showBusStationView) {
        this.showBusStationView = showBusStationView;
    }
}
