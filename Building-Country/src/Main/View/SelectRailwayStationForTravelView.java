package Main.View;

import Main.Buildings.RailwayStation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class SelectRailwayStationForTravelView extends VBox {
    private TableView<RailwayStation> tableView;
    private Button Selected;

    public SelectRailwayStationForTravelView() {
        setTableView(new TableView<>());
        setSelected(new Button(" ENTER "));
        getSelected().setAlignment(Pos.CENTER);
        getSelected().setMaxWidth(Double.MAX_VALUE);

        TableColumn<RailwayStation, String> nameCOL = new TableColumn<>("RAILWAY STATION NAME");
        nameCOL.setCellValueFactory(new PropertyValueFactory<>("TerminalName"));

        getTableView().getColumns().addAll(nameCOL);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        this.getChildren().addAll(getTableView(), getSelected());
    }

    public TableView<RailwayStation> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<RailwayStation> tableView) {
        this.tableView = tableView;
    }

    public Button getSelected() {
        return Selected;
    }

    public void setSelected(Button selected) {
        Selected = selected;
    }
}

