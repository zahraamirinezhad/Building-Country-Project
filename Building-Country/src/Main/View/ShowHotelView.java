package Main.View;

import Main.Buildings.Hotel;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class ShowHotelView extends BorderPane {
    private TableView<Hotel> tableView;
    private Button ShowRoomBTN;
    private Button ShowServicesBTN;
    private Button ExitBTN;

    public ShowHotelView(){
        tableView = new TableView<>();
        ShowRoomBTN = new Button(" SHOW ROOMS INFORMATION ");
        ShowServicesBTN = new Button(" SHOW SERVICES INFORMATION ");
        ExitBTN = new Button(" EXIT ");
        VBox AllBTN = new VBox(ShowRoomBTN,ShowServicesBTN,ExitBTN);
        ShowRoomBTN.setMaxWidth(Double.MAX_VALUE);
        ShowServicesBTN.setMaxWidth(Double.MAX_VALUE);
        ExitBTN.setMaxWidth(Double.MAX_VALUE);

        TableColumn<Hotel, String> nameCOL = new TableColumn<>("HOTEL NAME");
        nameCOL.setCellValueFactory(new PropertyValueFactory<>("HotelName"));

        TableColumn<Hotel, String> addressCOL = new TableColumn<>("ADDRESS");
        addressCOL.setCellValueFactory(new PropertyValueFactory<>("Address"));

        TableColumn<Hotel, Double> buildPriceCOL = new TableColumn<>("BUILD PRICE");
        buildPriceCOL.setCellValueFactory(new PropertyValueFactory<>("BuildPrice"));

        TableColumn<Hotel, Integer> numberOfStars = new TableColumn<>("NUMBER OF STARS");
        numberOfStars.setCellValueFactory(new PropertyValueFactory<>("StarNum"));

        getTableView().getColumns().addAll(nameCOL,addressCOL,buildPriceCOL,numberOfStars);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        AllBTN.setAlignment(Pos.BOTTOM_CENTER);
        AllBTN.setMaxWidth(Double.MAX_VALUE);

        this.setCenter(getTableView());
        this.setRight(AllBTN);
    }

    public TableView<Hotel> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<Hotel> tableView) {
        this.tableView = tableView;
    }

    public Button getShowRoomBTN() {
        return ShowRoomBTN;
    }

    public void setShowRoomBTN(Button showRoomBTN) {
        ShowRoomBTN = showRoomBTN;
    }

    public Button getShowServicesBTN() {
        return ShowServicesBTN;
    }

    public void setShowServicesBTN(Button showServicesBTN) {
        ShowServicesBTN = showServicesBTN;
    }

    public Button getExitBTN() {
        return ExitBTN;
    }

    public void setExitBTN(Button exitBTN) {
        ExitBTN = exitBTN;
    }
}
