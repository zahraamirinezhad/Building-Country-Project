package Main.Controller;

import Main.Bank.HesabBanki;
import Main.Person;
import Main.View.ShowHesabBankiInformationView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ShowHesabBankiInformationController {
    private ShowHesabBankiInformationView showHesabBankiInformationView;
    public ShowHesabBankiInformationController(){
        setShowHesabBankiInformationView(new ShowHesabBankiInformationView());

        showHesabBankiInformationView.getShowTarakoneshHa().setOnAction(event -> {
            HesabBanki hesabBanki = showHesabBankiInformationView.getTableView().getSelectionModel().getSelectedItem();
            ShowTarakoneshController showTarakoneshController = new ShowTarakoneshController();
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(showTarakoneshController.getShowTarakoneshView()));
            addCityStage.setWidth(520);
            addCityStage.setHeight(460);
            for(int i=0;i<hesabBanki.getTarakoneshHa().size();i++){
                showTarakoneshController.getShowTarakoneshView().getTableView().getItems().add(hesabBanki.getTarakoneshHa().get(i));
            }
            addCityStage.show();
        });

        showHesabBankiInformationView.getShowOwnerInformation().setOnAction(event -> {
            Person person = showHesabBankiInformationView.getTableView().getSelectionModel().getSelectedItem().getOwner();
            ShowPeopleController showPeopleController = new ShowPeopleController();
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(showPeopleController.getShowPeopleView()));
            addCityStage.setWidth(900);
            addCityStage.setHeight(400);
            showPeopleController.getShowPeopleView().getTableView().getItems().add(person);
            addCityStage.show();
        });

        showHesabBankiInformationView.getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showHesabBankiInformationView.getScene().getWindow().hide();
            }
        });
    }

    public ShowHesabBankiInformationView getShowHesabBankiInformationView() {
        return showHesabBankiInformationView;
    }

    public void setShowHesabBankiInformationView(ShowHesabBankiInformationView showHesabBankiInformationView) {
        this.showHesabBankiInformationView = showHesabBankiInformationView;
    }
}
