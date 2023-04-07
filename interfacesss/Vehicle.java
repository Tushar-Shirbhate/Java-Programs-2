package interfacesss;

import interfacessss.vehicleInterface;

public class Vehicle {

    void print(){
        System.out.println("Vehicle");
    }

}
  class  car extends Vehicle implements vehicleInterface{


      @Override
      public boolean isMotarized() {
          return false;
      }

      @Override
      public String getCampany() {
          return null;
      }
  }


