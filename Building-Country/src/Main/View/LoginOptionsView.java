package Main.View;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LoginOptionsView extends VBox {
    private Button VARIZ;
    private Button BARDASHT;
    private Button SHOW_INFORMATION;
    private Button EXIT;

    public LoginOptionsView(){
        VARIZ = new Button(" VARIZ ");
        VARIZ.setMaxWidth(Double.MAX_VALUE);
        VARIZ.setAlignment(Pos.CENTER);
        BARDASHT = new Button(" BARDASHT ");
        BARDASHT.setMaxWidth(Double.MAX_VALUE);
        BARDASHT.setAlignment(Pos.CENTER);
        SHOW_INFORMATION = new Button(" SHOW INFORMATION ");
        SHOW_INFORMATION.setMaxWidth(Double.MAX_VALUE);
        SHOW_INFORMATION.setAlignment(Pos.CENTER);
        EXIT = new Button(" EXIT ");
        EXIT.setMaxWidth(Double.MAX_VALUE);
        EXIT.setAlignment(Pos.CENTER);

        ImageView selectedImage = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//download (2).jpg"));
            selectedImage.setImage(image1);
            selectedImage.setFitWidth(450);
            selectedImage.setFitHeight(200);
        }catch (FileNotFoundException ex){}

        this.getChildren().addAll(VARIZ,BARDASHT,SHOW_INFORMATION,EXIT,selectedImage);
        this.setAlignment(Pos.CENTER);
    }


    public Button getVARIZ() {
        return VARIZ;
    }

    public void setVARIZ(Button VARIZ) {
        this.VARIZ = VARIZ;
    }

    public Button getBARDASHT() {
        return BARDASHT;
    }

    public void setBARDASHT(Button BARDASHT) {
        this.BARDASHT = BARDASHT;
    }

    public Button getSHOW_INFORMATION() {
        return SHOW_INFORMATION;
    }

    public void setSHOW_INFORMATION(Button SHOW_INFORMATION) {
        this.SHOW_INFORMATION = SHOW_INFORMATION;
    }

    public Button getEXIT() {
        return EXIT;
    }

    public void setEXIT(Button EXIT) {
        this.EXIT = EXIT;
    }
}
