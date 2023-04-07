package arraylist;

import java.util.ArrayList;

public class Arraylistdemo {
    public static void main(String[]args){
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(1,80);
        for(int i=0;i< arr.size();i++){
            System.out.println(arr.get(i));
        }

//        arr.remove(2);
//        arr.set(0,100);
//        Integer i=20;
//        arr.remove(i);
//        System.out.println(arr.size());
//        System.out.println(arr.get(0));
    }

}
