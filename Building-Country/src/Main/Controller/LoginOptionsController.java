package Main.Controller;

import Main.Bank.HesabBanki;
import Main.View.LoginOptionsView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginOptionsController {
    private LoginOptionsView loginOptionsView;
    public LoginOptionsController(HesabBanki hesabBanki){
        setLoginOptionsView(new LoginOptionsView());

        loginOptionsView.getVARIZ().setOnAction(event -> {
            VarizController varizController = new VarizController(hesabBanki);
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(varizController.getVarizView()));
            addCityStage.setWidth(550);
            addCityStage.setHeight(400);
            addCityStage.show();
        });

        loginOptionsView.getBARDASHT().setOnAction(event -> {
            BardashtController bardashtController = new BardashtController(hesabBanki);
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(bardashtController.getBardashtView()));
            addCityStage.setWidth(450);
            addCityStage.setHeight(400);
            addCityStage.show();
        });

        loginOptionsView.getSHOW_INFORMATION().setOnAction(event -> {
            ShowHesabBankiInformationController showHesabBankiInformationController = new ShowHesabBankiInformationController();
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(showHesabBankiInformationController.getShowHesabBankiInformationView()));
            addCityStage.setWidth(550);
            addCityStage.setHeight(400);
            showHesabBankiInformationController.getShowHesabBankiInformationView().getTableView().getItems().add(hesabBanki);
            addCityStage.show();
        });

        loginOptionsView.getEXIT().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                loginOptionsView.getScene().getWindow().hide();
            }
        });
    }

    public LoginOptionsView getLoginOptionsView() {
        return loginOptionsView;
    }

    public void setLoginOptionsView(LoginOptionsView loginOptionsView) {
        this.loginOptionsView = loginOptionsView;
    }
}
