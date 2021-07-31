package Main.View;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class addTerminalView extends HBox {
    private Button AIRPORTBT;
    private Button BUS_STATIONBT;
    private Button RAILWAY_STATIONBT;
    private Button SHIPPING_PORTBT;

    public addTerminalView(){
        AIRPORTBT = new Button(" AIRPORT ");
        BUS_STATIONBT = new Button(" BUS STATION ");
        RAILWAY_STATIONBT = new Button(" RAILWAY STATION ");
        SHIPPING_PORTBT = new Button(" SHIPPING PORT ");

        ImageView selectedImage1 = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//sociable-robots-airport.jpg"));
            selectedImage1.setImage(image1);
            selectedImage1.setFitWidth(450);
            selectedImage1.setFitHeight(200);
        }catch (FileNotFoundException ex){}

        ImageView selectedImage2 = new ImageView();
        try {
            Image image2 = new Image(new FileInputStream("images//The_new_2018_Wigan_Bus_Station.jpg"));
            selectedImage2.setImage(image2);
            selectedImage2.setFitWidth(450);
            selectedImage2.setFitHeight(200);
        }catch (FileNotFoundException ex){}


        ImageView selectedImage3 = new ImageView();
        try {
            Image image3 = new Image(new FileInputStream("images//3934.jpg"));
            selectedImage3.setImage(image3);
            selectedImage3.setFitWidth(450);
            selectedImage3.setFitHeight(200);
        }catch (FileNotFoundException ex){}


        ImageView selectedImage4 = new ImageView();
        try {
            Image image4 = new Image(new FileInputStream("images//porteverglades4_small.jpg"));
            selectedImage4.setImage(image4);
            selectedImage4.setFitWidth(450);
            selectedImage4.setFitHeight(200);
        }catch (FileNotFoundException ex){}

        VBox firstColm = new VBox(AIRPORTBT,BUS_STATIONBT);
        AIRPORTBT.setMaxWidth(Double.MAX_VALUE);
        AIRPORTBT.setAlignment(Pos.CENTER_LEFT);
        BUS_STATIONBT.setMaxWidth(Double.MAX_VALUE);
        BUS_STATIONBT.setAlignment(Pos.CENTER_LEFT);
        firstColm.setSpacing(190);

        VBox secColm = new VBox(selectedImage1,selectedImage2);
        secColm.setAlignment(Pos.TOP_CENTER);
        secColm.setSpacing(10);

        VBox thirdColm = new VBox(RAILWAY_STATIONBT,SHIPPING_PORTBT);
        RAILWAY_STATIONBT.setMaxWidth(Double.MAX_VALUE);
        RAILWAY_STATIONBT.setAlignment(Pos.CENTER_LEFT);
        SHIPPING_PORTBT.setMaxWidth(Double.MAX_VALUE);
        SHIPPING_PORTBT.setAlignment(Pos.CENTER_LEFT);
        thirdColm.setSpacing(190);


        VBox fourthColm = new VBox(selectedImage3,selectedImage4);
        fourthColm.setAlignment(Pos.TOP_CENTER);
        fourthColm.setSpacing(10);

        this.getChildren().addAll(firstColm,secColm,thirdColm,fourthColm);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(10);

    }

    public Button getAIRPORTBT() {
        return AIRPORTBT;
    }

    public void setAIRPORTBT(Button AIRPORTBT) {
        this.AIRPORTBT = AIRPORTBT;
    }

    public Button getBUS_STATIONBT() {
        return BUS_STATIONBT;
    }

    public void setBUS_STATIONBT(Button BUS_STATIONBT) {
        this.BUS_STATIONBT = BUS_STATIONBT;
    }

    public Button getRAILWAY_STATIONBT() {
        return RAILWAY_STATIONBT;
    }

    public void setRAILWAY_STATIONBT(Button RAILWAY_STATIONBT) {
        this.RAILWAY_STATIONBT = RAILWAY_STATIONBT;
    }

    public Button getSHIPPING_PORTBT() {
        return SHIPPING_PORTBT;
    }

    public void setSHIPPING_PORTBT(Button SHIPPING_PORTBT) {
        this.SHIPPING_PORTBT = SHIPPING_PORTBT;
    }
}
