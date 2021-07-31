package Main.Controller;

import Main.View.FinancialManagementView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class FinancialManagementController {
    private FinancialManagementView financialManagementView;
    public FinancialManagementController(){
        setFinancialManagementView(new FinancialManagementView());

        financialManagementView.getExitBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                financialManagementView.getScene().getWindow().hide();
            }
        });
    }

    public FinancialManagementView getFinancialManagementView() {
        return financialManagementView;
    }

    public void setFinancialManagementView(FinancialManagementView financialManagementView) {
        this.financialManagementView = financialManagementView;
    }
}
