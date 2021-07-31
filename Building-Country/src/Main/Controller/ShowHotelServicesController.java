package Main.Controller;

import Main.View.ShowHotelServicesView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ShowHotelServicesController {
    private ShowHotelServicesView showHotelServicesView;
    public ShowHotelServicesController(){
        setShowHotelServicesView(new ShowHotelServicesView());

        showHotelServicesView.getExit().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showHotelServicesView.getScene().getWindow().hide();
            }
        });
    }

    public ShowHotelServicesView getShowHotelServicesView() {
        return showHotelServicesView;
    }

    public void setShowHotelServicesView(ShowHotelServicesView showHotelServicesView) {
        this.showHotelServicesView = showHotelServicesView;
    }
}
