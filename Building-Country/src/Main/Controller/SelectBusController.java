package Main.Controller;

import Main.View.SelectBusView;

public class SelectBusController {
    private SelectBusView selectBusView;
    public SelectBusController(TravelController travelController){
        setSelectBusView(new SelectBusView());
        selectBusView.getSelectedBTN().setOnAction(event -> {
            travelController.SetVehicleFotTrip(selectBusView.getTableView().getSelectionModel().getSelectedItem());
            selectBusView.getScene().getWindow().hide();
        });
    }

    public SelectBusView getSelectBusView() {
        return selectBusView;
    }

    public void setSelectBusView(SelectBusView selectBusView) {
        this.selectBusView = selectBusView;
    }
}
