package Main.View;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class addPersonView extends VBox {
    private Label NameLBL;
    private Label LastNameLBL;
    private Label YearLBL;
    private Label PlaceLBL;
    private Label GenderLBL;
    private Label CodemelliLBL;
    private Label JobLBL;
    private RadioButton Pilot;
    private RadioButton Driver;
    private RadioButton Locomotives;
    private RadioButton Sailor;
    private RadioButton Crew;
    private RadioButton Female;
    private RadioButton Male;
    private TextField NameTF;
    private TextField LastNameTF;
    private Spinner<Integer> YearSP;
    private TextField PlaceTF;
    private TextField CodemelliTF;
    private Button ExitBTN;

    public addPersonView(){
        NameLBL = new Label(" NAME ");
        LastNameLBL = new Label(" LASTNAME ");
        YearLBL = new Label(" BIRTH YEAR ");
        PlaceLBL = new Label(" PLACE ");
        GenderLBL = new Label(" GENDER ");
        GenderLBL.setTextFill(Paint.valueOf("#138928"));
        GenderLBL.setAlignment(Pos.CENTER);
        CodemelliLBL = new Label(" NATIONAL CODE ");
        JobLBL = new Label(" JOB ");
        JobLBL.setTextFill(Paint.valueOf("#2019ae"));
        JobLBL.setAlignment(Pos.CENTER);

        ToggleGroup groupJob = new ToggleGroup();
        Pilot = new RadioButton("PILOT");
        Pilot.setToggleGroup(groupJob);
        Pilot.setSelected(true);
        Driver = new RadioButton("DRIVER");
        Driver.setToggleGroup(groupJob);
        Locomotives = new RadioButton("LOCOMOTIVE");
        Locomotives.setToggleGroup(groupJob);
        Sailor = new RadioButton("SAILOR");
        Sailor.setToggleGroup(groupJob);
        Crew = new RadioButton("CREW");
        Crew.setToggleGroup(groupJob);

        ToggleGroup groupGender = new ToggleGroup();
        Female = new RadioButton("FEMALE");
        Female.setToggleGroup(groupGender);
        Female.setSelected(true);
        Male = new RadioButton("MALE");
        Male.setToggleGroup(groupGender);

        NameTF = new TextField();
        LastNameTF = new TextField();
        YearSP = new Spinner<>(2000,2100,2000);
        PlaceTF = new TextField();
        CodemelliTF = new TextField();

        VBox firstColm = new VBox(NameLBL,LastNameLBL,YearLBL,PlaceLBL,CodemelliLBL);
        firstColm.setAlignment(Pos.CENTER);
        NameLBL.setAlignment(Pos.CENTER);
        LastNameLBL.setAlignment(Pos.CENTER);
        YearLBL.setAlignment(Pos.CENTER);
        PlaceLBL.setAlignment(Pos.CENTER);
        CodemelliLBL.setAlignment(Pos.CENTER);
        firstColm.setSpacing(6);

        VBox secColm = new VBox(NameTF,LastNameTF,YearSP,PlaceTF,CodemelliTF);
        secColm.setAlignment(Pos.CENTER);
        NameTF.setAlignment(Pos.CENTER);
        LastNameTF.setAlignment(Pos.CENTER);
        PlaceTF.setAlignment(Pos.CENTER);
        CodemelliTF.setAlignment(Pos.CENTER);

        HBox firstRow = new HBox(firstColm,secColm);
        firstRow.setAlignment(Pos.CENTER);

        HBox AllJobs = new HBox(Sailor,Driver,Locomotives,Crew,Pilot);
        AllJobs.setAlignment(Pos.CENTER);
        AllJobs.setSpacing(6);

        VBox secColm2 = new VBox();
        secColm2.setAlignment(Pos.CENTER);

        HBox AllGenders = new HBox(Female,Male);
        AllGenders.setAlignment(Pos.CENTER);
        AllGenders.setSpacing(6);

        ExitBTN = new Button(" EXIT ");
        ExitBTN.setAlignment(Pos.CENTER);

        ImageView selectedImage = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//header100people.jpg"));
            selectedImage.setImage(image1);
            selectedImage.setFitWidth(450);
            selectedImage.setFitHeight(200);
        }catch (FileNotFoundException ex){}

        this.getChildren().addAll(firstRow,GenderLBL,AllGenders,JobLBL,AllJobs,ExitBTN,selectedImage);
        this.setSpacing(10);
        this.setAlignment(Pos.CENTER);

    }


    public Label getNameLBL() {
        return NameLBL;
    }

    public void setNameLBL(Label nameLBL) {
        NameLBL = nameLBL;
    }

    public Label getLastNameLBL() {
        return LastNameLBL;
    }

    public void setLastNameLBL(Label lastNameLBL) {
        LastNameLBL = lastNameLBL;
    }

    public Label getYearLBL() {
        return YearLBL;
    }

    public void setYearLBL(Label yearLBL) {
        YearLBL = yearLBL;
    }

    public Label getPlaceLBL() {
        return PlaceLBL;
    }

    public void setPlaceLBL(Label placeLBL) {
        PlaceLBL = placeLBL;
    }

    public Label getGenderLBL() {
        return GenderLBL;
    }

    public void setGenderLBL(Label genderLBL) {
        GenderLBL = genderLBL;
    }

    public Label getCodemelliLBL() {
        return CodemelliLBL;
    }

    public void setCodemelliLBL(Label codemelliLBL) {
        CodemelliLBL = codemelliLBL;
    }

    public Label getJobLBL() {
        return JobLBL;
    }

    public void setJobLBL(Label jobLBL) {
        JobLBL = jobLBL;
    }

    public RadioButton getPilot() {
        return Pilot;
    }

    public void setPilot(RadioButton pilot) {
        Pilot = pilot;
    }

    public RadioButton getDriver() {
        return Driver;
    }

    public void setDriver(RadioButton driver) {
        Driver = driver;
    }

    public RadioButton getLocomotives() {
        return Locomotives;
    }

    public void setLocomotives(RadioButton locomotives) {
        Locomotives = locomotives;
    }

    public RadioButton getSailor() {
        return Sailor;
    }

    public void setSailor(RadioButton sailor) {
        Sailor = sailor;
    }

    public RadioButton getCrew() {
        return Crew;
    }

    public void setCrew(RadioButton crew) {
        Crew = crew;
    }

    public RadioButton getFemale() {
        return Female;
    }

    public void setFemale(RadioButton female) {
        Female = female;
    }

    public RadioButton getMale() {
        return Male;
    }

    public void setMale(RadioButton male) {
        Male = male;
    }

    public TextField getNameTF() {
        return NameTF;
    }

    public void setNameTF(TextField nameTF) {
        NameTF = nameTF;
    }

    public TextField getLastNameTF() {
        return LastNameTF;
    }

    public void setLastNameTF(TextField lastNameTF) {
        LastNameTF = lastNameTF;
    }

    public Spinner<Integer> getYearSP() {
        return YearSP;
    }

    public void setYearSP(Spinner<Integer> yearSP) {
        YearSP = yearSP;
    }

    public TextField getPlaceTF() {
        return PlaceTF;
    }

    public void setPlaceTF(TextField placeTF) {
        PlaceTF = placeTF;
    }

    public TextField getCodemelliTF() {
        return CodemelliTF;
    }

    public void setCodemelliTF(TextField codemelliTF) {
        CodemelliTF = codemelliTF;
    }

    public Button getExitBTN() {
        return ExitBTN;
    }

    public void setExitBTN(Button exitBTN) {
        ExitBTN = exitBTN;
    }
}
