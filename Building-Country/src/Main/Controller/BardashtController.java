package Main.Controller;

import Main.Bank.HesabBanki;
import Main.Bank.Tarakonesh;
import Main.Bank.TarakoneshType;
import Main.Country;
import Main.View.BardashtView;
import javax.swing.*;

public class BardashtController {
    private BardashtView bardashtView;
    public BardashtController(HesabBanki hesabBanki){
        setBardashtView(new BardashtView());

        bardashtView.getDone().setOnAction(event -> {
            if(hesabBanki.getMojudiHesab() - bardashtView.getBardashtValue().getValue() >= 0) {
                hesabBanki.setMojudiHesab(hesabBanki.getMojudiHesab() - bardashtView.getBardashtValue().getValue());
                hesabBanki.setTarakoneshHa(new Tarakonesh(bardashtView.getBardashtValue().getValue(), Country.getYEAR(), Country.getMONTH(), Country.getDAY(), TarakoneshType.BARDASHT));
            }else{
                JOptionPane.showMessageDialog(null,"NOT ENOUGH MONEY","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            bardashtView.getScene().getWindow().hide();
        });

    }

    public BardashtView getBardashtView() {
        return bardashtView;
    }

    public void setBardashtView(BardashtView bardashtView) {
        this.bardashtView = bardashtView;
    }
}
