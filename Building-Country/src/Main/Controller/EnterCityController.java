package Main.Controller;

import Main.Bank.Bank;
import Main.Buildings.Hotel;
import Main.Buildings.Room;
import Main.City;
import Main.Person;
import Main.Vehicles.*;
import Main.View.EnterCityView;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;

public class EnterCityController {
    private EnterCityView enterCityView;
    private City city;
    public EnterCityController(City city){
        setEnterCityView(new EnterCityView());
        this.setCity(city);
        enterCityView.getBtn1().setOnAction(event ->{
            if(city.getHoleMoney() - Hotel.getBuildPrice() >= 0) {
                addHotelController AddHotelController = new addHotelController(city);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(AddHotelController.getAddHotelView()));
                addCityStage.setWidth(650);
                addCityStage.setHeight(550);
                addCityStage.show();
            }else{
                JOptionPane.showMessageDialog(null,"You don't have enough money","ERROR",JOptionPane.ERROR_MESSAGE);
            }

        });

        enterCityView.getBtn2().setOnAction(event ->{
            addTerminalController addCityController = new addTerminalController(getCity());
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(addCityController.getAddTerminalView()));
            addCityStage.setWidth(1200);
            addCityStage.setHeight(450);
            addCityStage.show();
        });

        enterCityView.getBtn3().setOnAction(event -> {
            if(getCity().getNumHotel() == -1){
                JOptionPane.showMessageDialog(null,"NO HOTEL","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else if(getCity().getHoleMoney() - Room.getStayPrice() < 0){
                JOptionPane.showMessageDialog(null,"You don't have enough money","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else{
                getCity().setHoleMoney(getCity().getHoleMoney() - Room.getStayPrice());
                SelectHotelController selectHotelController = new SelectHotelController();
                for(int i=0;i<getCity().getNumHotel()+1;i++){
                    selectHotelController.getSelectHotelView().getTableView().getItems().add(getCity().getHotel().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectHotelController.getSelectHotelView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(450);
                addCityStage.show();
            }
        });

        enterCityView.getBtn4().setOnAction(event -> {
            if(getCity().getNumAirport() == -1){
                JOptionPane.showMessageDialog(null,"NO AIRPORT","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else if(getCity().getHoleMoney() - PassengerPlane.getPrice() < 0){
                JOptionPane.showMessageDialog(null,"You don't have enough money","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else{
                getCity().setHoleMoney(getCity().getHoleMoney() - PassengerPlane.getPrice());
                SelectAirportController selectAirportController = new SelectAirportController("PASSENGER PLANE");
                for(int i=0;i<getCity().getNumAirport()+1;i++){
                    selectAirportController.getSelectAirportView().getTableView().getItems().add(getCity().getAirport().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectAirportController.getSelectAirportView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(450);
                addCityStage.show();
            }
        });

        enterCityView.getBtn5().setOnAction(event -> {
            if(getCity().getNumAirport() == -1){
                JOptionPane.showMessageDialog(null,"NO AIRPORT","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else if(getCity().getHoleMoney() - CargoPlane.getPrice() < 0){
                JOptionPane.showMessageDialog(null,"You don't have enough money","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else{
                getCity().setHoleMoney(getCity().getHoleMoney() - CargoPlane.getPrice());
                SelectAirportController selectAirportController = new SelectAirportController("CARGO PLANE");
                for(int i=0;i<getCity().getNumAirport()+1;i++){
                    selectAirportController.getSelectAirportView().getTableView().getItems().add(getCity().getAirport().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectAirportController.getSelectAirportView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(450);
                addCityStage.show();
            }
        });

        enterCityView.getBtn6().setOnAction(event -> {
            if(getCity().getNumBusTerminal() == -1){
                JOptionPane.showMessageDialog(null,"NO BUS STATION","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else if(getCity().getHoleMoney() - Bus.getPrice() < 0){
                JOptionPane.showMessageDialog(null,"You don't have enough money","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else{
                getCity().setHoleMoney(getCity().getHoleMoney() - Bus.getPrice());
                SelectBusStationController selectBusStationController = new SelectBusStationController("BUS");
                for(int i=0;i<getCity().getNumBusTerminal()+1;i++){
                    selectBusStationController.getSelectBusStationView().getTableView().getItems().add(getCity().getBusTerminal().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectBusStationController.getSelectBusStationView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(450);
                addCityStage.show();
            }
        });

        enterCityView.getBtn7().setOnAction(event -> {
            if(getCity().getNumRailwayStation() == -1){
                JOptionPane.showMessageDialog(null,"NO RAILWAY STATION","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else if(getCity().getHoleMoney() - Train.getPrice() < 0){
                JOptionPane.showMessageDialog(null,"You don't have enough money","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else{
                getCity().setHoleMoney(getCity().getHoleMoney() - Train.getPrice());
                SelectRailwayStationController selectRailwayStationController = new SelectRailwayStationController("TRAIN");
                for(int i=0;i<getCity().getNumRailwayStation()+1;i++){
                    selectRailwayStationController.getSelectRailwayStationView().getTableView().getItems().add(getCity().getRailwayStation().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectRailwayStationController.getSelectRailwayStationView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(450);
                addCityStage.show();
            }
        });

        enterCityView.getBtn8().setOnAction(event -> {
            if(getCity().getNumShipPort() == -1){
                JOptionPane.showMessageDialog(null,"NO SHIPPING PORT","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else if(getCity().getHoleMoney() - Boat.getPrice() < 0){
                JOptionPane.showMessageDialog(null,"You don't have enough money","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else{
                getCity().setHoleMoney(getCity().getHoleMoney() - Boat.getPrice());
                SelectShipPortController selectShipPortController = new SelectShipPortController("BOAT");
                for(int i=0;i<getCity().getNumShipPort()+1;i++){
                    selectShipPortController.getSelectShipPortView().getTableView().getItems().add(getCity().getShippingPort().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectShipPortController.getSelectShipPortView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(450);
                addCityStage.show();
            }
        });

        enterCityView.getBtn9().setOnAction(event -> {
            if(getCity().getNumShipPort() == -1){
                JOptionPane.showMessageDialog(null,"NO SHIPPING PORT","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else if(getCity().getHoleMoney() - Ship.getPrice() < 0){
                JOptionPane.showMessageDialog(null,"You don't have enough money","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else{
                getCity().setHoleMoney(getCity().getHoleMoney() - Ship.getPrice());
                SelectShipPortController selectShipPortController = new SelectShipPortController("SHIP");
                for(int i=0;i<getCity().getNumShipPort()+1;i++){
                    selectShipPortController.getSelectShipPortView().getTableView().getItems().add(getCity().getShippingPort().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectShipPortController.getSelectShipPortView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(450);
                addCityStage.show();
            }
        });

        enterCityView.getBtn10().setOnAction(event -> {
            if(getCity().getNumAirport() == -1){
                JOptionPane.showMessageDialog(null,"NO AIRPORT","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else if(getCity().getHoleMoney() - 4.0 < 0){
                JOptionPane.showMessageDialog(null,"You don't have enough money","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else{
                getCity().setHoleMoney(getCity().getHoleMoney() - 4.0);
                SelectAirportController selectAirportController = new SelectAirportController("PILOT");
                for(int i=0;i<getCity().getNumAirport()+1;i++){
                    selectAirportController.getSelectAirportView().getTableView().getItems().add(getCity().getAirport().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectAirportController.getSelectAirportView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(450);
                addCityStage.show();
            }
        });

        enterCityView.getBtn11().setOnAction(event -> {
            if(getCity().getNumBusTerminal() == -1){
                JOptionPane.showMessageDialog(null,"NO BUS STATION","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else if(getCity().getHoleMoney() - 1.0 < 0){
                JOptionPane.showMessageDialog(null,"You don't have enough money","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else{
                getCity().setHoleMoney(getCity().getHoleMoney() - 1.0);
                SelectBusStationController selectBusStationController = new SelectBusStationController("DRIVER");
                for(int i=0;i<getCity().getNumBusTerminal()+1;i++){
                    selectBusStationController.getSelectBusStationView().getTableView().getItems().add(getCity().getBusTerminal().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectBusStationController.getSelectBusStationView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(450);
                addCityStage.show();
            }
        });

        enterCityView.getBtn12().setOnAction(event -> {
            if(getCity().getNumRailwayStation() == -1){
                JOptionPane.showMessageDialog(null,"NO RAILWAY STATION","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else if(getCity().getHoleMoney() - 3.0 < 0){
                JOptionPane.showMessageDialog(null,"You don't have enough money","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else{
                getCity().setHoleMoney(getCity().getHoleMoney() - 3.0);
                SelectRailwayStationController selectRailwayStationController = new SelectRailwayStationController("LOCOMOTIVES");
                for(int i=0;i<getCity().getNumRailwayStation()+1;i++){
                    selectRailwayStationController.getSelectRailwayStationView().getTableView().getItems().add(getCity().getRailwayStation().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectRailwayStationController.getSelectRailwayStationView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(450);
                addCityStage.show();
            }
        });

        enterCityView.getBtn13().setOnAction(event -> {
            if(getCity().getNumShipPort() == -1){
                JOptionPane.showMessageDialog(null,"NO SHIPPING PORT","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else if(getCity().getHoleMoney() - 4.0 < 0){
                JOptionPane.showMessageDialog(null,"You don't have enough money","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else{
                getCity().setHoleMoney(getCity().getHoleMoney() - 4.0);
                SelectShipPortController selectShipPortController = new SelectShipPortController("SAILOR");
                for(int i=0;i<getCity().getNumShipPort()+1;i++){
                    selectShipPortController.getSelectShipPortView().getTableView().getItems().add(getCity().getShippingPort().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectShipPortController.getSelectShipPortView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(450);
                addCityStage.show();
            }
        });

        enterCityView.getBtn14().setOnAction(event -> {
            if(getCity().getNumAirport() == -1){
                JOptionPane.showMessageDialog(null,"NO AIRPORT","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else if(getCity().getHoleMoney() - 1.0 < 0){
                JOptionPane.showMessageDialog(null,"You don't have enough money","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else{
                getCity().setHoleMoney(getCity().getHoleMoney() - 1.0);
                SelectAirportController selectAirportController = new SelectAirportController("CREW");
                for(int i=0;i<getCity().getNumAirport()+1;i++){
                    selectAirportController.getSelectAirportView().getTableView().getItems().add(getCity().getAirport().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectAirportController.getSelectAirportView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(450);
                addCityStage.show();
            }
        });

        enterCityView.getBtn15().setOnAction(event -> {
            if(getCity().getAirport().size() == 0){
                JOptionPane.showMessageDialog(null,"NO AIRPORT","ERROR",JOptionPane.WARNING_MESSAGE);
            }
            else {
                ShowAirportsController showAirportsController = new ShowAirportsController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showAirportsController.getShowAirportsView()));
                addCityStage.setWidth(1200);
                addCityStage.setHeight(500);
                for (int i = 0; i < getCity().getAirport().size(); i++) {
                    showAirportsController.getShowAirportsView().getTableView().getItems().add(getCity().getAirport().get(i));
                }
                addCityStage.show();
            }
        });

        enterCityView.getBtn16().setOnAction(event -> {
            if(getCity().getShippingPort().size() == 0){
                JOptionPane.showMessageDialog(null,"NO SHIPPING PORT","ERROR",JOptionPane.WARNING_MESSAGE);
            }
            else {
                ShowShipPortController showShipPortController = new ShowShipPortController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showShipPortController.getShowShipPortView()));
                addCityStage.setWidth(1200);
                addCityStage.setHeight(500);
                for (int i = 0; i < getCity().getShippingPort().size(); i++) {
                    showShipPortController.getShowShipPortView().getTableView().getItems().add(getCity().getShippingPort().get(i));
                }
                addCityStage.show();
            }
        });

        enterCityView.getBtn17().setOnAction(event -> {
            if(getCity().getBusTerminal().size() == 0){
                JOptionPane.showMessageDialog(null,"NO BUS STATION","ERROR",JOptionPane.WARNING_MESSAGE);
            }
            else {
                ShowBusStationController showBusStationController = new ShowBusStationController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showBusStationController.getShowBusStationView()));
                addCityStage.setWidth(1200);
                addCityStage.setHeight(500);
                for (int i = 0; i < getCity().getBusTerminal().size(); i++) {
                    showBusStationController.getShowBusStationView().getTableView().getItems().add(getCity().getBusTerminal().get(i));
                }
                addCityStage.show();
            }
        });

        enterCityView.getBtn18().setOnAction(event -> {
            if(getCity().getRailwayStation().size() == 0){
                JOptionPane.showMessageDialog(null,"NO RAILWAY STATION","ERROR",JOptionPane.WARNING_MESSAGE);
            }
            else {
                ShowRailwayStationController showRailwayStationController = new ShowRailwayStationController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showRailwayStationController.getShowRailwayStationView()));
                addCityStage.setWidth(1200);
                addCityStage.setHeight(500);
                for (int i = 0; i < getCity().getRailwayStation().size(); i++) {
                    showRailwayStationController.getShowRailwayStationView().getTableView().getItems().add(getCity().getRailwayStation().get(i));
                }
                addCityStage.show();
            }
        });

        enterCityView.getBtn19().setOnAction(event -> {
            ShowCitiesInformationController addCityController = new ShowCitiesInformationController(getCity());
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(addCityController.getShowCitiesInformationView()));
            addCityStage.setWidth(450);
            addCityStage.setHeight(440);
            addCityStage.show();
        });

        enterCityView.getBtn20().setOnAction(event -> {
            if(getCity().getHotel().size() == 0){
                JOptionPane.showMessageDialog(null,"NO HOTEL","ERROR",JOptionPane.WARNING_MESSAGE);
            }
            else {
                ShowHotelController showHotelController = new ShowHotelController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showHotelController.getShowHotelView()));
                addCityStage.setWidth(750);
                addCityStage.setHeight(440);
                for (int i = 0; i < getCity().getHotel().size(); i++) {
                    showHotelController.getShowHotelView().getTableView().getItems().add(getCity().getHotel().get(i));
                }
                addCityStage.show();
            }
        });

        enterCityView.getBtn21().setOnAction(event -> {
            addPersonController AddPersonController = new addPersonController(city);
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(AddPersonController.getAddPersonView()));
            addCityStage.setWidth(700);
            addCityStage.setHeight(660);
            addCityStage.show();
        });

        enterCityView.getBtn22().setOnAction(event -> {
            if(getCity().getPerson().size() == 0){
                JOptionPane.showMessageDialog(null,"NO CITIZEN","ERROR",JOptionPane.WARNING_MESSAGE);
            }
            else{
                ShowPeopleController showPeopleController = new ShowPeopleController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showPeopleController.getShowPeopleView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                for(int i=0;i<getCity().getPerson().size();i++){
                    showPeopleController.getShowPeopleView().getTableView().getItems().add(getCity().getPerson().get(i));
                }
                addCityStage.show();
            }
        });

        enterCityView.getBtn23().setOnAction(event -> {
            TravelController travelController = new TravelController(getCity());
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(travelController.getTravelView()));
            addCityStage.setWidth(600);
            addCityStage.setHeight(670);
            addCityStage.show();
        });

        enterCityView.getBtn24().setOnAction(event -> {
            if(getCity().getHoleMoney() - Bank.getBuildPrice() < 0){
                JOptionPane.showMessageDialog(null,"NOT ENOUGH MONEY","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else {
                BuildBankController buildBankController = new BuildBankController(getCity());
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(buildBankController.getBuildBankView()));
                addCityStage.setWidth(600);
                addCityStage.setHeight(450);
                addCityStage.show();
            }
        });

        enterCityView.getBtn25().setOnAction(event -> {
            if(getCity().getAllBanks().size() == 0){
                JOptionPane.showMessageDialog(null,"NO BANK","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else {
                SelectBankToEnterController selectBankToEnterController = new SelectBankToEnterController(city);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectBankToEnterController.getSelectBankToEnterView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(460);
                for(int i=0;i<getCity().getAllBanks().size();i++){
                    getCity().getAllBanks().get(i).SetAliveAccountsAndHoleMoney();
                    selectBankToEnterController.getSelectBankToEnterView().getTableView().getItems().add(getCity().getAllBanks().get(i));
                }
                addCityStage.show();
            }
        });

    }


    public EnterCityView getEnterCityView() {
        return enterCityView;
    }

    public void setEnterCityView(EnterCityView enterCityView) {
        this.enterCityView = enterCityView;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
