package Main.Controller;

import Main.View.EnterNameNewCityView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EnterNameNewCityController {
    private EnterNameNewCityView enterNameNewCityView;
    public EnterNameNewCityController(){
        setEnterNameNewCityView(new EnterNameNewCityView());
        enterNameNewCityView.getLetsBuildTheCityBTN().setOnAction(e ->{
                AddCityController addCityController = new AddCityController(enterNameNewCityView.getNameTF().getText());
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(addCityController.getAddCityView()));
                addCityStage.setWidth(500);
                addCityStage.setHeight(600);
                addCityStage.show();
                enterNameNewCityView.getScene().getWindow().hide();

        });
    }

    public EnterNameNewCityView getEnterNameNewCityView() {
        return enterNameNewCityView;
    }

    public void setEnterNameNewCityView(EnterNameNewCityView enterNameNewCityView) {
        this.enterNameNewCityView = enterNameNewCityView;
    }
}
