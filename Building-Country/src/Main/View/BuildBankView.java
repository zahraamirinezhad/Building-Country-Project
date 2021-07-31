package Main.View;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BuildBankView extends VBox {
    private Label BankNameLBL;
    private Label ProfitLBL;
    private TextField BankNameTF;
    private Spinner<Double> ProfitSP;
    private Button ExitBTN;

    public BuildBankView(){
        BankNameLBL = new Label(" BANK NAME ");
        ProfitLBL = new Label(" PROFIT ");

        BankNameTF = new TextField();
        ProfitSP = new Spinner<>(1.0,10.0,1.0);

        ExitBTN = new Button(" EXIT ");
        ExitBTN.setAlignment(Pos.CENTER);

        ImageView selectedImage = new ImageView();
        try {
            Image image1 = new Image(new FileInputStream("images//download (3).jpg"));
            selectedImage.setImage(image1);
            selectedImage.setFitWidth(450);
            selectedImage.setFitHeight(200);
        }catch (FileNotFoundException ex){}

        VBox firstCol = new VBox(BankNameLBL,ProfitLBL);
        firstCol.setSpacing(7);
        BankNameLBL.setMaxWidth(Double.MAX_VALUE);
        BankNameLBL.setAlignment(Pos.CENTER);
        ProfitLBL.setMaxWidth(Double.MAX_VALUE);
        ProfitLBL.setAlignment(Pos.CENTER);

        VBox secCol = new VBox(BankNameTF,ProfitSP);
        BankNameTF.setMaxWidth(Double.MAX_VALUE);
        BankNameTF.setAlignment(Pos.CENTER);
        ProfitSP.setMaxWidth(Double.MAX_VALUE);

        HBox All = new HBox(firstCol,secCol);
        All.setAlignment(Pos.CENTER);

        this.getChildren().addAll(All,ExitBTN,selectedImage);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(10);

    }


    public Label getBankNameLBL() {
        return BankNameLBL;
    }

    public void setBankNameLBL(Label bankNameLBL) {
        BankNameLBL = bankNameLBL;
    }

    public Label getProfitLBL() {
        return ProfitLBL;
    }

    public void setProfitLBL(Label profitLBL) {
        ProfitLBL = profitLBL;
    }

    public TextField getBankNameTF() {
        return BankNameTF;
    }

    public void setBankNameTF(TextField bankNameTF) {
        BankNameTF = bankNameTF;
    }

    public Button getExitBTN() {
        return ExitBTN;
    }

    public void setExitBTN(Button exitBTN) {
        ExitBTN = exitBTN;
    }

    public Spinner<Double> getProfitSP() {
        return ProfitSP;
    }

    public void setProfitSP(Spinner<Double> profitSP) {
        ProfitSP = profitSP;
    }
}
