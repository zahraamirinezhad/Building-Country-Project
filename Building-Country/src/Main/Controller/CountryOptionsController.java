package Main.Controller;

import Main.Bank.HesabBanki;
import Main.Country;
import Main.MyObjectOutputStream;
import Main.View.CountryOptionsView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.*;

import static Main.Main.Iran;

public class CountryOptionsController {
    private CountryOptionsView countryOptionsView;
    public CountryOptionsController(){
        setCountryOptionsView(new CountryOptionsView());

        countryOptionsView.getBuild_NEW_CITY().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                EnterNameNewCityController enterNameNewCityController = new EnterNameNewCityController();
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(enterNameNewCityController.getEnterNameNewCityView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(200);
                addCityStage.show();
            }
        });

        countryOptionsView.getENTER_CITY().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SelectCityController selectCityController = new SelectCityController("ENTER CITY");
                for (int i=0;i< Iran.getCities().size();i++){
                    selectCityController.getSelectCityView().getTableView().getItems().add(Iran.getCities().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectCityController.getSelectCityView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(450);
                addCityStage.show();
            }
        });

        countryOptionsView.getSHOW_CITIES_INFORMATION().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SelectCityController selectCityController = new SelectCityController("SHOW INFORMATION");
                for (int i=0;i< Iran.getCities().size();i++){
                    selectCityController.getSelectCityView().getTableView().getItems().add(Iran.getCities().get(i));
                }
                Stage addCityStage = new Stage();
                addCityStage.setScene(new Scene(selectCityController.getSelectCityView()));
                addCityStage.setWidth(400);
                addCityStage.setHeight(450);
                addCityStage.show();
            }
        });

        countryOptionsView.getFINANCIAL_MANAGEMENT().setOnAction(event -> {
            FinancialManagementController financialManagementController = new FinancialManagementController();
            for (int i=0;i< Iran.getCities().size();i++){
                for(int j=0;j<Iran.getCities().get(i).getAllBanks().size();j++){
                    for(int k=0;k<Iran.getCities().get(i).getAllBanks().get(j).getHesabHaBanki().size();k++){
                        financialManagementController.getFinancialManagementView().getTableView().getItems().add(Iran.getCities().get(i).getAllBanks().get(j).getHesabHaBanki().get(k));
                    }
                }
            }
            double HoleMoney = 0.0;
            for(int i=0;i<Iran.getCities().size();i++){
                HoleMoney += Iran.getCities().get(i).getHoleMoney();
            }
            financialManagementController.getFinancialManagementView().getFirstMoney().setText(String.valueOf(HoleMoney));
            financialManagementController.getFinancialManagementView().getSecMoney().setText(String.valueOf(HoleMoney));
            Stage addCityStage = new Stage();
            addCityStage.setScene(new Scene(financialManagementController.getFinancialManagementView()));
            addCityStage.setWidth(800);
            addCityStage.setHeight(400);
            addCityStage.show();
        });

        countryOptionsView.getEXIT().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    if (new File("cities.txt").length() == 0) {
                        FileOutputStream cityFout = new FileOutputStream("cities.txt", true);
                        ObjectOutputStream cityOout = new ObjectOutputStream(cityFout);
                        for (int i = 0; i < Country.getCities().size(); i++) {
                            cityOout.writeObject(Country.getCities().get(i));

                        }
                        cityOout.close();
                        cityFout.close();

                        FileOutputStream dateFin = new FileOutputStream("dates.txt", true);
                        DataOutputStream dateDin = new DataOutputStream(dateFin);
                        dateDin.writeInt(Country.getYEAR());
                        dateDin.writeInt(Country.getMONTH());
                        dateDin.writeInt(Country.getDAY());
                        dateDin.close();
                        dateFin.close();

                    } else {
                        new PrintWriter("cities.txt").close();
                        FileOutputStream cityFout = new FileOutputStream("cities.txt", true);
                        ObjectOutputStream cityOout = new MyObjectOutputStream(cityFout);
                        for (int i = 0; i < Country.getCities().size(); i++) {
                            cityOout.writeObject(Country.getCities().get(i));

                        }
                        cityOout.close();
                        cityFout.close();

                        new PrintWriter("dates.txt").close();
                        FileOutputStream dateFin = new FileOutputStream("dates.txt", true);
                        DataOutputStream dateDin = new DataOutputStream(dateFin);
                        dateDin.writeInt(Country.getYEAR());
                        dateDin.writeInt(Country.getMONTH());
                        dateDin.writeInt(Country.getDAY());
                        dateDin.close();
                        dateFin.close();
                    }
                    System.exit(0);

                } catch (Exception ex) {
                }
            }
        });
    }

    public void FINANCIAL_MANAGEMENT(HesabBanki hesabBanki,FinancialManagementController financialManagementController){
        new Thread() {
            @Override
            public void run() {
                if(hesabBanki.getStart() == 30){
                    financialManagementController.getFinancialManagementView().getTableView().refresh();
                }
            }
        }.start();
    }

    public CountryOptionsView getCountryOptionsView() {
        return countryOptionsView;
    }

    public void setCountryOptionsView(CountryOptionsView countryOptionsView) {
        this.countryOptionsView = countryOptionsView;
    }
}
