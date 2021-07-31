package Main.View;


import Main.Bank.Bank;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class EnterTheBankView extends VBox {
    private Button OPENING_A_BANK_ACCOUNT;
    private Button LOGIN;
    private Button SHOW_BANK_INFORMATION;
    private Button EXIT;

    public EnterTheBankView(){
        OPENING_A_BANK_ACCOUNT = new Button(Bank.getBankWorks()[0]);
        OPENING_A_BANK_ACCOUNT.setMaxWidth(Double.MAX_VALUE);
        OPENING_A_BANK_ACCOUNT.setAlignment(Pos.CENTER);
        LOGIN = new Button(Bank.getBankWorks()[1]);
        LOGIN.setMaxWidth(Double.MAX_VALUE);
        LOGIN.setAlignment(Pos.CENTER);
        SHOW_BANK_INFORMATION = new Button(Bank.getBankWorks()[2]);
        SHOW_BANK_INFORMATION.setMaxWidth(Double.MAX_VALUE);
        SHOW_BANK_INFORMATION.setAlignment(Pos.CENTER);
        EXIT = new Button(Bank.getBankWorks()[3]);
        EXIT.setMaxWidth(Double.MAX_VALUE);
        EXIT.setAlignment(Pos.CENTER);

        ImageView selectedImage = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//bank.jpg"));
            selectedImage.setImage(image1);
            selectedImage.setFitWidth(450);
            selectedImage.setFitHeight(200);
        }catch (FileNotFoundException ex){}

        this.getChildren().addAll(OPENING_A_BANK_ACCOUNT,LOGIN,SHOW_BANK_INFORMATION,EXIT,selectedImage);
        this.setAlignment(Pos.CENTER);

    }

    public Button getOPENING_A_BANK_ACCOUNT() {
        return OPENING_A_BANK_ACCOUNT;
    }

    public void setOPENING_A_BANK_ACCOUNT(Button OPENING_A_BANK_ACCOUNT) {
        this.OPENING_A_BANK_ACCOUNT = OPENING_A_BANK_ACCOUNT;
    }

    public Button getLOGIN() {
        return LOGIN;
    }

    public void setLOGIN(Button LOGIN) {
        this.LOGIN = LOGIN;
    }

    public Button getSHOW_BANK_INFORMATION() {
        return SHOW_BANK_INFORMATION;
    }

    public void setSHOW_BANK_INFORMATION(Button SHOW_BANK_INFORMATION) {
        this.SHOW_BANK_INFORMATION = SHOW_BANK_INFORMATION;
    }

    public Button getEXIT() {
        return EXIT;
    }

    public void setEXIT(Button EXIT) {
        this.EXIT = EXIT;
    }
}
