package Main.Controller;

import Main.Buildings.Hotel;
import Main.Vehicles.PassengerPlane;
import Main.View.ShowPassengerPlanesView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class ShowPassengerPlanesController {
    private ShowPassengerPlanesView showPassengerPlanesView;
    public ShowPassengerPlanesController(){
        setShowPassengerPlanesView(new ShowPassengerPlanesView());

        showPassengerPlanesView.getShowServices().setOnAction(event -> {
            PassengerPlane passengerPlane = showPassengerPlanesView.getTableView().getSelectionModel().getSelectedItem();
            if(passengerPlane.getServices().size() == 0){
                JOptionPane.showMessageDialog(null,"NO SERVICE","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else {
                ShowVehicleServicesController showVehicleServicesController = new ShowVehicleServicesController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showVehicleServicesController.getShowVehicleServicesView()));
                addCityStage.setWidth(350);
                addCityStage.setHeight(300);
                for (int i = 0; i < passengerPlane.getServices().size(); i++) {
                    if(passengerPlane.getServices().get(i).name().equals("RESTAURANT")){
                        showVehicleServicesController.getShowVehicleServicesView().getRESTAURANT().setSelected(true);
                    }
                    if(passengerPlane.getServices().get(i).name().equals("WATCH_MOVIE")){
                        showVehicleServicesController.getShowVehicleServicesView().getWATCH_MOVIE().setSelected(true);
                    }
                    if(passengerPlane.getServices().get(i).name().equals("LISTENING_MUSIC")){
                        showVehicleServicesController.getShowVehicleServicesView().getLISTENING_MUSIC().setSelected(true);
                    }
                    if(passengerPlane.getServices().get(i).name().equals("TOILET_BATH")){
                        showVehicleServicesController.getShowVehicleServicesView().getTOILET_BATH().setSelected(true);
                    }
                    if(passengerPlane.getServices().get(i).name().equals("READING_BOOK_NEWSPAPER")){
                        showVehicleServicesController.getShowVehicleServicesView().getREADING_BOOK_NEWSPAPER().setSelected(true);
                    }
                }
                addCityStage.show();
            }
        });
        showPassengerPlanesView.getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showPassengerPlanesView.getScene().getWindow().hide();
            }
        });
    }

    public ShowPassengerPlanesView getShowPassengerPlanesView() {
        return showPassengerPlanesView;
    }

    public void setShowPassengerPlanesView(ShowPassengerPlanesView showPassengerPlanesView) {
        this.showPassengerPlanesView = showPassengerPlanesView;
    }
}
