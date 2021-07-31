package Main.Controller;

import Main.Buildings.ShippingPort;
import Main.Vehicles.Boat;
import Main.Vehicles.Ship;
import Main.View.addShipPortView;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;

public class addShipPortController {
    private addShipPortView AddShipPortView;
    private addTerminalController AddTerminalController;
    private ShippingPort shippingPort;

    public addShipPortController(addTerminalController AddTerminalController) {
        setAddShipPortView(new addShipPortView());
        this.AddTerminalController = AddTerminalController;
        AddShipPortView.getConfirmed().setOnAction(event -> {
            Confirmed();
            AddShipPortView.getTerminalNameTF().setEditable(false);
            AddShipPortView.getAddressTF().setEditable(false);
            AddShipPortView.getMetrazhSP().setEditable(false);
            AddShipPortView.getStageNumSP().setEditable(false);
            AddShipPortView.getConfirmed().setDisable(true);
            AddShipPortView.getAddShip().setDisable(false);
            AddShipPortView.getAddBoat().setDisable(false);
            AddShipPortView.getAddSailor().setDisable(false);
            AddShipPortView.getExit().setDisable(false);
        });

        AddShipPortView.getAddShip().setOnAction(event -> {
            if (AddTerminalController.getCity().getHoleMoney() - Ship.getPrice() >= 0) {
                AddTerminalController.getCity().setHoleMoney(AddTerminalController.getCity().getHoleMoney() - Ship.getPrice());
                addShipController AddShipController = new addShipController(shippingPort);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(AddShipController.getAddShipView()));
                addCityStage.setWidth(650);
                addCityStage.setHeight(650);
                addCityStage.show();
            } else {
                JOptionPane.showMessageDialog(null, "You don't have enough money", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        });

        AddShipPortView.getAddBoat().setOnAction(event -> {
            if (AddTerminalController.getCity().getHoleMoney() - Boat.getPrice() >= 0) {
                AddTerminalController.getCity().setHoleMoney(AddTerminalController.getCity().getHoleMoney() - Boat.getPrice());
                addBoatController AddBoatController = new addBoatController(shippingPort);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(AddBoatController.getAddBoatView()));
                addCityStage.setWidth(550);
                addCityStage.setHeight(550);
                addCityStage.show();
            } else {
                JOptionPane.showMessageDialog(null, "You don't have enough money", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        });

        AddShipPortView.getAddSailor().setOnAction(event -> {
            if (AddTerminalController.getCity().getHoleMoney() - 4.0 >= 0) {
                AddTerminalController.getCity().setHoleMoney(AddTerminalController.getCity().getHoleMoney() - 4.0);
                AddCrewController addCrewController = new AddCrewController(shippingPort);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(addCrewController.getAddCrewView()));
                addCityStage.setWidth(850);
                addCityStage.setHeight(460);
                for (int i = 0; i < AddTerminalController.getCity().getPerson().size(); i++) {
                    if (AddTerminalController.getCity().getPerson().get(i).getJob().compareToIgnoreCase("SAILOR") == 0 && !AddTerminalController.getCity().getPerson().get(i).getWorkerOrNot()) {
                        addCrewController.getAddCrewView().getTableView().getItems().add(AddTerminalController.getCity().getPerson().get(i));
                    }
                }
                addCityStage.show();
            } else {
                JOptionPane.showMessageDialog(null, "You don't have enough money", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        });

        AddShipPortView.getExit().setOnAction(event -> {
            AddTerminalController.AddShippingPortToCity(shippingPort);
            AddShipPortView.getScene().getWindow().hide();
        });

    }

    public void Confirmed() {
        shippingPort = new ShippingPort(AddTerminalController.getCity().getCityName(), AddShipPortView.getTerminalNameTF().getText(), AddShipPortView.getAddressTF().getText(), AddShipPortView.getMetrazhSP().getValue(), AddShipPortView.getStageNumSP().getValue());
    }

    public addShipPortView getAddShipPortView() {
        return AddShipPortView;
    }

    public void setAddShipPortView(addShipPortView AddShipPortView) {
        this.AddShipPortView = AddShipPortView;
    }

    public addTerminalController getAddTerminalController() {
        return AddTerminalController;
    }

    public void setAddTerminalController(addTerminalController addTerminalController) {
        AddTerminalController = addTerminalController;
    }

    public ShippingPort getShippingPort() {
        return shippingPort;
    }

    public void setShippingPort(ShippingPort shippingPort) {
        this.shippingPort = shippingPort;
    }
}
