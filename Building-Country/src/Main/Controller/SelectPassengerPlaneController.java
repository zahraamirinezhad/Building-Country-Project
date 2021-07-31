package Main.Controller;

import Main.View.SelectPassengerPlaneView;

public class SelectPassengerPlaneController {
    private SelectPassengerPlaneView selectPassengerPlaneView;
    public  SelectPassengerPlaneController(TravelController travelController){
        setSelectPassengerPlaneView(new SelectPassengerPlaneView());
        selectPassengerPlaneView.getSelectedBTN().setOnAction(event -> {
            travelController.SetVehicleFotTrip(selectPassengerPlaneView.getTableView().getSelectionModel().getSelectedItem());
            selectPassengerPlaneView.getScene().getWindow().hide();
        });

    }

    public SelectPassengerPlaneView getSelectPassengerPlaneView() {
        return selectPassengerPlaneView;
    }

    public void setSelectPassengerPlaneView(SelectPassengerPlaneView selectPassengerPlaneView) {
        this.selectPassengerPlaneView = selectPassengerPlaneView;
    }
}
