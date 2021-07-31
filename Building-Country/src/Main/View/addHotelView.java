package Main.View;

import Main.Buildings.HotelServices;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class addHotelView extends VBox {
    private Label HotelNameLBL;
    private Label AddressLBL;
    private Label StarNumLBL;
    private Label ServicesLBL;
    private TextField HotelNameTF;
    private TextField AddressTF;
    private Spinner<Integer> StarNumSP;
    private Button AddRoom;
    private Button ExitBTN;
    private Button ConfirmedBTN;
    private CheckBox service1;
    private CheckBox service2;
    private CheckBox service3;
    private CheckBox service4;
    private CheckBox service5;
    private CheckBox service6;
    private CheckBox service7;
    private CheckBox service8;
    private CheckBox service9;
    private CheckBox service10;
    private CheckBox service11;
    private CheckBox service12;
    private CheckBox service13;

    public addHotelView(){
        HotelNameLBL = new Label(" HOTEL NAME ");
        AddressLBL = new Label(" ADDRESS ");
        StarNumLBL = new Label(" NUMBER OF STARS ");
        ServicesLBL = new Label(" SERVICES ");
        ServicesLBL.setAlignment(Pos.CENTER);
        ServicesLBL.setTextFill(Paint.valueOf("#a41998"));

        HotelNameTF = new TextField();
        AddressTF = new TextField();
        StarNumSP = new Spinner<>(1,5,1);

        AddRoom = new Button(" ADD ROOM ");
        ExitBTN = new Button(" EXIT ");
        ConfirmedBTN = new Button(" CONFIRMED ");
        AddRoom.setDisable(true);
        ExitBTN.setDisable(true);

        service1 = new CheckBox(HotelServices.service[0].name());
        service2 = new CheckBox(HotelServices.service[1].name());
        service3 = new CheckBox(HotelServices.service[2].name());
        service4 = new CheckBox(HotelServices.service[3].name());
        service5 = new CheckBox(HotelServices.service[4].name());
        service6 = new CheckBox(HotelServices.service[5].name());
        service7 = new CheckBox(HotelServices.service[6].name());
        service8 = new CheckBox(HotelServices.service[7].name());
        service9 = new CheckBox(HotelServices.service[8].name());
        service10 = new CheckBox(HotelServices.service[9].name());
        service11 = new CheckBox(HotelServices.service[10].name());
        service12 = new CheckBox(HotelServices.service[11].name());
        service13 = new CheckBox(HotelServices.service[12].name());
        HBox firstRow = new HBox(service1,service2,service3,service4,service5,service6);
        HBox secRow = new HBox(service7,service8,service9,service10,service11,service12);
        HBox thirdRow = new HBox(service13);
        firstRow.setAlignment(Pos.CENTER);
        firstRow.setSpacing(6);
        secRow.setAlignment(Pos.CENTER);
        secRow.setSpacing(6);
        thirdRow.setAlignment(Pos.CENTER);

        VBox firstColm = new VBox(HotelNameLBL,AddressLBL,StarNumLBL);
        HotelNameLBL.setMaxWidth(Double.MAX_VALUE);
        AddressLBL.setMaxWidth(Double.MAX_VALUE);
        StarNumLBL.setMaxWidth(Double.MAX_VALUE);
        firstColm.setSpacing(9);

        VBox secColm = new VBox(HotelNameTF,AddressTF,StarNumSP);
        HotelNameTF.setMaxWidth(Double.MAX_VALUE);
        AddressTF.setMaxWidth(Double.MAX_VALUE);
        StarNumSP.setMaxWidth(Double.MAX_VALUE);

        HBox AllColms = new HBox(firstColm,secColm);
        AllColms.setAlignment(Pos.CENTER);

        ImageView selectedImage = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//1920x880_upload-website-pageimage--welcome-to-the-dolcevita-hotel-jagdhof--2_448_3840x1760.jpg"));
            selectedImage.setImage(image1);
            selectedImage.setFitWidth(450);
            selectedImage.setFitHeight(200);
        }catch (FileNotFoundException ex){}


        this.getChildren().addAll(AllColms,ServicesLBL,firstRow,secRow,thirdRow,ConfirmedBTN,AddRoom,ExitBTN,selectedImage);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(10);
    }

    public Label getHotelNameLBL() {
        return HotelNameLBL;
    }

    public void setHotelNameLBL(Label hotelNameLBL) {
        HotelNameLBL = hotelNameLBL;
    }

    public Label getAddressLBL() {
        return AddressLBL;
    }

    public void setAddressLBL(Label addressLBL) {
        AddressLBL = addressLBL;
    }

    public Label getStarNumLBL() {
        return StarNumLBL;
    }

    public void setStarNumLBL(Label starNumLBL) {
        StarNumLBL = starNumLBL;
    }

    public TextField getHotelNameTF() {
        return HotelNameTF;
    }

    public void setHotelNameTF(TextField hotelNameTF) {
        HotelNameTF = hotelNameTF;
    }

    public TextField getAddressTF() {
        return AddressTF;
    }

    public void setAddressTF(TextField addressTF) {
        AddressTF = addressTF;
    }

    public Button getAddRoom() {
        return AddRoom;
    }

    public void setAddRoom(Button addRoom) {
        AddRoom = addRoom;
    }

    public Button getExitBTN() {
        return ExitBTN;
    }

    public void setExitBTN(Button exitBTN) {
        ExitBTN = exitBTN;
    }

    public Spinner<Integer> getStarNumSP() {
        return StarNumSP;
    }

    public void setStarNumSP(Spinner<Integer> starNumSP) {
        StarNumSP = starNumSP;
    }

    public Button getConfirmedBTN() {
        return ConfirmedBTN;
    }

    public void setConfirmedBTN(Button confirmedBTN) {
        ConfirmedBTN = confirmedBTN;
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

    public CheckBox getService6() {
        return service6;
    }

    public void setService6(CheckBox service6) {
        this.service6 = service6;
    }

    public CheckBox getService7() {
        return service7;
    }

    public void setService7(CheckBox service7) {
        this.service7 = service7;
    }

    public CheckBox getService8() {
        return service8;
    }

    public void setService8(CheckBox service8) {
        this.service8 = service8;
    }

    public CheckBox getService9() {
        return service9;
    }

    public void setService9(CheckBox service9) {
        this.service9 = service9;
    }

    public CheckBox getService10() {
        return service10;
    }

    public void setService10(CheckBox service10) {
        this.service10 = service10;
    }

    public CheckBox getService11() {
        return service11;
    }

    public void setService11(CheckBox service11) {
        this.service11 = service11;
    }

    public CheckBox getService12() {
        return service12;
    }

    public void setService12(CheckBox service12) {
        this.service12 = service12;
    }

    public CheckBox getService13() {
        return service13;
    }

    public void setService13(CheckBox service13) {
        this.service13 = service13;
    }

    public Label getServicesLBL() {
        return ServicesLBL;
    }

    public void setServicesLBL(Label servicesLBL) {
        ServicesLBL = servicesLBL;
    }
}
