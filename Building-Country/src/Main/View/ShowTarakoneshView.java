package Main.View;

import Main.Bank.Tarakonesh;
import Main.Bank.TarakoneshType;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class ShowTarakoneshView extends VBox {
    private TableView<Tarakonesh> tableView;
    private Button ExitBTN;

    public ShowTarakoneshView() {
        setTableView(new TableView<>());
        setExitBTN(new Button(" EXIT "));
        getExitBTN().setMaxWidth(Double.MAX_VALUE);
        getExitBTN().setAlignment(Pos.CENTER);

        TableColumn<Tarakonesh, Double> price = new TableColumn<>("PRICE");
        price.setCellValueFactory(new PropertyValueFactory<>("Price"));

        TableColumn<Tarakonesh, String> date = new TableColumn<>("DATE");
        date.setCellValueFactory(new PropertyValueFactory<>("Time"));

        TableColumn<Tarakonesh, TarakoneshType> type = new TableColumn<>("TYPE");
        type.setCellValueFactory(new PropertyValueFactory<>("Type"));

        getTableView().getColumns().addAll(price,date,type);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        this.getChildren().addAll(getTableView(),getExitBTN());
        this.setAlignment(Pos.CENTER);
        this.setMaxWidth(Double.MAX_VALUE);
    }

    public TableView<Tarakonesh> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<Tarakonesh> tableView) {
        this.tableView = tableView;
    }

    public Button getExitBTN() {
        return ExitBTN;
    }

    public void setExitBTN(Button exitBTN) {
        ExitBTN = exitBTN;
    }
}
