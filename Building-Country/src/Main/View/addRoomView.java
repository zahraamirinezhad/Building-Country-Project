package Main.View;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class addRoomView extends VBox {
    private Label RoomNumberLBL;
    private Label BedNumLBL;
    private Label MetrazhLBL;
    private Spinner<Integer> RoomNumberSP;
    private Spinner<Integer> BedNumSP;
    private Spinner<Double> MetrazhSP;
    private Button OKBTN;

    public addRoomView(){
        RoomNumberLBL = new Label(" ROOM NUMBER ");
        BedNumLBL = new Label(" NUMBER OF BEDS ");
        MetrazhLBL = new Label(" METRAZH ");

        RoomNumberSP = new Spinner<>(1,1000,1);
        BedNumSP = new Spinner<>(1,10,1);
        MetrazhSP = new Spinner<>(10.0,100.0,10.0);

        setOKBTN(new Button(" OK "));

        VBox firstColm = new VBox(RoomNumberLBL,BedNumLBL,MetrazhLBL);
        RoomNumberLBL.setMaxWidth(Double.MAX_VALUE);
        BedNumLBL.setMaxWidth(Double.MAX_VALUE);
        MetrazhLBL.setMaxWidth(Double.MAX_VALUE);
        firstColm.setSpacing(9);

        VBox secColm = new VBox(RoomNumberSP,BedNumSP,MetrazhSP);
        RoomNumberSP.setMaxWidth(Double.MAX_VALUE);
        BedNumSP.setMaxWidth(Double.MAX_VALUE);
        MetrazhSP.setMaxWidth(Double.MAX_VALUE);

        HBox AllColms = new HBox(firstColm,secColm);
        AllColms.setAlignment(Pos.CENTER);

        ImageView selectedImage = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//how-to-arrange-living-room-furniture-1976578-hero-c99074dcad854b669b91652046a39203.jpg"));
            selectedImage.setImage(image1);
            selectedImage.setFitWidth(450);
            selectedImage.setFitHeight(200);
        }catch (FileNotFoundException ex){}

        this.getChildren().addAll(AllColms, getOKBTN(),selectedImage);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(15);
    }


    public Label getRoomNumberLBL() {
        return RoomNumberLBL;
    }

    public void setRoomNumberLBL(Label roomNumberLBL) {
        RoomNumberLBL = roomNumberLBL;
    }

    public Label getBedNumLBL() {
        return BedNumLBL;
    }

    public void setBedNumLBL(Label bedNumLBL) {
        BedNumLBL = bedNumLBL;
    }

    public Label getMetrazhLBL() {
        return MetrazhLBL;
    }

    public void setMetrazhLBL(Label metrazhLBL) {
        MetrazhLBL = metrazhLBL;
    }

    public Button getOKBTN() {
        return OKBTN;
    }

    public void setOKBTN(Button OKBTN) {
        this.OKBTN = OKBTN;
    }

    public Spinner<Integer> getRoomNumberSP() {
        return RoomNumberSP;
    }

    public void setRoomNumberSP(Spinner<Integer> roomNumberSP) {
        RoomNumberSP = roomNumberSP;
    }

    public Spinner<Integer> getBedNumSP() {
        return BedNumSP;
    }

    public void setBedNumSP(Spinner<Integer> bedNumSP) {
        BedNumSP = bedNumSP;
    }

    public Spinner<Double> getMetrazhSP() {
        return MetrazhSP;
    }

    public void setMetrazhSP(Spinner<Double> metrazhSP) {
        MetrazhSP = metrazhSP;
    }
}
