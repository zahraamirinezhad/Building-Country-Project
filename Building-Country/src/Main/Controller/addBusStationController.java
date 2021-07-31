package Main.Controller;

import Main.Buildings.BusTerminal;
import Main.Vehicles.Bus;
import Main.Vehicles.PassengerPlane;
import Main.View.addBusStationView;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;

public class addBusStationController {
    private addBusStationView AddBusStationView;
    private BusTerminal busTerminal;
    private addTerminalController AddTerminalController;
    public addBusStationController(addTerminalController AddTerminalController){
        setAddBusStationView(new addBusStationView());
        this.AddTerminalController = AddTerminalController;
        AddBusStationView.getConfirmed().setOnAction(event -> {
            Confirmed();
            AddBusStationView.getTerminalNameTF().setEditable(false);
            AddBusStationView.getAddressTF().setEditable(false);
            AddBusStationView.getMetrazhSP().setEditable(false);
            AddBusStationView.getConfirmed().setDisable(true);
            AddBusStationView.getAddDriver().setDisable(false);
            AddBusStationView.getAddBus().setDisable(false);
            AddBusStationView.getExit().setDisable(false);
        });

        AddBusStationView.getAddBus().setOnAction(event -> {
            if(AddTerminalController.getCity().getHoleMoney() - Bus.getPrice() >= 0) {
                AddTerminalController.getCity().setHoleMoney(AddTerminalController.getCity().getHoleMoney() - Bus.getPrice());
                addBusController AddBusController = new addBusController(busTerminal);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(AddBusController.getAddBusView()));
                addCityStage.setWidth(550);
                addCityStage.setHeight(550);
                addCityStage.show();
            }
            else {
                JOptionPane.showMessageDialog(null,"You don't have enough money","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        });

        AddBusStationView.getAddDriver().setOnAction(event -> {
            if(AddTerminalController.getCity().getHoleMoney() - 1.0 >= 0) {
                AddTerminalController.getCity().setHoleMoney(AddTerminalController.getCity().getHoleMoney() - 1.0);
            AddCrewController addCrewController = new AddCrewController(busTerminal);
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(addCrewController.getAddCrewView()));
            addCityStage.setWidth(850);
            addCityStage.setHeight(460);
            for(int i=0;i<AddTerminalController.getCity().getPerson().size();i++){
                if(AddTerminalController.getCity().getPerson().get(i).getJob().compareToIgnoreCase("DRIVER") == 0 && !AddTerminalController.getCity().getPerson().get(i).getWorkerOrNot()){
                    addCrewController.getAddCrewView().getTableView().getItems().add(AddTerminalController.getCity().getPerson().get(i));
                }
            }
            addCityStage.show();
            }else{
                JOptionPane.showMessageDialog(null,"You don't have enough money","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        });

        AddBusStationView.getExit().setOnAction(event -> {
            AddTerminalController.AddBusStationToCity(busTerminal);
            AddBusStationView.getScene().getWindow().hide();
        });

    }

    public void Confirmed(){
        busTerminal = new BusTerminal(getAddTerminalController().getCity().getCityName(),AddBusStationView.getTerminalNameTF().getText(),AddBusStationView.getAddressTF().getText(),AddBusStationView.getMetrazhSP().getValue());
    }

    public addBusStationView getAddBusStationView() {
        return AddBusStationView;
    }

    public void setAddBusStationView(addBusStationView addBusStationView) {
        AddBusStationView = addBusStationView;
    }

    public BusTerminal getBusTerminal() {
        return busTerminal;
    }

    public void setBusTerminal(BusTerminal busTerminal) {
        this.busTerminal = busTerminal;
    }

    public addTerminalController getAddTerminalController() {
        return AddTerminalController;
    }

    public void setAddTerminalController(addTerminalController addTerminalController) {
        AddTerminalController = addTerminalController;
    }
}
