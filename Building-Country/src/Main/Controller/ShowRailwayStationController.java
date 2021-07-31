package Main.Controller;

import Main.Buildings.BusTerminal;
import Main.Buildings.RailwayStation;
import Main.View.ShowRailwayStationView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;

public class ShowRailwayStationController {
    private ShowRailwayStationView showRailwayStationView;
    public ShowRailwayStationController(){
        setShowRailwayStationView(new ShowRailwayStationView());

        showRailwayStationView.getShowTrainBTN().setOnAction(event -> {
            RailwayStation railwayStation = showRailwayStationView.getTableView().getSelectionModel().getSelectedItem();
            if(railwayStation.getTrains().size() == 0){
                JOptionPane.showMessageDialog(null,"NO TRAIN","ERROR",JOptionPane.WARNING_MESSAGE);
                showRailwayStationView.getScene().getWindow().hide();
            }
            else {
                ShowTrainsController showTrainsController = new ShowTrainsController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showTrainsController.getShowTrainsView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                for (int i = 0; i < railwayStation.getTrains().size(); i++) {
                    showTrainsController.getShowTrainsView().getTableView().getItems().add(railwayStation.getTrains().get(i));
                }
                addCityStage.show();
            }
        });

        showRailwayStationView.getShowLocomotivesBTN().setOnAction(event -> {
            RailwayStation railwayStation = showRailwayStationView.getTableView().getSelectionModel().getSelectedItem();
            if(railwayStation.getPeople().size() == 0){
                JOptionPane.showMessageDialog(null,"NO LOCOMOTIVES","ERROR",JOptionPane.WARNING_MESSAGE);
                showRailwayStationView.getScene().getWindow().hide();
            }
            else {
                ShowPeopleController showPeopleController = new ShowPeopleController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showPeopleController.getShowPeopleView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                for (int i = 0; i < railwayStation.getPeople().size(); i++) {
                    showPeopleController.getShowPeopleView().getTableView().getItems().add(railwayStation.getPeople().get(i));
                }
                addCityStage.show();
            }
        });

        showRailwayStationView.getShowTripsBTN().setOnAction(event -> {
            RailwayStation railwayStation = showRailwayStationView.getTableView().getSelectionModel().getSelectedItem();
            ShowTripTypeController showTripTypeController = new ShowTripTypeController(railwayStation);
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(showTripTypeController.getShowTripTypeView()));
            addCityStage.setWidth(400);
            addCityStage.setHeight(200);
            addCityStage.show();
        });

        showRailwayStationView.getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showRailwayStationView.getScene().getWindow().hide();
            }
        });
    }

    public ShowRailwayStationView getShowRailwayStationView() {
        return showRailwayStationView;
    }

    public void setShowRailwayStationView(ShowRailwayStationView showRailwayStationView) {
        this.showRailwayStationView = showRailwayStationView;
    }
}
