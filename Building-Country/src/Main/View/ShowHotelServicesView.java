package Main.View;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;

public class ShowHotelServicesView extends VBox {
    private CheckBox LAUNDRY;
    private CheckBox GYM;
    private CheckBox POOL;
    private CheckBox RESTAURANT;
    private CheckBox CAFE;
    private CheckBox STORE;
    private CheckBox LIBRARY;
    private CheckBox BEAUTYSALON;
    private CheckBox CINEMA;
    private CheckBox CLINIC;
    private CheckBox PARK;
    private CheckBox GAMENET;
    private CheckBox FREEINTERNET;
    private Button Exit;
    public ShowHotelServicesView(){
        LAUNDRY = new CheckBox("LAUNDRY");
        LAUNDRY.setMaxWidth(Double.MAX_VALUE);
        LAUNDRY.setDisable(true);

        GYM = new CheckBox("GYM");
        GYM.setMaxWidth(Double.MAX_VALUE);
        GYM.setDisable(true);

        POOL = new CheckBox("POOL");
        POOL.setMaxWidth(Double.MAX_VALUE);
        POOL.setDisable(true);

        RESTAURANT = new CheckBox("RESTAURANT");
        RESTAURANT.setMaxWidth(Double.MAX_VALUE);
        RESTAURANT.setDisable(true);

        CAFE = new CheckBox("CAFE");
        CAFE.setMaxWidth(Double.MAX_VALUE);
        CAFE.setDisable(true);

        STORE = new CheckBox("STORE");
        STORE.setMaxWidth(Double.MAX_VALUE);
        STORE.setDisable(true);

        LIBRARY = new CheckBox("LIBRARY");
        LIBRARY.setMaxWidth(Double.MAX_VALUE);
        LIBRARY.setDisable(true);

        BEAUTYSALON = new CheckBox("BEAUTYSALON");
        BEAUTYSALON.setMaxWidth(Double.MAX_VALUE);
        BEAUTYSALON.setDisable(true);

        CINEMA = new CheckBox("CINEMA");
        CINEMA.setMaxWidth(Double.MAX_VALUE);
        CINEMA.setDisable(true);

        CLINIC = new CheckBox("CLINIC");
        CLINIC.setMaxWidth(Double.MAX_VALUE);
        CLINIC.setDisable(true);

        PARK = new CheckBox("PARK");
        PARK.setMaxWidth(Double.MAX_VALUE);
        PARK.setDisable(true);

        GAMENET = new CheckBox("GAMENET");
        GAMENET.setMaxWidth(Double.MAX_VALUE);
        GAMENET.setDisable(true);

        FREEINTERNET = new CheckBox("FREEINTERNET");
        FREEINTERNET.setMaxWidth(Double.MAX_VALUE);
        FREEINTERNET.setDisable(true);

        Exit = new Button(" EXIT ");
        Exit.setMaxWidth(Double.MAX_VALUE);

        this.getChildren().addAll(LAUNDRY, GYM, POOL, RESTAURANT, CAFE, STORE, LIBRARY, BEAUTYSALON, CINEMA, CLINIC, PARK, GAMENET, FREEINTERNET,Exit);
        this.setAlignment(Pos.CENTER);

    }

    public CheckBox getLAUNDRY() {
        return LAUNDRY;
    }

    public void setLAUNDRY(CheckBox LAUNDRY) {
        this.LAUNDRY = LAUNDRY;
    }

    public CheckBox getGYM() {
        return GYM;
    }

    public void setGYM(CheckBox GYM) {
        this.GYM = GYM;
    }

    public CheckBox getPOOL() {
        return POOL;
    }

    public void setPOOL(CheckBox POOL) {
        this.POOL = POOL;
    }

    public CheckBox getRESTAURANT() {
        return RESTAURANT;
    }

    public void setRESTAURANT(CheckBox RESTAURANT) {
        this.RESTAURANT = RESTAURANT;
    }

    public CheckBox getCAFE() {
        return CAFE;
    }

    public void setCAFE(CheckBox CAFE) {
        this.CAFE = CAFE;
    }

    public CheckBox getSTORE() {
        return STORE;
    }

    public void setSTORE(CheckBox STORE) {
        this.STORE = STORE;
    }

    public CheckBox getLIBRARY() {
        return LIBRARY;
    }

    public void setLIBRARY(CheckBox LIBRARY) {
        this.LIBRARY = LIBRARY;
    }

    public CheckBox getBEAUTYSALON() {
        return BEAUTYSALON;
    }

    public void setBEAUTYSALON(CheckBox BEAUTYSALON) {
        this.BEAUTYSALON = BEAUTYSALON;
    }

    public CheckBox getCINEMA() {
        return CINEMA;
    }

    public void setCINEMA(CheckBox CINEMA) {
        this.CINEMA = CINEMA;
    }

    public CheckBox getCLINIC() {
        return CLINIC;
    }

    public void setCLINIC(CheckBox CLINIC) {
        this.CLINIC = CLINIC;
    }

    public CheckBox getPARK() {
        return PARK;
    }

    public void setPARK(CheckBox PARK) {
        this.PARK = PARK;
    }

    public CheckBox getGAMENET() {
        return GAMENET;
    }

    public void setGAMENET(CheckBox GAMENET) {
        this.GAMENET = GAMENET;
    }

    public CheckBox getFREEINTERNET() {
        return FREEINTERNET;
    }

    public void setFREEINTERNET(CheckBox FREEINTERNET) {
        this.FREEINTERNET = FREEINTERNET;
    }

    public Button getExit() {
        return Exit;
    }

    public void setExit(Button exit) {
        Exit = exit;
    }
}
