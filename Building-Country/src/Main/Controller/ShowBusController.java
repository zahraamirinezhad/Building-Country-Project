package Main.Controller;

import Main.View.ShowBusView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ShowBusController {
    private ShowBusView showBusView;
    public ShowBusController(){
        setShowBusView(new ShowBusView());
        showBusView.getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showBusView.getScene().getWindow().hide();
            }
        });
    }

    public ShowBusView getShowBusView() {
        return showBusView;
    }

    public void setShowBusView(ShowBusView showBusView) {
        this.showBusView = showBusView;
    }
}
