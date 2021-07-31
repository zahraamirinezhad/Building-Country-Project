package Main.Controller;

import Main.View.ShowRoomView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ShowRoomController {
    private ShowRoomView showRoomView;
    public ShowRoomController(){
        setShowRoomView(new ShowRoomView());
        showRoomView.getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showRoomView.getScene().getWindow().hide();
            }
        });
    }

    public ShowRoomView getShowRoomView() {
        return showRoomView;
    }

    public void setShowRoomView(ShowRoomView showRoomView) {
        this.showRoomView = showRoomView;
    }
}
