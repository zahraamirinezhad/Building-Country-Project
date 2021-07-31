package Main.View;

import Main.Vehicles.Train;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class SelectTrainView extends VBox {
    private TableView<Train> tableView;
    private Button SelectedBTN;

    public SelectTrainView() {
        setTableView(new TableView<>());
        setSelectedBTN(new Button(" EXIT "));
        getSelectedBTN().setMaxWidth(Double.MAX_VALUE);
        getSelectedBTN().setAlignment(Pos.CENTER);

        TableColumn<Train, String> factoryName = new TableColumn<>("FACTORY NAME");
        factoryName.setCellValueFactory(new PropertyValueFactory<>("FactoryName"));

        TableColumn<Train, Double> price = new TableColumn<>("PRICE");
        price.setCellValueFactory(new PropertyValueFactory<>("Price"));

        TableColumn<Train, Integer> id = new TableColumn<>("ID");
        id.setCellValueFactory(new PropertyValueFactory<>("ID"));

        TableColumn<Train, Integer> capacity = new TableColumn<>("CAPACITY");
        capacity.setCellValueFactory(new PropertyValueFactory<>("Capacity"));

        TableColumn<Train, Double> lastSpeed = new TableColumn<>("LAST SPEED");
        lastSpeed.setCellValueFactory(new PropertyValueFactory<>("LastSpeed"));

        TableColumn<Train, String> fuel = new TableColumn<>("FUEL");
        fuel.setCellValueFactory(new PropertyValueFactory<>("Fuel"));

        TableColumn<Train, Integer> waggon = new TableColumn<>("WAGGON");
        waggon.setCellValueFactory(new PropertyValueFactory<>("Waggon"));

        TableColumn<Train, Integer> star = new TableColumn<>("STAR");
        star.setCellValueFactory(new PropertyValueFactory<>("Star"));


        getTableView().getColumns().addAll(factoryName, price, id, capacity,lastSpeed,fuel,waggon,star);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        this.getChildren().addAll(getTableView(), getSelectedBTN());
        this.setAlignment(Pos.CENTER);
    }

    public TableView<Train> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<Train> tableView) {
        this.tableView = tableView;
    }

    public Button getSelectedBTN() {
        return SelectedBTN;
    }

    public void setSelectedBTN(Button selectedBTN) {
        SelectedBTN = selectedBTN;
    }
}
