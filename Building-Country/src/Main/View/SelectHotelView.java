package Main.View;

import Main.Buildings.Hotel;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class SelectHotelView extends VBox {
    private TableView<Hotel> tableView;
    private Button Selected;

    public SelectHotelView() {
        setTableView(new TableView<>());
        setSelected(new Button(" ENTER "));
        getSelected().setAlignment(Pos.CENTER);
        getSelected().setMaxWidth(Double.MAX_VALUE);

        TableColumn<Hotel, String> nameCOL = new TableColumn<>("HOTEL NAME");
        nameCOL.setCellValueFactory(new PropertyValueFactory<>("HotelName"));

        getTableView().getColumns().addAll(nameCOL);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        this.getChildren().addAll(getTableView(), getSelected());
    }

    public TableView<Hotel> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<Hotel> tableView) {
        this.tableView = tableView;
    }

    public Button getSelected() {
        return Selected;
    }

    public void setSelected(Button selected) {
        Selected = selected;
    }
}
