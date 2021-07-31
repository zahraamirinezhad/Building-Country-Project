package Main.Controller;

import Main.Vehicles.Ship;
import Main.Vehicles.Train;
import Main.View.ShowTrainsView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class ShowTrainsController {
    private ShowTrainsView showTrainsView;
    public ShowTrainsController(){
        setShowTrainsView(new ShowTrainsView());

        showTrainsView.getShowServices().setOnAction(event -> {
            Train train = showTrainsView.getTableView().getSelectionModel().getSelectedItem();
            if(train.getServices().size() == 0){
                JOptionPane.showMessageDialog(null,"NO SERVICE","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else {
                ShowVehicleServicesController showVehicleServicesController = new ShowVehicleServicesController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showVehicleServicesController.getShowVehicleServicesView()));
                addCityStage.setWidth(250);
                addCityStage.setHeight(400);
                for (int i = 0; i < train.getServices().size(); i++) {
                    if(train.getServices().get(i).name().equals("RESTAURANT")){
                        showVehicleServicesController.getShowVehicleServicesView().getRESTAURANT().setSelected(true);
                    }
                    else if(train.getServices().get(i).name().equals("WATCH_MOVIE")){
                        showVehicleServicesController.getShowVehicleServicesView().getWATCH_MOVIE().setSelected(true);
                    }
                    else if(train.getServices().get(i).name().equals("LISTENING_MUSIC")){
                        showVehicleServicesController.getShowVehicleServicesView().getLISTENING_MUSIC().setSelected(true);
                    }
                    else if(train.getServices().get(i).name().equals("TOILET_BATH")){
                        showVehicleServicesController.getShowVehicleServicesView().getTOILET_BATH().setSelected(true);
                    }
                    else if(train.getServices().get(i).name().equals("READING_BOOK_NEWSPAPER")){
                        showVehicleServicesController.getShowVehicleServicesView().getREADING_BOOK_NEWSPAPER().setSelected(true);
                    }
                }
                addCityStage.show();
            }
        });

        showTrainsView.getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showTrainsView.getScene().getWindow().hide();
            }
        });
    }

    public ShowTrainsView getShowTrainsView() {
        return showTrainsView;
    }

    public void setShowTrainsView(ShowTrainsView showTrainsView) {
        this.showTrainsView = showTrainsView;
    }
}
