package Main.View;

import Main.Person;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class SelectPersonView extends VBox {
    private TableView<Person> tableView;
    private Button SelectedBTN;

    public SelectPersonView(){
        setTableView(new TableView<>());
        SelectedBTN = new Button(" EXIT ");
        SelectedBTN.setMaxWidth(Double.MAX_VALUE);
        SelectedBTN.setAlignment(Pos.CENTER);

        TableColumn<Person, String> nameCOL = new TableColumn<>("NAME");
        nameCOL.setCellValueFactory(new PropertyValueFactory<>("Name"));

        TableColumn<Person, String> lastnameCOL = new TableColumn<>("LASTNAME");
        lastnameCOL.setCellValueFactory(new PropertyValueFactory<>("LastName"));

        TableColumn<Person, Integer> yearCOL = new TableColumn<>("YEAR");
        yearCOL.setCellValueFactory(new PropertyValueFactory<>("Year"));

        TableColumn<Person, String> placeCOL = new TableColumn<>("PLACE");
        placeCOL.setCellValueFactory(new PropertyValueFactory<>("Place"));

        TableColumn<Person, String> genderCOL = new TableColumn<>("GENDER");
        genderCOL.setCellValueFactory(new PropertyValueFactory<>("Gender"));

        TableColumn<Person, String> nationalCodeCOL = new TableColumn<>("NATIONAL CODE");
        nationalCodeCOL.setCellValueFactory(new PropertyValueFactory<>("CodeMelli"));

        TableColumn<Person, String> jobCodeCOL = new TableColumn<>("JOB");
        jobCodeCOL.setCellValueFactory(new PropertyValueFactory<>("Job"));

        TableColumn<Person, Double> salaryCOL = new TableColumn<>("SALARY");
        salaryCOL.setCellValueFactory(new PropertyValueFactory<>("Salary"));

        getTableView().getColumns().addAll(nameCOL,lastnameCOL,yearCOL,placeCOL,genderCOL,nationalCodeCOL,jobCodeCOL,salaryCOL);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        this.getChildren().addAll(getTableView(),SelectedBTN);
        this.setAlignment(Pos.CENTER);
    }

    public TableView<Person> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<Person> tableView) {
        this.tableView = tableView;
    }

    public Button getSelectedBTN() {
        return SelectedBTN;
    }

    public void setSelectedBTN(Button selectedBTN) {
        SelectedBTN = selectedBTN;
    }
}
