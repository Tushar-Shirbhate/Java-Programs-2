package com.company;
import java.util.*;
public class bitmanipulationeg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        /***int num= sc.nextInt();
        int number = num & num - 1;
        if (number == 0) {
            System.out.println("number is power of 2");
        } else {
            System.out.println("number is not a power of 2");
        }***/
      /*** int num= sc .nextInt();
       int pos= sc.nextInt();
       int bitmask= 1<<pos;
      // int notbitmask= ~ bitmask;
       int number= bitmask|num;
       System.out.println(number);***/
      int num= sc.nextInt();
      int count=0;
      for(int i=0;i<32;i++) {
          if ((num & 1) == 1) {
              count = count + 1;
          }
         num= num>>1;
      }
        System.out.println(count);

    }
}

