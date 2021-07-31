package Main.View;

import Main.Buildings.BusTerminal;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class ShowBusStationView extends BorderPane {
    private TableView<BusTerminal> tableView;
    private Button ShowBusBTN;
    private Button ShowDriverBTN;
    private Button ShowTripsBTN;
    private Button ExitBTN;

    public ShowBusStationView() {
        setTableView(new TableView<>());
        setShowBusBTN(new Button(" SHOW BUSES INFORMATION "));
        getShowBusBTN().setMaxWidth(Double.MAX_VALUE);
        setShowDriverBTN(new Button(" SHOW DRIVERS INFORMATION "));
        getShowDriverBTN().setMaxWidth(Double.MAX_VALUE);
        setShowTripsBTN(new Button(" SHOW TRIPS "));
        getShowTripsBTN().setMaxWidth(Double.MAX_VALUE);
        setExitBTN(new Button(" EXIT "));
        getExitBTN().setMaxWidth(Double.MAX_VALUE);

        TableColumn<BusTerminal, String> nameCOL = new TableColumn<>("RAILWAY STATION NAME");
        nameCOL.setCellValueFactory(new PropertyValueFactory<>("TerminalName"));

        TableColumn<BusTerminal, String> addressCOL = new TableColumn<>("ADDRESS");
        addressCOL.setCellValueFactory(new PropertyValueFactory<>("Address"));

        TableColumn<BusTerminal, Double> metrazhCOL = new TableColumn<>("METRAZH");
        metrazhCOL.setCellValueFactory(new PropertyValueFactory<>("Metrazh"));

        TableColumn<BusTerminal, Double> buildPriceCOL = new TableColumn<>("BUILD PRICE");
        buildPriceCOL.setCellValueFactory(new PropertyValueFactory<>("BuildPrice"));

        getTableView().getColumns().addAll(nameCOL, addressCOL, metrazhCOL, buildPriceCOL);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        VBox AllBTN = new VBox(getShowBusBTN(), getShowDriverBTN(), getShowTripsBTN(), getExitBTN());
        AllBTN.setAlignment(Pos.BOTTOM_CENTER);
        AllBTN.setMaxWidth(Double.MAX_VALUE);

        this.setCenter(getTableView());
        this.setRight(AllBTN);
    }

    public TableView<BusTerminal> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<BusTerminal> tableView) {
        this.tableView = tableView;
    }

    public Button getShowBusBTN() {
        return ShowBusBTN;
    }

    public void setShowBusBTN(Button showBusBTN) {
        ShowBusBTN = showBusBTN;
    }

    public Button getShowDriverBTN() {
        return ShowDriverBTN;
    }

    public void setShowDriverBTN(Button showDriverBTN) {
        ShowDriverBTN = showDriverBTN;
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
