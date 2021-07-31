package Main.Controller;

import Main.View.ShowBoatView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ShowBoatController {
    private ShowBoatView showBoatView;
    public ShowBoatController(){
        setShowBoatView(new ShowBoatView());
        showBoatView.getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showBoatView.getScene().getWindow().hide();
            }
        });
    }

    public ShowBoatView getShowBoatView() {
        return showBoatView;
    }

    public void setShowBoatView(ShowBoatView showBoatView) {
        this.showBoatView = showBoatView;
    }
}
