package Main.View;

import Main.City;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class AddCityView extends BorderPane {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private  Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private  Button btn9;
    private Button btn10;
    private  Button btn11;
    private Button btn12;
    private Button btn13;
    private Button btn14;
    private Button btn15;
    private Button btn16;
    private Button btn17;
    private Button btn18;
    private Button btn19;
    private Button btn20;
    private Button btn21;
    private Button btn22;
    private Button btn23;
    private Button btn24;
    private Button btn25;

    public AddCityView(){
        setBtn1(new Button(City.getList()[0]));
        setBtn2(new Button(City.getList()[1]));
        setBtn3(new Button(City.getList()[2]));
        setBtn4(new Button(City.getList()[3]));
        setBtn5(new Button(City.getList()[4]));
        setBtn6(new Button(City.getList()[5]));
        setBtn7(new Button(City.getList()[6]));
        setBtn8(new Button(City.getList()[7]));
        setBtn9(new Button(City.getList()[8]));
        setBtn10(new Button(City.getList()[9]));
        setBtn11(new Button(City.getList()[10]));
        setBtn12(new Button(City.getList()[11]));
        setBtn13(new Button(City.getList()[12]));
        setBtn14(new Button(City.getList()[13]));
        setBtn15(new Button(City.getList()[14]));
        setBtn16(new Button(City.getList()[15]));
        setBtn17(new Button(City.getList()[16]));
        setBtn18(new Button(City.getList()[17]));
        setBtn19(new Button(City.getList()[18]));
        setBtn20(new Button(City.getList()[19]));
        setBtn21(new Button(City.getList()[20]));
        setBtn22(new Button(City.getList()[21]));
        setBtn23(new Button(City.getList()[22]));
        setBtn24(new Button(City.getList()[23]));
        setBtn25(new Button(City.getList()[24]));

        VBox firstColm = new VBox(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12);
        VBox secColm = new VBox(btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24);
        firstColm.setAlignment(Pos.CENTER);
        secColm.setAlignment(Pos.CENTER);
        btn1.setMaxWidth(Double.MAX_VALUE);
        btn2.setMaxWidth(Double.MAX_VALUE);
        btn3.setMaxWidth(Double.MAX_VALUE);
        btn4.setMaxWidth(Double.MAX_VALUE);
        btn5.setMaxWidth(Double.MAX_VALUE);
        btn6.setMaxWidth(Double.MAX_VALUE);
        btn7.setMaxWidth(Double.MAX_VALUE);
        btn8.setMaxWidth(Double.MAX_VALUE);
        btn9.setMaxWidth(Double.MAX_VALUE);
        btn10.setMaxWidth(Double.MAX_VALUE);
        btn11.setMaxWidth(Double.MAX_VALUE);
        btn12.setMaxWidth(Double.MAX_VALUE);
        btn13.setMaxWidth(Double.MAX_VALUE);
        btn14.setMaxWidth(Double.MAX_VALUE);
        btn15.setMaxWidth(Double.MAX_VALUE);
        btn16.setMaxWidth(Double.MAX_VALUE);
        btn17.setMaxWidth(Double.MAX_VALUE);
        btn18.setMaxWidth(Double.MAX_VALUE);
        btn19.setMaxWidth(Double.MAX_VALUE);
        btn20.setMaxWidth(Double.MAX_VALUE);
        btn21.setMaxWidth(Double.MAX_VALUE);
        btn22.setMaxWidth(Double.MAX_VALUE);
        btn23.setMaxWidth(Double.MAX_VALUE);
        btn24.setMaxWidth(Double.MAX_VALUE);

        HBox bothColm = new HBox(firstColm,secColm);
        bothColm.setAlignment(Pos.CENTER);


        ImageView selectedImage = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//North_of_tehran.jpg"));
            selectedImage.setImage(image1);
            selectedImage.setFitWidth(450);
            selectedImage.setFitHeight(200);
        }catch (FileNotFoundException ex){}

        VBox All = new VBox(bothColm,btn25,selectedImage);
        All.setAlignment(Pos.CENTER);
        btn25.setMaxWidth(275);

        this.setCenter(All);

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

    public Button getBtn9() {
        return btn9;
    }

    public void setBtn9(Button btn9) {
        this.btn9 = btn9;
    }

    public Button getBtn10() {
        return btn10;
    }

    public void setBtn10(Button btn10) {
        this.btn10 = btn10;
    }

    public Button getBtn11() {
        return btn11;
    }

    public void setBtn11(Button btn11) {
        this.btn11 = btn11;
    }

    public Button getBtn12() {
        return btn12;
    }

    public void setBtn12(Button btn12) {
        this.btn12 = btn12;
    }

    public Button getBtn13() {
        return btn13;
    }

    public void setBtn13(Button btn13) {
        this.btn13 = btn13;
    }

    public Button getBtn14() {
        return btn14;
    }

    public void setBtn14(Button btn14) {
        this.btn14 = btn14;
    }

    public Button getBtn15() {
        return btn15;
    }

    public void setBtn15(Button btn15) {
        this.btn15 = btn15;
    }

    public Button getBtn16() {
        return btn16;
    }

    public void setBtn16(Button btn16) {
        this.btn16 = btn16;
    }

    public Button getBtn17() {
        return btn17;
    }

    public void setBtn17(Button btn17) {
        this.btn17 = btn17;
    }

    public Button getBtn18() {
        return btn18;
    }

    public void setBtn18(Button btn18) {
        this.btn18 = btn18;
    }

    public Button getBtn19() {
        return btn19;
    }

    public void setBtn19(Button btn19) {
        this.btn19 = btn19;
    }

    public Button getBtn20() {
        return btn20;
    }

    public void setBtn20(Button btn20) {
        this.btn20 = btn20;
    }

    public Button getBtn21() {
        return btn21;
    }

    public void setBtn21(Button btn21) {
        this.btn21 = btn21;
    }

    public Button getBtn22() {
        return btn22;
    }

    public void setBtn22(Button btn22) {
        this.btn22 = btn22;
    }

    public Button getBtn23() {
        return btn23;
    }

    public void setBtn23(Button btn23) {
        this.btn23 = btn23;
    }

    public Button getBtn24() {
        return btn24;
    }

    public void setBtn24(Button btn24) {
        this.btn24 = btn24;
    }

    public Button getBtn25() {
        return btn25;
    }

    public void setBtn25(Button btn25) {
        this.btn25 = btn25;
    }
}
