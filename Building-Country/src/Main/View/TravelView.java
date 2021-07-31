package Main.View;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TravelView extends VBox {
    private Label TerminalTypeLBL;
    private Label IDLBL;
    private Label DateLBL;
    private Label TripCostValueLBL;
    private RadioButton AIRPORT;
    private RadioButton SHIP_PORT;
    private RadioButton BUS_STATION;
    private RadioButton RAILWAY_STATION;
    private Button SelectDestinationCityBTN;
    private Button SelectOriginTerminalBTN;
    private Button SelectDestinationTerminalBTN;
    private Button SelectPassengersBTN;
    private Button SelectDriverBTN;
    private Button SelectVehicleBTN;
    private Button ExitBTN;
    private Button ShowTripCostBTN;
    private Spinner<Integer> IDSP;
    private DatePicker Date;

    public TravelView(){
        SelectDestinationCityBTN = new Button(" SELECT DESTINATION CITY ");

        ToggleGroup toggleGroup1 = new ToggleGroup();
        TerminalTypeLBL = new Label(" TERMINAL TYPE ");
        AIRPORT = new RadioButton("AIRPLANE");
        AIRPORT.setToggleGroup(toggleGroup1);
        AIRPORT.setDisable(true);
        AIRPORT.setSelected(false);
        BUS_STATION = new RadioButton("BUS STATION");
        BUS_STATION.setToggleGroup(toggleGroup1);
        BUS_STATION.setDisable(true);
        BUS_STATION.setSelected(false);
        SHIP_PORT = new RadioButton("SHIP PORT");
        SHIP_PORT.setToggleGroup(toggleGroup1);
        SHIP_PORT.setDisable(true);
        SHIP_PORT.setSelected(false);
        RAILWAY_STATION = new RadioButton("RAILWAY STATION");
        RAILWAY_STATION.setToggleGroup(toggleGroup1);
        RAILWAY_STATION.setDisable(true);
        RAILWAY_STATION.setSelected(false);

        SelectOriginTerminalBTN = new Button(" SELECT ORIGIN TERMINAL ");
        SelectOriginTerminalBTN.setDisable(true);
        SelectDestinationTerminalBTN = new Button(" SELECT DESTINATION TERMINAL ");
        SelectDestinationTerminalBTN.setDisable(true);

        SelectPassengersBTN = new Button(" SELECT PASSENGERS ");
        SelectPassengersBTN.setDisable(true);

        SelectDriverBTN = new Button(" SELECT THE DRIVER ");
        SelectDriverBTN.setDisable(true);

        SelectVehicleBTN = new Button(" SELECT THE VEHICLE ");
        SelectVehicleBTN.setDisable(true);

        IDLBL = new Label(" ID ");
        IDSP = new Spinner<>(100,1000,100);

        DateLBL = new Label(" DATE ");
        Date = new DatePicker();

        TripCostValueLBL = new Label(" TRIP COST VALUE ");
        TripCostValueLBL.setVisible(false);

        ShowTripCostBTN = new Button(" SHOW TRIP COST ");
        ShowTripCostBTN.setDisable(true);

        ExitBTN = new Button(" EXIT ");
        ExitBTN.setDisable(true);

        ImageView selectedImage = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//download.jpg"));
            selectedImage.setImage(image1);
            selectedImage.setFitWidth(450);
            selectedImage.setFitHeight(200);
        }catch (FileNotFoundException ex){}

        HBox secRow = new HBox(AIRPORT,BUS_STATION,RAILWAY_STATION,SHIP_PORT);
        secRow.setSpacing(10);
        secRow.setAlignment(Pos.CENTER);

        VBox firstCol = new VBox(IDLBL,DateLBL);
        firstCol.setAlignment(Pos.CENTER);
        firstCol.setSpacing(5);
        IDLBL.setMaxWidth(Double.MAX_VALUE);
        IDLBL.setAlignment(Pos.CENTER);
        DateLBL.setMaxWidth(Double.MAX_VALUE);
        DateLBL.setAlignment(Pos.CENTER);

        VBox secCol = new VBox(IDSP,Date);
        secCol.setAlignment(Pos.CENTER);
        IDSP.setMaxWidth(Double.MAX_VALUE);
        Date.setMaxWidth(Double.MAX_VALUE);

        HBox thirdRow = new HBox(firstCol,secCol);
        thirdRow.setSpacing(10);
        thirdRow.setAlignment(Pos.CENTER);

        this.getChildren().addAll(SelectDestinationCityBTN,TerminalTypeLBL,secRow,SelectOriginTerminalBTN,SelectDestinationTerminalBTN,SelectVehicleBTN,SelectDriverBTN,SelectPassengersBTN,thirdRow,ShowTripCostBTN,TripCostValueLBL,ExitBTN,selectedImage);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(5);
    }

    public Label getIDLBL() {
        return IDLBL;
    }

    public void setIDLBL(Label IDLBL) {
        this.IDLBL = IDLBL;
    }

    public Label getDateLBL() {
        return DateLBL;
    }

    public void setDateLBL(Label dateLBL) {
        DateLBL = dateLBL;
    }

    public Label getTripCostValueLBL() {
        return TripCostValueLBL;
    }

    public void setTripCostValueLBL(Label tripCostValueLBL) {
        TripCostValueLBL = tripCostValueLBL;
    }

    public RadioButton getAIRPORT() {
        return AIRPORT;
    }

    public void setAIRPORT(RadioButton AIRPORT) {
        this.AIRPORT = AIRPORT;
    }

    public RadioButton getSHIP_PORT() {
        return SHIP_PORT;
    }

    public void setSHIP_PORT(RadioButton SHIP_PORT) {
        this.SHIP_PORT = SHIP_PORT;
    }

    public RadioButton getBUS_STATION() {
        return BUS_STATION;
    }

    public void setBUS_STATION(RadioButton BUS_STATION) {
        this.BUS_STATION = BUS_STATION;
    }

    public RadioButton getRAILWAY_STATION() {
        return RAILWAY_STATION;
    }

    public void setRAILWAY_STATION(RadioButton RAILWAY_STATION) {
        this.RAILWAY_STATION = RAILWAY_STATION;
    }

    public Button getSelectDestinationCityBTN() {
        return SelectDestinationCityBTN;
    }

    public void setSelectDestinationCityBTN(Button selectDestinationCityBTN) {
        SelectDestinationCityBTN = selectDestinationCityBTN;
    }

    public Button getSelectOriginTerminalBTN() {
        return SelectOriginTerminalBTN;
    }

    public void setSelectOriginTerminalBTN(Button selectOriginTerminalBTN) {
        SelectOriginTerminalBTN = selectOriginTerminalBTN;
    }

    public Button getSelectDestinationTerminalBTN() {
        return SelectDestinationTerminalBTN;
    }

    public void setSelectDestinationTerminalBTN(Button selectDestinationTerminalBTN) {
        SelectDestinationTerminalBTN = selectDestinationTerminalBTN;
    }

    public Button getSelectPassengersBTN() {
        return SelectPassengersBTN;
    }

    public void setSelectPassengersBTN(Button selectPassengersBTN) {
        SelectPassengersBTN = selectPassengersBTN;
    }

    public Button getSelectDriverBTN() {
        return SelectDriverBTN;
    }

    public void setSelectDriverBTN(Button selectDriverBTN) {
        SelectDriverBTN = selectDriverBTN;
    }

    public Button getSelectVehicleBTN() {
        return SelectVehicleBTN;
    }

    public void setSelectVehicleBTN(Button selectVehicleBTN) {
        SelectVehicleBTN = selectVehicleBTN;
    }

    public Spinner<Integer> getIDSP() {
        return IDSP;
    }

    public void setIDSP(Spinner<Integer> IDSP) {
        this.IDSP = IDSP;
    }

    public DatePicker getDate() {
        return Date;
    }

    public void setDate(DatePicker date) {
        Date = date;
    }

    public Label getTerminalTypeLBL() {
        return TerminalTypeLBL;
    }

    public void setTerminalTypeLBL(Label terminalTypeLBL) {
        TerminalTypeLBL = terminalTypeLBL;
    }

    public Button getExitBTN() {
        return ExitBTN;
    }

    public void setExitBTN(Button exitBTN) {
        ExitBTN = exitBTN;
    }

    public Button getShowTripCostBTN() {
        return ShowTripCostBTN;
    }

    public void setShowTripCostBTN(Button showTripCostBTN) {
        ShowTripCostBTN = showTripCostBTN;
    }
}
