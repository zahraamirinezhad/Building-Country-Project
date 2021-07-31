package Main.Controller;

import Main.Buildings.Airport;
import Main.Vehicles.PassengerPlane;
import Main.Vehicles.WelfareServices;
import Main.View.addPassengerPlaneView;

public class addPassengerPlaneController {
    private addPassengerPlaneView AddPassengerPlaneView;
    private PassengerPlane passengerPlane;
    public addPassengerPlaneController(Airport airport){
        setAddPassengerPlaneView(new addPassengerPlaneView());

        AddPassengerPlaneView.getOKBTN().setOnAction(event -> {
            addPassengerPlane(airport);
            AddPassengerPlaneView.getScene().getWindow().hide();
        });

    }

    public void addPassengerPlane(Airport airport){
        setPassengerPlane(new PassengerPlane(AddPassengerPlaneView.getCapacitySP().getValue(),AddPassengerPlaneView.getIDSP().getValue(),AddPassengerPlaneView.getFactoryNameTF().getText(),AddPassengerPlaneView.getLastHeightSP().getValue(),AddPassengerPlaneView.getRunwayLengthSP().getValue(),AddPassengerPlaneView.getChairsTF().getText()));
        if(AddPassengerPlaneView.getService1().isSelected()){
            getPassengerPlane().setServices(WelfareServices.service[0]);
        }
        if(AddPassengerPlaneView.getService2().isSelected()){
            getPassengerPlane().setServices(WelfareServices.service[1]);
        }
        if(AddPassengerPlaneView.getService3().isSelected()){
            getPassengerPlane().setServices(WelfareServices.service[2]);
        }
        if(AddPassengerPlaneView.getService4().isSelected()){
            getPassengerPlane().setServices(WelfareServices.service[3]);
        }
        if(AddPassengerPlaneView.getService5().isSelected()){
            getPassengerPlane().setServices(WelfareServices.service[4]);
        }
        airport.setAirV(getPassengerPlane());
        airport.setPassengerPlanesNum(airport.getPassengerPlanesNum()+1);
    }

    public addPassengerPlaneView getAddPassengerPlaneView() {
        return AddPassengerPlaneView;
    }

    public void setAddPassengerPlaneView(addPassengerPlaneView addPassengerPlaneView) {
        AddPassengerPlaneView = addPassengerPlaneView;
    }

    public PassengerPlane getPassengerPlane() {
        return passengerPlane;
    }

    public void setPassengerPlane(PassengerPlane passengerPlane) {
        this.passengerPlane = passengerPlane;
    }
}
