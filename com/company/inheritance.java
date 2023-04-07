package com.company;


import interfacesss.Vehicle;
import interfacessss.vehicleInterface;

abstract class vehicle {
    private String colour;
    int maxspeed;
    public vehicle(int maxspeed){
        System.out.println("vehicle constructor");
        this.maxspeed=maxspeed;
    }
    public vehicle(){

    }

    public String getColour(){

        return colour;
    }

    public void setColour(String colour){
        this.colour=colour;
    }

    public void print() {
        System.out.println("vehicle" + "colour" + colour + "maxspeed" + maxspeed );
    }
    public abstract boolean isMotarized();
    public abstract String getCampany();

}

abstract class car extends vehicle {
    int noofdoor;
//    int maxspeed;
//    public void printcar() {
//        System.out.println("car" + "colour" + getColour() + "maxspeed" + maxspeed + "noofdoor" + noofdoor );
//    }
    public void print() {
        System.out.println("car" + "colour" + getColour() + "maxspeed" + maxspeed + "noofdoor" + noofdoor );
    }
    public car(int noofdoor,int maxspeed) {
        super(maxspeed);
        System.out.println("cars constructor");
        this.noofdoor=noofdoor;
    }
//    public void print() {
//        super.print();
//        System.out.println( "car" + "noofdoor" + noofdoor );

//    }
    public void printmaxspeed(){
          super.maxspeed=150;
        System.out.println(maxspeed+" "+super.maxspeed);
    }
      public boolean isMotarized(){
        return  true;
      }


}
class BMW extends car {
    public BMW(int noofdoor, int maxspeed) {
        super(noofdoor, maxspeed);
    }

    public  String getCampany(){
        return "BMW";
    }

}
  abstract class bicycle extends vehicle {
      public  boolean isMotarized(){
          return  false;
      }

  }
public class inheritance {
    public static void main(String args[]){
 //       Object o=new vehicle(100);
 //       vehicle v = new vehicle();
     //   vehicle1 v;
    //    car c= new car (2,200);


//        vehicle v= new car(4,100);
 //       v = new bicycle();
//        car c= (car)v;
//        c.noofdoor=4;

//        vehicle v;
//        Scanner s= new Scanner(System.in);
//        int n= s.nextInt();
//        if (n<10){
//            v=new car(4,100);
//        }else{
//            v=new vehicle(100);
//        }
//        v.print();
 //       System.out.println(v.isMotarized());
//        v.printmaxspeed();
//        vehicle v = new car(4,100);

//        v.new bicycle();
//        v.maxspeed=100;
//        v.noofdoors=4;
//        v.print();
//        vehicle v = new vehicle(250);
//       // v.colour="red";
//        v.setColour("red");
//        v.maxspeed=100;
//       v.print();

//        car c= new car(4,100);
//        c.colour="Black";
//        c.setColour("black");
//        c.maxspeed=200;
//        c.noofdoor=5;
//        c.print();
//        c.printcar();
//         c.printmaxspeed();
//        bicycle b= new bicycle();
//       b.print();






    }
}
