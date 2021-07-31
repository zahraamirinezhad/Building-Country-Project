package Main.View;

import Main.Buildings.Room;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class ShowRoomView extends VBox {
    private TableView<Room> tableView;
    private Button ExitBTN;

    public ShowRoomView(){
        tableView = new TableView<>();
        ExitBTN = new Button(" EXIT ");
        ExitBTN.setMaxWidth(Double.MAX_VALUE);

        TableColumn<Room, Integer> roomNumber = new TableColumn<>("ROOM NUMBER");
        roomNumber.setCellValueFactory(new PropertyValueFactory<>("RoomNumber"));

        TableColumn<Room, Double> stayPrice = new TableColumn<>("STAY PRICE");
        stayPrice.setCellValueFactory(new PropertyValueFactory<>("StayPrice"));

        TableColumn<Room, Double> metrazh = new TableColumn<>("METRAZH");
        metrazh.setCellValueFactory(new PropertyValueFactory<>("Metrazh"));

        TableColumn<Room, Integer> numberOfBeds = new TableColumn<>("NUMBER OF BEDS");
        numberOfBeds.setCellValueFactory(new PropertyValueFactory<>("BedNum"));

        getTableView().getColumns().addAll(roomNumber,stayPrice,metrazh,numberOfBeds);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        this.getChildren().addAll(getTableView(),ExitBTN);
        this.setAlignment(Pos.CENTER);
    }

    public TableView<Room> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<Room> tableView) {
        this.tableView = tableView;
    }

    public Button getExitBTN() {
        return ExitBTN;
    }

    public void setExitBTN(Button exitBTN) {
        ExitBTN = exitBTN;
    }
}
