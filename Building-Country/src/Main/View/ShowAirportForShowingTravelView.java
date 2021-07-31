package Main.View;

import Main.Buildings.Airport;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class ShowAirportForShowingTravelView extends BorderPane {
    private TableView<Airport> tableView;
    private Button ShowTripsBTN;
    private Button ExitBTN;

    public ShowAirportForShowingTravelView(){
        setTableView(new TableView<>());
        setShowTripsBTN(new Button(" SHOW TRIPS"));
        getShowTripsBTN().setMaxWidth(Double.MAX_VALUE);
        setExitBTN(new Button(" EXIT "));
        getExitBTN().setMaxWidth(Double.MAX_VALUE);

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

        VBox AllBTN = new VBox(getShowTripsBTN(), getExitBTN());
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

    public Button getShowTripsBTN() {
        return ShowTripsBTN;
    }

    public void setShowTripsBTN(Button showTripsBTN) {
        ShowTripsBTN = showTripsBTN;
    }

    public Button getExitBTN() {
        return ExitBTN;
    }

    public void setExitBTN(Button exitBTN) {
        ExitBTN = exitBTN;
    }
}
