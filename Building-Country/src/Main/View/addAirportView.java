package Main.View;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class addAirportView extends VBox {
    private Label TerminalNameLBL;
    private Label AddressLBL;
    private Label MetrazhLBL;
    private Label RunawayNumLBL;
    private TextField TerminalNameTF;
    private TextField AddressTF;
    private Spinner<Double> MetrazhSP;
    private Spinner<Integer> RunawayNumSP;
    private Button AddCargoPlane;
    private Button AddPassengerPlane;
    private Button AddPilot;
    private Button ConfirmedBTN;
    private Button ExitBTN;
    private Button addCrew;
    private RadioButton INTERNATIONAL;
    private RadioButton DOMESTIC;

    public addAirportView(){
        TerminalNameLBL = new Label(" TERMINAL NAME ");
        AddressLBL = new Label(" ADDRESS ");
        MetrazhLBL = new Label(" METRAZH ");
        RunawayNumLBL = new Label(" NUMBER OF RUNAWAYS ");

        TerminalNameTF = new TextField();
        AddressTF = new TextField();

        MetrazhSP = new Spinner<>(200.0,1000.0,200.0);
        RunawayNumSP = new Spinner<>(1,20,1);

        AddCargoPlane = new Button(" ADD CARGO PLANE ");
        AddPassengerPlane = new Button(" ADD PASSENGER PLANE ");
        addCrew = new Button(" EMPLOYEE CREW ");
        setAddPilot(new Button(" EMPLOYEE PILOT "));
        ConfirmedBTN = new Button(" CONFIRMED ");
        ExitBTN = new Button(" EXIT ");
        AddPilot.setDisable(true);
        AddCargoPlane.setDisable(true);
        AddPassengerPlane.setDisable(true);
        ExitBTN.setDisable(true);
        addCrew.setDisable(true);

        ToggleGroup group = new ToggleGroup();
        INTERNATIONAL = new RadioButton("INTERNATIONAL");
        INTERNATIONAL.setToggleGroup(group);
        INTERNATIONAL.setSelected(true);
        DOMESTIC = new RadioButton("DOMESTIC");
        DOMESTIC.setToggleGroup(group);

        VBox firstColm = new VBox(TerminalNameLBL,AddressLBL,MetrazhLBL,RunawayNumLBL);
        TerminalNameLBL.setMaxWidth(Double.MAX_VALUE);
        AddressLBL.setMaxWidth(Double.MAX_VALUE);
        MetrazhLBL.setMaxWidth(Double.MAX_VALUE);
        RunawayNumLBL.setMaxWidth(Double.MAX_VALUE);
        firstColm.setSpacing(10);

        VBox secColm = new VBox(TerminalNameTF,AddressTF,MetrazhSP,RunawayNumSP);
        TerminalNameTF.setMaxWidth(Double.MAX_VALUE);
        AddressTF.setMaxWidth(Double.MAX_VALUE);
        MetrazhSP.setMaxWidth(Double.MAX_VALUE);
        RunawayNumSP.setMaxWidth(Double.MAX_VALUE);

        HBox AirportType = new HBox(INTERNATIONAL,DOMESTIC);
        AirportType.setSpacing(10);
        AirportType.setAlignment(Pos.CENTER);

        HBox AllColms = new HBox(firstColm,secColm);
        AllColms.setAlignment(Pos.CENTER);

        ImageView selectedImage = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//airport-banner-wap2.jpg"));
            selectedImage.setImage(image1);
            selectedImage.setFitWidth(450);
            selectedImage.setFitHeight(200);
        }catch (FileNotFoundException ex){}

        this.getChildren().addAll(AllColms,AirportType,ConfirmedBTN,AddPassengerPlane,AddCargoPlane,AddPilot,addCrew,ExitBTN,selectedImage);
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

    public Label getRunawayNumLBL() {
        return RunawayNumLBL;
    }

    public void setRunawayNumLBL(Label runawayNumLBL) {
        RunawayNumLBL = runawayNumLBL;
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

    public Button getAddCargoPlane() {
        return AddCargoPlane;
    }

    public void setAddCargoPlane(Button addCargoPlane) {
        AddCargoPlane = addCargoPlane;
    }

    public Button getAddPassengerPlane() {
        return AddPassengerPlane;
    }

    public void setAddPassengerPlane(Button addPassengerPlane) {
        AddPassengerPlane = addPassengerPlane;
    }

    public Spinner<Double> getMetrazhSP() {
        return MetrazhSP;
    }

    public void setMetrazhSP(Spinner<Double> metrazhSP) {
        MetrazhSP = metrazhSP;
    }

    public Spinner<Integer> getRunawayNumSP() {
        return RunawayNumSP;
    }

    public void setRunawayNumSP(Spinner<Integer> runawayNumSP) {
        RunawayNumSP = runawayNumSP;
    }

    public Button getAddPilot() {
        return AddPilot;
    }

    public void setAddPilot(Button addPilot) {
        AddPilot = addPilot;
    }

    public Button getConfirmedBTN() {
        return ConfirmedBTN;
    }

    public void setConfirmedBTN(Button confirmedBTN) {
        ConfirmedBTN = confirmedBTN;
    }

    public RadioButton getINTERNATIONAL() {
        return INTERNATIONAL;
    }

    public void setINTERNATIONAL(RadioButton INTERNATIONAL) {
        this.INTERNATIONAL = INTERNATIONAL;
    }

    public RadioButton getDOMESTIC() {
        return DOMESTIC;
    }

    public void setDOMESTIC(RadioButton DOMESTIC) {
        this.DOMESTIC = DOMESTIC;
    }

    public Button getExitBTN() {
        return ExitBTN;
    }

    public void setExitBTN(Button exitBTN) {
        ExitBTN = exitBTN;
    }

    public Button getAddCrew() {
        return addCrew;
    }

    public void setAddCrew(Button addCrew) {
        this.addCrew = addCrew;
    }
}
