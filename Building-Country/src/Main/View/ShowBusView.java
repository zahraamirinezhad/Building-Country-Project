package Main.View;

import Main.Vehicles.Bus;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class ShowBusView extends VBox {
    private TableView<Bus> tableView;
    private Button ExitBTN;

    public ShowBusView() {
        setTableView(new TableView<>());
        setExitBTN(new Button(" EXIT "));
        getExitBTN().setMaxWidth(Double.MAX_VALUE);
        getExitBTN().setAlignment(Pos.CENTER);

        TableColumn<Bus, String> factoryName = new TableColumn<>("FACTORY NAME");
        factoryName.setCellValueFactory(new PropertyValueFactory<>("FactoryName"));

        TableColumn<Bus, Double> price = new TableColumn<>("PRICE");
        price.setCellValueFactory(new PropertyValueFactory<>("Price"));

        TableColumn<Bus, Integer> id = new TableColumn<>("ID");
        id.setCellValueFactory(new PropertyValueFactory<>("ID"));

        TableColumn<Bus, Integer> capacity = new TableColumn<>("CAPACITY");
        capacity.setCellValueFactory(new PropertyValueFactory<>("Capacity"));

        TableColumn<Bus, Double> lastSpeed = new TableColumn<>("LAST SPEED");
        lastSpeed.setCellValueFactory(new PropertyValueFactory<>("LastSpeed"));

        TableColumn<Bus, String> fuel = new TableColumn<>("FUEL");
        fuel.setCellValueFactory(new PropertyValueFactory<>("Fuel"));

        TableColumn<Bus, String> type = new TableColumn<>("TYPE");
        type.setCellValueFactory(new PropertyValueFactory<>("Type"));


        getTableView().getColumns().addAll(factoryName, price, id, capacity,lastSpeed,fuel,type);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        this.getChildren().addAll(getTableView(), getExitBTN());
        this.setAlignment(Pos.CENTER);
    }

    public TableView<Bus> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<Bus> tableView) {
        this.tableView = tableView;
    }

    public Button getExitBTN() {
        return ExitBTN;
    }

    public void setExitBTN(Button exitBTN) {
        ExitBTN = exitBTN;
    }

}
