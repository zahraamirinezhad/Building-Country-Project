package Main.Controller;

import Main.Buildings.Airport;
import Main.Vehicles.CargoPlane;
import Main.Vehicles.PassengerPlane;
import Main.View.ShowAirportsView;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;

public class ShowAirportsController {
    private ShowAirportsView showAirportsView;
    public ShowAirportsController(){
        setShowAirportsView(new ShowAirportsView());

        showAirportsView.getShowPassengerPlanesBTN().setOnAction(event -> {
            Airport airport = showAirportsView.getTableView().getSelectionModel().getSelectedItem();
            if(airport.getPassengerPlanesNum() == 0){
                JOptionPane.showMessageDialog(null,"NO PASSENGER PLANE","ERROR",JOptionPane.WARNING_MESSAGE);
                showAirportsView.getScene().getWindow().hide();
            }
            else {
                ShowPassengerPlanesController showPassengerPlanesController = new ShowPassengerPlanesController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showPassengerPlanesController.getShowPassengerPlanesView()));
                addCityStage.setWidth(1000);
                addCityStage.setHeight(400);
                for (int i = 0; i < airport.getAirV().size(); i++) {
                    if (airport.getAirV().get(i) instanceof PassengerPlane) {
                        PassengerPlane passengerPlane = (PassengerPlane) airport.getAirV().get(i);
                        showPassengerPlanesController.getShowPassengerPlanesView().getTableView().getItems().add(passengerPlane);
                    }
                }
                addCityStage.show();
            }
        });

        showAirportsView.getShowCargoPlanesBTN().setOnAction(event -> {
            Airport airport = showAirportsView.getTableView().getSelectionModel().getSelectedItem();
            if(airport.getCargoPlanesNum() == 0){
                JOptionPane.showMessageDialog(null,"NO CARGO PLANE","ERROR",JOptionPane.WARNING_MESSAGE);
                showAirportsView.getScene().getWindow().hide();
            }
            else {
                ShowCargoPlanesController showCargoPlanesController = new ShowCargoPlanesController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showCargoPlanesController.getShowCargoPlanesView()));
                addCityStage.setWidth(1000);
                addCityStage.setHeight(400);
                for (int i = 0; i < airport.getAirV().size(); i++) {
                    if (airport.getAirV().get(i) instanceof CargoPlane) {
                        CargoPlane cargoPlane = (CargoPlane) airport.getAirV().get(i);
                        showCargoPlanesController.getShowCargoPlanesView().getTableView().getItems().add(cargoPlane);
                    }
                }
                addCityStage.show();
            }
        });

        showAirportsView.getShowCrewsBTN().setOnAction(event -> {
            Airport airport = showAirportsView.getTableView().getSelectionModel().getSelectedItem();
            if(airport.getCrewsNum() == 0){
                JOptionPane.showMessageDialog(null,"NO CREW","ERROR",JOptionPane.WARNING_MESSAGE);
                showAirportsView.getScene().getWindow().hide();
            }
            else {
                ShowPeopleController showPeopleController = new ShowPeopleController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showPeopleController.getShowPeopleView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                for (int i = 0; i < airport.getPeople().size(); i++) {
                    if (airport.getPeople().get(i).getJob().compareToIgnoreCase("CREW") == 0) {
                        showPeopleController.getShowPeopleView().getTableView().getItems().add(airport.getPeople().get(i));
                    }
                }
                addCityStage.show();
            }

        });

        showAirportsView.getShowPilotsBTN().setOnAction(event -> {
            Airport airport = showAirportsView.getTableView().getSelectionModel().getSelectedItem();
            if(airport.getPilotsNum() == 0){
                JOptionPane.showMessageDialog(null,"NO PILOTS","ERROR",JOptionPane.WARNING_MESSAGE);
                showAirportsView.getScene().getWindow().hide();
            }
            else {
                ShowPeopleController showPeopleController = new ShowPeopleController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showPeopleController.getShowPeopleView()));
                addCityStage.setWidth(900);
                addCityStage.setHeight(400);
                for (int i = 0; i < airport.getPeople().size(); i++) {
                    if (airport.getPeople().get(i).getJob().compareToIgnoreCase("PILOT") == 0) {
                        showPeopleController.getShowPeopleView().getTableView().getItems().add(airport.getPeople().get(i));
                    }
                }
                addCityStage.show();
            }
        });

        showAirportsView.getShowTripsBTN().setOnAction(event -> {
            Airport airport = showAirportsView.getTableView().getSelectionModel().getSelectedItem();
            ShowTripTypeController showTripTypeController = new ShowTripTypeController(airport);
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(showTripTypeController.getShowTripTypeView()));
            addCityStage.setWidth(400);
            addCityStage.setHeight(200);
            addCityStage.show();
        });
        showAirportsView.getExitBTN().setOnAction(event -> {
            showAirportsView.getScene().getWindow().hide();
        });
    }

    public ShowAirportsView getShowAirportsView() {
        return showAirportsView;
    }

    public void setShowAirportsView(ShowAirportsView showAirportsView) {
        this.showAirportsView = showAirportsView;
    }
}
