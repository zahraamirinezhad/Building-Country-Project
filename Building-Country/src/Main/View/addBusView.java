package Main.View;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class addBusView extends VBox {
    private Label CapacityLBL;
    private Label IDLBL;
    private Label FactoryNameLBL;
    private Label FuelLBL;
    private Label LastSpeedLBL;
    private Spinner<Integer> CapacitySP;
    private Spinner<Integer> IDSP;
    private TextField FactoryNameTF;
    private TextField FuelTF;
    private Spinner<Double> LastSpeedSP;
    private RadioButton VIP;
    private RadioButton NON_VIP;
    private Button OKBTN;

    public addBusView(){
        setCapacityLBL(new Label(" CAPACITY "));
        setIDLBL(new Label(" ID "));
        setFactoryNameLBL(new Label(" NAME OF THE FACTORY "));
        setFuelLBL(new Label(" FUEL "));
        setLastSpeedLBL(new Label(" LAST SPEED "));

        CapacitySP = new Spinner<>(1,100,1);
        IDSP = new Spinner<>(100,1000,100);
        setFactoryNameTF(new TextField());
        setFuelTF(new TextField());
        LastSpeedSP = new Spinner<>(40.0,100.0,40.0);
        OKBTN = new Button(" OK ");

        ToggleGroup group = new ToggleGroup();
        VIP = new RadioButton("VIP");
        VIP.setToggleGroup(group);
        VIP.setSelected(true);
        NON_VIP = new RadioButton("NON VIP");
        NON_VIP.setToggleGroup(group);
        HBox BusType = new HBox(VIP,NON_VIP);
        BusType.setSpacing(10);
        BusType.setAlignment(Pos.CENTER);

        VBox firstColm = new VBox(getCapacityLBL(), getIDLBL(), getFactoryNameLBL(), getFuelLBL(), getLastSpeedLBL());
        getCapacityLBL().setMaxWidth(Double.MAX_VALUE);
        getIDLBL().setMaxWidth(Double.MAX_VALUE);
        getFactoryNameLBL().setMaxWidth(Double.MAX_VALUE);
        getFuelLBL().setMaxWidth(Double.MAX_VALUE);
        getLastSpeedLBL().setMaxWidth(Double.MAX_VALUE);
        firstColm.setSpacing(9);

        VBox secColm = new VBox(getCapacitySP(), getIDSP(), getFactoryNameTF(), getFuelTF(), getLastSpeedSP());
        getCapacitySP().setMaxWidth(Double.MAX_VALUE);
        getIDSP().setMaxWidth(Double.MAX_VALUE);
        getFactoryNameTF().setMaxWidth(Double.MAX_VALUE);
        getFuelTF().setMaxWidth(Double.MAX_VALUE);
        getLastSpeedSP().setMaxWidth(Double.MAX_VALUE);

        HBox AllColms = new HBox(firstColm,secColm);
        AllColms.setAlignment(Pos.CENTER);

        ImageView selectedImage = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//images.jpg"));
            selectedImage.setImage(image1);
            selectedImage.setFitWidth(450);
            selectedImage.setFitHeight(200);
        }catch (FileNotFoundException ex){}

        this.getChildren().addAll(AllColms,BusType,OKBTN,selectedImage);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(15);
    }

    public Label getCapacityLBL() {
        return CapacityLBL;
    }

    public void setCapacityLBL(Label capacityLBL) {
        CapacityLBL = capacityLBL;
    }

    public Label getIDLBL() {
        return IDLBL;
    }

    public void setIDLBL(Label IDLBL) {
        this.IDLBL = IDLBL;
    }

    public Label getFactoryNameLBL() {
        return FactoryNameLBL;
    }

    public void setFactoryNameLBL(Label factoryNameLBL) {
        FactoryNameLBL = factoryNameLBL;
    }

    public Label getFuelLBL() {
        return FuelLBL;
    }

    public void setFuelLBL(Label fuelLBL) {
        FuelLBL = fuelLBL;
    }

    public Label getLastSpeedLBL() {
        return LastSpeedLBL;
    }

    public void setLastSpeedLBL(Label lastSpeedLBL) {
        LastSpeedLBL = lastSpeedLBL;
    }

    public TextField getFactoryNameTF() {
        return FactoryNameTF;
    }

    public void setFactoryNameTF(TextField factoryNameTF) {
        FactoryNameTF = factoryNameTF;
    }

    public TextField getFuelTF() {
        return FuelTF;
    }

    public void setFuelTF(TextField fuelTF) {
        FuelTF = fuelTF;
    }

    public Spinner<Integer> getCapacitySP() {
        return CapacitySP;
    }

    public void setCapacitySP(Spinner<Integer> capacitySP) {
        CapacitySP = capacitySP;
    }

    public Spinner<Integer> getIDSP() {
        return IDSP;
    }

    public void setIDSP(Spinner<Integer> IDSP) {
        this.IDSP = IDSP;
    }

    public Spinner<Double> getLastSpeedSP() {
        return LastSpeedSP;
    }

    public void setLastSpeedSP(Spinner<Double> lastSpeedSP) {
        LastSpeedSP = lastSpeedSP;
    }

    public RadioButton getVIP() {
        return VIP;
    }

    public void setVIP(RadioButton VIP) {
        this.VIP = VIP;
    }

    public RadioButton getNON_VIP() {
        return NON_VIP;
    }

    public void setNON_VIP(RadioButton NON_VIP) {
        this.NON_VIP = NON_VIP;
    }

    public Button getOKBTN() {
        return OKBTN;
    }

    public void setOKBTN(Button OKBTN) {
        this.OKBTN = OKBTN;
    }
}
