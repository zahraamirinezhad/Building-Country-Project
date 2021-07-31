package Main.View;

import Main.Vehicles.Ship;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class SelectShipView extends VBox {
    private TableView<Ship> tableView;
    private Button SelectedBTN;

    public SelectShipView() {
        setTableView(new TableView<>());
        setSelectedBTN(new Button(" EXIT "));
        getSelectedBTN().setMaxWidth(Double.MAX_VALUE);
        getSelectedBTN().setAlignment(Pos.CENTER);

        TableColumn<Ship, String> factoryName = new TableColumn<>("FACTORY NAME");
        factoryName.setCellValueFactory(new PropertyValueFactory<>("FactoryName"));

        TableColumn<Ship, Double> price = new TableColumn<>("PRICE");
        price.setCellValueFactory(new PropertyValueFactory<>("Price"));

        TableColumn<Ship, Integer> id = new TableColumn<>("ID");
        id.setCellValueFactory(new PropertyValueFactory<>("ID"));

        TableColumn<Ship, Integer> capacity = new TableColumn<>("CAPACITY");
        capacity.setCellValueFactory(new PropertyValueFactory<>("Capacity"));

        TableColumn<Ship, String> fuel = new TableColumn<>("FUEL");
        fuel.setCellValueFactory(new PropertyValueFactory<>("Fuel"));

        TableColumn<Ship, Double> leastDeath = new TableColumn<>("LEAST DEATH");
        leastDeath.setCellValueFactory(new PropertyValueFactory<>("LeastDepth"));

        TableColumn<Ship, Double> lastSpeed = new TableColumn<>("LAST SPEED");
        lastSpeed.setCellValueFactory(new PropertyValueFactory<>("LastSpeed"));

        TableColumn<Ship, String> type = new TableColumn<>("TYPE");
        type.setCellValueFactory(new PropertyValueFactory<>("Type"));

        TableColumn<Ship, Double> weight = new TableColumn<>("WEIGHT");
        weight.setCellValueFactory(new PropertyValueFactory<>("Weight"));

        getTableView().getColumns().addAll(factoryName, price, id, capacity,fuel,leastDeath,lastSpeed,type,weight);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        this.getChildren().addAll(getTableView(), getSelectedBTN());
        this.setAlignment(Pos.CENTER);
    }

    public TableView<Ship> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<Ship> tableView) {
        this.tableView = tableView;
    }

    public Button getSelectedBTN() {
        return SelectedBTN;
    }

    public void setSelectedBTN(Button selectedBTN) {
        SelectedBTN = selectedBTN;
    }
}
