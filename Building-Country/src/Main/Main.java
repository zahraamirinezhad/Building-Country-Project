package Main;

import Main.Controller.CountryOptionsController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.*;
import java.util.Scanner;

public class Main extends Application {
    public static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public static Country Iran = new Country();

    public static void main(String[] args) throws IOException {
        Date date = new Date();
        date.start();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        CountryOptionsController COPView = new CountryOptionsController();
        primaryStage.setScene(new Scene(COPView.getCountryOptionsView()));
        primaryStage.setWidth(450);
        primaryStage.setHeight(365);
        primaryStage.show();
    }
}

class Date extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                this.sleep(1500);
                Country.setDAY(Country.getDAY()+1);
                if (Country.getDAY() == 30) {
                    Country.setMONTH(Country.getMONTH() +1);
                    Country.setDAY(0);
                }
                if (Country.getMONTH() == 12) {
                    Country.setYEAR(Country.getYEAR()+1);
                    Country.setMONTH(0);
                    Country.setDAY(0);
                }

            } catch (InterruptedException e) {
            }
        }
    }
}

