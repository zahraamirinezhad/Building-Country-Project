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

public class addCargoPlaneView extends VBox {
    private Label CapacityLBL;
    private Label IDLBL;
    private Label FactoryNameLBL;
    private Label LastHeightLBL;
    private Label RunwayLengthLBL;
    private Label LastWeightLBL;
    private Spinner<Integer> CapacitySP;
    private Spinner<Integer> IDSP;
    private TextField FactoryNameTF;
    private Spinner<Double> LastHeightSP;
    private Spinner<Double> RunwayLengthSP;
    private Spinner<Double> LastWeightSP;
    private Button OKBTN;

    public addCargoPlaneView() {
        setCapacityLBL(new Label(" CAPACITY "));
        setIDLBL(new Label(" ID "));
        setFactoryNameLBL(new Label(" NAME OF THE FACTORY "));
        LastHeightLBL = new Label(" LAST HEIGHT ");
        RunwayLengthLBL = new Label(" LENGTH OF RUNAWAYS ");
        setLastWeightLBL(new Label(" LAST WEIGHT "));

        CapacitySP = new Spinner<>(1, 200, 1);
        IDSP = new Spinner<>(100, 1000, 100);
        LastHeightSP = new Spinner<>(100.0, 1000.0, 100.0);
        RunwayLengthSP = new Spinner<>(100.0, 1000.0, 100.0);
        LastWeightSP = new Spinner<>(100.0, 1000.0, 100.0);
        FactoryNameTF = new TextField();

        OKBTN = new Button(" OK ");

        VBox firstColm = new VBox(getCapacityLBL(), getIDLBL(), getFactoryNameLBL(), getLastHeightLBL(), getRunwayLengthLBL(), getLastWeightLBL());
        getCapacityLBL().setMaxWidth(Double.MAX_VALUE);
        getIDLBL().setMaxWidth(Double.MAX_VALUE);
        getFactoryNameLBL().setMaxWidth(Double.MAX_VALUE);
        LastHeightLBL.setMaxWidth(Double.MAX_VALUE);
        RunwayLengthLBL.setMaxWidth(Double.MAX_VALUE);
        LastWeightLBL.setMaxWidth(Double.MAX_VALUE);
        firstColm.setSpacing(9);

        VBox secColm = new VBox(getCapacitySP(), getIDSP(), getFactoryNameTF(), getLastHeightSP(), getRunwayLengthSP(), getLastWeightSP());
        getCapacitySP().setMaxWidth(Double.MAX_VALUE);
        getIDSP().setMaxWidth(Double.MAX_VALUE);
        getFactoryNameTF().setMaxWidth(Double.MAX_VALUE);
        getLastHeightSP().setMaxWidth(Double.MAX_VALUE);
        getRunwayLengthSP().setMaxWidth(Double.MAX_VALUE);
        getLastWeightSP().setMaxWidth(Double.MAX_VALUE);

        HBox AllColms = new HBox(firstColm, secColm);
        AllColms.setAlignment(Pos.CENTER);

        ImageView selectedImage = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//180130114822-belugaxl-livery-design-full-169.jpg"));
            selectedImage.setImage(image1);
            selectedImage.setFitWidth(450);
            selectedImage.setFitHeight(200);
        } catch (FileNotFoundException ex) {
        }

        this.getChildren().addAll(AllColms, OKBTN, selectedImage);
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

    public Label getLastWeightLBL() {
        return LastWeightLBL;
    }

    public void setLastWeightLBL(Label lastWeightLBL) {
        LastWeightLBL = lastWeightLBL;
    }

    public TextField getFactoryNameTF() {
        return FactoryNameTF;
    }

    public void setFactoryNameTF(TextField factoryNameTF) {
        FactoryNameTF = factoryNameTF;
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

    public Spinner<Double> getLastWeightSP() {
        return LastWeightSP;
    }

    public void setLastWeightSP(Spinner<Double> lastWeightSP) {
        LastWeightSP = lastWeightSP;
    }

    public Button getOKBTN() {
        return OKBTN;
    }

    public void setOKBTN(Button OKBTN) {
        this.OKBTN = OKBTN;
    }
}
