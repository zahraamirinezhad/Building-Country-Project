package Main.Controller;

import Main.Buildings.*;
import Main.City;
import Main.View.addTerminalView;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;

public class addTerminalController {
    private addTerminalView AddTerminalView;
    private City city;

    public addTerminalController(City city) {
        setAddTerminalView(new addTerminalView());
        this.setCity(city);
        AddTerminalView.getAIRPORTBT().setOnAction(e -> {
            if(this.city.getHoleMoney() - Airport.getBuildPrice() >= 0) {
                addAirportController AddAirportController = new addAirportController(this);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(AddAirportController.getAddAirportView()));
                addCityStage.setWidth(600);
                addCityStage.setHeight(600);
                addCityStage.show();
                AddTerminalView.getScene().getWindow().hide();
            }else {
                JOptionPane.showMessageDialog(null,"You don't have enough money","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        });

        AddTerminalView.getBUS_STATIONBT().setOnAction(e -> {
            if(this.city.getHoleMoney() - BusTerminal.getBuildPrice() >= 0) {
                addBusStationController AddBusStationController = new addBusStationController(this);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(AddBusStationController.getAddBusStationView()));
                addCityStage.setWidth(600);
                addCityStage.setHeight(500);
                addCityStage.show();
                AddTerminalView.getScene().getWindow().hide();
            }else {
                JOptionPane.showMessageDialog(null,"You don't have enough money","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        });

        AddTerminalView.getRAILWAY_STATIONBT().setOnAction(e -> {
            if(this.city.getHoleMoney() - RailwayStation.getBuildPrice() >= 0) {
                addRailwayStationController AddRailwayStationController = new addRailwayStationController(this);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(AddRailwayStationController.getAddRailwayStationView()));
                addCityStage.setWidth(600);
                addCityStage.setHeight(550);
                addCityStage.show();
                AddTerminalView.getScene().getWindow().hide();
            }else {
                JOptionPane.showMessageDialog(null,"You don't have enough money","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        });
        AddTerminalView.getSHIPPING_PORTBT().setOnAction(e -> {
            if(this.city.getHoleMoney() - ShippingPort.getBuildPrice() >= 0) {
                addShipPortController AddShipPortController = new addShipPortController(this);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(AddShipPortController.getAddShipPortView()));
                addCityStage.setWidth(600);
                addCityStage.setHeight(550);
                addCityStage.show();
                AddTerminalView.getScene().getWindow().hide();
            }else {
                JOptionPane.showMessageDialog(null,"You don't have enough money","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public void AddAirportToCity(Airport airport) {
        getCity().setAirport(airport);
        getCity().setNumAirport(getCity().getNumAirport() + 1);
        getCity().setHoleMoney(getCity().getHoleMoney() - Airport.getBuildPrice());
    }

    public void AddBusStationToCity(BusTerminal busTerminal) {
        getCity().setBusTerminal(busTerminal);
        getCity().setNumBusTerminal(getCity().getNumBusTerminal() + 1);
        getCity().setHoleMoney(getCity().getHoleMoney() - BusTerminal.getBuildPrice());
    }

    public void AddRailwayStationToCity(RailwayStation railwayStation) {
        getCity().setRailwayStation(railwayStation);
        getCity().setNumRailwayStation(getCity().getNumRailwayStation() + 1);
        getCity().setHoleMoney(getCity().getHoleMoney() - RailwayStation.getBuildPrice());
    }

    public void AddShippingPortToCity(ShippingPort shippingPort) {
        getCity().setShippingPort(shippingPort);
        getCity().setNumShipPort(getCity().getNumShipPort() + 1);
        getCity().setHoleMoney(getCity().getHoleMoney() - ShippingPort.getBuildPrice());
    }

    public addTerminalView getAddTerminalView() {
        return AddTerminalView;
    }

    public void setAddTerminalView(addTerminalView addTerminalView) {
        AddTerminalView = addTerminalView;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
