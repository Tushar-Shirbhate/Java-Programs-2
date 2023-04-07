package interfacesss;

import interfacessss.vehicleInterface;

public class vehicleuse1 {
    public static  void  main(String[]args){
        Vehicle v = new Vehicle();
        vehicleInterface vI;
        vI= (vehicleInterface) new Vehicle();
        vI.getCampany();
        ((Vehicle) vI).print();
    }
}
