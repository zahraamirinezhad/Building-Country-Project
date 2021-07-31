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

public class addPassengerPlaneView extends VBox {
    private Label FactoryNameLBL;
    private Label ChairsLBL;
    private Label CapacityLBL;
    private Label IDLBL;
    private Label LastHeightLBL;
    private Label RunwayLengthLBL;
    private Label ServicesLBL;
    private TextField FactoryNameTF;
    private TextField ChairsTF;
    private Button OKBTN;
    private Spinner<Integer> CapacitySP;
    private Spinner<Integer> IDSP;
    private Spinner<Double> LastHeightSP;
    private Spinner<Double> RunwayLengthSP;
    private CheckBox service1;
    private CheckBox service2;
    private CheckBox service3;
    private CheckBox service4;
    private CheckBox service5;

    public addPassengerPlaneView(){
        FactoryNameLBL = new  Label(" NAME OF THE FACTORY ");
        ChairsLBL = new Label(" TYPE OF CHAIRS SETTLEMENT ");
        CapacityLBL = new Label(" CAPACITY ");
        IDLBL = new Label(" ID ");
        LastHeightLBL = new Label(" LAST HEIGHT ");
        RunwayLengthLBL = new Label(" LENGTH OF RUNAWAY ");
        ServicesLBL = new Label(" SERVICES ");
        ServicesLBL.setAlignment(Pos.CENTER);
        ServicesLBL.setTextFill(Paint.valueOf("#a41998"));

        CapacitySP = new Spinner<>(1,200,1);
        IDSP = new Spinner<>(100,1000,100);
        LastHeightSP = new Spinner<>(100.0,1000.0,100.0);
        RunwayLengthSP = new Spinner<>(100.0,1000.0,100.0);

        service1 = new CheckBox(WelfareServices.service[0].name());
        service2 = new CheckBox(WelfareServices.service[1].name());
        service3 = new CheckBox(WelfareServices.service[2].name());
        service4 = new CheckBox(WelfareServices.service[3].name());
        service5 = new CheckBox(WelfareServices.service[4].name());
        HBox serviceRow = new HBox(service1,service2,service3,service4,service5);
        serviceRow.setSpacing(6);
        serviceRow.setAlignment(Pos.CENTER);

        FactoryNameTF = new TextField();
        ChairsTF = new TextField();


        OKBTN = new Button(" OK ");

        VBox firstColm = new VBox(getCapacityLBL(), getIDLBL(), getFactoryNameLBL(), getLastHeightLBL(), getRunwayLengthLBL(), getChairsLBL());
        getCapacityLBL().setMaxWidth(Double.MAX_VALUE);
        getIDLBL().setMaxWidth(Double.MAX_VALUE);
        getFactoryNameLBL().setMaxWidth(Double.MAX_VALUE);
        getLastHeightLBL().setMaxWidth(Double.MAX_VALUE);
        getRunwayLengthLBL().setMaxWidth(Double.MAX_VALUE);
        ChairsLBL.setMaxWidth(Double.MAX_VALUE);
        firstColm.setSpacing(9);

        VBox secColm = new VBox(getCapacitySP(), getIDSP(), getFactoryNameTF(), getLastHeightSP(), getRunwayLengthSP(), getChairsTF());
        CapacitySP.setMaxWidth(Double.MAX_VALUE);
        IDSP.setMaxWidth(Double.MAX_VALUE);
        getFactoryNameTF().setMaxWidth(Double.MAX_VALUE);
        LastHeightSP.setMaxWidth(Double.MAX_VALUE);
        RunwayLengthSP.setMaxWidth(Double.MAX_VALUE);
        ChairsTF.setMaxWidth(Double.MAX_VALUE);

        HBox AllColms = new HBox(firstColm,secColm);
        AllColms.setAlignment(Pos.CENTER);

        ImageView selectedImage = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//3b. LPA.jpg"));
            selectedImage.setImage(image1);
            selectedImage.setFitWidth(450);
            selectedImage.setFitHeight(200);
        }catch (FileNotFoundException ex){}

        this.getChildren().addAll(AllColms,ServicesLBL,serviceRow,OKBTN,selectedImage);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(15);
    }

    public Label getFactoryNameLBL() {
        return FactoryNameLBL;
    }

    public void setFactoryNameLBL(Label factoryNameLBL) {
        FactoryNameLBL = factoryNameLBL;
    }

    public Label getChairsLBL() {
        return ChairsLBL;
    }

    public void setChairsLBL(Label chairsLBL) {
        ChairsLBL = chairsLBL;
    }

    public TextField getFactoryNameTF() {
        return FactoryNameTF;
    }

    public void setFactoryNameTF(TextField factoryNameTF) {
        FactoryNameTF = factoryNameTF;
    }

    public TextField getChairsTF() {
        return ChairsTF;
    }

    public void setChairsTF(TextField chairsTF) {
        ChairsTF = chairsTF;
    }

    public Button getOKBTN() {
        return OKBTN;
    }

    public void setOKBTN(Button OKBTN) {
        this.OKBTN = OKBTN;
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

    public Spinner<Double> getLastHeightSP() {
        return LastHeightSP;
    }

    public void setLastHeightSP(Spinner<Double> lastHeightSP) {
        LastHeightSP = lastHeightSP;
    }

    public Spinner<Double> getRunwayLengthSP() {
        return RunwayLengthSP;
    }

    public void setRunwayLengthSP(Spinner<Double> runwayLengthSP) {
        RunwayLengthSP = runwayLengthSP;
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

    public Label getLastHeightLBL() {
        return LastHeightLBL;
    }

    public void setLastHeightLBL(Label lastHeightLBL) {
        LastHeightLBL = lastHeightLBL;
    }

    public Label getRunwayLengthLBL() {
        return RunwayLengthLBL;
    }

    public void setRunwayLengthLBL(Label runwayLengthLBL) {
        RunwayLengthLBL = runwayLengthLBL;
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
