package Main.View;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class LoginView extends VBox {
    private Label UsernameLBL;
    private Label PasswordLBL;
    private TextField UsernameTF;
    private Spinner<Integer> PasswordSP;
    private Button LoginBTN;

    public LoginView(){
        UsernameLBL = new Label(" USERNAME ");
        UsernameLBL.setAlignment(Pos.CENTER);
        UsernameLBL.setMaxWidth(Double.MAX_VALUE);
        PasswordLBL = new Label(" PASSWORD ");
        PasswordLBL.setAlignment(Pos.CENTER);
        PasswordLBL.setMaxWidth(Double.MAX_VALUE);
        UsernameTF = new TextField();
        UsernameTF.setAlignment(Pos.CENTER);
        UsernameTF.setMaxWidth(Double.MAX_VALUE);
        PasswordSP = new Spinner<>(100,900,100);
        PasswordSP.setMaxWidth(Double.MAX_VALUE);
        LoginBTN = new Button(" LOGIN ");
        LoginBTN.setAlignment(Pos.CENTER);

        VBox firstCol = new VBox(UsernameLBL,PasswordLBL);
        firstCol.setAlignment(Pos.CENTER);
        firstCol.setSpacing(7);
        VBox secCol = new VBox(UsernameTF,PasswordSP);
        secCol.setAlignment(Pos.CENTER);

        HBox All = new HBox(firstCol,secCol);
        All.setAlignment(Pos.CENTER);
        All.setSpacing(10);

        this.getChildren().addAll(All,LoginBTN);
        this.setSpacing(10);
        this.setAlignment(Pos.CENTER);
    }

    public Label getUsernameLBL() {
        return UsernameLBL;
    }

    public void setUsernameLBL(Label usernameLBL) {
        UsernameLBL = usernameLBL;
    }

    public Label getPasswordLBL() {
        return PasswordLBL;
    }

    public void setPasswordLBL(Label passwordLBL) {
        PasswordLBL = passwordLBL;
    }

    public TextField getUsernameTF() {
        return UsernameTF;
    }

    public void setUsernameTF(TextField usernameTF) {
        UsernameTF = usernameTF;
    }

    public Spinner<Integer> getPasswordSP() {
        return PasswordSP;
    }

    public void setPasswordSP(Spinner<Integer> passwordSP) {
        PasswordSP = passwordSP;
    }

    public Button getLoginBTN() {
        return LoginBTN;
    }

    public void setLoginBTN(Button loginBTN) {
        LoginBTN = loginBTN;
    }
}
