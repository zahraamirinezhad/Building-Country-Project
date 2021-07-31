package Main.View;

import Main.City;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class SelectCityForTravelView extends VBox {
    private TableView<City> tableView;
    private Button Selected;

    public SelectCityForTravelView(){
        setTableView(new TableView<>());
        setSelected(new Button(" ENTER "));
        getSelected().setAlignment(Pos.CENTER);
        getSelected().setMaxWidth(Double.MAX_VALUE);

        TableColumn<City,String> nameCOL = new TableColumn<>("CITY NAME");
        nameCOL.setCellValueFactory(new PropertyValueFactory<>("CityName"));

        getTableView().getColumns().addAll(nameCOL);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        this.getChildren().addAll(getTableView(), getSelected());

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
