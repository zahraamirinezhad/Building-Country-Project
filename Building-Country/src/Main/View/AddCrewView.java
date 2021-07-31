package Main.View;

import Main.Person;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class AddCrewView extends VBox {
    private TableView<Person> tableView;
    private Button EmployedBTN;

    public AddCrewView(){
        setTableView(new TableView<>());
        TableColumn<Person,String> nameCOL = new TableColumn<>("NAME");
        TableColumn<Person,String> lastnameCOL = new TableColumn<>("LASTNAME");
        TableColumn<Person,Integer> yearCOL = new TableColumn<>("BIRTH YEAR");
        TableColumn<Person,String> placeCOL = new TableColumn<>("PLACE");
        TableColumn<Person,String> jobCOL = new TableColumn<>("JOB");
        TableColumn<Person,String> genderCOL = new TableColumn<>("GENDER");
        TableColumn<Person,String> codemelliCOL = new TableColumn<>("NATIONAL CODE");

        nameCOL.setCellValueFactory(new PropertyValueFactory<>("Name"));
        lastnameCOL.setCellValueFactory(new PropertyValueFactory<>("LastName"));
        yearCOL.setCellValueFactory(new PropertyValueFactory<>("Year"));
        placeCOL.setCellValueFactory(new PropertyValueFactory<>("Place"));
        jobCOL.setCellValueFactory(new PropertyValueFactory<>("Job"));
        genderCOL.setCellValueFactory(new PropertyValueFactory<>("Gender"));
        codemelliCOL.setCellValueFactory(new PropertyValueFactory<>("CodeMelli"));

        getTableView().getColumns().addAll(nameCOL,lastnameCOL,yearCOL,placeCOL,jobCOL,genderCOL,codemelliCOL);
        getTableView().setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        EmployedBTN = new Button(" EMPLOYED ");
        EmployedBTN.setMaxWidth(Double.MAX_VALUE);
        EmployedBTN.setAlignment(Pos.CENTER);

        this.getChildren().addAll(tableView,EmployedBTN);
        this.setAlignment(Pos.CENTER);
    }


    public TableView<Person> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<Person> tableView) {
        this.tableView = tableView;
    }

    public Button getEmployedBTN() {
        return EmployedBTN;
    }

    public void setEmployedBTN(Button employedBTN) {
        EmployedBTN = employedBTN;
    }
}
