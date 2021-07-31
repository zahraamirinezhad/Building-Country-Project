package Main.View;

import Main.Vehicles.Boat;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class ShowBoatView extends VBox {
    private TableView<Boat> tableView;
    private Button ExitBTN;

    public ShowBoatView() {
        setTableView(new TableView<>());
        setExitBTN(new Button(" EXIT "));
        getExitBTN().setMaxWidth(Double.MAX_VALUE);
        getExitBTN().setAlignment(Pos.CENTER);

        TableColumn<Boat, String> factoryName = new TableColumn<>("FACTORY NAME");
        factoryName.setCellValueFactory(new PropertyValueFactory<>("FactoryName"));

        TableColumn<Boat, Double> price = new TableColumn<>("PRICE");
        price.setCellValueFactory(new PropertyValueFactory<>("Price"));

        TableColumn<Boat, Integer> id = new TableColumn<>("ID");
        id.setCellValueFactory(new PropertyValueFactory<>("ID"));

        TableColumn<Boat, Integer> capacity = new TableColumn<>("CAPACITY");
        capacity.setCellValueFactory(new PropertyValueFactory<>("Capacity"));

        TableColumn<Boat, String> fuel = new TableColumn<>("FUEL");
        fuel.setCellValueFactory(new PropertyValueFactory<>("Fuel"));

        TableColumn<Boat, Double> leastDeath = new TableColumn<>("LEAST DEATH");
        leastDeath.setCellValueFactory(new PropertyValueFactory<>("LeastDepth"));

        TableColumn<Boat, Double> lastSpeed = new TableColumn<>("LAST SPEED");
        lastSpeed.setCellValueFactory(new PropertyValueFactory<>("LastSpeed"));

        TableColumn<Boat, String> hullQuality = new TableColumn<>("HULL QUALITY");
        hullQuality.setCellValueFactory(new PropertyValueFactory<>("HullQuality"));

        TableColumn<Boat, Double> weight = new TableColumn<>("WEIGHT");
        weight.setCellValueFactory(new PropertyValueFactory<>("Weight"));

        getTableView().getColumns().addAll(factoryName, price, id, capacity,fuel,leastDeath,lastSpeed,hullQuality,weight);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        this.getChildren().addAll(getTableView(), getExitBTN());
        this.setAlignment(Pos.CENTER);
    }

    public TableView<Boat> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<Boat> tableView) {
        this.tableView = tableView;
    }

    public Button getExitBTN() {
        return ExitBTN;
    }

    public void setExitBTN(Button exitBTN) {
        ExitBTN = exitBTN;
    }
}
