package Main.View;

import Main.Vehicles.PassengerPlane;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class ShowPassengerPlanesView extends VBox {
    private TableView<PassengerPlane> tableView;
    private Button ShowServices;
    private Button ExitBTN;

    public ShowPassengerPlanesView() {
        setTableView(new TableView<>());
        setExitBTN(new Button(" EXIT "));
        getExitBTN().setMaxWidth(Double.MAX_VALUE);
        getExitBTN().setAlignment(Pos.CENTER);

        setShowServices(new Button(" SHOW SERVICES "));
        getShowServices().setMaxWidth(Double.MAX_VALUE);
        getShowServices().setAlignment(Pos.CENTER);

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

        this.getChildren().addAll(getTableView(),ShowServices, getExitBTN());
        this.setAlignment(Pos.CENTER);
    }

    public TableView<PassengerPlane> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<PassengerPlane> tableView) {
        this.tableView = tableView;
    }

    public Button getExitBTN() {
        return ExitBTN;
    }

    public void setExitBTN(Button exitBTN) {
        ExitBTN = exitBTN;
    }

    public Button getShowServices() {
        return ShowServices;
    }

    public void setShowServices(Button showServices) {
        ShowServices = showServices;
    }
}
