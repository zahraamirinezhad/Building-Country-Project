package Main.Controller;

import Main.Bank.Bank;
import Main.City;
import Main.View.SelectBankToEnterView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SelectBankToEnterController {
    private SelectBankToEnterView selectBankToEnterView;

    public SelectBankToEnterController(City city){
        setSelectBankToEnterView(new SelectBankToEnterView());

        selectBankToEnterView.getEnterBTN().setOnAction(event -> {
            Bank bank = selectBankToEnterView.getTableView().getSelectionModel().getSelectedItem();
            EnterTheBankController enterTheBankController = new EnterTheBankController(bank,city);
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(enterTheBankController.getEnterTheBankView()));
            addCityStage.setWidth(450);
            addCityStage.setHeight(340);
            addCityStage.show();
            selectBankToEnterView.getScene().getWindow().hide();
        });
    }

    public SelectBankToEnterView getSelectBankToEnterView() {
        return selectBankToEnterView;
    }

    public void setSelectBankToEnterView(SelectBankToEnterView selectBankToEnterView) {
        this.selectBankToEnterView = selectBankToEnterView;
    }
}
