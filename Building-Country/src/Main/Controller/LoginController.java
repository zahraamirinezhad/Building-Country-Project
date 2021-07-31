package Main.Controller;

import Main.Bank.Bank;
import Main.View.LoginView;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;

public class LoginController {
    private LoginView loginView;
    public LoginController(Bank bank){
        setLoginView(new LoginView());

        loginView.getLoginBTN().setOnAction(event -> {
            boolean flag = false;
            for(int i=0;i<bank.getHesabHaBanki().size();i++){
                if(bank.getHesabHaBanki().get(i).getUserName().equals(loginView.getUsernameTF().getText())){
                    if(bank.getHesabHaBanki().get(i).getPassword() == loginView.getPasswordSP().getValue()){
                        LoginOptionsController loginOptionsController = new LoginOptionsController(bank.getHesabHaBanki().get(i));
                        Stage addCityStage = new Stage();
                        addCityStage.setScene(new Scene(loginOptionsController.getLoginOptionsView()));
                        addCityStage.setWidth(455);
                        addCityStage.setHeight(340);
                        addCityStage.show();
                        loginView.getScene().getWindow().hide();
                    }else{
                        JOptionPane.showMessageDialog(null,"INVALID PASSWORD","ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                    flag = true;
                }
            }
            if(!flag){
                JOptionPane.showMessageDialog(null,"INVALID USERNAME","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public LoginView getLoginView() {
        return loginView;
    }

    public void setLoginView(LoginView loginView) {
        this.loginView = loginView;
    }
}
