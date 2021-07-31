package Main.View;

import Main.Bank.HesabBanki;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class ShowHesabBankiInformationView extends VBox {
    private TableView<HesabBanki> tableView;
    private Button ShowTarakoneshHa;
    private Button ShowOwnerInformation;
    private Button ExitBTN;

    public ShowHesabBankiInformationView() {
        setTableView(new TableView<>());
        setExitBTN(new Button(" EXIT "));
        getExitBTN().setMaxWidth(Double.MAX_VALUE);
        getExitBTN().setAlignment(Pos.CENTER);
        setShowTarakoneshHa(new Button(" TARAKONESH HA "));
        getShowTarakoneshHa().setMaxWidth(Double.MAX_VALUE);
        getShowTarakoneshHa().setAlignment(Pos.CENTER);
        setShowOwnerInformation(new Button(" SHOW OWNER'S INFORMATION "));
        getShowOwnerInformation().setMaxWidth(Double.MAX_VALUE);
        getShowOwnerInformation().setAlignment(Pos.CENTER);

        TableColumn<HesabBanki, String> username = new TableColumn<>("USERNAME");
        username.setCellValueFactory(new PropertyValueFactory<>("UserName"));

        TableColumn<HesabBanki, Integer> password = new TableColumn<>("PASSWORD");
        password.setCellValueFactory(new PropertyValueFactory<>("Password"));

        TableColumn<HesabBanki, Integer> leftDays = new TableColumn<>("LEFT DAYS");
        leftDays.setCellValueFactory(new PropertyValueFactory<>("start"));

        TableColumn<HesabBanki, Double> mojudiHesab = new TableColumn<>("MOJUDI HESAB");
        mojudiHesab.setCellValueFactory(new PropertyValueFactory<>("MojudiHesab"));

        getTableView().getColumns().addAll(username,password,leftDays,mojudiHesab);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        this.getChildren().addAll(getTableView(),getShowOwnerInformation(),getShowTarakoneshHa(),getExitBTN());
        this.setAlignment(Pos.CENTER);
        this.setMaxWidth(Double.MAX_VALUE);
    }

    public TableView<HesabBanki> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<HesabBanki> tableView) {
        this.tableView = tableView;
    }

    public Button getShowTarakoneshHa() {
        return ShowTarakoneshHa;
    }

    public void setShowTarakoneshHa(Button showTarakoneshHa) {
        ShowTarakoneshHa = showTarakoneshHa;
    }

    public Button getExitBTN() {
        return ExitBTN;
    }

    public void setExitBTN(Button exitBTN) {
        ExitBTN = exitBTN;
    }

    public Button getShowOwnerInformation() {
        return ShowOwnerInformation;
    }

    public void setShowOwnerInformation(Button showOwnerInformation) {
        ShowOwnerInformation = showOwnerInformation;
    }
}
