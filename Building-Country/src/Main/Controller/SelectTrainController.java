package Main.Controller;

import Main.View.SelectTrainView;

public class SelectTrainController {
    private SelectTrainView selectTrainView;
    public SelectTrainController(TravelController travelController){
        setSelectTrainView(new SelectTrainView());
        selectTrainView.getSelectedBTN().setOnAction(event -> {
            travelController.SetVehicleFotTrip(selectTrainView.getTableView().getSelectionModel().getSelectedItem());
            selectTrainView.getScene().getWindow().hide();
        });
    }

    public SelectTrainView getSelectTrainView() {
        return selectTrainView;
    }

    public void setSelectTrainView(SelectTrainView selectTrainView) {
        this.selectTrainView = selectTrainView;
    }
}
