package Main.Controller;

import Main.Bank.HesabBanki;
import Main.Bank.Tarakonesh;
import Main.Bank.TarakoneshType;
import Main.Country;
import Main.View.VarizView;

public class VarizController {
    private VarizView varizView;
    public VarizController(HesabBanki hesabBanki){
        setVarizView(new VarizView());

        varizView.getDone().setOnAction(event -> {
            hesabBanki.setMojudiHesab(hesabBanki.getMojudiHesab() + varizView.getVarizValue().getValue());
            hesabBanki.setTarakoneshHa(new Tarakonesh(varizView.getVarizValue().getValue(), Country.getYEAR(),Country.getMONTH(),Country.getDAY(), TarakoneshType.VARIZ));
            varizView.getScene().getWindow().hide();
        });
    }

    public VarizView getVarizView() {
        return varizView;
    }

    public void setVarizView(VarizView varizView) {
        this.varizView = varizView;
    }
}
