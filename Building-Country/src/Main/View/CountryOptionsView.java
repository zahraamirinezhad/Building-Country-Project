package Main.View;

import Main.Country;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CountryOptionsView extends VBox {
    private Button Build_NEW_CITY;
    private Button ENTER_CITY;
    private Button SHOW_CITIES_INFORMATION;
    private Button FINANCIAL_MANAGEMENT;
    private Button EXIT;

    public CountryOptionsView() {
        setBuild_NEW_CITY(new Button(Country.getCountryOptions()[0]));
        setENTER_CITY(new Button(Country.getCountryOptions()[1]));
        setSHOW_CITIES_INFORMATION(new Button(Country.getCountryOptions()[2]));
        setFINANCIAL_MANAGEMENT(new Button(Country.getCountryOptions()[3]));
        setEXIT(new Button(Country.getCountryOptions()[4]));

        getBuild_NEW_CITY().setMaxWidth(Double.MAX_VALUE);
        getENTER_CITY().setMaxWidth(Double.MAX_VALUE);
        getSHOW_CITIES_INFORMATION().setMaxWidth(Double.MAX_VALUE);
        getFINANCIAL_MANAGEMENT().setMaxWidth(Double.MAX_VALUE);
        getEXIT().setMaxWidth(Double.MAX_VALUE);

        ImageView selectedImage = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//157214837.jpg"));
            selectedImage.setImage(image1);
            selectedImage.setFitWidth(450);
            selectedImage.setFitHeight(200);
        }catch (FileNotFoundException ex){}

        this.getChildren().addAll(getBuild_NEW_CITY(), getENTER_CITY(), getSHOW_CITIES_INFORMATION(), getFINANCIAL_MANAGEMENT(), getEXIT(),selectedImage);
        this.setAlignment(Pos.CENTER);
    }

    public Button getBuild_NEW_CITY() {
        return Build_NEW_CITY;
    }

    public void setBuild_NEW_CITY(Button build_NEW_CITY) {
        Build_NEW_CITY = build_NEW_CITY;
    }

    public Button getENTER_CITY() {
        return ENTER_CITY;
    }

    public void setENTER_CITY(Button ENTER_CITY) {
        this.ENTER_CITY = ENTER_CITY;
    }

    public Button getSHOW_CITIES_INFORMATION() {
        return SHOW_CITIES_INFORMATION;
    }

    public void setSHOW_CITIES_INFORMATION(Button SHOW_CITIES_INFORMATION) {
        this.SHOW_CITIES_INFORMATION = SHOW_CITIES_INFORMATION;
    }

    public Button getFINANCIAL_MANAGEMENT() {
        return FINANCIAL_MANAGEMENT;
    }

    public void setFINANCIAL_MANAGEMENT(Button FINANCIAL_MANAGEMENT) {
        this.FINANCIAL_MANAGEMENT = FINANCIAL_MANAGEMENT;
    }

    public Button getEXIT() {
        return EXIT;
    }

    public void setEXIT(Button EXIT) {
        this.EXIT = EXIT;
    }
}
