package Main.Controller;

import Main.Bank.Bank;
import Main.City;
import Main.View.EnterTheBankView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EnterTheBankController {
    private EnterTheBankView enterTheBankView;
    public EnterTheBankController(Bank bank, City city){
        setEnterTheBankView(new EnterTheBankView());

        enterTheBankView.getOPENING_A_BANK_ACCOUNT().setOnAction(event -> {
            OpeningAnAccountController openingAnAccountController = new OpeningAnAccountController(city,bank);
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(openingAnAccountController.getOpeningAnAccountView()));
            addCityStage.setWidth(600);
            addCityStage.setHeight(460);
            addCityStage.show();
        });

        enterTheBankView.getLOGIN().setOnAction(event -> {
            bank.SetAliveAccountsAndHoleMoney();
            LoginController loginController = new LoginController(bank);
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(loginController.getLoginView()));
            addCityStage.setWidth(500);
            addCityStage.setHeight(200);
            addCityStage.show();
        });

        enterTheBankView.getSHOW_BANK_INFORMATION().setOnAction(event -> {
            ShowBankInformationController showBankInformationController = new ShowBankInformationController();
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(showBankInformationController.getShowBankInformationView()));
            addCityStage.setWidth(850);
            addCityStage.setHeight(350);
            showBankInformationController.getShowBankInformationView().getTableView().getItems().add(bank);
            addCityStage.show();
        });

        enterTheBankView.getEXIT().setOnAction(event -> {
            enterTheBankView.getScene().getWindow().hide();
        });
    }



    public EnterTheBankView getEnterTheBankView() {
        return enterTheBankView;
    }

    public void setEnterTheBankView(EnterTheBankView enterTheBankView) {
        this.enterTheBankView = enterTheBankView;
    }
}
