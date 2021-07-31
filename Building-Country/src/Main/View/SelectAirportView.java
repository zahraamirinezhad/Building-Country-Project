package Main.View;

import Main.Buildings.Airport;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class SelectAirportView extends VBox {
    private TableView<Airport> tableView;
    private Button Selected;

    public SelectAirportView(){
        setTableView(new TableView<>());
        Selected = new Button(" ENTER ");
        Selected.setAlignment(Pos.CENTER);
        Selected.setMaxWidth(Double.MAX_VALUE);

        TableColumn<Airport,String> nameCOL = new TableColumn<>("AIRPORT NAME");
        nameCOL.setCellValueFactory(new PropertyValueFactory<>("TerminalName"));

        getTableView().getColumns().addAll(nameCOL);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        this.getChildren().addAll(tableView,Selected);
    }

    public TableView<Airport> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<Airport> tableView) {
        this.tableView = tableView;
    }

    public Button getSelected() {
        return Selected;
    }

    public void setSelected(Button selected) {
        Selected = selected;
    }
}
