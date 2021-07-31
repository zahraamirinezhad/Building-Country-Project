package Main.Controller;

import Main.Buildings.Airport;
import Main.View.ShowAirportForShowingTravelView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ShowAirportForShowingTravelController {
    private ShowAirportForShowingTravelView showAirportForShowingTravelView;

    public ShowAirportForShowingTravelController() {
        setShowAirportForShowingTravelView(new ShowAirportForShowingTravelView());

        showAirportForShowingTravelView.getShowTripsBTN().setOnAction(event -> {
            Airport airport = showAirportForShowingTravelView.getTableView().getSelectionModel().getSelectedItem();
            airport.SwapTrips();
            ShowTripTypeController showTripTypeController = new ShowTripTypeController(airport);
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(showTripTypeController.getShowTripTypeView()));
            addCityStage.setWidth(400);
            addCityStage.setHeight(200);
            addCityStage.show();
        });

        showAirportForShowingTravelView.getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showAirportForShowingTravelView.getScene().getWindow().hide();
            }
        });
    }

    public ShowAirportForShowingTravelView getShowAirportForShowingTravelView() {
        return showAirportForShowingTravelView;
    }

    public void setShowAirportForShowingTravelView(ShowAirportForShowingTravelView showAirportForShowingTravelView) {
        this.showAirportForShowingTravelView = showAirportForShowingTravelView;
    }
}
