package Main.View;

import Main.Vehicles.CargoPlane;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class ShowCargoPlanesView extends VBox {
    private TableView<CargoPlane> tableView;
    private Button ExitBTN;

    public ShowCargoPlanesView() {
        setTableView(new TableView<>());
        setExitBTN(new Button(" EXIT "));
        getExitBTN().setMaxWidth(Double.MAX_VALUE);
        getExitBTN().setAlignment(Pos.CENTER);

        TableColumn<CargoPlane, String> factoryName = new TableColumn<>("FACTORY NAME");
        factoryName.setCellValueFactory(new PropertyValueFactory<>("FactoryName"));

        TableColumn<CargoPlane, Double> price = new TableColumn<>("PRICE");
        price.setCellValueFactory(new PropertyValueFactory<>("Price"));

        TableColumn<CargoPlane, Integer> id = new TableColumn<>("ID");
        id.setCellValueFactory(new PropertyValueFactory<>("ID"));

        TableColumn<CargoPlane, Integer> capacity = new TableColumn<>("CAPACITY");
        capacity.setCellValueFactory(new PropertyValueFactory<>("Capacity"));

        TableColumn<CargoPlane, Double> lastHeight = new TableColumn<>("LAST HEIGHT");
        lastHeight.setCellValueFactory(new PropertyValueFactory<>("LastHeight"));

        TableColumn<CargoPlane, Double> lengthOfRunaway = new TableColumn<>("LENGTH OF RUNAWAY");
        lengthOfRunaway.setCellValueFactory(new PropertyValueFactory<>("RunwayLength"));

        TableColumn<CargoPlane, Double> lastWeight = new TableColumn<>("LAST WEIGHT");
        lastWeight.setCellValueFactory(new PropertyValueFactory<>("LastWeight"));

        getTableView().getColumns().addAll(factoryName, price, id, capacity, lastHeight, lengthOfRunaway, lastWeight);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        this.getChildren().addAll(getTableView(), getExitBTN());
        this.setAlignment(Pos.CENTER);
    }

    public TableView<CargoPlane> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<CargoPlane> tableView) {
        this.tableView = tableView;
    }

    public Button getExitBTN() {
        return ExitBTN;
    }

    public void setExitBTN(Button exitBTN) {
        ExitBTN = exitBTN;
    }
}
