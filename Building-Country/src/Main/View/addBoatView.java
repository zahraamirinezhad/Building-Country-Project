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

public class addBoatView extends VBox {
    private Label CapacityLBL;
    private Label IDLBL;
    private Label FactoryNameLBL;
    private Label FuelLBL;
    private Label LeastDepthLBL;
    private Label LastSpeedLBL;
    private Label WeightLBL;
    private Label HullQualityLBL;
    private Spinner<Integer> CapacitySP;
    private Spinner<Integer> IDSP;
    private TextField FactoryNameTF;
    private TextField FuelTF;
    private Spinner<Double> LeastDepthSP;
    private Spinner<Double> LastSpeedSP;
    private Spinner<Double> WeightSP;
    private TextField HullQualityTF;
    private Button OKBTN;

    public addBoatView() {
        CapacityLBL = new Label(" CAPACITY ");
        IDLBL = new Label(" ID ");
        FactoryNameLBL = new Label(" NAME OF THE FACTORY ");
        FuelLBL = new Label(" FUEL ");
        LastSpeedLBL = new Label(" LAST SPEED ");
        LeastDepthLBL = new Label(" LEAST DEPTH ");
        WeightLBL = new Label(" WEIGHT ");
        HullQualityLBL = new Label(" HULL QUALITY ");

        CapacitySP = new Spinner<>(1,100,1);
        IDSP = new Spinner<>(100,1000,100);
        FactoryNameTF = new TextField();
        FuelTF = new TextField();
        LeastDepthSP = new Spinner<>(10.0,100.0,10.0);
        LastSpeedSP = new Spinner<>(10.0,100.0,10.0);
        WeightSP = new Spinner<>(10.0,50.0,10.0);
        HullQualityTF = new TextField();

        OKBTN = new Button(" OK ");

        VBox firstColm = new VBox(CapacityLBL,IDLBL,FactoryNameLBL,FuelLBL,LastSpeedLBL,LeastDepthLBL,WeightLBL,HullQualityLBL);
        CapacityLBL.setMaxWidth(Double.MAX_VALUE);
        IDLBL.setMaxWidth(Double.MAX_VALUE);
        FactoryNameLBL.setMaxWidth(Double.MAX_VALUE);
        FuelLBL.setMaxWidth(Double.MAX_VALUE);
        LeastDepthLBL.setMaxWidth(Double.MAX_VALUE);
        LastSpeedLBL.setMaxWidth(Double.MAX_VALUE);
        WeightLBL.setMaxWidth(Double.MAX_VALUE);
        HullQualityLBL.setMaxWidth(Double.MAX_VALUE);
        firstColm.setSpacing(9);

        VBox secColm = new VBox(CapacitySP,IDSP,FactoryNameTF,FuelTF,LastSpeedSP,LeastDepthSP,WeightSP,HullQualityTF);
        CapacitySP.setMaxWidth(Double.MAX_VALUE);
        IDSP.setMaxWidth(Double.MAX_VALUE);
        FactoryNameTF.setMaxWidth(Double.MAX_VALUE);
        FuelTF.setMaxWidth(Double.MAX_VALUE);
        LeastDepthSP.setMaxWidth(Double.MAX_VALUE);
        LastSpeedSP.setMaxWidth(Double.MAX_VALUE);
        WeightSP.setMaxWidth(Double.MAX_VALUE);
        HullQualityTF.setMaxWidth(Double.MAX_VALUE);

        HBox AllColms = new HBox(firstColm,secColm);
        AllColms.setAlignment(Pos.CENTER);

        ImageView selectedImage = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//8a.jpg"));
            selectedImage.setImage(image1);
            selectedImage.setFitWidth(450);
            selectedImage.setFitHeight(200);
        }catch (FileNotFoundException ex){}

        this.getChildren().addAll(AllColms,OKBTN,selectedImage);
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

    public Label getHullQualityLBL() {
        return HullQualityLBL;
    }

    public void setHullQualityLBL(Label hullQualityLBL) {
        HullQualityLBL = hullQualityLBL;
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

    public TextField getHullQualityTF() {
        return HullQualityTF;
    }

    public void setHullQualityTF(TextField hullQualityTF) {
        HullQualityTF = hullQualityTF;
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
}
