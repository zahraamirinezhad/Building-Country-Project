package Main.Controller;

import Main.Buildings.*;
import Main.City;
import Main.Person;
import Main.Trip.Trip;
import Main.Vehicles.*;
import Main.View.TravelView;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import static Main.Main.Iran;

public class TravelController {
    private TravelView travelView;
    private City OriginCity;
    private City DestinationCity;
    private Terminal OriginTerminal;
    private Terminal DestinationTerminal;
    private ArrayList<Person> passengers = new ArrayList<>();
    private Person Driver;
    private Vehicle vehicle;

    public TravelController(City OriginCity) {
        setTravelView(new TravelView());
        this.setOriginCity(OriginCity);

        getTravelView().getSelectDestinationCityBTN().setOnAction(event -> {
            SelectCityForTravelController selectCityForTravelController = new SelectCityForTravelController(this);
            for (int i = 0; i < Iran.getCities().size(); i++) {
                if (Iran.getCities().get(i).getCityName().compareToIgnoreCase(OriginCity.getCityName()) != 0) {
                    selectCityForTravelController.getSelectCityForTravelView().getTableView().getItems().add(Iran.getCities().get(i));
                }
            }
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(selectCityForTravelController.getSelectCityForTravelView()));
            addCityStage.setWidth(400);
            addCityStage.setHeight(450);
            addCityStage.show();
        });

