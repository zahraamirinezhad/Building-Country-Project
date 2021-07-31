package Main.Controller;

import Main.View.SelectPersonView;

public class SelectDriverForTravelController {
    private SelectPersonView selectPersonView;
    public SelectDriverForTravelController(TravelController travelController){
        setSelectPassengerForTravelView(new SelectPersonView());

        selectPersonView.getSelectedBTN().setOnAction(event -> {
            travelController.SetDriverFotTrip(selectPersonView.getTableView().getSelectionModel().getSelectedItem());
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
