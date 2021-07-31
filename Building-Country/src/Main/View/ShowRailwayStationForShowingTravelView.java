package Main.View;

import Main.Buildings.RailwayStation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class ShowRailwayStationForShowingTravelView extends BorderPane {
    private TableView<RailwayStation> tableView;
    private Button ShowTripsBTN;
    private Button ExitBTN;

    public ShowRailwayStationForShowingTravelView() {
        setTableView(new TableView<>());
        setShowTripsBTN(new Button(" SHOW TRIPS "));
        getShowTripsBTN().setMaxWidth(Double.MAX_VALUE);
        setExitBTN(new Button(" EXIT "));
        getExitBTN().setMaxWidth(Double.MAX_VALUE);

        TableColumn<RailwayStation, String> nameCOL = new TableColumn<>("RAILWAY STATION NAME");
        nameCOL.setCellValueFactory(new PropertyValueFactory<>("TerminalName"));

        TableColumn<RailwayStation, String> addressCOL = new TableColumn<>("ADDRESS");
        addressCOL.setCellValueFactory(new PropertyValueFactory<>("Address"));

        TableColumn<RailwayStation, Double> metrazhCOL = new TableColumn<>("METRAZH");
        metrazhCOL.setCellValueFactory(new PropertyValueFactory<>("Metrazh"));

        TableColumn<RailwayStation, Double> buildPriceCOL = new TableColumn<>("BUILD PRICE");
        buildPriceCOL.setCellValueFactory(new PropertyValueFactory<>("BuildPrice"));

        TableColumn<RailwayStation, Integer> inputRailsCOL = new TableColumn<>("INPUT RAILS");
        inputRailsCOL.setCellValueFactory(new PropertyValueFactory<>("InputRails"));

        TableColumn<RailwayStation, Integer> outputRailsCOL = new TableColumn<>("OUTPUT RAILS");
        outputRailsCOL.setCellValueFactory(new PropertyValueFactory<>("OutputRails"));

        getTableView().getColumns().addAll(nameCOL, addressCOL, metrazhCOL, buildPriceCOL,inputRailsCOL,outputRailsCOL);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        VBox AllBTN = new VBox(getShowTripsBTN(), getExitBTN());
        AllBTN.setAlignment(Pos.BOTTOM_CENTER);
        AllBTN.setMaxWidth(Double.MAX_VALUE);

        this.setCenter(getTableView());
        this.setRight(AllBTN);
    }

    public TableView<RailwayStation> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<RailwayStation> tableView) {
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
