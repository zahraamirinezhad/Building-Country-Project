package Main.View;

import Main.Buildings.ShippingPort;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class ShowShipPortView extends BorderPane {
    private TableView<ShippingPort> tableView;
    private Button ShowShipBTN;
    private Button ShowBoatBTN;
    private Button ShowSailorBTN;
    private Button ShowTripsBTN;
    private Button ExitBTN;

    public ShowShipPortView() {
        setTableView(new TableView<>());
        ShowShipBTN = new Button(" SHOW SHIPS INFORMATION ");
        ShowShipBTN.setMaxWidth(Double.MAX_VALUE);
        ShowBoatBTN = new Button(" SHOW BOATS INFORMATION ");
        ShowBoatBTN.setMaxWidth(Double.MAX_VALUE);
        ShowSailorBTN = new Button(" SHOW SAILORS INFORMATION ");
        ShowSailorBTN.setMaxWidth(Double.MAX_VALUE);
        setShowTripsBTN(new Button(" SHOW TRIPS"));
        getShowTripsBTN().setMaxWidth(Double.MAX_VALUE);
        setExitBTN(new Button(" EXIT "));
        getExitBTN().setMaxWidth(Double.MAX_VALUE);

        TableColumn<ShippingPort, String> nameCOL = new TableColumn<>("AIRPORT NAME");
        nameCOL.setCellValueFactory(new PropertyValueFactory<>("TerminalName"));

        TableColumn<ShippingPort, String> addressCOL = new TableColumn<>("ADDRESS");
        addressCOL.setCellValueFactory(new PropertyValueFactory<>("Address"));

        TableColumn<ShippingPort, Double> metrazhCOL = new TableColumn<>("METRAZH");
        metrazhCOL.setCellValueFactory(new PropertyValueFactory<>("Metrazh"));

        TableColumn<ShippingPort, Double> buildPriceCOL = new TableColumn<>("BUILD PRICE");
        buildPriceCOL.setCellValueFactory(new PropertyValueFactory<>("BuildPrice"));

        TableColumn<ShippingPort, Integer> numberOfStagesCOL = new TableColumn<>("NUMBER OF STAGES");
        numberOfStagesCOL.setCellValueFactory(new PropertyValueFactory<>("StageNum"));

        getTableView().getColumns().addAll(nameCOL, addressCOL, metrazhCOL, buildPriceCOL, numberOfStagesCOL);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        VBox AllBTN = new VBox(ShowShipBTN, ShowBoatBTN, ShowSailorBTN, getShowTripsBTN(), getExitBTN());
        AllBTN.setAlignment(Pos.BOTTOM_CENTER);
        AllBTN.setMaxWidth(Double.MAX_VALUE);

        this.setCenter(getTableView());
        this.setRight(AllBTN);
    }

    public TableView<ShippingPort> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<ShippingPort> tableView) {
        this.tableView = tableView;
    }

    public Button getShowShipBTN() {
        return ShowShipBTN;
    }

    public void setShowShipBTN(Button showShipBTN) {
        ShowShipBTN = showShipBTN;
    }

    public Button getShowBoatBTN() {
        return ShowBoatBTN;
    }

    public void setShowBoatBTN(Button showBoatBTN) {
        ShowBoatBTN = showBoatBTN;
    }

    public Button getShowSailorBTN() {
        return ShowSailorBTN;
    }

    public void setShowSailorBTN(Button showSailorBTN) {
        ShowSailorBTN = showSailorBTN;
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
