package Main.Controller;

import Main.Vehicles.PassengerPlane;
import Main.Vehicles.Ship;
import Main.View.ShowShipView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class ShowShipController {
    private ShowShipView showShipView;
    public ShowShipController(){
        setShowShipView(new ShowShipView());

        showShipView.getShowServices().setOnAction(event -> {
            Ship ship = showShipView.getTableView().getSelectionModel().getSelectedItem();
            if(ship.getServices().size() == 0){
                JOptionPane.showMessageDialog(null,"NO SERVICE","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else {
                ShowVehicleServicesController showVehicleServicesController = new ShowVehicleServicesController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showVehicleServicesController.getShowVehicleServicesView()));
                addCityStage.setWidth(250);
                addCityStage.setHeight(400);
                for (int i = 0; i < ship.getServices().size(); i++) {
                    if(ship.getServices().get(i).name().equals("RESTAURANT")){
                        showVehicleServicesController.getShowVehicleServicesView().getRESTAURANT().setSelected(true);
                    }
                    else if(ship.getServices().get(i).name().equals("WATCH_MOVIE")){
                        showVehicleServicesController.getShowVehicleServicesView().getWATCH_MOVIE().setSelected(true);
                    }
                    else if(ship.getServices().get(i).name().equals("LISTENING_MUSIC")){
                        showVehicleServicesController.getShowVehicleServicesView().getLISTENING_MUSIC().setSelected(true);
                    }
                    else if(ship.getServices().get(i).name().equals("TOILET_BATH")){
                        showVehicleServicesController.getShowVehicleServicesView().getTOILET_BATH().setSelected(true);
                    }
                    else if(ship.getServices().get(i).name().equals("READING_BOOK_NEWSPAPER")){
                        showVehicleServicesController.getShowVehicleServicesView().getREADING_BOOK_NEWSPAPER().setSelected(true);
                    }
                }
                addCityStage.show();
            }
        });

        showShipView.getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showShipView.getScene().getWindow().hide();
            }
        });
    }

    public ShowShipView getShowShipView() {
        return showShipView;
    }

    public void setShowShipView(ShowShipView showShipView) {
        this.showShipView = showShipView;
    }
}
