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

public class addBusStationView extends VBox {
    private Label TerminalNameLBL;
    private Label AddressLBL;
    private Label MetrazhLBL;
    private TextField TerminalNameTF;
    private TextField AddressTF;
    private Spinner<Double> MetrazhSP;
    private Button AddDriver;
    private Button AddBus;
    private Button Confirmed;
    private Button Exit;

    public addBusStationView(){
        TerminalNameLBL = new Label(" TERMINAL NAME ");
        AddressLBL = new Label(" ADDRESS ");
        MetrazhLBL = new Label(" METRAZH ");

        TerminalNameTF = new TextField();
        AddressTF = new TextField();

        MetrazhSP = new Spinner<>(100.0,1000.0,100.0);

        AddBus = new Button(" ADD BUS ");
        AddDriver = new Button(" EMPLOYEE DRIVER ");
        Confirmed = new Button(" CONFIRMED ");
        Exit = new Button(" EXIT ");
        AddBus.setDisable(true);
        AddDriver.setDisable(true);
        Exit.setDisable(true);

        VBox firstColm = new VBox(TerminalNameLBL,AddressLBL,MetrazhLBL);
        TerminalNameLBL.setMaxWidth(Double.MAX_VALUE);
        AddressLBL.setMaxWidth(Double.MAX_VALUE);
        MetrazhLBL.setMaxWidth(Double.MAX_VALUE);
        firstColm.setSpacing(10);

        VBox secColm = new VBox(TerminalNameTF,AddressTF,MetrazhSP);
        TerminalNameTF.setMaxWidth(Double.MAX_VALUE);
        AddressTF.setMaxWidth(Double.MAX_VALUE);
        MetrazhSP.setMaxWidth(Double.MAX_VALUE);

        HBox AllColms = new HBox(firstColm,secColm);
        AllColms.setAlignment(Pos.CENTER);

        ImageView selectedImage = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//NAT-RTA-1-1603196931420_17545fbcd5d_original-ratio.jpg"));
            selectedImage.setImage(image1);
            selectedImage.setFitWidth(450);
            selectedImage.setFitHeight(200);
        }catch (FileNotFoundException ex){}

        this.getChildren().addAll(AllColms,Confirmed,AddBus,AddDriver,Exit,selectedImage);
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

    public Button getAddBus() {
        return AddBus;
    }

    public void setAddBus(Button addBus) {
        AddBus = addBus;
    }

    public Spinner<Double> getMetrazhSP() {
        return MetrazhSP;
    }

    public void setMetrazhSP(Spinner<Double> metrazhSP) {
        MetrazhSP = metrazhSP;
    }

    public Button getAddDriver() {
        return AddDriver;
    }

    public void setAddDriver(Button addDriver) {
        AddDriver = addDriver;
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
