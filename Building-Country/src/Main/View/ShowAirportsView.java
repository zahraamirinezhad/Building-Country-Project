package Main.View;

import Main.Buildings.Airport;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class ShowAirportsView extends BorderPane {
    private TableView<Airport> tableView;
    private Button ShowPassengerPlanesBTN;
    private Button ShowCargoPlanesBTN;
    private Button ShowCrewsBTN;
    private Button ShowPilotsBTN;
    private Button ShowTripsBTN;
    private Button ExitBTN;

    public ShowAirportsView(){
        setTableView(new TableView<>());
        ShowPassengerPlanesBTN = new Button(" SHOW PASSENGER PLANES INFORMATION ");
        ShowPassengerPlanesBTN.setMaxWidth(Double.MAX_VALUE);
        ShowCargoPlanesBTN = new Button(" SHOW CARGO PLANES INFORMATION ");
        ShowCargoPlanesBTN.setMaxWidth(Double.MAX_VALUE);
        ShowCrewsBTN = new Button(" SHOW CREWS INFORMATION ");
        ShowCrewsBTN.setMaxWidth(Double.MAX_VALUE);
        ShowPilotsBTN = new Button(" SHOW PILOTS INFORMATION ");
        ShowPilotsBTN.setMaxWidth(Double.MAX_VALUE);
        ShowTripsBTN = new Button(" SHOW TRIPS");
        ShowTripsBTN.setMaxWidth(Double.MAX_VALUE);
        ExitBTN = new Button(" EXIT ");
        ExitBTN.setMaxWidth(Double.MAX_VALUE);

        TableColumn<Airport, String> nameCOL = new TableColumn<>("AIRPORT NAME");
        nameCOL.setCellValueFactory(new PropertyValueFactory<>("TerminalName"));

        TableColumn<Airport, String> addressCOL = new TableColumn<>("ADDRESS");
        addressCOL.setCellValueFactory(new PropertyValueFactory<>("Address"));

        TableColumn<Airport, Double> metrazhCOL = new TableColumn<>("METRAZH");
        metrazhCOL.setCellValueFactory(new PropertyValueFactory<>("Metrazh"));

        TableColumn<Airport, String> typeCOL = new TableColumn<>("AIRPORT TYPE");
        typeCOL.setCellValueFactory(new PropertyValueFactory<>("AirportType"));

        TableColumn<Airport, Double> buildPriceCOL = new TableColumn<>("BUILD PRICE");
        buildPriceCOL.setCellValueFactory(new PropertyValueFactory<>("BuildPrice"));

        TableColumn<Airport, Integer> runawaysCOL = new TableColumn<>("NUMBER OF RUNAWAYS");
        runawaysCOL.setCellValueFactory(new PropertyValueFactory<>("RunawayNum"));

        getTableView().getColumns().addAll(nameCOL,addressCOL,metrazhCOL,typeCOL,buildPriceCOL,runawaysCOL);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        VBox AllBTN = new VBox(ShowPassengerPlanesBTN,ShowCargoPlanesBTN,ShowPilotsBTN,ShowCrewsBTN,ShowTripsBTN,ExitBTN);
        AllBTN.setAlignment(Pos.BOTTOM_CENTER);
        AllBTN.setMaxWidth(Double.MAX_VALUE);

        this.setCenter(getTableView());
        this.setRight(AllBTN);
    }

    public TableView<Airport> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<Airport> tableView) {
        this.tableView = tableView;
    }

    public Button getShowCrewsBTN() {
        return ShowCrewsBTN;
    }

    public void setShowCrewsBTN(Button showCrewsBTN) {
        ShowCrewsBTN = showCrewsBTN;
    }

    public Button getShowPilotsBTN() {
        return ShowPilotsBTN;
    }

    public void setShowPilotsBTN(Button showPilotsBTN) {
        ShowPilotsBTN = showPilotsBTN;
    }

    public Button getShowPassengerPlanesBTN() {
        return ShowPassengerPlanesBTN;
    }

    public void setShowPassengerPlanesBTN(Button showPassengerPlanesBTN) {
        ShowPassengerPlanesBTN = showPassengerPlanesBTN;
    }

    public Button getShowCargoPlanesBTN() {
        return ShowCargoPlanesBTN;
    }

    public void setShowCargoPlanesBTN(Button showCargoPlanesBTN) {
        ShowCargoPlanesBTN = showCargoPlanesBTN;
    }

    public Button getExitBTN() {
        return ExitBTN;
    }

    public void setExitBTN(Button exitBTN) {
        ExitBTN = exitBTN;
    }

    public Button getShowTripsBTN() {
        return ShowTripsBTN;
    }

    public void setShowTripsBTN(Button showTripsBTN) {
        ShowTripsBTN = showTripsBTN;
    }
}
