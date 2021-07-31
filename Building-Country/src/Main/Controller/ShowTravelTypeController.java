package Main.Controller;

import Main.City;
import Main.View.ShowTravelTypeView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;

public class ShowTravelTypeController {
    private ShowTravelTypeView showTravelTypeView;
    public ShowTravelTypeController(City city){
        setShowTravelTypeView(new ShowTravelTypeView());

        showTravelTypeView.getTRAVELS_BY_AIRPLANE().setOnAction(event -> {
            if (city.getNumAirport() == -1) {
                JOptionPane.showMessageDialog(null, "NO AIRPORT", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                ShowAirportForShowingTravelController showAirportForShowingTravelController = new ShowAirportForShowingTravelController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showAirportForShowingTravelController.getShowAirportForShowingTravelView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                for (int i = 0; i < city.getNumAirport()+1; i++) {
                    showAirportForShowingTravelController.getShowAirportForShowingTravelView().getTableView().getItems().add(city.getAirport().get(i));
                }
                addCityStage.show();
            }
        });

        showTravelTypeView.getTRAVELS_BY_SHIP().setOnAction(event -> {
            if (city.getNumShipPort() == -1) {
                JOptionPane.showMessageDialog(null, "NO SHIPPING PORT", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                ShowShipPortForShowingTravelController showShipPortForShowingTravelController = new ShowShipPortForShowingTravelController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showShipPortForShowingTravelController.getShowShipPortForShowingTravelView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                for (int i = 0; i < city.getNumShipPort()+1; i++) {
                    showShipPortForShowingTravelController.getShowShipPortForShowingTravelView().getTableView().getItems().add(city.getShippingPort().get(i));
                }
                addCityStage.show();
            }
        });

        showTravelTypeView.getTRAVELS_BY_BUS().setOnAction(event -> {
            if (city.getNumBusTerminal() == -1) {
                JOptionPane.showMessageDialog(null, "NO BUS STATION", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                ShowBusStationForShowingTravelController showBusStationForShowingTravelController = new ShowBusStationForShowingTravelController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showBusStationForShowingTravelController.getShowBusStationForShowingTravelView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                for (int i = 0; i < city.getNumBusTerminal()+1; i++) {
                    showBusStationForShowingTravelController.getShowBusStationForShowingTravelView().getTableView().getItems().add(city.getBusTerminal().get(i));
                }
                addCityStage.show();
            }
        });

        showTravelTypeView.getTRAVELS_BY_TRAIN().setOnAction(event -> {
            if (city.getNumRailwayStation() == -1) {
                JOptionPane.showMessageDialog(null, "NO RAILWAY STATION", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                ShowRailwayStationForShowingTravelController showRailwayStationForShowingTravelController = new ShowRailwayStationForShowingTravelController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showRailwayStationForShowingTravelController.getShowRailwayStationForShowingTravelView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                for (int i = 0; i < city.getNumRailwayStation()+1; i++) {
                    showRailwayStationForShowingTravelController.getShowRailwayStationForShowingTravelView().getTableView().getItems().add(city.getRailwayStation().get(i));
                }
                addCityStage.show();
            }
        });

        showTravelTypeView.getExit().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showTravelTypeView.getScene().getWindow().hide();
            }
        });
    }

    public ShowTravelTypeView getShowTravelTypeView() {
        return showTravelTypeView;
    }

    public void setShowTravelTypeView(ShowTravelTypeView showTravelTypeView) {
        this.showTravelTypeView = showTravelTypeView;
    }
}
