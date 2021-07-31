package Main.Controller;

import Main.View.SelectPersonView;

public class SelectPassengerForTravelController {
    private SelectPersonView selectPersonView;
    public SelectPassengerForTravelController(TravelController travelController){
        setSelectPassengerForTravelView(new SelectPersonView());
        selectPersonView.getSelectedBTN().setOnAction(event -> {
            travelController.SetPassengerForTrip(selectPersonView.getTableView().getSelectionModel().getSelectedItem());
            selectPersonView.getTableView().getItems().remove(selectPersonView.getTableView().getSelectionModel().getSelectedItem());
            selectPersonView.getScene().getWindow().hide();
        });
    }

    public SelectPersonView getSelectPassengerForTravelView() {
        return selectPersonView;
    }

    public void setSelectPassengerForTravelView(SelectPersonView selectPersonView) {
        this.selectPersonView = selectPersonView;
    }
}
