package Main.Controller;

import Main.View.SelectShipView;

public class SelectShipController {
    private SelectShipView selectShipView;
    public SelectShipController(TravelController travelController){
        setSelectShipView(new SelectShipView());
        selectShipView.getSelectedBTN().setOnAction(event -> {
            travelController.SetVehicleFotTrip(selectShipView.getTableView().getSelectionModel().getSelectedItem());
            selectShipView.getScene().getWindow().hide();
        });
    }

    public SelectShipView getSelectShipView() {
        return selectShipView;
    }

    public void setSelectShipView(SelectShipView selectShipView) {
        this.selectShipView = selectShipView;
    }
}
