package Main.View;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class ShowTripTypeView extends VBox {
    private Button Entrance;
    private Button Outward;
    private Button All;
    private Button Exit;

    public ShowTripTypeView(){
        Entrance = new Button(" ENTRANCE TRIPS ");
        Entrance.setMaxWidth(Double.MAX_VALUE);
        Entrance.setAlignment(Pos.CENTER);
        Outward = new Button(" OUTWARD TRIPS ");
        Outward.setMaxWidth(Double.MAX_VALUE);
        Outward.setAlignment(Pos.CENTER);
        All = new Button(" ALL TRIPS ");
        All.setMaxWidth(Double.MAX_VALUE);
        All.setAlignment(Pos.CENTER);
        Exit = new Button(" EXIT ");
        Exit.setMaxWidth(Double.MAX_VALUE);
        Exit.setAlignment(Pos.CENTER);

        this.getChildren().addAll(Entrance,Outward,All,Exit);
        this.setAlignment(Pos.CENTER);

    }

    public Button getEntrance() {
        return Entrance;
    }

    public void setEntrance(Button entrance) {
        Entrance = entrance;
    }

    public Button getOutward() {
        return Outward;
    }

    public void setOutward(Button outward) {
        Outward = outward;
    }

    public Button getAll() {
        return All;
    }

    public void setAll(Button all) {
        All = all;
    }

    public Button getExit() {
        return Exit;
    }

    public void setExit(Button exit) {
        Exit = exit;
    }
}
