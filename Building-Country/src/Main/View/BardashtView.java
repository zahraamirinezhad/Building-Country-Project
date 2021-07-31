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

public class BardashtView extends VBox {
    private Label Bardasht;
    private Spinner<Double> BardashtValue;
    private Button Done;

    public BardashtView(){
        setBardasht(new Label(" BARDASHT "));
        getBardasht().setAlignment(Pos.CENTER);
        setBardashtValue(new Spinner<>(5.0,100.0,5.0));
        setDone(new Button(" DONE "));
        getDone().setAlignment(Pos.CENTER);
        HBox All = new HBox(getBardasht(), getBardashtValue());
        All.setSpacing(10);
        All.setAlignment(Pos.CENTER);

        ImageView selectedImage = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//download (1).jpg"));
            selectedImage.setImage(image1);
            selectedImage.setFitWidth(450);
            selectedImage.setFitHeight(200);
        }catch (FileNotFoundException ex){}

        this.getChildren().addAll(All, getDone(),selectedImage);
        this.setSpacing(20);
        this.setAlignment(Pos.CENTER);
    }

    public Label getBardasht() {
        return Bardasht;
    }

    public void setBardasht(Label bardasht) {
        Bardasht = bardasht;
    }

    public Spinner<Double> getBardashtValue() {
        return BardashtValue;
    }

    public void setBardashtValue(Spinner<Double> bardashtValue) {
        BardashtValue = bardashtValue;
    }

    public Button getDone() {
        return Done;
    }

    public void setDone(Button done) {
        Done = done;
    }
}
