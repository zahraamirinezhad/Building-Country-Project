package Main.Controller;

import Main.View.ShowVehicleServicesView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ShowVehicleServicesController {
    private ShowVehicleServicesView showVehicleServicesView;
    public ShowVehicleServicesController(){
        setShowVehicleServicesView(new ShowVehicleServicesView());

        showVehicleServicesView.getExit().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showVehicleServicesView.getScene().getWindow().hide();
            }
        });
    }

    public ShowVehicleServicesView getShowVehicleServicesView() {
        return showVehicleServicesView;
    }

    public void setShowVehicleServicesView(ShowVehicleServicesView showVehicleServicesView) {
        this.showVehicleServicesView = showVehicleServicesView;
    }
}
