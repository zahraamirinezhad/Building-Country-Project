package Main.View;

import Main.Bank.Bank;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class SelectBankToEnterView extends VBox {
    private TableView<Bank> tableView;
    private Button EnterBTN;

    public SelectBankToEnterView() {
        setTableView(new TableView<>());
        setEnterBTN(new Button(" ENTER "));
        getEnterBTN().setAlignment(Pos.CENTER);
        getEnterBTN().setMaxWidth(Double.MAX_VALUE);

        TableColumn<Bank, String> bankName = new TableColumn<>("BANK NAME");
        bankName.setCellValueFactory(new PropertyValueFactory<>("BankName"));

        getTableView().getColumns().addAll(bankName);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        this.getChildren().addAll(getTableView(), getEnterBTN());
    }

    public TableView<Bank> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<Bank> tableView) {
        this.tableView = tableView;
    }

    public Button getEnterBTN() {
        return EnterBTN;
    }

    public void setEnterBTN(Button enterBTN) {
        EnterBTN = enterBTN;
    }
}
