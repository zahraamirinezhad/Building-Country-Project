package Main.Controller;

import Main.Bank.Bank;
import Main.Bank.HesabBanki;
import Main.City;
import Main.Person;
import Main.View.FinancialManagementView;
import Main.View.OpeningAnAccountView;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;

import static java.lang.Thread.sleep;

public class OpeningAnAccountController {
    private OpeningAnAccountView openingAnAccountView;
    private Person person = null;
    public OpeningAnAccountController(City city, Bank bank){
        setOpeningAnAccountView(new OpeningAnAccountView());

        getOpeningAnAccountView().getSelectThePerson().setOnAction(event -> {
            SelectPersonForOpeningAnAccountController selectPersonForOpeningAnAccountController = new SelectPersonForOpeningAnAccountController(this);
            for (int i = 0; i < city.getPerson().size(); i++) {
                selectPersonForOpeningAnAccountController.getSelectPersonView().getTableView().getItems().add(city.getPerson().get(i));
            }
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(selectPersonForOpeningAnAccountController.getSelectPersonView()));
            addCityStage.setWidth(900);
            addCityStage.setHeight(400);
            addCityStage.show();
        });

        getOpeningAnAccountView().getExit().setOnAction(event -> {
            boolean flag = false;
            for(int i=0;i<bank.getHesabHaBanki().size();i++){
                if(bank.getHesabHaBanki().get(i).getUserName().equals(openingAnAccountView.getUsernameTF().getText())){
                    JOptionPane.showMessageDialog(null,"THIS USERNAME HAS ALREADY EXIST","WARNING",JOptionPane.WARNING_MESSAGE);
                    flag = true;
                    break;
                }
                if(bank.getHesabHaBanki().get(i).getPassword() == openingAnAccountView.getPasswordSP().getValue()){
                    JOptionPane.showMessageDialog(null,"THIS PASSWORD HAS ALREADY EXIST","WARNING",JOptionPane.WARNING_MESSAGE);
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                Finish(bank);
                openingAnAccountView.getScene().getWindow().hide();
            }
        });


    }

    public void Finish(Bank bank){
        String Username = openingAnAccountView.getUsernameTF().getText();
        int Password = openingAnAccountView.getPasswordSP().getValue();
        double MojudiHesab = openingAnAccountView.getMojudiHesabSP().getValue();
        bank.setHesabHaBanki(new HesabBanki(MojudiHesab,person,Username,Password,bank.getCityName(),bank.getBankName()));
        HesabBanki HB = bank.getHesabHaBanki().get(bank.getHesabHaBanki().size()-1);
        new Thread(() -> {
                try {
                    while (true) {
                        sleep(1500);
                        HB.setStart(HB.getStart() + 1);
                        if(HB.getStart() == 30) {
                            double secMoney = Double.valueOf(FinancialManagementView.getSecMoney().getText());
                            secMoney += HB.getMojudiHesab() * (bank.getProfit() / 100);
                            FinancialManagementView.getSecMoney().setText(String.valueOf(secMoney));
                            HB.setMojudiHesab(HB.getMojudiHesab() + HB.getMojudiHesab() * (bank.getProfit() / 100));
                            HB.setStart(0);
                            Platform.runLater(() -> {
                                FinancialManagementView.getTableView().refresh();
                            });
                        }
                    }
                } catch (InterruptedException c) {}
            }).start();
    }

    public OpeningAnAccountView getOpeningAnAccountView() {
        return openingAnAccountView;
    }

    public void setOpeningAnAccountView(OpeningAnAccountView openingAnAccountView) {
        this.openingAnAccountView = openingAnAccountView;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
