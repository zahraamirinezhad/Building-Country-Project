package Main.View;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class ShowTravelTypeView extends VBox {
    private Button TRAVELS_BY_SHIP;
    private Button TRAVELS_BY_TRAIN;
    private Button TRAVELS_BY_AIRPLANE;
    private Button TRAVELS_BY_BUS;
    private Button Exit;

    public ShowTravelTypeView() {
        TRAVELS_BY_SHIP = new Button(" TRAVELS BY SHIP ");
        TRAVELS_BY_SHIP.setMaxWidth(Double.MAX_VALUE);
        TRAVELS_BY_SHIP.setAlignment(Pos.CENTER);
        TRAVELS_BY_TRAIN = new Button(" TRAVELS BY TRAIN ");
        TRAVELS_BY_TRAIN.setMaxWidth(Double.MAX_VALUE);
        TRAVELS_BY_TRAIN.setAlignment(Pos.CENTER);
        TRAVELS_BY_AIRPLANE = new Button(" TRAVELS BY AIRPLANE ");
        TRAVELS_BY_AIRPLANE.setMaxWidth(Double.MAX_VALUE);
        TRAVELS_BY_AIRPLANE.setAlignment(Pos.CENTER);
        TRAVELS_BY_BUS = new Button(" TRAVELS BY BUS ");
        TRAVELS_BY_BUS.setMaxWidth(Double.MAX_VALUE);
        TRAVELS_BY_BUS.setAlignment(Pos.CENTER);
        Exit = new Button(" EXIT ");
        Exit.setMaxWidth(Double.MAX_VALUE);
        Exit.setAlignment(Pos.CENTER);

        this.getChildren().addAll(TRAVELS_BY_SHIP,TRAVELS_BY_TRAIN, TRAVELS_BY_AIRPLANE,TRAVELS_BY_BUS,Exit);
        this.setAlignment(Pos.CENTER);
    }

    public Button getTRAVELS_BY_SHIP() {
        return TRAVELS_BY_SHIP;
    }

    public void setTRAVELS_BY_SHIP(Button TRAVELS_BY_SHIP) {
        this.TRAVELS_BY_SHIP = TRAVELS_BY_SHIP;
    }

    public Button getTRAVELS_BY_TRAIN() {
        return TRAVELS_BY_TRAIN;
    }

    public void setTRAVELS_BY_TRAIN(Button TRAVELS_BY_TRAIN) {
        this.TRAVELS_BY_TRAIN = TRAVELS_BY_TRAIN;
    }

    public Button getTRAVELS_BY_AIRPLANE() {
        return TRAVELS_BY_AIRPLANE;
    }

    public void setTRAVELS_BY_AIRPLANE(Button TRAVELS_BY_AIRPLANE) {
        this.TRAVELS_BY_AIRPLANE = TRAVELS_BY_AIRPLANE;
    }

    public Button getTRAVELS_BY_BUS() {
        return TRAVELS_BY_BUS;
    }

    public void setTRAVELS_BY_BUS(Button TRAVELS_BY_BUS) {
        this.TRAVELS_BY_BUS = TRAVELS_BY_BUS;
    }

    public Button getExit() {
        return Exit;
    }

    public void setExit(Button exit) {
        Exit = exit;
    }
}
