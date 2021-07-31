package Main.Controller;

import Main.Buildings.BusTerminal;
import Main.View.ShowBusStationForShowingTravelView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ShowBusStationForShowingTravelController {
    private ShowBusStationForShowingTravelView showBusStationForShowingTravelView;
    public ShowBusStationForShowingTravelController(){
        setShowBusStationForShowingTravelView(new ShowBusStationForShowingTravelView());

        showBusStationForShowingTravelView.getShowTripsBTN().setOnAction(event -> {
            BusTerminal busTerminal = showBusStationForShowingTravelView.getTableView().getSelectionModel().getSelectedItem();
            busTerminal.SwapTrips();
            ShowTripTypeController showTripTypeController = new ShowTripTypeController(busTerminal);
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(showTripTypeController.getShowTripTypeView()));
            addCityStage.setWidth(400);
            addCityStage.setHeight(200);
            addCityStage.show();
        });

        showBusStationForShowingTravelView.getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showBusStationForShowingTravelView.getScene().getWindow().hide();
            }
        });
    }

    public ShowBusStationForShowingTravelView getShowBusStationForShowingTravelView() {
        return showBusStationForShowingTravelView;
    }

    public void setShowBusStationForShowingTravelView(ShowBusStationForShowingTravelView showBusStationForShowingTravelView) {
        this.showBusStationForShowingTravelView = showBusStationForShowingTravelView;
    }
}
