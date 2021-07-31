package Main.View;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class EnterNameNewCityView extends VBox {
    private Label NameLBL;
    private TextField NameTF;
    private Button LetsBuildTheCityBTN;

    public EnterNameNewCityView(){
        NameLBL = new Label(" NAME ");
        NameTF = new TextField();
        LetsBuildTheCityBTN = new Button(" LETS BUILD THE CITY ");
        HBox line = new HBox(NameLBL,NameTF);
        line.setSpacing(10);
        line.setAlignment(Pos.CENTER);
        this.getChildren().addAll(line,LetsBuildTheCityBTN);
        this.setSpacing(10);
        this.setAlignment(Pos.CENTER);
    }

    public Label getNameLBL() {
        return NameLBL;
    }

    public void setNameLBL(Label nameLBL) {
        NameLBL = nameLBL;
    }

    public TextField getNameTF() {
        return NameTF;
    }

    public void setNameTF(TextField nameTF) {
        NameTF = nameTF;
    }

    public Button getLetsBuildTheCityBTN() {
        return LetsBuildTheCityBTN;
    }

    public void setLetsBuildTheCityBTN(Button letsBuildTheCityBTN) {
        LetsBuildTheCityBTN = letsBuildTheCityBTN;
    }
}
