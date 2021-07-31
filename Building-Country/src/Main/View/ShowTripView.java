package Main.View;

import Main.Trip.Trip;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class ShowTripView extends BorderPane {
    private TableView<Trip> tableView;
    private Button ShowOriginTerminalBTN;
    private Button ShowDestinationTerminalBTN;
    private Button ShowPassengersBTN;
    private Button ShowDriverBTN;
    private Button ShowVehicleBTN;
    private Button ExitBTN;

    public ShowTripView() {
        setTableView(new TableView<>());
        ShowOriginTerminalBTN = new Button(" SHOW INFORMATION ABOUT ORIGIN TERMINAL ");
        ShowOriginTerminalBTN.setMaxWidth(Double.MAX_VALUE);
        ShowDestinationTerminalBTN = new Button(" SHOW INFORMATION ABOUT DESTINATION TERMINAL ");
        ShowDestinationTerminalBTN.setMaxWidth(Double.MAX_VALUE);
        ShowPassengersBTN = new Button(" SHOW PASSENGERS INFORMATION ");
        ShowPassengersBTN.setMaxWidth(Double.MAX_VALUE);
        ShowDriverBTN = new Button(" SHOW DRIVER INFORMATION ");
        ShowDriverBTN.setMaxWidth(Double.MAX_VALUE);
        ShowVehicleBTN = new Button(" SHOW VEHICLE INFORMATION ");
        ShowVehicleBTN.setMaxWidth(Double.MAX_VALUE);
        ExitBTN = new Button(" EXIT ");
        ExitBTN.setMaxWidth(Double.MAX_VALUE);

        TableColumn<Trip, String> originalCityName = new TableColumn<>("ORIGIN CITY NAME");
        originalCityName.setCellValueFactory(new PropertyValueFactory<>("OriginCityName"));

        TableColumn<Trip, String> destinationCityName = new TableColumn<>("DESTINATION CITY NAME");
        destinationCityName.setCellValueFactory(new PropertyValueFactory<>("DestinationCityName"));

        TableColumn<Trip, Integer> id = new TableColumn<>("ID");
        id.setCellValueFactory(new PropertyValueFactory<>("ID"));

        TableColumn<Trip, Integer> year = new TableColumn<>("YEAR");
        year.setCellValueFactory(new PropertyValueFactory<>("Year"));

        TableColumn<Trip, Integer> month = new TableColumn<>("MONTH");
        month.setCellValueFactory(new PropertyValueFactory<>("Month"));

        TableColumn<Trip, Integer> day = new TableColumn<>("DAY");
        day.setCellValueFactory(new PropertyValueFactory<>("Day"));

        TableColumn<Trip, Double> tripCost = new TableColumn<>("TRIP COST");
        tripCost.setCellValueFactory(new PropertyValueFactory<>("TripCost"));

        TableColumn<Trip, String> tripType = new TableColumn<>("TRIP TYPE");
        tripType.setCellValueFactory(new PropertyValueFactory<>("Type"));

        getTableView().getColumns().addAll(originalCityName,destinationCityName,id,year,month,day,tripCost,tripType);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        VBox AllBTN = new VBox(ShowOriginTerminalBTN, ShowDestinationTerminalBTN, ShowPassengersBTN, ShowDriverBTN, ShowVehicleBTN, ExitBTN);
        AllBTN.setAlignment(Pos.BOTTOM_CENTER);
        AllBTN.setMaxWidth(Double.MAX_VALUE);

        this.setCenter(getTableView());
        this.setRight(AllBTN);
    }

    public TableView<Trip> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<Trip> tableView) {
        this.tableView = tableView;
    }

    public Button getShowOriginTerminalBTN() {
        return ShowOriginTerminalBTN;
    }

    public void setShowOriginTerminalBTN(Button showOriginTerminalBTN) {
        ShowOriginTerminalBTN = showOriginTerminalBTN;
    }

    public Button getShowDestinationTerminalBTN() {
        return ShowDestinationTerminalBTN;
    }

    public void setShowDestinationTerminalBTN(Button showDestinationTerminalBTN) {
        ShowDestinationTerminalBTN = showDestinationTerminalBTN;
    }

    public Button getShowPassengersBTN() {
        return ShowPassengersBTN;
    }

    public void setShowPassengersBTN(Button showPassengersBTN) {
        ShowPassengersBTN = showPassengersBTN;
    }

    public Button getShowDriverBTN() {
        return ShowDriverBTN;
    }

    public void setShowDriverBTN(Button showDriverBTN) {
        ShowDriverBTN = showDriverBTN;
    }

    public Button getShowVehicleBTN() {
        return ShowVehicleBTN;
    }

    public void setShowVehicleBTN(Button showVehicleBTN) {
        ShowVehicleBTN = showVehicleBTN;
    }

    public Button getExitBTN() {
        return ExitBTN;
    }

    public void setExitBTN(Button exitBTN) {
        ExitBTN = exitBTN;
    }
}
