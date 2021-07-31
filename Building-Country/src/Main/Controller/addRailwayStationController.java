package Main.Controller;

import Main.Buildings.RailwayStation;
import Main.Vehicles.Train;
import Main.View.addRailwayStationView;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class addRailwayStationController {
    private addRailwayStationView AddRailwayStationView;
    private addTerminalController AddTerminalController;
    private RailwayStation railwayStation;
    public addRailwayStationController(addTerminalController AddTerminalController){
        setAddRailwayStationView(new addRailwayStationView());
        this.AddTerminalController = AddTerminalController;

        AddRailwayStationView.getConfirmed().setOnAction(event -> {
            Confirmed();
            AddRailwayStationView.getTerminalNameTF().setEditable(false);
            AddRailwayStationView.getAddressTF().setEditable(false);
            AddRailwayStationView.getMetrazhSP().setEditable(false);
            AddRailwayStationView.getInputRailsSP().setEditable(false);
            AddRailwayStationView.getOutputRailsSP().setEditable(false);
            AddRailwayStationView.getConfirmed().setDisable(true);
            AddRailwayStationView.getAddTrain().setDisable(false);
            AddRailwayStationView.getAddLocomotives().setDisable(false);
            AddRailwayStationView.getExit().setDisable(false);
        });

        AddRailwayStationView.getAddTrain().setOnAction(event -> {
            if(AddTerminalController.getCity().getHoleMoney() - Train.getPrice() >= 0) {
                AddTerminalController.getCity().setHoleMoney(AddTerminalController.getCity().getHoleMoney() - Train.getPrice());
                addTrainController AddTrainController = new addTrainController(railwayStation);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(AddTrainController.getAddTrainView()));
                addCityStage.setWidth(650);
                addCityStage.setHeight(650);
                addCityStage.show();
            }else {
                JOptionPane.showMessageDialog(null,"You don't have enough money","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        });

        AddRailwayStationView.getAddLocomotives().setOnAction(event -> {
            if(AddTerminalController.getCity().getHoleMoney() - 3.0 >= 0) {
                AddTerminalController.getCity().setHoleMoney(AddTerminalController.getCity().getHoleMoney() - 3.0);
            AddCrewController addCrewController = new AddCrewController(railwayStation);
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(addCrewController.getAddCrewView()));
            addCityStage.setWidth(850);
            addCityStage.setHeight(460);
            for(int i=0;i<AddTerminalController.getCity().getPerson().size();i++){
                if(AddTerminalController.getCity().getPerson().get(i).getJob().compareToIgnoreCase("LOCOMOTIVES") == 0 && !AddTerminalController.getCity().getPerson().get(i).getWorkerOrNot()){
                    addCrewController.getAddCrewView().getTableView().getItems().add(AddTerminalController.getCity().getPerson().get(i));
                }
            }
            addCityStage.show();
            }else{
                JOptionPane.showMessageDialog(null,"You don't have enough money","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        });

        AddRailwayStationView.getExit().setOnAction(event -> {
            AddTerminalController.AddRailwayStationToCity(railwayStation);
            AddRailwayStationView.getScene().getWindow().hide();
        });
    }

    public void Confirmed(){
        railwayStation = new RailwayStation(AddTerminalController.getCity().getCityName(),AddRailwayStationView.getTerminalNameTF().getText(),AddRailwayStationView.getAddressTF().getText(),AddRailwayStationView.getMetrazhSP().getValue(),AddRailwayStationView.getInputRailsSP().getValue(),AddRailwayStationView.getOutputRailsSP().getValue());
    }

    public addRailwayStationView getAddRailwayStationView() {
        return AddRailwayStationView;
    }

    public void setAddRailwayStationView(addRailwayStationView addRailwayStationView) {
        AddRailwayStationView = addRailwayStationView;
    }

    public addTerminalController getAddTerminalController() {
        return AddTerminalController;
    }

    public void setAddTerminalController(addTerminalController addTerminalController) {
        AddTerminalController = addTerminalController;
    }

    public RailwayStation getRailwayStation() {
        return railwayStation;
    }

    public void setRailwayStation(RailwayStation railwayStation) {
        this.railwayStation = railwayStation;
    }
}
