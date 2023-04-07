package generics;

public class genericmethod {
    public static<T extends printinterface> void printarray(T arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i].print();
 //           System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[]args){
//        Integer arr[]=new Integer[5];
//        for (int i=0;i<arr.length;i++){
//            arr[i]=i+1;
//        }
//        printarray(arr);
//
//        String arrs[]=new String[5];
//        for (int i=0;i<arrs.length;i++){
//            arrs[i]="abcd";
//        }
//        printarray(arrs);

        Vehicles v[]=new Vehicles[5];
        for (int i=0;i<v.length;i++){
            v[i]=new Vehicles(10*i,"sdf");
        }
        printarray(v);

        student student[]=new student[5];
        for (int i=0;i<student.length;i++){
            student[i]=new student(10*i+1);
        }
        printarray(student);
    }
}










class Vehicles implements printinterface  {

    int maxspeed;
    String company;

    public Vehicles (int maxspeed,String company){
        super();
        this.maxspeed=maxspeed;
        this.company=company;
    }
    public void print(){
        System.out.println(maxspeed+" "+company);
    }
}




class student implements printinterface{
    int rollnumber;
    public student (int rollnumber){
        super();
        this.rollnumber=rollnumber;
    }


    @Override
    public void print() {
        System.out.println(rollnumber);
    }
}










