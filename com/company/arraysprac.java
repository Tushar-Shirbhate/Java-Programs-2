package com.company;
import java.util.*;
public class arraysprac {
    public static void main(String[]args){
     //   int[]marks=new int[3];
     /***   marks[0]=97;//phy
        marks[1]=94;//chem
        marks[2]=96;//math
       // System.out.println(marks[0]);
       // System.out.println(marks[1]);
        //System.out.println(marks[2]);
        for (int i=0;i<3;i++){
            System.out.println(marks[i]);
        }***/
     //Scanner sc= new Scanner (System.in );
     /***int size= sc.nextInt();
     int numbers[]=new int[size];
     //input
     for (int i=0;i<size;i++){
          numbers[i]=sc.nextInt();
     }
     //output
     for(int i=0;i<size;i++){
         System.out.println(numbers[i]);
     }***/
     //taking stze of array from user
     /***Scanner sc= new Scanner (System.in);
     int Size=sc.nextInt();
     //declaring array
     int number[]= new int[Size];
     //input in array
     for(int i = 0;i<Size;i++){
         number[i]=sc.nextInt();
     }
     // number to find
     int x=3;
     //output
     for (int i =0;i< number.length;i++){
         if (number[i]==x){
             System.out.println("x found at index:"+i);
         }
     }***/
     //Scanner sc= new Scanner (System.in);
     /***int size= sc.nextInt();

     String names[]= new String[size];

     for (int i=0;i<names.length;i++) {
         names[i] = sc.next();
     }
     for(int i=0;i<names.length;i++){
         System.out.print(" Name " +(i+1)+" is:"+ names[i]);
     }***/
     Scanner sc= new Scanner (System.in);
     int size= sc.nextInt();

     int numbers[]=new int[size];

     for (int i=0; i<numbers.length;i++){
         numbers[i]=sc.nextInt();
     }
     int max= Integer.MIN_VALUE;
     int min= Integer.MAX_VALUE;

     for (int i =0;i<numbers.length;i++){
         if (numbers[i]<min){
           min=numbers[i];
         }
         if(numbers[i]>max){
             max=numbers[i];
         }
     }
        System.out.println("The largest number is:"+max);
        System.out.println("The smallest number is"+min);

     //Scanner sc= new Scanner(System.in);
     /***int size= sc.nextInt();

     int arrr[]=new int[size];

     for (int i=0;i<arrr.length;i++){
         arrr[i]=sc.nextInt();
     }

     boolean isAsending = true;

     for(int i=0;i<arrr.length-1;i++){
         if (arrr[i] > arrr[i+1]){
             isAsending= false;
         }
     }
     if(isAsending){
         System.out.println("The given array is in asending order");
     }else{
         System.out.println(" The given array is not in asending order");
     }***/


    }
}
