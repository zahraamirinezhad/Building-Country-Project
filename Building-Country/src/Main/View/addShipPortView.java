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


public class addShipPortView extends VBox {
    private Label TerminalNameLBL;
    private Label AddressLBL;
    private Label MetrazhLBL;
    private Label StageNumLBL;
    private TextField TerminalNameTF;
    private TextField AddressTF;
    private Spinner<Double> MetrazhSP;
    private Spinner<Integer> StageNumSP;
    private Button AddBoat;
    private Button AddShip;
    private Button addSailor;
    private Button Confirmed;
    private Button Exit;

    public addShipPortView(){
        TerminalNameLBL = new Label(" TERMINAL NAME ");
        AddressLBL = new Label(" ADDRESS ");
        MetrazhLBL = new Label(" METRAZH ");
        StageNumLBL = new Label(" NUMBER OF STAGES ");

        TerminalNameTF = new TextField();
        AddressTF = new TextField();
        MetrazhSP = new Spinner<>(100.0,1000.0,100.0);
        StageNumSP = new Spinner<>(10,100,10);

        VBox firstColm = new VBox(TerminalNameLBL,AddressLBL,MetrazhLBL,StageNumLBL);
        TerminalNameLBL.setMaxWidth(Double.MAX_VALUE);
        AddressLBL.setMaxWidth(Double.MAX_VALUE);
        MetrazhLBL.setMaxWidth(Double.MAX_VALUE);
        StageNumLBL.setMaxWidth(Double.MAX_VALUE);
        firstColm.setSpacing(10);

        VBox secColm = new VBox(TerminalNameTF,AddressTF,MetrazhSP,StageNumSP);
        TerminalNameTF.setMaxWidth(Double.MAX_VALUE);
        AddressTF.setMaxWidth(Double.MAX_VALUE);
        MetrazhSP.setMaxWidth(Double.MAX_VALUE);
        StageNumSP.setMaxWidth(Double.MAX_VALUE);

        AddShip = new Button(" ADD SHIP ");
        AddBoat = new Button(" ADD BOAT ");
        addSailor = new Button(" EMPLOYEE SAILOR ");
        Confirmed = new Button(" CONFIRMED ");
        Exit = new Button(" EXIT ");
        AddShip.setDisable(true);
        AddBoat.setDisable(true);
        Exit.setDisable(true);
        addSailor.setDisable(true);

        HBox AllColms = new HBox(firstColm,secColm);
        AllColms.setAlignment(Pos.CENTER);

        ImageView selectedImage = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//67-large-5a213866b87f7080908391d208aadce5.jpg"));
            selectedImage.setImage(image1);
            selectedImage.setFitWidth(450);
            selectedImage.setFitHeight(200);
        }catch (FileNotFoundException ex){}

        this.getChildren().addAll(AllColms,Confirmed,AddShip,AddBoat,addSailor,Exit,selectedImage);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(10);

    }


    public Label getTerminalNameLBL() {
        return TerminalNameLBL;
    }

    public void setTerminalNameLBL(Label terminalNameLBL) {
        TerminalNameLBL = terminalNameLBL;
    }

    public Label getAddressLBL() {
        return AddressLBL;
    }

    public void setAddressLBL(Label addressLBL) {
        AddressLBL = addressLBL;
    }

    public Label getMetrazhLBL() {
        return MetrazhLBL;
    }

    public void setMetrazhLBL(Label metrazhLBL) {
        MetrazhLBL = metrazhLBL;
    }

    public Label getStageNumLBL() {
        return StageNumLBL;
    }

    public void setStageNumLBL(Label stageNumLBL) {
        StageNumLBL = stageNumLBL;
    }

    public TextField getTerminalNameTF() {
        return TerminalNameTF;
    }

    public void setTerminalNameTF(TextField terminalNameTF) {
        TerminalNameTF = terminalNameTF;
    }

    public TextField getAddressTF() {
        return AddressTF;
    }

    public void setAddressTF(TextField addressTF) {
        AddressTF = addressTF;
    }

    public Button getAddBoat() {
        return AddBoat;
    }

    public void setAddBoat(Button addBoat) {
        AddBoat = addBoat;
    }

    public Button getAddShip() {
        return AddShip;
    }

    public void setAddShip(Button addShip) {
        AddShip = addShip;
    }

    public Spinner<Double> getMetrazhSP() {
        return MetrazhSP;
    }

    public void setMetrazhSP(Spinner<Double> metrazhSP) {
        MetrazhSP = metrazhSP;
    }

    public Spinner<Integer> getStageNumSP() {
        return StageNumSP;
    }

    public void setStageNumSP(Spinner<Integer> stageNumSP) {
        StageNumSP = stageNumSP;
    }

    public Button getAddSailor() {
        return addSailor;
    }

    public void setAddSailor(Button addSailor) {
        this.addSailor = addSailor;
    }

    public Button getConfirmed() {
        return Confirmed;
    }

    public void setConfirmed(Button confirmed) {
        Confirmed = confirmed;
    }

    public Button getExit() {
        return Exit;
    }

    public void setExit(Button exit) {
        Exit = exit;
    }
}
