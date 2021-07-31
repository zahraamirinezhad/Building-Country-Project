package Main.View;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;

public class ShowVehicleServicesView extends VBox {
    private CheckBox RESTAURANT;
    private CheckBox WATCH_MOVIE;
    private CheckBox LISTENING_MUSIC;
    private CheckBox TOILET_BATH;
    private CheckBox READING_BOOK_NEWSPAPER;
    private Button Exit;

    public ShowVehicleServicesView(){
        RESTAURANT = new CheckBox("RESTAURANT");
        RESTAURANT.setMaxWidth(Double.MAX_VALUE);
        RESTAURANT.setDisable(true);

        WATCH_MOVIE = new CheckBox("WATCH MOVIE");
        WATCH_MOVIE.setMaxWidth(Double.MAX_VALUE);
        WATCH_MOVIE.setDisable(true);

        LISTENING_MUSIC = new CheckBox("LISTENING MUSIC");
        LISTENING_MUSIC.setMaxWidth(Double.MAX_VALUE);
        LISTENING_MUSIC.setDisable(true);

        TOILET_BATH = new CheckBox("TOILET BATH");
        TOILET_BATH.setMaxWidth(Double.MAX_VALUE);
        TOILET_BATH.setDisable(true);

        READING_BOOK_NEWSPAPER = new CheckBox("READING BOOK NEWSPAPER");
        READING_BOOK_NEWSPAPER.setMaxWidth(Double.MAX_VALUE);
        READING_BOOK_NEWSPAPER.setDisable(true);

        Exit = new Button(" EXIT ");
        Exit.setMaxWidth(Double.MAX_VALUE);

        this.getChildren().addAll(RESTAURANT, WATCH_MOVIE, LISTENING_MUSIC, TOILET_BATH, READING_BOOK_NEWSPAPER,Exit);
        this.setAlignment(Pos.CENTER);
    }

    public CheckBox getRESTAURANT() {
        return RESTAURANT;
    }

    public void setRESTAURANT(CheckBox RESTAURANT) {
        this.RESTAURANT = RESTAURANT;
    }

    public CheckBox getWATCH_MOVIE() {
        return WATCH_MOVIE;
    }

    public void setWATCH_MOVIE(CheckBox WATCH_MOVIE) {
        this.WATCH_MOVIE = WATCH_MOVIE;
    }

    public CheckBox getLISTENING_MUSIC() {
        return LISTENING_MUSIC;
    }

    public void setLISTENING_MUSIC(CheckBox LISTENING_MUSIC) {
        this.LISTENING_MUSIC = LISTENING_MUSIC;
    }

    public CheckBox getTOILET_BATH() {
        return TOILET_BATH;
    }

    public void setTOILET_BATH(CheckBox TOILET_BATH) {
        this.TOILET_BATH = TOILET_BATH;
    }

    public CheckBox getREADING_BOOK_NEWSPAPER() {
        return READING_BOOK_NEWSPAPER;
    }

    public void setREADING_BOOK_NEWSPAPER(CheckBox READING_BOOK_NEWSPAPER) {
        this.READING_BOOK_NEWSPAPER = READING_BOOK_NEWSPAPER;
    }

    public Button getExit() {
        return Exit;
    }

    public void setExit(Button exit) {
        Exit = exit;
    }
}
