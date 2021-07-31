package Main.View;

import Main.Bank.Bank;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class ShowBankInformationView extends VBox {
    private TableView<Bank> tableView;
    private Button ShowHesabBanki;
    private Button ExitBTN;

    public ShowBankInformationView() {
        setTableView(new TableView<>());
        setExitBTN(new Button(" EXIT "));
        getExitBTN().setMaxWidth(Double.MAX_VALUE);
        getExitBTN().setAlignment(Pos.CENTER);
        setShowHesabBanki(new Button(" SHOW ACCOUNTS INFORMATION "));
        getShowHesabBanki().setMaxWidth(Double.MAX_VALUE);
        getShowHesabBanki().setAlignment(Pos.CENTER);

        TableColumn<Bank, String> cityName = new TableColumn<>("CITY NAME");
        cityName.setCellValueFactory(new PropertyValueFactory<>("CityName"));

        TableColumn<Bank, String> bankName = new TableColumn<>("BANK NAME");
        bankName.setCellValueFactory(new PropertyValueFactory<>("BankName"));

        TableColumn<Bank, Integer> profit = new TableColumn<>("PROFIT");
        profit.setCellValueFactory(new PropertyValueFactory<>("Profit"));

        TableColumn<Bank, Double> holeMoney = new TableColumn<>("HOLE MONEY");
        holeMoney.setCellValueFactory(new PropertyValueFactory<>("HoleMoney"));

        TableColumn<Bank, Integer> aliveAccounts = new TableColumn<>("ALIVE ACCOUNTS");
        aliveAccounts.setCellValueFactory(new PropertyValueFactory<>("AliveAccounts"));

        TableColumn<Bank, Double> buildPrice = new TableColumn<>("BUILD PRICE");
        buildPrice.setCellValueFactory(new PropertyValueFactory<>("BuildPrice"));

        getTableView().getColumns().addAll(cityName,bankName,profit,holeMoney,aliveAccounts,buildPrice);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        this.getChildren().addAll(getTableView(),getShowHesabBanki(),getExitBTN());
        this.setAlignment(Pos.CENTER);
        this.setMaxWidth(Double.MAX_VALUE);
    }

    public TableView<Bank> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<Bank> tableView) {
        this.tableView = tableView;
    }

    public Button getShowHesabBanki() {
        return ShowHesabBanki;
    }

    public void setShowHesabBanki(Button showHesabBanki) {
        ShowHesabBanki = showHesabBanki;
    }

    public Button getExitBTN() {
        return ExitBTN;
    }

    public void setExitBTN(Button exitBTN) {
        ExitBTN = exitBTN;
    }
}
