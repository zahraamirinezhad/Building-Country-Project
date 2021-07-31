package Main.Controller;

import Main.Buildings.RailwayStation;
import Main.Vehicles.Train;
import Main.Vehicles.WelfareServices;
import Main.View.addTrainView;

public class addTrainController {
   private addTrainView AddTrainView;
   public addTrainController(RailwayStation railwayStation){
       setAddTrainView(new addTrainView());

       AddTrainView.getOKBTN().setOnAction(event -> {
           AddTrain(railwayStation);
           AddTrainView.getScene().getWindow().hide();
       });
   }

   public void AddTrain(RailwayStation railwayStation){
       Train train = new Train(AddTrainView.getCapacitySP().getValue(),AddTrainView.getIDSP().getValue(),AddTrainView.getFactoryNameTF().getText(),AddTrainView.getLastSpeedSP().getValue(),AddTrainView.getFuelTF().getText(),AddTrainView.getWaggonSP().getValue(),AddTrainView.getStarsSP().getValue());
       if(AddTrainView.getService1().isSelected()){
           train.setServices(WelfareServices.service[0]);
       }
       if(AddTrainView.getService2().isSelected()){
           train.setServices(WelfareServices.service[1]);
       }
       if(AddTrainView.getService3().isSelected()){
           train.setServices(WelfareServices.service[2]);
       }
       if(AddTrainView.getService4().isSelected()){
           train.setServices(WelfareServices.service[3]);
       }
       if(AddTrainView.getService5().isSelected()){
           train.setServices(WelfareServices.service[4]);
       }
       railwayStation.setTrains(train);
   }

    public addTrainView getAddTrainView() {
        return AddTrainView;
    }

    public void setAddTrainView(addTrainView addTrainView) {
        AddTrainView = addTrainView;
    }
}
