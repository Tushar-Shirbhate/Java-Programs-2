package com.company;
import java.util.*;
public class numbersystems {
    public static void main(String args[]){
        //get bit(do AND operation of bitmask and given bit)
        /***int n=12;
        int pos=3;
        int bitmask=1<<pos;
        if ((bitmask & n) == 0) {
            System.out.println("The bit at the given position is 0");
        }else{
            System.out.println("The bit at the given position is 1");
        }***/
        //set bit(do OR operation of bitmask and given bit)
        /***int n= 6;
        int pos=1;
        int bitmask=1<<pos;
        int number= bitmask|n;
        System.out.println(number);***/
        //clear bit(first take the not of the bitmask then do AND operation of it with given number )
       /*** int n=5;
        int pos=2;
        int bitmask=1<<pos;
        int notbm = ~bitmask;
        int number= n&notbm;
        System.out.println(number);***/
       //update bit(for 1(AND operation of number and notbitmask)for (OR operation of number and bitmask))
         Scanner sc=new Scanner (System.in);
         int operation=sc.nextInt();
         int n= sc.nextInt();
         int pos=1;
         int bitmask= 1<<pos;
         if(operation==0){
         int notbitmask= ~ bitmask;
         int number= notbitmask&n;
         System.out.println(number);
         }
         if(operation==1){
             int num= n|bitmask;
             System.out.println(num);
         }
    }

}