        getTravelView().getSelectOriginTerminalBTN().setOnAction(event -> {
            if (getTravelView().getAIRPORT().isSelected()) {
                SelectAirportForTravelController selectAirportForTravelController = new SelectAirportForTravelController(this, "ORIGIN");
                for (int i = 0; i < getOriginCity().getNumAirport() + 1; i++) {
                    selectAirportForTravelController.getSelectAirportForTravelView().getTableView().getItems().add(getOriginCity().getAirport().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectAirportForTravelController.getSelectAirportForTravelView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(450);
                addCityStage.show();
            } else if (getTravelView().getRAILWAY_STATION().isSelected()) {
                SelectRailwayStationForTravelController selectRailwayStationForTravelController = new SelectRailwayStationForTravelController(this, "ORIGIN");
                for (int i = 0; i < getOriginCity().getNumRailwayStation() + 1; i++) {
                    selectRailwayStationForTravelController.getSelectRailwayStationForTravelView().getTableView().getItems().add(getOriginCity().getRailwayStation().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectRailwayStationForTravelController.getSelectRailwayStationForTravelView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(450);
                addCityStage.show();
            } else if (getTravelView().getBUS_STATION().isSelected()) {
                SelectBusStationForTravelController selectBusStationForTravelController = new SelectBusStationForTravelController(this, "ORIGIN");
                for (int i = 0; i < getOriginCity().getNumBusTerminal() + 1; i++) {
                    selectBusStationForTravelController.getSelectBusStationForTravelView().getTableView().getItems().add(getOriginCity().getBusTerminal().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectBusStationForTravelController.getSelectBusStationForTravelView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(450);
                addCityStage.show();
            } else if (getTravelView().getSHIP_PORT().isSelected()) {
                SelectShipPortForTravelController selectShipPortForTravelController = new SelectShipPortForTravelController(this, "ORIGIN");
                for (int i = 0; i < getOriginCity().getNumShipPort() + 1; i++) {
                    selectShipPortForTravelController.getSelectShipPortForTravelView().getTableView().getItems().add(getOriginCity().getShippingPort().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectShipPortForTravelController.getSelectShipPortForTravelView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(450);
                addCityStage.show();
            }
            getTravelView().getSelectDestinationTerminalBTN().setDisable(false);
        });

        getTravelView().getSelectDestinationTerminalBTN().setOnAction(event -> {
            if (getTravelView().getAIRPORT().isSelected()) {
                SelectAirportForTravelController selectAirportForTravelController = new SelectAirportForTravelController(this, "DESTINATION");
                for (int i = 0; i < getDestinationCity().getNumAirport() + 1; i++) {
                    selectAirportForTravelController.getSelectAirportForTravelView().getTableView().getItems().add(getDestinationCity().getAirport().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectAirportForTravelController.getSelectAirportForTravelView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(450);
                addCityStage.show();
            } else if (getTravelView().getRAILWAY_STATION().isSelected()) {
                SelectRailwayStationForTravelController selectRailwayStationForTravelController = new SelectRailwayStationForTravelController(this, "DESTINATION");
                for (int i = 0; i < getDestinationCity().getNumRailwayStation() + 1; i++) {
                    selectRailwayStationForTravelController.getSelectRailwayStationForTravelView().getTableView().getItems().add(getDestinationCity().getRailwayStation().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectRailwayStationForTravelController.getSelectRailwayStationForTravelView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(450);
                addCityStage.show();
            } else if (getTravelView().getBUS_STATION().isSelected()) {
                SelectBusStationForTravelController selectBusStationForTravelController = new SelectBusStationForTravelController(this, "DESTINATION");
                for (int i = 0; i < getDestinationCity().getNumBusTerminal() + 1; i++) {
                    selectBusStationForTravelController.getSelectBusStationForTravelView().getTableView().getItems().add(getDestinationCity().getBusTerminal().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectBusStationForTravelController.getSelectBusStationForTravelView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(450);
                addCityStage.show();
            } else if (getTravelView().getSHIP_PORT().isSelected()) {
                SelectShipPortForTravelController selectShipPortForTravelController = new SelectShipPortForTravelController(this, "DESTINATION");
                for (int i = 0; i < getDestinationCity().getNumShipPort() + 1; i++) {
                    selectShipPortForTravelController.getSelectShipPortForTravelView().getTableView().getItems().add(getDestinationCity().getShippingPort().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectShipPortForTravelController.getSelectShipPortForTravelView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(450);
                addCityStage.show();
            }
            getTravelView().getSelectVehicleBTN().setDisable(false);
        });

        travelView.getSelectPassengersBTN().setOnAction(event -> {
            if(getPassengers().size() > getVehicle().getCapacity()){
                JOptionPane.showMessageDialog(null,"NOT ENOUGH CAPACITY","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            {
                SelectPassengerForTravelController selectPassengerForTravelController = new SelectPassengerForTravelController(this);
                for (int i = 0; i < getOriginCity().getPerson().size(); i++) {
                    if (!getOriginCity().getPerson().get(i).equals(getDriver())) {
                        selectPassengerForTravelController.getSelectPassengerForTravelView().getTableView().getItems().add(getOriginCity().getPerson().get(i));
                    }
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectPassengerForTravelController.getSelectPassengerForTravelView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                addCityStage.show();
                getTravelView().getShowTripCostBTN().setDisable(false);
                getTravelView().getExitBTN().setDisable(false);
            }
        });

        travelView.getSelectDriverBTN().setOnAction(event -> {
            if (OriginTerminal instanceof Airport) {
                Airport airport = (Airport) OriginTerminal;
                SelectDriverForTravelController selectDriverForTravelController = new SelectDriverForTravelController(this);
                for (int i = 0; i < airport.getPeople().size(); i++) {
                    if (airport.getPeople().get(i).getJob().compareToIgnoreCase("PILOT") == 0) {
                        selectDriverForTravelController.getSelectPassengerForTravelView().getTableView().getItems().add(airport.getPeople().get(i));
                    }
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectDriverForTravelController.getSelectPassengerForTravelView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                addCityStage.show();
            }
            if (OriginTerminal instanceof RailwayStation) {
                RailwayStation railwayStation = (RailwayStation) OriginTerminal;
                SelectDriverForTravelController selectDriverForTravelController = new SelectDriverForTravelController(this);
                for (int i = 0; i < railwayStation.getPeople().size(); i++) {
                    selectDriverForTravelController.getSelectPassengerForTravelView().getTableView().getItems().add(railwayStation.getPeople().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectDriverForTravelController.getSelectPassengerForTravelView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                addCityStage.show();
            }
            if (OriginTerminal instanceof ShippingPort) {
                ShippingPort shippingPort = (ShippingPort) OriginTerminal;
                SelectDriverForTravelController selectDriverForTravelController = new SelectDriverForTravelController(this);
                for (int i = 0; i < shippingPort.getPeople().size(); i++) {
                    selectDriverForTravelController.getSelectPassengerForTravelView().getTableView().getItems().add(shippingPort.getPeople().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectDriverForTravelController.getSelectPassengerForTravelView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                addCityStage.show();
            }
            if (OriginTerminal instanceof BusTerminal) {
                BusTerminal busTerminal = (BusTerminal) OriginTerminal;
                SelectDriverForTravelController selectDriverForTravelController = new SelectDriverForTravelController(this);
                for (int i = 0; i < busTerminal.getPeople().size(); i++) {
                    selectDriverForTravelController.getSelectPassengerForTravelView().getTableView().getItems().add(busTerminal.getPeople().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectDriverForTravelController.getSelectPassengerForTravelView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                addCityStage.show();
            }
            getTravelView().getSelectPassengersBTN().setDisable(false);
        });

        travelView.getSelectVehicleBTN().setOnAction(event -> {
            if (OriginTerminal instanceof Airport) {
                Airport airport = (Airport) OriginTerminal;
                SelectPassengerPlaneController selectPassengerPlaneController = new SelectPassengerPlaneController(this);
                for (int i = 0; i < airport.getAirV().size(); i++) {
                    if (airport.getAirV().get(i) instanceof PassengerPlane) {
                        PassengerPlane passengerPlane = (PassengerPlane) airport.getAirV().get(i);
                        selectPassengerPlaneController.getSelectPassengerPlaneView().getTableView().getItems().add(passengerPlane);
                    }
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectPassengerPlaneController.getSelectPassengerPlaneView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                addCityStage.show();
            }
            if (OriginTerminal instanceof RailwayStation) {
                RailwayStation railwayStation = (RailwayStation) OriginTerminal;
                SelectTrainController selectTrainController = new SelectTrainController(this);
                for (int i = 0; i < railwayStation.getTrains().size(); i++) {
                    selectTrainController.getSelectTrainView().getTableView().getItems().add(railwayStation.getTrains().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectTrainController.getSelectTrainView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                addCityStage.show();
            }
            if (OriginTerminal instanceof ShippingPort) {
                ShippingPort shippingPort = (ShippingPort) OriginTerminal;
                SelectShipController selectShipController = new SelectShipController(this);
                for (int i = 0; i < shippingPort.getSeaV().size(); i++) {
                    if (shippingPort.getSeaV().get(i) instanceof Ship) {
                        Ship ship = (Ship) shippingPort.getSeaV().get(i);
                        selectShipController.getSelectShipView().getTableView().getItems().add(ship);
                    }
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectShipController.getSelectShipView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                addCityStage.show();
            }
            if (OriginTerminal instanceof BusTerminal) {
                BusTerminal busTerminal = (BusTerminal) OriginTerminal;
                SelectBusController selectBusController = new SelectBusController(this);
                for (int i = 0; i < busTerminal.getPeople().size(); i++) {
                    selectBusController.getSelectBusView().getTableView().getItems().add(busTerminal.getBus().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectBusController.getSelectBusView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                addCityStage.show();
            }
            getTravelView().getSelectDriverBTN().setDisable(false);
        });

        travelView.getShowTripCostBTN().setOnAction(event -> {
            travelView.getTripCostValueLBL().setText(" TRIP COST : " + (OriginTerminal.TripsCost(passengers, vehicle)));
            travelView.getTripCostValueLBL().setVisible(true);
        });

        travelView.getExitBTN().setOnAction(event -> {
            Finish();
        });
    }

    public void SetPassengerForTrip(Person person) {
        setPassengers(person);
        OriginCity.getPerson().remove(person);
        DestinationCity.getPerson().add(person);
        OriginCity.setPeopleNum(OriginCity.getPeopleNum() - 1);
        DestinationCity.setPeopleNum(DestinationCity.getPeopleNum() + 1);
    }

    public void SetDriverFotTrip(Person driver) {
        if (OriginTerminal instanceof Airport) {
            OriginTerminal.getPeople().remove(driver);
            ((Airport) OriginTerminal).setPilotsNum(((Airport) OriginTerminal).getPilotsNum() - 1);
            OriginCity.getPerson().remove(driver);
            DestinationTerminal.getPeople().add(driver);
            ((Airport) DestinationTerminal).setPilotsNum(((Airport) DestinationTerminal).getPilotsNum() + 1);
            DestinationCity.getPerson().add(driver);
        } else if (OriginTerminal instanceof RailwayStation) {
            OriginTerminal.getPeople().remove(driver);
            OriginCity.getPerson().remove(driver);
            DestinationTerminal.getPeople().add(driver);
            DestinationCity.getPerson().add(driver);
        } else if (OriginTerminal instanceof BusTerminal) {
            OriginTerminal.getPeople().remove(driver);
            OriginCity.getPerson().remove(driver);
            DestinationTerminal.getPeople().add(driver);
            DestinationCity.getPerson().add(driver);
        } else if (OriginTerminal instanceof ShippingPort) {
            OriginTerminal.getPeople().remove(driver);
            OriginCity.getPerson().remove(driver);
            DestinationTerminal.getPeople().add(driver);
            DestinationCity.getPerson().add(driver);
        }
        setDriver(driver);
    }

    public void SetVehicleFotTrip(Vehicle vehicle) {
        if (OriginTerminal instanceof Airport) {
            ((Airport) OriginTerminal).getAirV().remove(vehicle);
            ((Airport) DestinationTerminal).getAirV().add((AirVehicle) vehicle);
        } else if (OriginTerminal instanceof RailwayStation) {
            ((RailwayStation) OriginTerminal).getTrains().remove(vehicle);
            ((RailwayStation) DestinationTerminal).getTrains().add((Train) vehicle);
        } else if (OriginTerminal instanceof BusTerminal) {
            ((BusTerminal) OriginTerminal).getBus().remove(vehicle);
            ((BusTerminal) DestinationTerminal).getBus().add((Bus) vehicle);
        } else if (OriginTerminal instanceof ShippingPort) {
            ((ShippingPort) OriginTerminal).getSeaV().remove(vehicle);
            ((ShippingPort) OriginTerminal).setShipNum(((ShippingPort) OriginTerminal).getShipNum() - 1);
            ((ShippingPort) DestinationTerminal).getSeaV().add((SeaVehicle) vehicle);
            ((ShippingPort) DestinationTerminal).setShipNum(((ShippingPort) DestinationTerminal).getShipNum() + 1);
        }
        setVehicle(vehicle);
    }

    public void Finish() {
        if(getPassengers().size() < getVehicle().getCapacity() / 2){
            JOptionPane.showMessageDialog(null,"NOT ENOUGH PASSENGERS","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else {
            LocalDate localDate = travelView.getDate().getValue();
            int Year = localDate.getYear();
            int Month = localDate.getMonthValue();
            int Day = localDate.getDayOfMonth();
            double Cost = OriginTerminal.TripsCost(passengers, vehicle);
            OriginTerminal.setTrips(new Trip(OriginCity.getCityName(), DestinationCity.getCityName(), OriginTerminal, DestinationTerminal, passengers, Driver, vehicle, travelView.getIDSP().getValue(), Year, Month, Day, Cost, "OUTWARD"));
            DestinationTerminal.setTrips(new Trip(OriginCity.getCityName(), DestinationCity.getCityName(), OriginTerminal, DestinationTerminal, passengers, Driver, vehicle, travelView.getIDSP().getValue(), Year, Month, Day, Cost, "ENTRANCE"));
            OriginCity.setHoleMoney(OriginCity.getHoleMoney() - Cost);
            travelView.getScene().getWindow().hide();
        }
    }

    public TravelView getTravelView() {
        return travelView;
    }

    public void setTravelView(TravelView travelView) {
        this.travelView = travelView;
    }

    public City getOriginCity() {
        return OriginCity;
    }

    public void setOriginCity(City originCity) {
        OriginCity = originCity;
    }

    public City getDestinationCity() {
        return DestinationCity;
    }

    public void setDestinationCity(City destinationCity) {
        DestinationCity = destinationCity;
    }

    public Terminal getOriginTerminal() {
        return OriginTerminal;
    }

    public void setOriginTerminal(Terminal originTerminal) {
        OriginTerminal = originTerminal;
    }

    public Terminal getDestinationTerminal() {
        return DestinationTerminal;
    }

    public void setDestinationTerminal(Terminal destinationTerminal) {
        DestinationTerminal = destinationTerminal;
    }

    public ArrayList<Person> getPassengers() {
        return passengers;
    }

    public void setPassengers(Person passengers) {
        this.passengers.add(passengers);
    }

    public Person getDriver() {
        return Driver;
    }

    public void setDriver(Person driver) {
        Driver = driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
