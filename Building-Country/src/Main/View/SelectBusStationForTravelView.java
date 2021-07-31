package Main.View;

import Main.Buildings.BusTerminal;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class SelectBusStationForTravelView extends VBox {
    private TableView<BusTerminal> tableView;
    private Button Selected;

    public SelectBusStationForTravelView() {
        setTableView(new TableView<>());
        setSelected(new Button(" ENTER "));
        getSelected().setAlignment(Pos.CENTER);
        getSelected().setMaxWidth(Double.MAX_VALUE);

        TableColumn<BusTerminal, String> nameCOL = new TableColumn<>("BUS STATION NAME");
        nameCOL.setCellValueFactory(new PropertyValueFactory<>("TerminalName"));

        getTableView().getColumns().addAll(nameCOL);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        this.getChildren().addAll(getTableView(), getSelected());
    }

    public TableView<BusTerminal> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<BusTerminal> tableView) {
        this.tableView = tableView;
    }

    public Button getSelected() {
        return Selected;
    }

    public void setSelected(Button selected) {
        Selected = selected;
    }
}
