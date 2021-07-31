package Main.View;

import Main.Buildings.ShippingPort;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class SelectShipPortView extends VBox {
    private TableView<ShippingPort> tableView;
    private Button Selected;

    public SelectShipPortView() {
        setTableView(new TableView<>());
        setSelected(new Button(" ENTER "));
        getSelected().setAlignment(Pos.CENTER);
        getSelected().setMaxWidth(Double.MAX_VALUE);

        TableColumn<ShippingPort, String> nameCOL = new TableColumn<>("SHIPPING PORT NAME");
        nameCOL.setCellValueFactory(new PropertyValueFactory<>("TerminalName"));

        getTableView().getColumns().addAll(nameCOL);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        this.getChildren().addAll(getTableView(), getSelected());
    }

    public TableView<ShippingPort> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<ShippingPort> tableView) {
        this.tableView = tableView;
    }

    public Button getSelected() {
        return Selected;
    }

    public void setSelected(Button selected) {
        Selected = selected;
    }
}
