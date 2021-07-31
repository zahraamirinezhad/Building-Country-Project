package Main.Controller;

import Main.Buildings.Hotel;
import Main.Buildings.HotelServices;
import Main.Buildings.Room;
import Main.City;
import Main.View.addHotelView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;

public class addHotelController {
    private addHotelView AddHotelView;
    private Hotel hotel;
    private City city;
    public addHotelController(City city){
        setAddHotelView(new addHotelView());
        this.setCity(city);
        AddHotelView.getConfirmedBTN().setOnAction( e-> {
            AddHotel();
            AddHotelView.getHotelNameTF().setEditable(false);
            AddHotelView.getAddressTF().setEditable(false);
            AddHotelView.getStarNumSP().setEditable(false);
            AddHotelView.getConfirmedBTN().setDisable(true);
            AddHotelView.getExitBTN().setDisable(false);
            AddHotelView.getAddRoom().setDisable(false);
            AddHotelView.getService1().setDisable(true);
            AddHotelView.getService2().setDisable(true);
            AddHotelView.getService3().setDisable(true);
            AddHotelView.getService4().setDisable(true);
            AddHotelView.getService5().setDisable(true);
            AddHotelView.getService6().setDisable(true);
            AddHotelView.getService7().setDisable(true);
            AddHotelView.getService8().setDisable(true);
            AddHotelView.getService9().setDisable(true);
            AddHotelView.getService10().setDisable(true);
            AddHotelView.getService11().setDisable(true);
            AddHotelView.getService12().setDisable(true);
            AddHotelView.getService13().setDisable(true);
        });
        AddHotelView.getAddRoom().setOnAction(e->{
            if(getCity().getHoleMoney() - Room.getStayPrice() >= 0) {
                addRoomController AddRoomController = new addRoomController(hotel);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(AddRoomController.getAddRoomView()));
                addCityStage.setWidth(550);
                addCityStage.setHeight(550);
                addCityStage.show();
            }else {
                JOptionPane.showMessageDialog(null,"You don't have enough money","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        });

        AddHotelView.getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                AddHotelView.getScene().getWindow().hide();
            }
        });
    }

    public void AddHotel(){
        setHotel(new Hotel(AddHotelView.getHotelNameTF().getText(), AddHotelView.getAddressTF().getText(), AddHotelView.getStarNumSP().getValue()));
        if(AddHotelView.getService1().isSelected()){
            getHotel().setServices(HotelServices.service[0]);
        }
        if(AddHotelView.getService2().isSelected()){
            getHotel().setServices(HotelServices.service[1]);
        }
        if(AddHotelView.getService3().isSelected()){
            getHotel().setServices(HotelServices.service[2]);
        }
        if(AddHotelView.getService4().isSelected()){
            getHotel().setServices(HotelServices.service[3]);
        }
        if(AddHotelView.getService5().isSelected()){
            getHotel().setServices(HotelServices.service[4]);
        }
        if(AddHotelView.getService6().isSelected()){
            getHotel().setServices(HotelServices.service[5]);
        }
        if(AddHotelView.getService7().isSelected()){
            getHotel().setServices(HotelServices.service[6]);
        }
        if(AddHotelView.getService8().isSelected()){
            getHotel().setServices(HotelServices.service[7]);
        }
        if(AddHotelView.getService9().isSelected()){
            getHotel().setServices(HotelServices.service[8]);
        }
        if(AddHotelView.getService10().isSelected()){
            getHotel().setServices(HotelServices.service[9]);
        }
        if(AddHotelView.getService11().isSelected()){
            getHotel().setServices(HotelServices.service[10]);
        }
        if(AddHotelView.getService12().isSelected()){
            getHotel().setServices(HotelServices.service[11]);
        }
        if(AddHotelView.getService13().isSelected()){
            getHotel().setServices(HotelServices.service[12]);
        }
        getCity().setHotel(hotel);
        getCity().setNumHotel(getCity().getNumHotel()+1);
        getCity().setHoleMoney(getCity().getHoleMoney() - Hotel.getBuildPrice());
    }

    public addHotelView getAddHotelView() {
        return AddHotelView;
    }

    public void setAddHotelView(addHotelView addHotelView) {
        AddHotelView = addHotelView;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
