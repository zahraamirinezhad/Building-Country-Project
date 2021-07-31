package Main.Controller;

import Main.Buildings.RailwayStation;
import Main.View.ShowRailwayStationForShowingTravelView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ShowRailwayStationForShowingTravelController {
    private ShowRailwayStationForShowingTravelView showRailwayStationForShowingTravelView;
    public ShowRailwayStationForShowingTravelController(){
        setShowRailwayStationForShowingTravelView(new ShowRailwayStationForShowingTravelView());

        showRailwayStationForShowingTravelView.getShowTripsBTN().setOnAction(event -> {
            RailwayStation railwayStation = showRailwayStationForShowingTravelView.getTableView().getSelectionModel().getSelectedItem();
            railwayStation.SwapTrips();
            ShowTripTypeController showTripTypeController = new ShowTripTypeController(railwayStation);
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(showTripTypeController.getShowTripTypeView()));
            addCityStage.setWidth(400);
            addCityStage.setHeight(200);
            addCityStage.show();
        });

        showRailwayStationForShowingTravelView.getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showRailwayStationForShowingTravelView.getScene().getWindow().hide();
            }
        });
    }

    public ShowRailwayStationForShowingTravelView getShowRailwayStationForShowingTravelView() {
        return showRailwayStationForShowingTravelView;
    }

    public void setShowRailwayStationForShowingTravelView(ShowRailwayStationForShowingTravelView showRailwayStationForShowingTravelView) {
        this.showRailwayStationForShowingTravelView = showRailwayStationForShowingTravelView;
    }
}
