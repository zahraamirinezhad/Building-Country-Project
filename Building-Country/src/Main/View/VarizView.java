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

public class VarizView extends VBox {
    private Label Variz;
    private Spinner<Double> VarizValue;
    private Button Done;

    public VarizView(){
        Variz = new Label(" VARIZ ");
        Variz.setAlignment(Pos.CENTER);
        VarizValue = new Spinner<>(5.0,100.0,5.0);
        Done = new Button(" DONE ");
        Done.setAlignment(Pos.CENTER);
        HBox All = new HBox(Variz,VarizValue);
        All.setSpacing(10);
        All.setAlignment(Pos.CENTER);

        ImageView selectedImage = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//credit-card.jpg"));
            selectedImage.setImage(image1);
            selectedImage.setFitWidth(450);
            selectedImage.setFitHeight(200);
        }catch (FileNotFoundException ex){}

        this.getChildren().addAll(All,Done,selectedImage);
        this.setSpacing(20);
        this.setAlignment(Pos.CENTER);
    }

    public Label getVariz() {
        return Variz;
    }

    public void setVariz(Label variz) {
        Variz = variz;
    }

    public Spinner<Double> getVarizValue() {
        return VarizValue;
    }

    public void setVarizValue(Spinner<Double> varizValue) {
        VarizValue = varizValue;
    }

    public Button getDone() {
        return Done;
    }

    public void setDone(Button done) {
        Done = done;
    }
}
