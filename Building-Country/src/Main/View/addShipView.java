package Main.View;

import Main.Vehicles.WelfareServices;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class addShipView extends VBox{
    private Label CapacityLBL;
    private Label IDLBL;
    private Label FactoryNameLBL;
    private Label FuelLBL;
    private Label LeastDepthLBL;
    private Label LastSpeedLBL;
    private Label WeightLBL;
    private Label ServicesLBL;
    private Spinner<Integer> CapacitySP;
    private Spinner<Integer> IDSP;
    private TextField FactoryNameTF;
    private TextField FuelTF;
    private Spinner<Double> LeastDepthSP;
    private Spinner<Double> LastSpeedSP;
    private Spinner<Double> WeightSP;
    private RadioButton battle;
    private RadioButton cargo;
    private RadioButton passenger;
    private Button OKBTN;
    private CheckBox service1;
    private CheckBox service2;
    private CheckBox service3;
    private CheckBox service4;
    private CheckBox service5;

    public addShipView(){
        CapacityLBL = new Label(" CAPACITY ");
        IDLBL = new Label(" ID ");
        FactoryNameLBL = new Label(" NAME OF THE FACTORY ");
        FuelLBL = new Label(" FUEL ");
        LastSpeedLBL = new Label(" LAST SPEED ");
        LeastDepthLBL = new Label(" LEAST DEATH ");
        WeightLBL = new Label(" WEIGHT ");
        ServicesLBL = new Label(" SERVICES ");
        ServicesLBL.setAlignment(Pos.CENTER);
        ServicesLBL.setTextFill(Paint.valueOf("#a41998"));

        CapacitySP = new Spinner<>(1,1000,1);
        IDSP = new Spinner<>(100,1000,100);
        FactoryNameTF = new TextField();
        FuelTF = new TextField();
        LeastDepthSP = new Spinner<>(100.0,1000.0,100.0);
        LastSpeedSP = new Spinner<>(100.0,1000.0,100.0);
        WeightSP = new Spinner<>(100.0,1000.0,100.0);

        OKBTN = new Button(" OK ");

        service1 = new CheckBox(WelfareServices.service[0].name());
        service2 = new CheckBox(WelfareServices.service[1].name());
        service3 = new CheckBox(WelfareServices.service[2].name());
        service4 = new CheckBox(WelfareServices.service[3].name());
        service5 = new CheckBox(WelfareServices.service[4].name());
        HBox serviceRow = new HBox(service1,service2,service3,service4,service5);
        serviceRow.setSpacing(6);
        serviceRow.setAlignment(Pos.CENTER);

        ToggleGroup group = new ToggleGroup();
        battle = new RadioButton("BATTLE");
        battle.setToggleGroup(group);
        cargo  = new RadioButton("CARGO");
        cargo.setToggleGroup(group);
        passenger = new RadioButton("PASSENGER");
        passenger.setToggleGroup(group);
        passenger.setSelected(true);
        HBox ShipType = new HBox(battle,cargo,passenger);
        ShipType.setSpacing(10);
        ShipType.setAlignment(Pos.CENTER);

        VBox firstColm = new VBox(CapacityLBL,IDLBL,FactoryNameLBL,FuelLBL,LastSpeedLBL,LeastDepthLBL,WeightLBL);
        CapacityLBL.setMaxWidth(Double.MAX_VALUE);
        IDLBL.setMaxWidth(Double.MAX_VALUE);
        FactoryNameLBL.setMaxWidth(Double.MAX_VALUE);
        FuelLBL.setMaxWidth(Double.MAX_VALUE);
        LeastDepthLBL.setMaxWidth(Double.MAX_VALUE);
        LastSpeedLBL.setMaxWidth(Double.MAX_VALUE);
        WeightLBL.setMaxWidth(Double.MAX_VALUE);
        firstColm.setSpacing(9);

        VBox secColm = new VBox(CapacitySP,IDSP,FactoryNameTF,FuelTF,LastSpeedSP,LeastDepthSP,WeightSP);
        CapacitySP.setMaxWidth(Double.MAX_VALUE);
        IDSP.setMaxWidth(Double.MAX_VALUE);
        FactoryNameTF.setMaxWidth(Double.MAX_VALUE);
        FuelTF.setMaxWidth(Double.MAX_VALUE);
        LastSpeedSP.setMaxWidth(Double.MAX_VALUE);
        LeastDepthSP.setMaxWidth(Double.MAX_VALUE);
        WeightSP.setMaxWidth(Double.MAX_VALUE);

        HBox AllColms = new HBox(firstColm,secColm);
        AllColms.setAlignment(Pos.CENTER);

        ImageView selectedImage = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//CRUISE_Charming.jpg"));
            selectedImage.setImage(image1);
            selectedImage.setFitWidth(450);
            selectedImage.setFitHeight(200);
        }catch (FileNotFoundException ex){}

        this.getChildren().addAll(AllColms,ShipType,ServicesLBL,serviceRow,OKBTN,selectedImage);
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

    public Label getLeastDepthLBL() {
        return LeastDepthLBL;
    }

    public void setLeastDepthLBL(Label leastDepthLBL) {
        LeastDepthLBL = leastDepthLBL;
    }

    public Label getLastSpeedLBL() {
        return LastSpeedLBL;
    }

    public void setLastSpeedLBL(Label lastSpeedLBL) {
        LastSpeedLBL = lastSpeedLBL;
    }

    public Label getWeightLBL() {
        return WeightLBL;
    }

    public void setWeightLBL(Label weightLBL) {
        WeightLBL = weightLBL;
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

    public Spinner<Double> getLeastDepthSP() {
        return LeastDepthSP;
    }

    public void setLeastDepthSP(Spinner<Double> leastDepthSP) {
        LeastDepthSP = leastDepthSP;
    }

    public Spinner<Double> getLastSpeedSP() {
        return LastSpeedSP;
    }

    public void setLastSpeedSP(Spinner<Double> lastSpeedSP) {
        LastSpeedSP = lastSpeedSP;
    }

    public Spinner<Double> getWeightSP() {
        return WeightSP;
    }

    public void setWeightSP(Spinner<Double> weightSP) {
        WeightSP = weightSP;
    }

    public Button getOKBTN() {
        return OKBTN;
    }

    public void setOKBTN(Button OKBTN) {
        this.OKBTN = OKBTN;
    }

    public RadioButton getBattle() {
        return battle;
    }

    public void setBattle(RadioButton battle) {
        this.battle = battle;
    }

    public RadioButton getCargo() {
        return cargo;
    }

    public void setCargo(RadioButton cargo) {
        this.cargo = cargo;
    }

    public RadioButton getPassenger() {
        return passenger;
    }

    public void setPassenger(RadioButton passenger) {
        this.passenger = passenger;
    }

    public CheckBox getService1() {
        return service1;
    }

    public void setService1(CheckBox service1) {
        this.service1 = service1;
    }

    public CheckBox getService2() {
        return service2;
    }

    public void setService2(CheckBox service2) {
        this.service2 = service2;
    }

    public CheckBox getService3() {
        return service3;
    }

    public void setService3(CheckBox service3) {
        this.service3 = service3;
    }

    public CheckBox getService4() {
        return service4;
    }

    public void setService4(CheckBox service4) {
        this.service4 = service4;
    }

    public CheckBox getService5() {
        return service5;
    }

    public void setService5(CheckBox service5) {
        this.service5 = service5;
    }

    public Label getServicesLBL() {
        return ServicesLBL;
    }

    public void setServicesLBL(Label servicesLBL) {
        ServicesLBL = servicesLBL;
    }
}
