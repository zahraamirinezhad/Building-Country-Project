package Main.Controller;

import Main.Buildings.Hotel;
import Main.View.SelectHotelView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SelectHotelController {
    private SelectHotelView selectHotelView;
    public SelectHotelController(){
        setSelectHotelView(new SelectHotelView());
        selectHotelView.getSelected().setOnAction(event -> {
            Hotel hotel = selectHotelView.getTableView().getSelectionModel().getSelectedItem();
            addRoomController AddRoomController = new addRoomController(hotel);
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(AddRoomController.getAddRoomView()));
            addCityStage.setWidth(650);
            addCityStage.setHeight(650);
            addCityStage.show();
            selectHotelView.getScene().getWindow().hide();
        });
    }

    public SelectHotelView getSelectHotelView() {
        return selectHotelView;
    }

    public void setSelectHotelView(SelectHotelView selectHotelView) {
        this.selectHotelView = selectHotelView;
    }
}
