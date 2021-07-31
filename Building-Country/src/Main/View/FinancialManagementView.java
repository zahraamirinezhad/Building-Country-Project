package Main.View;

import Main.Bank.HesabBanki;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class FinancialManagementView extends VBox {
    private static TableView<HesabBanki> tableView;
    private TextArea FirstMoney;
    private static TextArea SecMoney;
    private Button ExitBTN;

    public FinancialManagementView() {

        setTableView(new TableView<>());
        setExitBTN(new Button(" EXIT "));
        getExitBTN().setMaxWidth(Double.MAX_VALUE);
        getExitBTN().setAlignment(Pos.CENTER);
        FirstMoney = new TextArea();
        SecMoney = new TextArea();

        TableColumn<HesabBanki, String> cityName = new TableColumn<>("CITY NAME");
        cityName.setCellValueFactory(new PropertyValueFactory<>("CityName"));

        TableColumn<HesabBanki, String> bankName = new TableColumn<>("BANK NAME");
        bankName.setCellValueFactory(new PropertyValueFactory<>("BankName"));

        TableColumn<HesabBanki, String> username = new TableColumn<>("USERNAME");
        username.setCellValueFactory(new PropertyValueFactory<>("UserName"));

        TableColumn<HesabBanki, Integer> password = new TableColumn<>("PASSWORD");
        password.setCellValueFactory(new PropertyValueFactory<>("Password"));

        TableColumn<HesabBanki, Double> mojudiHesab = new TableColumn<>("MOJUDI HESAB");
        mojudiHesab.setCellValueFactory(new PropertyValueFactory<>("MojudiHesab"));

        getTableView().getColumns().addAll(cityName,bankName,username,password, mojudiHesab);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        this.getChildren().addAll(getFirstMoney(),getSecMoney(),getTableView(),getExitBTN());
        this.setAlignment(Pos.CENTER);
    }

    public static TableView<HesabBanki> getTableView() {
        return tableView;
    }

    public static void setTableView(TableView<HesabBanki> tableView) {
        FinancialManagementView.tableView = tableView;
    }


    public TextArea getFirstMoney() {
        return FirstMoney;
    }

    public void setFirstMoney(TextArea firstMoney) {
        FirstMoney = firstMoney;
    }

    public static TextArea getSecMoney() {
        return SecMoney;
    }

    public static void setSecMoney(TextArea secMoney) {
        SecMoney = secMoney;
    }

    public Button getExitBTN() {
        return ExitBTN;
    }

    public void setExitBTN(Button exitBTN) {
        ExitBTN = exitBTN;
    }

}
