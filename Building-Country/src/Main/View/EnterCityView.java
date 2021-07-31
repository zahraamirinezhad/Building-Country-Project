package Main.View;

import Main.City;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class EnterCityView extends TabPane {
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


    public EnterCityView(){
        setBtn1(new Button(City.getEnterList()[0]));
        setBtn2(new Button(City.getEnterList()[1]));
        setBtn3(new Button(City.getEnterList()[2]));
        setBtn4(new Button(City.getEnterList()[3]));
        setBtn5(new Button(City.getEnterList()[4]));
        setBtn6(new Button(City.getEnterList()[5]));
        setBtn7(new Button(City.getEnterList()[6]));
        setBtn8(new Button(City.getEnterList()[7]));
        setBtn9(new Button(City.getEnterList()[8]));
        setBtn10(new Button(City.getEnterList()[9]));
        setBtn11(new Button(City.getEnterList()[10]));
        setBtn12(new Button(City.getEnterList()[11]));
        setBtn13(new Button(City.getEnterList()[12]));
        setBtn14(new Button(City.getEnterList()[13]));
        setBtn15(new Button(City.getEnterList()[14]));
        setBtn16(new Button(City.getEnterList()[15]));
        setBtn17(new Button(City.getEnterList()[16]));
        setBtn18(new Button(City.getEnterList()[17]));
        setBtn19(new Button(City.getEnterList()[18]));
        setBtn20(new Button(City.getEnterList()[19]));
        setBtn21(new Button(City.getEnterList()[20]));
        setBtn22(new Button(City.getEnterList()[21]));
        setBtn23(new Button(City.getEnterList()[22]));
        setBtn24(new Button(City.getEnterList()[23]));
        setBtn25(new Button(City.getEnterList()[24]));

        Tab tab0 = new Tab("TERMINALS");
        Tab tab1 = new Tab("HOTELS");
        Tab tab2 = new Tab("ADD VEHICLE");
        Tab tab3 = new Tab("ADD CREWS");
        Tab tab4 = new Tab("TRAVEL");
        Tab tab5 = new Tab("BANKS");
        Tab tab6 = new Tab("SHOW INFORMATION");
        Tab tab7 = new Tab(" POPULATION ");

        VBox vBox0 = new VBox(btn2);
        btn2.setMaxWidth(Double.MAX_VALUE);
        ImageView selectedImage0 = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//images (3).jpg"));
            selectedImage0.setImage(image1);
            selectedImage0.setFitWidth(450);
            selectedImage0.setFitHeight(200);
        }catch (FileNotFoundException ex){}
        BorderPane borderPane0 = new BorderPane();
        borderPane0.setLeft(vBox0);
        borderPane0.setRight(selectedImage0);
        tab0.setContent(borderPane0);

        VBox vBox1 = new VBox(btn1,btn3);
        btn1.setMaxWidth(Double.MAX_VALUE);
        btn3.setMaxWidth(Double.MAX_VALUE);
        ImageView selectedImage1 = new ImageView();
        try {
            javafx.scene.image.Image image1 = new Image(new FileInputStream("images//v2gQQH6Qq5EAJSemo1Yqie27aYBOHE4pSwA6jSkFHKg.jpg"));
            selectedImage1.setImage(image1);
            selectedImage1.setFitWidth(450);
            selectedImage1.setFitHeight(200);
        }catch (FileNotFoundException ex){}
        BorderPane borderPane1 = new BorderPane();
        borderPane1.setLeft(vBox1);
        borderPane1.setRight(selectedImage1);
        tab1.setContent(borderPane1);

        VBox vBox2 = new VBox(btn4,btn5,btn6,btn7,btn8,btn9);
        btn4.setMaxWidth(Double.MAX_VALUE);
        btn5.setMaxWidth(Double.MAX_VALUE);
        btn6.setMaxWidth(Double.MAX_VALUE);
        btn7.setMaxWidth(Double.MAX_VALUE);
        btn8.setMaxWidth(Double.MAX_VALUE);
        btn9.setMaxWidth(Double.MAX_VALUE);
        ImageView selectedImage2 = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//airplane-truck-car-ship-train_171932-149.jpg"));
            selectedImage2.setImage(image1);
            selectedImage2.setFitWidth(450);
            selectedImage2.setFitHeight(200);
        }catch (FileNotFoundException ex){}
        BorderPane borderPane2 = new BorderPane();
        borderPane2.setLeft(vBox2);
        borderPane2.setRight(selectedImage2);
        tab2.setContent(borderPane2);

        VBox vBox3 = new VBox(btn10,btn11,btn12,btn13,btn14);
        btn10.setMaxWidth(Double.MAX_VALUE);
        btn11.setMaxWidth(Double.MAX_VALUE);
        btn12.setMaxWidth(Double.MAX_VALUE);
        btn13.setMaxWidth(Double.MAX_VALUE);
        btn14.setMaxWidth(Double.MAX_VALUE);
        ImageView selectedImage3 = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//vueling-pilot-cc.jpg"));
            selectedImage3.setImage(image1);
            selectedImage3.setFitWidth(450);
            selectedImage3.setFitHeight(200);
        }catch (FileNotFoundException ex){}
        BorderPane borderPane3 = new BorderPane();
        borderPane3.setLeft(vBox3);
        borderPane3.setRight(selectedImage3);
        tab3.setContent(borderPane3);

        VBox vBox4 = new VBox(btn23);
        btn23.setMaxWidth(Double.MAX_VALUE);
        ImageView selectedImage4 = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//travel-world-map-1068x713.jpg"));
            selectedImage4.setImage(image1);
            selectedImage4.setFitWidth(450);
            selectedImage4.setFitHeight(200);
        }catch (FileNotFoundException ex){}
        BorderPane borderPane4 = new BorderPane();
        borderPane4.setLeft(vBox4);
        borderPane4.setRight(selectedImage4);
        tab4.setContent(borderPane4);

        VBox vBox5 = new VBox(btn24,btn25);
        btn24.setMaxWidth(Double.MAX_VALUE);
        btn25.setMaxWidth(Double.MAX_VALUE);
        ImageView selectedImage5 = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//Bl06bank.jpg"));
            selectedImage5.setImage(image1);
            selectedImage5.setFitWidth(450);
            selectedImage5.setFitHeight(200);
        }catch (FileNotFoundException ex){}
        BorderPane borderPane5 = new BorderPane();
        borderPane5.setLeft(vBox5);
        borderPane5.setRight(selectedImage5);
        tab5.setContent(borderPane5);

        VBox vBox6 = new VBox(btn15,btn16,btn17,btn18,btn19,btn20,btn22);
        btn15.setMaxWidth(Double.MAX_VALUE);
        btn16.setMaxWidth(Double.MAX_VALUE);
        btn17.setMaxWidth(Double.MAX_VALUE);
        btn18.setMaxWidth(Double.MAX_VALUE);
        btn19.setMaxWidth(Double.MAX_VALUE);
        btn20.setMaxWidth(Double.MAX_VALUE);
        btn22.setMaxWidth(Double.MAX_VALUE);
        ImageView selectedImage6 = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//information-system-supporting-science.jpg"));
            selectedImage6.setImage(image1);
            selectedImage6.setFitWidth(450);
            selectedImage6.setFitHeight(200);
        }catch (FileNotFoundException ex){}
        BorderPane borderPane6 = new BorderPane();
        borderPane6.setLeft(vBox6);
        borderPane6.setRight(selectedImage6);
        tab6.setContent(borderPane6);

        VBox vBox7 = new VBox(btn21);
        btn21.setMaxWidth(Double.MAX_VALUE);
        ImageView selectedImage7 = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//images (1).jpg"));
            selectedImage7.setImage(image1);
            selectedImage7.setFitWidth(450);
            selectedImage7.setFitHeight(200);
        }catch (FileNotFoundException ex){}
        BorderPane borderPane7 = new BorderPane();
        borderPane7.setLeft(vBox7);
        borderPane7.setRight(selectedImage7);
        tab7.setContent(borderPane7);

        this.getTabs().addAll(tab0,tab1,tab2,tab3,tab4,tab5,tab6,tab7);


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
