package Main.Controller;

import Main.Buildings.Airport;
import Main.Vehicles.CargoPlane;
import Main.View.addCargoPlaneView;

public class addCargoPlaneController {
    private addCargoPlaneView AddCargoPlaneView;
    public addCargoPlaneController(Airport airport){
        setAddCargoPlaneView(new addCargoPlaneView());
        AddCargoPlaneView.getOKBTN().setOnAction(event -> {
            airport.setAirV(new CargoPlane(AddCargoPlaneView.getCapacitySP().getValue(),AddCargoPlaneView.getIDSP().getValue(),AddCargoPlaneView.getFactoryNameTF().getText(),AddCargoPlaneView.getLastHeightSP().getValue(),AddCargoPlaneView.getRunwayLengthSP().getValue(),AddCargoPlaneView.getLastWeightSP().getValue()));
            airport.setCargoPlanesNum(airport.getCargoPlanesNum()+1);
            AddCargoPlaneView.getScene().getWindow().hide();
        });
    }

    public addCargoPlaneView getAddCargoPlaneView() {
        return AddCargoPlaneView;
    }

    public void setAddCargoPlaneView(addCargoPlaneView addCargoPlaneView) {
        AddCargoPlaneView = addCargoPlaneView;
    }
}
