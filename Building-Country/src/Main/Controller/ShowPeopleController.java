package Main.Controller;

import Main.View.ShowPeopleView;

public class ShowPeopleController {
    private ShowPeopleView showPeopleView;
    public ShowPeopleController(){
        setShowPeopleView(new ShowPeopleView());
        showPeopleView.getExitBTN().setOnAction(event -> {
            showPeopleView.getScene().getWindow().hide();
        });
    }

    public ShowPeopleView getShowPeopleView() {
        return showPeopleView;
    }

    public void setShowPeopleView(ShowPeopleView showPeopleView) {
        this.showPeopleView = showPeopleView;
    }
}
