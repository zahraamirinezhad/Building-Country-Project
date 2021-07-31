package Main.View;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class OpeningAnAccountView extends VBox {
    private Button SelectThePerson;
    private Label Username;
    private Label Password;
    private Label MojudiHesab;
    private TextField UsernameTF;
    private Spinner<Integer> PasswordSP;
    private Spinner<Double> MojudiHesabSP;
    private Button Exit;

    public OpeningAnAccountView(){
        SelectThePerson = new Button(" SELECT PERSON ");
        SelectThePerson.setAlignment(Pos.CENTER);
        Exit = new Button(" EXIT ");
        Exit.setAlignment(Pos.CENTER);
        Username = new Label(" USERNAME ");
        Password = new Label(" PASSWORD ");
        MojudiHesab = new Label(" MOJUDI HESAB ");
        UsernameTF = new TextField();
        PasswordSP = new Spinner<>(100,900,100);
        MojudiHesabSP = new Spinner<>(0.0,50.0,0.0);

        ImageView selectedImage = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//3052667.jpg"));
            selectedImage.setImage(image1);
            selectedImage.setFitWidth(450);
            selectedImage.setFitHeight(200);
        }catch (FileNotFoundException ex){}

        VBox firstCol = new VBox(Username,Password,MojudiHesab);
        firstCol.setSpacing(7);
        firstCol.setAlignment(Pos.CENTER);
        Username.setAlignment(Pos.CENTER);
        Username.setMaxWidth(Double.MAX_VALUE);
        Password.setAlignment(Pos.CENTER);
        Password.setMaxWidth(Double.MAX_VALUE);
        MojudiHesab.setAlignment(Pos.CENTER);
        MojudiHesab.setMaxWidth(Double.MAX_VALUE);

        VBox secCol = new VBox(UsernameTF,PasswordSP,MojudiHesabSP);
        secCol.setAlignment(Pos.CENTER);
        UsernameTF.setAlignment(Pos.CENTER);
        UsernameTF.setMaxWidth(Double.MAX_VALUE);
        PasswordSP.setMaxWidth(Double.MAX_VALUE);
        MojudiHesabSP.setMaxWidth(Double.MAX_VALUE);

        HBox All = new HBox(firstCol,secCol);
        All.setAlignment(Pos.CENTER);

        this.getChildren().addAll(SelectThePerson,All,Exit,selectedImage);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(10);

    }

    public Button getSelectThePerson() {
        return SelectThePerson;
    }

    public void setSelectThePerson(Button selectThePerson) {
        SelectThePerson = selectThePerson;
    }

    public Label getUsername() {
        return Username;
    }

    public void setUsername(Label username) {
        Username = username;
    }

    public Label getPassword() {
        return Password;
    }

    public void setPassword(Label password) {
        Password = password;
    }

    public Label getMojudiHesab() {
        return MojudiHesab;
    }

    public void setMojudiHesab(Label mojudiHesab) {
        MojudiHesab = mojudiHesab;
    }

    public Button getExit() {
        return Exit;
    }

    public void setExit(Button exit) {
        Exit = exit;
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

    public Spinner<Double> getMojudiHesabSP() {
        return MojudiHesabSP;
    }

    public void setMojudiHesabSP(Spinner<Double> mojudiHesabSP) {
        MojudiHesabSP = mojudiHesabSP;
    }
}
