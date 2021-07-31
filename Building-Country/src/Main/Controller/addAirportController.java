package Main.Controller;

import Main.Buildings.Airport;
import Main.Person;
import Main.Vehicles.CargoPlane;
import Main.Vehicles.PassengerPlane;
import Main.View.addAirportView;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class addAirportController {
    private addAirportView AddAirportView;
    private Airport airport;
    private addTerminalController AddTerminalController;

    public addAirportController(addTerminalController AddTerminalController) {
        setAddAirportView(new addAirportView());
        this.setAddTerminalController(AddTerminalController);
        AddAirportView.getConfirmedBTN().setOnAction(e -> {
            Confirmed();
            AddAirportView.getTerminalNameTF().setEditable(false);
            AddAirportView.getAddressTF().setEditable(false);
            AddAirportView.getMetrazhSP().setEditable(false);
            AddAirportView.getRunawayNumSP().setEditable(false);
            AddAirportView.getConfirmedBTN().setDisable(true);
            AddAirportView.getINTERNATIONAL().setDisable(true);
            AddAirportView.getDOMESTIC().setDisable(true);
            AddAirportView.getAddCargoPlane().setDisable(false);
            AddAirportView.getAddPassengerPlane().setDisable(false);
            AddAirportView.getAddPilot().setDisable(false);
            AddAirportView.getExitBTN().setDisable(false);
            AddAirportView.getAddCrew().setDisable(false);
        });
        AddAirportView.getAddPassengerPlane().setOnAction(e -> {
            if (AddTerminalController.getCity().getHoleMoney() - PassengerPlane.getPrice() >= 0) {
                AddTerminalController.getCity().setHoleMoney(AddTerminalController.getCity().getHoleMoney() - PassengerPlane.getPrice());
                airport.setPassengerPlanesNum(airport.getPassengerPlanesNum()+1);
                addPassengerPlaneController AddPassengerPlaneController = new addPassengerPlaneController(airport);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(AddPassengerPlaneController.getAddPassengerPlaneView()));
                addCityStage.setWidth(650);
                addCityStage.setHeight(650);
                addCityStage.show();
            } else {
                JOptionPane.showMessageDialog(null, "You don't have enough money", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        });

        AddAirportView.getAddCargoPlane().setOnAction(e -> {
            if (AddTerminalController.getCity().getHoleMoney() - CargoPlane.getPrice() >= 0) {
                AddTerminalController.getCity().setHoleMoney(AddTerminalController.getCity().getHoleMoney() - CargoPlane.getPrice());
                airport.setCargoPlanesNum(airport.getCargoPlanesNum()+1);
                addCargoPlaneController AddCargoPlaneController = new addCargoPlaneController(airport);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(AddCargoPlaneController.getAddCargoPlaneView()));
                addCityStage.setWidth(550);
                addCityStage.setHeight(550);
                addCityStage.show();
            } else {
                JOptionPane.showMessageDialog(null, "You don't have enough money", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        });

        AddAirportView.getAddPilot().setOnAction(event -> {
            if (AddTerminalController.getCity().getHoleMoney() - 4.0 >= 0) {
                AddTerminalController.getCity().setHoleMoney(AddTerminalController.getCity().getHoleMoney() - 4.0);
                airport.setPilotsNum(airport.getPilotsNum()+1);
                AddCrewController addCrewController = new AddCrewController(airport);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(addCrewController.getAddCrewView()));
                addCityStage.setWidth(850);
                addCityStage.setHeight(460);
                for (int i = 0; i < AddTerminalController.getCity().getPerson().size(); i++) {
                    if (AddTerminalController.getCity().getPerson().get(i).getJob().compareToIgnoreCase("PILOT") == 0 && !AddTerminalController.getCity().getPerson().get(i).getWorkerOrNot()) {
                        addCrewController.getAddCrewView().getTableView().getItems().add(AddTerminalController.getCity().getPerson().get(i));
                    }
                }
                addCityStage.show();
            } else {
                JOptionPane.showMessageDialog(null, "You don't have enough money", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        });

        AddAirportView.getAddCrew().setOnAction(event -> {
            if (AddTerminalController.getCity().getHoleMoney() - 2.0 >= 0) {
                AddTerminalController.getCity().setHoleMoney(AddTerminalController.getCity().getHoleMoney() - 2.0);
                airport.setCrewsNum(airport.getCrewsNum()+1);
                AddCrewController addCrewController = new AddCrewController(airport);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(addCrewController.getAddCrewView()));
                addCityStage.setWidth(850);
                addCityStage.setHeight(460);
                for (int i = 0; i < AddTerminalController.getCity().getPerson().size(); i++) {
                    if (AddTerminalController.getCity().getPerson().get(i).getJob().compareToIgnoreCase("CREW") == 0 && !AddTerminalController.getCity().getPerson().get(i).getWorkerOrNot()) {
                        addCrewController.getAddCrewView().getTableView().getItems().add(AddTerminalController.getCity().getPerson().get(i));
                    }
                }
                addCityStage.show();
            } else {
                JOptionPane.showMessageDialog(null, "You don't have enough money", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        });

        AddAirportView.getExitBTN().setOnAction(event -> {
            AddTerminalController.AddAirportToCity(airport);
            AddAirportView.getScene().getWindow().hide();
        });
    }

    public void Confirmed() {
        if (AddAirportView.getINTERNATIONAL().isSelected()) {
            setAirport(new Airport(AddTerminalController.getCity().getCityName(), AddAirportView.getTerminalNameTF().getText(), AddAirportView.getAddressTF().getText(), AddAirportView.getMetrazhSP().getValue(), "INTERNATIONAL", AddAirportView.getRunawayNumSP().getValue()));
        } else {
            setAirport(new Airport(AddTerminalController.getCity().getCityName(), AddAirportView.getTerminalNameTF().getText(), AddAirportView.getAddressTF().getText(), AddAirportView.getMetrazhSP().getValue(), "DOMESTIC", AddAirportView.getRunawayNumSP().getValue()));
        }
    }

    public void AddPilot(Person person) {
        airport.setPeople(person);
    }

    public addAirportView getAddAirportView() {
        return AddAirportView;
    }

    public void setAddAirportView(addAirportView addAirportView) {
        AddAirportView = addAirportView;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public addTerminalController getAddTerminalController() {
        return AddTerminalController;
    }

    public void setAddTerminalController(addTerminalController addTerminalController) {
        AddTerminalController = addTerminalController;
    }
}
