package Main.View;

import Main.City;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ShowCitiesInformationView extends VBox {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;

    public ShowCitiesInformationView(){
        setBtn1(new Button(City.getShowList()[0]));
        setBtn2(new Button(City.getShowList()[1]));
        setBtn3(new Button(City.getShowList()[2]));
        setBtn4(new Button(City.getShowList()[3]));
        setBtn5(new Button(City.getShowList()[4]));
        setBtn6(new Button(City.getShowList()[5]));
        setBtn7(new Button(City.getShowList()[6]));
        setBtn8(new Button(City.getShowList()[7]));

        btn1.setMaxWidth(Double.MAX_VALUE);
        btn2.setMaxWidth(Double.MAX_VALUE);
        btn3.setMaxWidth(Double.MAX_VALUE);
        btn4.setMaxWidth(Double.MAX_VALUE);
        btn5.setMaxWidth(Double.MAX_VALUE);
        btn6.setMaxWidth(Double.MAX_VALUE);
        btn7.setMaxWidth(Double.MAX_VALUE);
        btn8.setMaxWidth(Double.MAX_VALUE);

        ImageView selectedImage = new ImageView();
        try {
            javafx.scene.image.Image image1 = new Image(new FileInputStream("images//denver-blue-dusk-bg.jpg"));
            selectedImage.setImage(image1);
            selectedImage.setFitWidth(450);
            selectedImage.setFitHeight(200);
        }catch (FileNotFoundException ex){}

        this.getChildren().addAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,selectedImage);
        this.setAlignment(Pos.CENTER);
    }
    public Button getBtn1() {
        return btn1;
    }

    public void setBtn1(Button btn1) {
        this.btn1 = btn1;
    }

    public Button getBtn2() {
        return btn2;
    }

    public void setBtn2(Button btn2) {
        this.btn2 = btn2;
    }

    public Button getBtn3() {
        return btn3;
    }

    public void setBtn3(Button btn3) {
        this.btn3 = btn3;
    }

    public Button getBtn4() {
        return btn4;
    }

    public void setBtn4(Button btn4) {
        this.btn4 = btn4;
    }

    public Button getBtn5() {
        return btn5;
    }

    public void setBtn5(Button btn5) {
        this.btn5 = btn5;
    }

    public Button getBtn6() {
        return btn6;
    }

    public void setBtn6(Button btn6) {
        this.btn6 = btn6;
    }

    public Button getBtn7() {
        return btn7;
    }

    public void setBtn7(Button btn7) {
        this.btn7 = btn7;
    }

    public Button getBtn8() {
        return btn8;
    }

    public void setBtn8(Button btn8) {
        this.btn8 = btn8;
    }
}
