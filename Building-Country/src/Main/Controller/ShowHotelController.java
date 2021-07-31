package Main.Controller;

import Main.Buildings.Hotel;
import Main.View.ShowHotelServicesView;
import Main.View.ShowHotelView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;

public class ShowHotelController {
    private ShowHotelView showHotelView;
    public ShowHotelController(){
        setShowHotelView(new ShowHotelView());

        showHotelView.getShowRoomBTN().setOnAction(event -> {
            Hotel hotel = showHotelView.getTableView().getSelectionModel().getSelectedItem();
            if(hotel.getRooms().size() == 0){
                JOptionPane.showMessageDialog(null,"NO ROOM","ERROR",JOptionPane.WARNING_MESSAGE);
            }
            else {
                ShowRoomController showRoomController = new ShowRoomController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showRoomController.getShowRoomView()));
                addCityStage.setWidth(750);
                addCityStage.setHeight(440);
                for (int i = 0; i < hotel.getRooms().size(); i++) {
                    showRoomController.getShowRoomView().getTableView().getItems().add(hotel.getRooms().get(i));
                }
                addCityStage.show();
            }
        });

        showHotelView.getShowServicesBTN().setOnAction(event -> {
            Hotel hotel = showHotelView.getTableView().getSelectionModel().getSelectedItem();
            if(hotel.getServices().size() == 0){
                JOptionPane.showMessageDialog(null,"NO SERVICE","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else {
                ShowHotelServicesController showHotelServicesController = new ShowHotelServicesController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(showHotelServicesController.getShowHotelServicesView()));
                addCityStage.setWidth(280);
                addCityStage.setHeight(320);
                for (int i = 0; i < hotel.getServices().size(); i++) {
                    if(hotel.getServices().get(i).name().equals("LAUNDRY")){
                        showHotelServicesController.getShowHotelServicesView().getLAUNDRY().setSelected(true);
                    }
                    if(hotel.getServices().get(i).name().equals("GYM")){
                        showHotelServicesController.getShowHotelServicesView().getGYM().setSelected(true);
                    }
                    if(hotel.getServices().get(i).name().equals("POOL")){
                        showHotelServicesController.getShowHotelServicesView().getPOOL().setSelected(true);
                    }
                    if(hotel.getServices().get(i).name().equals("RESTAURANT")){
                        showHotelServicesController.getShowHotelServicesView().getRESTAURANT().setSelected(true);
                    }
                    if(hotel.getServices().get(i).name().equals("CAFE")){
                        showHotelServicesController.getShowHotelServicesView().getCAFE().setSelected(true);
                    }
                    if(hotel.getServices().get(i).name().equals("STORE")){
                        showHotelServicesController.getShowHotelServicesView().getSTORE().setSelected(true);
                    }
                    if(hotel.getServices().get(i).name().equals("LIBRARY")){
                        showHotelServicesController.getShowHotelServicesView().getLIBRARY().setSelected(true);
                    }
                    if(hotel.getServices().get(i).name().equals("BEAUTYSALON")){
                        showHotelServicesController.getShowHotelServicesView().getBEAUTYSALON().setSelected(true);
                    }
                    if(hotel.getServices().get(i).name().equals("CINEMA")){
                        showHotelServicesController.getShowHotelServicesView().getCINEMA().setSelected(true);
                    }
                    if(hotel.getServices().get(i).name().equals("CLINIC")){
                        showHotelServicesController.getShowHotelServicesView().getCLINIC().setSelected(true);
                    }
                    if(hotel.getServices().get(i).name().equals("PARK")){
                        showHotelServicesController.getShowHotelServicesView().getPARK().setSelected(true);
                    }
                    if(hotel.getServices().get(i).name().equals("GAMENET")){
                        showHotelServicesController.getShowHotelServicesView().getGAMENET().setSelected(true);
                    }
                    if(hotel.getServices().get(i).name().equals("FREEINTERNET")){
                        showHotelServicesController.getShowHotelServicesView().getFREEINTERNET().setSelected(true);
                    }
                }
                addCityStage.show();
            }
        });

        showHotelView.getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    showHotelView.getScene().getWindow().hide();
            }
        });
    }

    public ShowHotelView getShowHotelView() {
        return showHotelView;
    }

    public void setShowHotelView(ShowHotelView showHotelView) {
        this.showHotelView = showHotelView;
    }
}
