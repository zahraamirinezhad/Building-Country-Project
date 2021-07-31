package Main.Controller;

import Main.View.SelectPersonView;

public class SelectPersonForOpeningAnAccountController {
    private SelectPersonView selectPersonView;
    public SelectPersonForOpeningAnAccountController(OpeningAnAccountController openingAnAccountController){
        setSelectPersonView(new SelectPersonView());

        selectPersonView.getSelectedBTN().setOnAction(event -> {
            openingAnAccountController.setPerson(selectPersonView.getTableView().getSelectionModel().getSelectedItem());
            selectPersonView.getScene().getWindow().hide();
        });

    }

    public SelectPersonView getSelectPersonView() {
        return selectPersonView;
    }

    public void setSelectPersonView(SelectPersonView selectPersonView) {
        this.selectPersonView = selectPersonView;
    }
}
