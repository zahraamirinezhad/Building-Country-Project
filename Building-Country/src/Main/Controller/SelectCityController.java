package Main.Controller;

import Main.City;
import Main.View.SelectCityView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SelectCityController {
    private SelectCityView selectCityView;
    public SelectCityController(String command){
        setSelectCityView(new SelectCityView());
        selectCityView.getSelected().setOnAction(event -> {
            if(command.compareToIgnoreCase("ENTER CITY") == 0) {
                City city = selectCityView.getTableView().getSelectionModel().getSelectedItem();
                EnterCityController addCityController = new EnterCityController(city);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(addCityController.getEnterCityView()));
                addCityStage.setWidth(750);
                addCityStage.setHeight(500);
                addCityStage.show();
                selectCityView.getScene().getWindow().hide();
            }
            else if(command.compareToIgnoreCase("SHOW INFORMATION") == 0){
                City city = selectCityView.getTableView().getSelectionModel().getSelectedItem();
                ShowCitiesInformationController addCityController = new ShowCitiesInformationController(city);
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(addCityController.getShowCitiesInformationView()));
                addCityStage.setWidth(450);
                addCityStage.setHeight(440);
                addCityStage.show();
                selectCityView.getScene().getWindow().hide();
            }
        });
    }

    public SelectCityView getSelectCityView() {
        return selectCityView;
    }

    public void setSelectCityView(SelectCityView selectCityView) {
        this.selectCityView = selectCityView;
    }
}
