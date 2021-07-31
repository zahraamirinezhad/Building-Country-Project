package Main.Controller;

import Main.City;
import Main.View.ShowCitiesInformationView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;

public class ShowCitiesInformationController {
    private ShowCitiesInformationView showCitiesInformationView;

    public ShowCitiesInformationController(City city) {
        setShowCitiesInformationView(new ShowCitiesInformationView());

        showCitiesInformationView.getBtn1().setOnAction(event -> {
            if (city.getHotel().size() == 0) {
                JOptionPane.showMessageDialog(null, "NO HOTEL", "ERROR", JOptionPane.WARNING_MESSAGE);
            } else {
                ShowHotelController showHotelController = new ShowHotelController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showHotelController.getShowHotelView()));
                addCityStage.setWidth(750);
                addCityStage.setHeight(440);
                for (int i = 0; i < city.getHotel().size(); i++) {
                    showHotelController.getShowHotelView().getTableView().getItems().add(city.getHotel().get(i));
                }
                addCityStage.show();
            }

        });

        showCitiesInformationView.getBtn2().setOnAction(event -> {
            if (city.getAirport().size() == 0) {
                JOptionPane.showMessageDialog(null, "NO AIRPORT", "ERROR", JOptionPane.WARNING_MESSAGE);
            } else {
                ShowAirportsController showAirportsController = new ShowAirportsController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showAirportsController.getShowAirportsView()));
                addCityStage.setWidth(1200);
                addCityStage.setHeight(500);
                for (int i = 0; i < city.getAirport().size(); i++) {
                    showAirportsController.getShowAirportsView().getTableView().getItems().add(city.getAirport().get(i));
                }
                addCityStage.show();
            }
        });

        showCitiesInformationView.getBtn3().setOnAction(event -> {
            if (city.getShippingPort().size() == 0) {
                JOptionPane.showMessageDialog(null, "NO SHIPPING PORT", "ERROR", JOptionPane.WARNING_MESSAGE);
            } else {
                ShowShipPortController showShipPortController = new ShowShipPortController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showShipPortController.getShowShipPortView()));
                addCityStage.setWidth(1200);
                addCityStage.setHeight(500);
                for (int i = 0; i < city.getShippingPort().size(); i++) {
                    showShipPortController.getShowShipPortView().getTableView().getItems().add(city.getShippingPort().get(i));
                }
                addCityStage.show();
            }
        });

        showCitiesInformationView.getBtn4().setOnAction(event -> {
            if (city.getBusTerminal().size() == 0) {
                JOptionPane.showMessageDialog(null, "NO BUS STATION", "ERROR", JOptionPane.WARNING_MESSAGE);
            } else {
                ShowBusStationController showBusStationController = new ShowBusStationController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showBusStationController.getShowBusStationView()));
                addCityStage.setWidth(1200);
                addCityStage.setHeight(500);
                for (int i = 0; i < city.getBusTerminal().size(); i++) {
                    showBusStationController.getShowBusStationView().getTableView().getItems().add(city.getBusTerminal().get(i));
                }
                addCityStage.show();
            }
        });

        showCitiesInformationView.getBtn5().setOnAction(event -> {
            if (city.getRailwayStation().size() == 0) {
                JOptionPane.showMessageDialog(null, "NO RAILWAY STATION", "ERROR", JOptionPane.WARNING_MESSAGE);
            } else {
                ShowRailwayStationController showRailwayStationController = new ShowRailwayStationController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showRailwayStationController.getShowRailwayStationView()));
                addCityStage.setWidth(1200);
                addCityStage.setHeight(500);
                for (int i = 0; i < city.getRailwayStation().size(); i++) {
                    showRailwayStationController.getShowRailwayStationView().getTableView().getItems().add(city.getRailwayStation().get(i));
                }
                addCityStage.show();
            }
        });

        showCitiesInformationView.getBtn6().setOnAction(event -> {
            if (city.getPerson().size() == 0) {
                JOptionPane.showMessageDialog(null, "NO CITIZEN", "ERROR", JOptionPane.WARNING_MESSAGE);
            } else {
                ShowPeopleController showPeopleController = new ShowPeopleController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showPeopleController.getShowPeopleView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                for (int i = 0; i < city.getPerson().size(); i++) {
                    showPeopleController.getShowPeopleView().getTableView().getItems().add(city.getPerson().get(i));
                }
                addCityStage.show();
            }
        });

        showCitiesInformationView.getBtn7().setOnAction(event -> {
            ShowTravelTypeController showTravelTypeController = new ShowTravelTypeController(city);
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(showTravelTypeController.getShowTravelTypeView()));
            addCityStage.setWidth(400);
            addCityStage.setHeight(200);
            addCityStage.show();
        });

        showCitiesInformationView.getBtn8().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showCitiesInformationView.getScene().getWindow().hide();
            }
        });
    }

    public ShowCitiesInformationView getShowCitiesInformationView() {
        return showCitiesInformationView;
    }

    public void setShowCitiesInformationView(ShowCitiesInformationView showCitiesInformationView) {
        this.showCitiesInformationView = showCitiesInformationView;
    }
}
