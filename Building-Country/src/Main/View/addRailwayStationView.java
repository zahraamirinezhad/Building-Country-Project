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

public class addRailwayStationView extends VBox{
    private Label TerminalNameLBL;
    private Label AddressLBL;
    private Label MetrazhLBL;
    private Label InputRailsLBL;
    private Label OutputRailsLBL;
    private TextField TerminalNameTF;
    private TextField AddressTF;
    private Spinner<Double> MetrazhSP;
    private Spinner<Integer> InputRailsSP;
    private Spinner<Integer> OutputRailsSP;
    private Button Confirmed;
    private Button addLocomotives;
    private Button AddTrain;
    private Button Exit;

    public addRailwayStationView(){
        TerminalNameLBL = new Label(" TERMINAL NAME ");
        AddressLBL = new Label(" ADDRESS ");
        MetrazhLBL = new Label(" METRAZH ");
        InputRailsLBL = new Label(" NUMBER OF INPUT RAILS ");
        OutputRailsLBL = new Label(" NUMBER OF OUTPUT RAILS ");

        TerminalNameTF = new TextField();
        AddressTF = new TextField();
        MetrazhSP = new Spinner<>(100.0,1000.0,100.0);
        InputRailsSP = new Spinner<>(10,100,10);
        OutputRailsSP = new Spinner<>(10,100,10);

        AddTrain = new Button(" ADD TRAIN ");
        Confirmed = new Button(" CONFIRMED ");
        addLocomotives = new Button(" EMPLOYEE LOCOMOTIVES ");
        Exit = new Button(" EXIT ");
        addLocomotives.setDisable(true);
        AddTrain.setDisable(true);
        Exit.setDisable(true);

        VBox firstColm = new VBox(TerminalNameLBL,AddressLBL,MetrazhLBL,InputRailsLBL,OutputRailsLBL);
        TerminalNameLBL.setMaxWidth(Double.MAX_VALUE);
        AddressLBL.setMaxWidth(Double.MAX_VALUE);
        MetrazhLBL.setMaxWidth(Double.MAX_VALUE);
        InputRailsLBL.setMaxWidth(Double.MAX_VALUE);
        OutputRailsLBL.setMaxWidth(Double.MAX_VALUE);
        firstColm.setSpacing(10);

        VBox secColm = new VBox(TerminalNameTF,AddressTF,MetrazhSP,InputRailsSP,OutputRailsSP);
        TerminalNameTF.setMaxWidth(Double.MAX_VALUE);
        AddressTF.setMaxWidth(Double.MAX_VALUE);
        MetrazhSP.setMaxWidth(Double.MAX_VALUE);
        InputRailsSP.setMaxWidth(Double.MAX_VALUE);
        OutputRailsSP.setMaxWidth(Double.MAX_VALUE);

        HBox AllColms = new HBox(firstColm,secColm);
        AllColms.setAlignment(Pos.CENTER);

        ImageView selectedImage = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//bc4dc877244ef1c9006af42261513757.jpg"));
            selectedImage.setImage(image1);
            selectedImage.setFitWidth(450);
            selectedImage.setFitHeight(200);
        }catch (FileNotFoundException ex){}

        this.getChildren().addAll(AllColms,Confirmed,addLocomotives,AddTrain,Exit,selectedImage);
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

    public Label getInputRailsLBL() {
        return InputRailsLBL;
    }

    public void setInputRailsLBL(Label inputRailsLBL) {
        InputRailsLBL = inputRailsLBL;
    }

    public Label getOutputRailsLBL() {
        return OutputRailsLBL;
    }

    public void setOutputRailsLBL(Label outputRailsLBL) {
        OutputRailsLBL = outputRailsLBL;
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

    public Button getAddTrain() {
        return AddTrain;
    }

    public void setAddTrain(Button addTrain) {
        AddTrain = addTrain;
    }

    public Spinner<Double> getMetrazhSP() {
        return MetrazhSP;
    }

    public void setMetrazhSP(Spinner<Double> metrazhSP) {
        MetrazhSP = metrazhSP;
    }

    public Spinner<Integer> getInputRailsSP() {
        return InputRailsSP;
    }

    public void setInputRailsSP(Spinner<Integer> inputRailsSP) {
        InputRailsSP = inputRailsSP;
    }

    public Spinner<Integer> getOutputRailsSP() {
        return OutputRailsSP;
    }

    public void setOutputRailsSP(Spinner<Integer> outputRailsSP) {
        OutputRailsSP = outputRailsSP;
    }

    public Button getConfirmed() {
        return Confirmed;
    }

    public void setConfirmed(Button confirmed) {
        Confirmed = confirmed;
    }

    public Button getAddLocomotives() {
        return addLocomotives;
    }

    public void setAddLocomotives(Button addLocomotives) {
        this.addLocomotives = addLocomotives;
    }

    public Button getExit() {
        return Exit;
    }

    public void setExit(Button exit) {
        Exit = exit;
    }
}
