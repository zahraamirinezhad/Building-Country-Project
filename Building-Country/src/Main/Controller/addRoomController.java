package Main.Controller;

import Main.Buildings.Hotel;
import Main.Buildings.Room;
import Main.View.addRoomView;

public class addRoomController {
    private addRoomView AddRoomView;
    public addRoomController(Hotel hotel) {
        setAddRoomView(new addRoomView());
        AddRoomView.getOKBTN().setOnAction(e -> {
            hotel.setRooms(new Room(AddRoomView.getRoomNumberSP().getValue(), AddRoomView.getBedNumSP().getValue(), AddRoomView.getMetrazhSP().getValue()));
            AddRoomView.getScene().getWindow().hide();
        });
    }

    public addRoomView getAddRoomView() {
        return AddRoomView;
    }

    public void setAddRoomView(addRoomView addRoomView) {
        AddRoomView = addRoomView;
    }

}
