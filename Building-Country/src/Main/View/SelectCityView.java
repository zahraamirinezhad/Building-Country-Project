package Main.View;

import Main.City;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class SelectCityView extends VBox {
    private TableView<City> tableView;
    private Button Selected;

    public SelectCityView(){
        setTableView(new TableView<>());
        Selected = new Button(" ENTER ");
        Selected.setAlignment(Pos.CENTER);
        Selected.setMaxWidth(Double.MAX_VALUE);

        TableColumn<City,String> nameCOL = new TableColumn<>("CITY NAME");
        nameCOL.setCellValueFactory(new PropertyValueFactory<>("CityName"));

        getTableView().getColumns().addAll(nameCOL);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        this.getChildren().addAll(tableView,Selected);

    }

    public TableView<City> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<City> tableView) {
        this.tableView = tableView;
    }

    public Button getSelected() {
        return Selected;
    }

    public void setSelected(Button selected) {
        Selected = selected;
    }
}
