package Main.Controller;

import Main.Buildings.*;
import Main.Trip.Trip;
import Main.Vehicles.Bus;
import Main.Vehicles.PassengerPlane;
import Main.Vehicles.Ship;
import Main.Vehicles.Train;
import Main.View.ShowTripView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ShowTripController {
    private ShowTripView showTripView;
    public ShowTripController(){
        setShowTripView(new ShowTripView());
        showTripView.getShowOriginTerminalBTN().setOnAction(event -> {
            Trip trip = showTripView.getTableView().getSelectionModel().getSelectedItem();
            Terminal terminal = trip.getOrigin();
            if(terminal instanceof Airport){
                Airport airport = (Airport) terminal;
                ShowAirportsController showAirportsController = new ShowAirportsController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showAirportsController.getShowAirportsView()));
                addCityStage.setWidth(1200);
                addCityStage.setHeight(500);
                showAirportsController.getShowAirportsView().getTableView().getItems().add(airport);
                addCityStage.show();
            }
            else if(terminal instanceof RailwayStation){
                RailwayStation railwayStation = (RailwayStation) terminal;
                ShowRailwayStationController showRailwayStationController = new ShowRailwayStationController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showRailwayStationController.getShowRailwayStationView()));
                addCityStage.setWidth(1200);
                addCityStage.setHeight(500);
                showRailwayStationController.getShowRailwayStationView().getTableView().getItems().add(railwayStation);
                addCityStage.show();
            }
            else if(terminal instanceof ShippingPort){
                ShippingPort shippingPort = (ShippingPort) terminal;
                ShowShipPortController showShipPortController = new ShowShipPortController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showShipPortController.getShowShipPortView()));
                addCityStage.setWidth(1200);
                addCityStage.setHeight(500);
                showShipPortController.getShowShipPortView().getTableView().getItems().add(shippingPort);
                addCityStage.show();
            }
            else if(terminal instanceof BusTerminal){
                BusTerminal busTerminal = (BusTerminal) terminal;
                ShowBusStationController showBusStationController = new ShowBusStationController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showBusStationController.getShowBusStationView()));
                addCityStage.setWidth(1200);
                addCityStage.setHeight(500);
                showBusStationController.getShowBusStationView().getTableView().getItems().add(busTerminal);
                addCityStage.show();
            }
        });

        showTripView.getShowDestinationTerminalBTN().setOnAction(event -> {
            Trip trip = showTripView.getTableView().getSelectionModel().getSelectedItem();
            Terminal terminal = trip.getDestination();
            if(terminal instanceof Airport){
                Airport airport = (Airport) terminal;
                ShowAirportsController showAirportsController = new ShowAirportsController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showAirportsController.getShowAirportsView()));
                addCityStage.setWidth(1200);
                addCityStage.setHeight(500);
                showAirportsController.getShowAirportsView().getTableView().getItems().add(airport);
                addCityStage.show();
            }
            else if(terminal instanceof RailwayStation){
                RailwayStation railwayStation = (RailwayStation) terminal;
                ShowRailwayStationController showRailwayStationController = new ShowRailwayStationController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showRailwayStationController.getShowRailwayStationView()));
                addCityStage.setWidth(1200);
                addCityStage.setHeight(500);
                showRailwayStationController.getShowRailwayStationView().getTableView().getItems().add(railwayStation);
                addCityStage.show();
            }
            else if(terminal instanceof ShippingPort){
                ShippingPort shippingPort = (ShippingPort) terminal;
                ShowShipPortController showShipPortController = new ShowShipPortController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showShipPortController.getShowShipPortView()));
                addCityStage.setWidth(1200);
                addCityStage.setHeight(500);
                showShipPortController.getShowShipPortView().getTableView().getItems().add(shippingPort);
                addCityStage.show();
            }
            else if(terminal instanceof BusTerminal){
                BusTerminal busTerminal = (BusTerminal) terminal;
                ShowBusStationController showBusStationController = new ShowBusStationController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showBusStationController.getShowBusStationView()));
                addCityStage.setWidth(1200);
                addCityStage.setHeight(500);
                showBusStationController.getShowBusStationView().getTableView().getItems().add(busTerminal);
                addCityStage.show();
            }
        });

        showTripView.getShowPassengersBTN().setOnAction(event -> {
            Trip trip = showTripView.getTableView().getSelectionModel().getSelectedItem();
            ShowPeopleController showPeopleController = new ShowPeopleController();
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(showPeopleController.getShowPeopleView()));
            addCityStage.setWidth(900);
            addCityStage.setHeight(400);
            for(int i=0;i<trip.getPassengers().size();i++){
                showPeopleController.getShowPeopleView().getTableView().getItems().add(trip.getPassengers().get(i));
            }
            addCityStage.show();
        });

        showTripView.getShowDriverBTN().setOnAction(event -> {
            Trip trip = showTripView.getTableView().getSelectionModel().getSelectedItem();
            ShowPeopleController showPeopleController = new ShowPeopleController();
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(showPeopleController.getShowPeopleView()));
            addCityStage.setWidth(900);
            addCityStage.setHeight(400);
            showPeopleController.getShowPeopleView().getTableView().getItems().add(trip.getDriver());
            addCityStage.show();
        });

        showTripView.getShowVehicleBTN().setOnAction(event -> {
            Trip trip = showTripView.getTableView().getSelectionModel().getSelectedItem();
            Terminal terminal = trip.getOrigin();
            if(terminal instanceof Airport){
                PassengerPlane passengerPlane = (PassengerPlane) trip.getVehicle();
                ShowPassengerPlanesController showPassengerPlanesController = new ShowPassengerPlanesController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showPassengerPlanesController.getShowPassengerPlanesView()));
                addCityStage.setWidth(1000);
                addCityStage.setHeight(400);
                showPassengerPlanesController.getShowPassengerPlanesView().getTableView().getItems().add(passengerPlane);
                addCityStage.show();
            }
            else if(terminal instanceof RailwayStation){
                Train train = (Train) trip.getVehicle();
                ShowTrainsController showTrainsController = new ShowTrainsController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showTrainsController.getShowTrainsView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                showTrainsController.getShowTrainsView().getTableView().getItems().add(train);
                addCityStage.show();
            }
            else if(terminal instanceof ShippingPort){
                Ship ship = (Ship) trip.getVehicle();
                ShowShipController showShipController = new ShowShipController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showShipController.getShowShipView()));
                addCityStage.setWidth(920);
                addCityStage.setHeight(400);
                showShipController.getShowShipView().getTableView().getItems().add(ship);
                addCityStage.show();
            }
            else if(terminal instanceof BusTerminal){
                Bus bus = (Bus) trip.getVehicle();
                ShowBusController showBusController = new ShowBusController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showBusController.getShowBusView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                showBusController.getShowBusView().getTableView().getItems().add(bus);
                addCityStage.show();
            }
        });

        showTripView.getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showTripView.getScene().getWindow().hide();
            }
        });
    }

    public ShowTripView getShowTripView() {
        return showTripView;
    }

    public void setShowTripView(ShowTripView showTripView) {
        this.showTripView = showTripView;
    }
}
