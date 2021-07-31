package Main.Controller;

import Main.Buildings.ShippingPort;
import Main.View.ShowShipPortForShowingTravelView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ShowShipPortForShowingTravelController {
    private ShowShipPortForShowingTravelView showShipPortForShowingTravelView;
    public ShowShipPortForShowingTravelController(){
        setShowShipPortForShowingTravelView(new ShowShipPortForShowingTravelView());

        showShipPortForShowingTravelView.getShowTripsBTN().setOnAction(event -> {
            ShippingPort shippingPort = showShipPortForShowingTravelView.getTableView().getSelectionModel().getSelectedItem();
            shippingPort.SwapTrips();
            ShowTripTypeController showTripTypeController = new ShowTripTypeController(shippingPort);
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(showTripTypeController.getShowTripTypeView()));
            addCityStage.setWidth(400);
            addCityStage.setHeight(200);
            addCityStage.show();
        });

        showShipPortForShowingTravelView.getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showShipPortForShowingTravelView.getScene().getWindow().hide();
            }
        });
    }

    public ShowShipPortForShowingTravelView getShowShipPortForShowingTravelView() {
        return showShipPortForShowingTravelView;
    }

    public void setShowShipPortForShowingTravelView(ShowShipPortForShowingTravelView showShipPortForShowingTravelView) {
        this.showShipPortForShowingTravelView = showShipPortForShowingTravelView;
    }
}
