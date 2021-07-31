package Main.Controller;

import Main.Bank.Bank;
import Main.View.ShowBankInformationView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ShowBankInformationController {
    private ShowBankInformationView showBankInformationView;
    public ShowBankInformationController(){
        setShowBankInformationView(new ShowBankInformationView());

        showBankInformationView.getShowHesabBanki().setOnAction(event -> {
            Bank bank = showBankInformationView.getTableView().getSelectionModel().getSelectedItem();
            ShowHesabBankiInformationController showHesabBankiInformationController = new ShowHesabBankiInformationController();
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(showHesabBankiInformationController.getShowHesabBankiInformationView()));
            addCityStage.setWidth(550);
            addCityStage.setHeight(300);
            for(int i=0;i<bank.getHesabHaBanki().size();i++){
                showHesabBankiInformationController.getShowHesabBankiInformationView().getTableView().getItems().add(bank.getHesabHaBanki().get(i));
            }
            addCityStage.show();
        });

        showBankInformationView.getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showBankInformationView.getScene().getWindow().hide();
            }
        });
    }

    public ShowBankInformationView getShowBankInformationView() {
        return showBankInformationView;
    }

    public void setShowBankInformationView(ShowBankInformationView showBankInformationView) {
        this.showBankInformationView = showBankInformationView;
    }
}
