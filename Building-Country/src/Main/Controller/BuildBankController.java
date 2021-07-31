package Main.Controller;

import Main.Bank.Bank;
import Main.City;
import Main.View.BuildBankView;
import static Main.Main.Iran;

public class BuildBankController {
    private BuildBankView buildBankView;
    public BuildBankController(City city){
        setBuildBankView(new BuildBankView());

        buildBankView.getExitBTN().setOnAction(event -> {
            city.setAllBanks(new Bank(city.getCityName(),buildBankView.getBankNameTF().getText(),buildBankView.getProfitSP().getValue()));
            city.setHoleMoney(city.getHoleMoney() - Bank.getBuildPrice());
            buildBankView.getScene().getWindow().hide();

        });
    }

    public BuildBankView getBuildBankView() {
        return buildBankView;
    }

    public void setBuildBankView(BuildBankView buildBankView) {
        this.buildBankView = buildBankView;
    }
}
