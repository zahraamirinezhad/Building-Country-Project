package Main.Controller;

import Main.View.ShowTarakoneshView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ShowTarakoneshController {
    private ShowTarakoneshView showTarakoneshView;
    public ShowTarakoneshController(){
        setShowTarakoneshView(new ShowTarakoneshView());

        showTarakoneshView.getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showTarakoneshView.getScene().getWindow().hide();
            }
        });
    }

    public ShowTarakoneshView getShowTarakoneshView() {
        return showTarakoneshView;
    }

    public void setShowTarakoneshView(ShowTarakoneshView showTarakoneshView) {
        this.showTarakoneshView = showTarakoneshView;
    }
}
