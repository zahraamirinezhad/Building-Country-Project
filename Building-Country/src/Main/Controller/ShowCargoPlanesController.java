package Main.Controller;

import Main.View.ShowCargoPlanesView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ShowCargoPlanesController {
    private ShowCargoPlanesView showCargoPlanesView;
    public ShowCargoPlanesController(){
        setShowCargoPlanesView(new ShowCargoPlanesView());
        showCargoPlanesView.getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showCargoPlanesView.getScene().getWindow().hide();
            }
        });
    }

    public ShowCargoPlanesView getShowCargoPlanesView() {
        return showCargoPlanesView;
    }

    public void setShowCargoPlanesView(ShowCargoPlanesView showCargoPlanesView) {
        this.showCargoPlanesView = showCargoPlanesView;
    }
}
