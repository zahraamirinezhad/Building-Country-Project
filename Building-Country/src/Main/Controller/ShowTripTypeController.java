package Main.Controller;

import Main.Buildings.Terminal;
import Main.View.ShowTripTypeView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ShowTripTypeController {
    private ShowTripTypeView showTripTypeView;
    public ShowTripTypeController(Terminal terminal){
        setShowTripTypeView(new ShowTripTypeView());

        showTripTypeView.getEntrance().setOnAction(event -> {
            ShowTripController showTripController = new ShowTripController();
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(showTripController.getShowTripView()));
            addCityStage.setWidth(1500);
            addCityStage.setHeight(400);
            for (int i = 0; i < terminal.getTrips().size(); i++) {
                if (terminal.getTrips().get(i).getType().compareToIgnoreCase("ENTRANCE") == 0) {
                    showTripController.getShowTripView().getTableView().getItems().add(terminal.getTrips().get(i));
                }
            }
            addCityStage.show();
        });

        showTripTypeView.getOutward().setOnAction(event -> {
            ShowTripController showTripController = new ShowTripController();
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(showTripController.getShowTripView()));
            addCityStage.setWidth(1500);
            addCityStage.setHeight(400);
            for (int i = 0; i < terminal.getTrips().size(); i++) {
                if (terminal.getTrips().get(i).getType().compareToIgnoreCase("OUTWARD") == 0) {
                    showTripController.getShowTripView().getTableView().getItems().add(terminal.getTrips().get(i));
                }
            }
            addCityStage.show();
        });

        showTripTypeView.getAll().setOnAction(event -> {
            ShowTripController showTripController = new ShowTripController();
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(showTripController.getShowTripView()));
            addCityStage.setWidth(1500);
            addCityStage.setHeight(400);
            for (int i = 0; i < terminal.getTrips().size(); i++) {
                showTripController.getShowTripView().getTableView().getItems().add(terminal.getTrips().get(i));
            }
            addCityStage.show();
        });

        showTripTypeView.getExit().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showTripTypeView.getScene().getWindow().hide();
            }
        });
    }

    public ShowTripTypeView getShowTripTypeView() {
        return showTripTypeView;
    }

    public void setShowTripTypeView(ShowTripTypeView showTripTypeView) {
        this.showTripTypeView = showTripTypeView;
    }
}
