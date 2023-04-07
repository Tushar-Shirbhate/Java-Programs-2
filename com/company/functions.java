package com.company;
import java.util.*;
public class functions {
  //  public static void printMyName (String name){
      /***  System.out.println(name);
        return;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        String name= sc.next();
        printMyName(name);


    }***/
     // public static  int printSum(int a,int b){
      /***    int sum= a+b;
          return sum;
      }
      public static void main(String[]args){
          Scanner sc= new Scanner (System.in);
          int a= sc.nextInt();
          int b= sc.nextInt();

          int sum = printSum(a,b);
          System.out.println("Sum of 2 numbers is:"+sum);
       ***/
      //public static float printProduct(float a, float b){
       /***   return a*b;
      }
      public static void main(String[]args){
          Scanner sc= new Scanner (System.in);
          Float a= sc.nextFloat();
          Float b= sc.nextFloat();


          System.out.println("The Product of the 2 numbers is"+ printProduct(a ,b));

      }***/
      // public static void printFactorial(int a){
         /***  if (a < 0) {
               System.out.println("Invalid Number");
               return;
           }

           int factorial=1;
           for (int i= a ;i>=1;i--){
               factorial=factorial*i;
           }
           System.out.println(factorial);
           return;
       }
       public static void main(String[]args){
           Scanner sc= new Scanner (System.in);
           int a = sc.nextInt();

            printFactorial(a);
       }**/


       
}
