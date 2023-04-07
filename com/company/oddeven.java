package com.company;
import java.util.*;
public class oddeven {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt ();
        if (num%2==0){
            System.out.println("Given no is even");
        }
       else {
            System.out.println("Given no is odd");
        }


    }
}
