package Main.View;

import Main.Buildings.BusTerminal;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class ShowBusStationForShowingTravelView extends BorderPane {
    private TableView<BusTerminal> tableView;
    private Button ShowTripsBTN;
    private Button ExitBTN;

    public ShowBusStationForShowingTravelView() {
        setTableView(new TableView<>());
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

        VBox AllBTN = new VBox(getShowTripsBTN(), getExitBTN());
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
