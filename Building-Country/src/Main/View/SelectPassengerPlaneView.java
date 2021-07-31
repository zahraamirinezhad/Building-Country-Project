package Main.View;

import Main.Vehicles.PassengerPlane;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class SelectPassengerPlaneView extends VBox {
    private TableView<PassengerPlane> tableView;
    private Button SelectedBTN;

    public SelectPassengerPlaneView() {
        setTableView(new TableView<>());
        setSelectedBTN(new Button(" EXIT "));
        getSelectedBTN().setMaxWidth(Double.MAX_VALUE);
        getSelectedBTN().setAlignment(Pos.CENTER);

        TableColumn<PassengerPlane, String> factoryName = new TableColumn<>("FACTORY NAME");
        factoryName.setCellValueFactory(new PropertyValueFactory<>("FactoryName"));

        TableColumn<PassengerPlane, Double> price = new TableColumn<>("PRICE");
        price.setCellValueFactory(new PropertyValueFactory<>("Price"));

        TableColumn<PassengerPlane, Integer> id = new TableColumn<>("ID");
        id.setCellValueFactory(new PropertyValueFactory<>("ID"));

        TableColumn<PassengerPlane, Integer> capacity = new TableColumn<>("CAPACITY");
        capacity.setCellValueFactory(new PropertyValueFactory<>("Capacity"));

        TableColumn<PassengerPlane, Double> lastHeight = new TableColumn<>("LAST HEIGHT");
        lastHeight.setCellValueFactory(new PropertyValueFactory<>("LastHeight"));

        TableColumn<PassengerPlane, Double> lengthOfRunaway = new TableColumn<>("LENGTH OF RUNAWAY");
        lengthOfRunaway.setCellValueFactory(new PropertyValueFactory<>("RunwayLength"));

        TableColumn<PassengerPlane, String> chairs = new TableColumn<>("CHAIRS");
        chairs.setCellValueFactory(new PropertyValueFactory<>("Chairs"));

        getTableView().getColumns().addAll(factoryName, price, id, capacity, lastHeight, lengthOfRunaway, chairs);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        this.getChildren().addAll(getTableView(), getSelectedBTN());
        this.setAlignment(Pos.CENTER);
    }

    public TableView<PassengerPlane> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<PassengerPlane> tableView) {
        this.tableView = tableView;
    }

    public Button getSelectedBTN() {
        return SelectedBTN;
    }

    public void setSelectedBTN(Button selectedBTN) {
        SelectedBTN = selectedBTN;
    }
}
